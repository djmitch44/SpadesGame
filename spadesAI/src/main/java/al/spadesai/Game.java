/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package al.spadesai;

/
    import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private player[] players;
    private Deck deck;
    private int[] scores;
    private int numTricks;
    private boolean spadesBroken;

    public Game(player[] players) {
        this.players = players;
        this.deck = new Deck();
        this.scores = new int[2];
        this.numTricks = 0;
        this.spadesBroken = false;
    }

    public void play() {
        while (scores[0] < 500 && scores[1] < 500) {
            // Deal cards
            deck.shuffle();
            for (int i = 0; i < players.length; i++) {
                players[i].clearHand();
                for (int j = 0; j < 13; j++) {
                    players[i].addCard(deck.dealCard());
                }
            }

            // Bid
            int[] bids = new int[4];
            int startingPlayer = 0;
            int highBid = -1;
            int highBidder = -1;
            boolean bidBroken = false;
            for (int i = 0; i < 4; i++) {
                int currentPlayer = (startingPlayer + i) % 4;
                int bid = players[currentPlayer].bid(bidBroken);
                if (bid > highBid) {
                    highBid = bid;
                    highBidder = currentPlayer;
                } else if (bid == highBid && bid != 0) {
                    bidBroken = true;
                }
                bids[currentPlayer] = bid;
            }

            // Play tricks
            numTricks = 13;
            for (int i = 0; i < numTricks; i++) {
                Trick trick = new Trick(highBidder, spadesBroken);
                for (int j = 0; j < 4; j++) {
                    int currentPlayer = (highBidder + j) % 4;
                    Card playedCard = players[currentPlayer].playCard(trick);
                    trick.addCard(playedCard);
                }
                int winner = trick.getWinner();
                players[winner].addTrick();
                highBidder = winner;
                spadesBroken |= trick.spadesBroken();
            }

            // Update scores
            int[] trickPoints = new int[2];
            trickPoints[0] = players[0].getNumTricks() + players[2].getNumTricks();
            trickPoints[1] = players[1].getNumTricks() + players[3].getNumTricks();
            if (trickPoints[0] >= highBid) {
                scores[0] += highBid;
            } else {
                scores[1] += 10 * highBid;
            }
            players[highBidder].setPoints(highBid);
            players[(highBidder + 2) % 4].setPoints(0);
            System.out.println("Scores: " + scores[0] + " - " + scores[1]);
        }
        System.out.println("Game over.");
    }
}