/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package al.spadesai;


import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        player[] players = new player[4];
        players[0] = new player();
        players[1] = new player();
        players[2] = new player();
        players[3] = new player();
        Game game = new Game(players);
        game.play();
    }
}

