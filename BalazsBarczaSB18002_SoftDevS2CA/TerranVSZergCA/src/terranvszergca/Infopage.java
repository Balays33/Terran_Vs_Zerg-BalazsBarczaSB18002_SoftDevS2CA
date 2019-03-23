/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terranvszergca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author  Balazs Barcza
 *          SB18002
 *          November 2018
 */
public class Infopage {
    
    File file = new File("info.text");
    private String playername;

        
     public void saveData(String playername ) 
     {
         this.playername=playername;
         try {
         PrintWriter output = new PrintWriter(file);
         output.println(playername);
         } catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			System.out.println("ERROR: $s\n"+ex);
		}
     }
     
     public void printoutDatabase() {
		try {
			
			Scanner input = new Scanner(file);
			String name = input.nextLine();
			System.out.println(name);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: $s\n"+e);
		}
     }
    public void writeoutInfo()
    {
        System.out.println("Name of the Game : Terran VS Zerg\n" +
"The game is base on the famous franchise StarCraft. All of the characters and story background is protected by copyright. This game is only study for purposes.");
        System.out.println("The story is about two races. One is the Terran and other one is the Zerg They are fighting over the Earth. The player can choose between the two race. ");
        System.out.println("After picking race , the player can choose main hero. There are three different characters per race. All of the characters are randomly created so every time restarts the game and it will be different.  ");
        System.out.println("After choosing player can move around on the map 3x3. Every location has a unique story. Player needs to fight three enemies and needs to have 3 victories to be able to fight with the main boss. \n" +
"In the main fight, the gamer will get extra two characters. ");
        System.out.println("This will be team fight so player can change characters (if necessary). Player has to be careful because any loos of characters (dead) means end of the game.");
        System.out.println("The game has a combat system. I have used the dices to decide who will make attack or defence etc");
        System.out.println("Goal of the game:\n" +
"If all player units are defeated the player loses (end game).\n" +
"If the enemy boss is defeated, player wins (end game).   ");
    }
    
}
