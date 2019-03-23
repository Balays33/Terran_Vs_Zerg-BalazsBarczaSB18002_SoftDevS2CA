/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terranvszergca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author  Balazs Barcza
 *          SB18002
 *          November 2018
 */
public class LogialPRO {
    
    /**
     * Global Variables in the LogialPRO class
     * r : random 
     * menu number is integer and privet The User use the numeric numbers 1-3 to choose the menu point
     * 1: info
     * 2: run the game
     * 3: exit
     */
    Random r = new Random();
    private int menunumber;
   
    /**
     *This is the main method in the LogialPRO class
     *  create game characters objects  main Boss
     *  player object from the GameCharacters class
     *  story object from the Story class
     * 
     *  menu inside a loop do -while 
     *      you can exit from the loop with 3
     *      menu system switch - case
     *          1: info
     *          2: run the game
     *          3: exit
     * 
     *  1: info 
     *  2: Run the Game
     *      story.TerranAndZergstory() story class  call TerranAndZergstory method// import the Terran background story  the Zerg background story
     *      player.choosecharacterMethod(); GameCharacters class call choosecharacterMethod method // choose race and hero character
     *      
     *       
     *          pass values from the map X  Y integer to the stroy
     * 
     *                  checking where we are on the map if we are on the 11 or 13 or 31 location map locations and the story numbers are connected I have pass X  Y position to the Story
     *                      x*10 + y = story number
     *                      we have to fight with random enemy
     *                      also checking the victory numbers If The player has less 3  you can fight with enemy
     *               fight fightWithEnemy call the fight with the Enemy method from the Fight class
     *                      If The player has 3 victory the player has to find The main BOSS
     *      
     *              3 victory and the location on the map 33 
     *           fight fightMainBoss this is the fight method different the  fightWithEnemy  extra method include inside the method
     * 
     *              
                                                    *   The program now can create enemy in this locations
     * 
     *              
     */
    
    
    public void run() 
    {
        GameCharacters player = new GameCharacters();
        Story story = new Story();
        
        Map map = new Map();
        
        
        // Terran Objects
        Marine m1 =  new Marine("Marine",1);
        Reaper r1 = new Reaper("Reaper",2);
        Ghost g1 = new Ghost("Ghost",3);
        player.setM1(m1);
        player.setR1(r1);
        player.setG1(g1);
        
        // Zerg Objects
        Hydralisk h1 = new Hydralisk("Hydralisk",1);
        Zergling z1 = new Zergling("Zergling",2);
        Queen q1 = new Queen("Queen",3);
        player.setH1(h1);
        player.setZ1(z1);
        player.setQ1(q1);
        
        
        // main boss characters
        Kerrigan k1 = new Kerrigan("Kerrigan",10,600,50); // ZERG main boss
        TychusFindlay t1 = new TychusFindlay("TychusFindlay",10,600,50); // TERRAN main boss
        player.setK1(k1);
        player.setT1(t1);
        
        player.getname();   //get player name from the Gamecharacter class
        
        
        do {
            authorname();
            menuname();

            Scanner s = new Scanner(System.in);
            if (s.hasNextInt()) {
                menunumber = s.nextInt();
            }
            switch (menunumber) {
                case 1:
                    authorname();
                    Infopage i = new Infopage();
                    i.writeoutInfo();
                    //i.saveData(player.getPlayername());
                    //i.printoutDatabase();
                    
                    
                    
                    
                    break;
                case 2:
                    story.TerranAndZergstory(); // import the Terran background story & the zerg background story
                    player.choosecharacterMethod(); // choose race and hero character
                    player.chooseHERO();    // this method write out your hero characater details
                    if (player.getHeroCharacter()<4){story.TerranStory();}      // depends from the race you can get the story 
                    if (player.getHeroCharacter()>=4){story.ZergStory();}
                    Fight fight = new Fight(player.getHeroCharacter(), player.getMyHERO(), player.getM1(), player.getR1(), player.getG1(), player.getH1(), player.getZ1(), player.getQ1(), player.getK1(), player.getT1());
                    fight.setupplayer();    // create fight object from the Fight class send all of the character objects to the class and fill the array with object
                    if (fight.a[player.getHeroCharacter()].getHealth() <0 )
                        {
                           fight.a[player.getHeroCharacter()].setHealth(50);    // If you restart the game after the last game and your hero character is dead you get new healt point
                        }
                    
                    do {
                        if (fight.a[player.getHeroCharacter()].getHealth() <0 )
                        {
                           break;
                        }
                        map.mapHike();  // map system 
                        story.storyline(map.getXmove(), map.getYmove()); // send the location on the map to the stroy so we get the location story
                        if (story.getStroynumber() == 22)
                        {
                            if (fight.a[player.getHeroCharacter()].getHealth() < 60)
                            {
                            System.out.println("You got rest your health point back to 60");
                            fight.a[player.getHeroCharacter()].setHealth(60);
                            fight.a[player.getHeroCharacter()].info();
                            }
                        }
                         if ((story.getStroynumber() == 11)  && (fight.getWin() < 3)) // checking where are WE on the MAP and how many victroy We have
                         {
                             if (story.isStroyf11() == false)
                             {
                                 fight.fightWithEnemy();
                             }
                              story.setStroyf11(true);
                         }
                        if ((story.getStroynumber() == 31)  && (fight.getWin() < 3)) // if we have less 3 victory and we are on MAP 11 or 31 or 13 we have to fight with enemy
                         {
                             if (story.isStroyf31() == false)
                             {
                                 fight.fightWithEnemy();
                             }
                              story.setStroyf31(true);
                         }
                        if ((story.getStroynumber() == 13)  && (fight.getWin() < 3))
                         {
                             if (story.isStroyf13() == false)
                             {
                                 fight.fightWithEnemy();
                             }
                              story.setStroyf13(true);
                         }
                       
                        if (fight.getWin() == 3) {      
                            System.out.println("You have to find the Main boss");   // 3 victory we are able to fight with the main boss
                        }
                        if ((story.getStroynumber() == 33) && (fight.getWin() == 3)) {
                            System.out.println("This is the final test with your team you have to kill the enemy boss");
                            fight.fightMainBoss();
                        }
                        System.out.println(" your victory: "+fight.getWin());
                    } while (fight.getWin() != 4);  // we have total 3 + 1 main boss victory we won

                    player.setBackCharacter();  // make alive the dead characters in the game
                    fight.setWin(0);            // set victroy to 0
                    story.resetStory113113();   // reset the sory 
                    
                    break;
            }
        } while (menunumber != 3);

       
       
        
        
        
    }
    private void authorname()
    {
            System.out.println("           ");
            System.out.println("@author  Balazs Barcza");
            System.out.println("            SB18002");
            System.out.println("            barczabalazs@gmail.com         "); 
            System.out.println("           ");
    }
    private void menuname()
    {
       
            System.out.println("Terran Vs Zerg ");
            System.out.println("   1: Info about the game         ");
            System.out.println("   2: Start game        ");
            System.out.println("   3: Exit        ");
            System.out.println("           ");
    }
    
    
}
