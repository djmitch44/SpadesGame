/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package al.spadesai;


    import java.util.ArrayList;

public class player {
    private ArrayList<Card> hand;
    private boolean hasLead;

    public void Player() {
        this.hand = new ArrayList<Card>();
        this.hasLead = false;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public Card playCard(int index) {
        Card card = this.hand.get(index);
        this.hand.remove(index);
        return card;
    }

    public boolean hasCard(Card card) {
        return this.hand.contains(card);
    }

    public void setHasLead(boolean hasLead) {
        this.hasLead = hasLead;
    }

    public boolean hasLead() {
        return this.hasLead;
    }
}
