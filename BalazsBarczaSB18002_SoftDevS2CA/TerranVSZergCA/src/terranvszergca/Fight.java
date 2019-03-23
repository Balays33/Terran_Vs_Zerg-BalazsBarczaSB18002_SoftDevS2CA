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

public class Fight  
{
    
    // global variable
    /**
     *global variable
     * private access only with getter and setter
     * r random
     * 
     */
    private int heroCharacterF;
    private int magicCounter=3;
    private int defend = 5;
    private int howManyFightDone=0;
    
    Random r = new Random();
    
    private int attachChoose;
    private int win = 0; // to the stroyline
     
     // create a dice who have bigger number The bigger number make the move 
     /**
     * dices to the fight
     */
    private int dice;
    private int dice2;
    
     /**
     * declaration of objects
     */
    Race myHERO;
     //objects
    Marine m1;
    Reaper r1;
    Ghost g1;
    Hydralisk h1;
    Zergling z1;
    Queen q1;
    Kerrigan k1;
    TychusFindlay t1;
    Race[] a = new Race[9];
    
    private int enemy=0;
    private int chaCh = 0;

    //constructor

    /**
     *default constructor
     */
    public Fight() {
    }
    

    /**
     * @param heroCharacter
     * @param myHERO
     * @param m1
     * @param r1
     * @param g1
     * @param h1
     * @param z1
     * @param q1
     * @param k1
     * @param t1
     */

    
     public Fight(int heroCharacter,Race myHERO,Marine m1,Reaper r1,Ghost g1,Hydralisk h1,Zergling z1,Queen q1,Kerrigan k1,TychusFindlay t1)
    {
       this.heroCharacterF=heroCharacter;
       this.myHERO=myHERO;
       this.m1=m1;
       this.r1=r1;
       this.g1=g1;
       this.h1=h1;
       this.z1=z1;
       this.q1=q1;
       this.k1=k1;
       this.t1=t1;
    }
    
    /**
     * setup player method create array A 0-8 positions fill up with objects
     * object array
     */
     
     public void setupplayer()
    {
        a[0] = m1;
        a[1] = m1;
        a[2] = r1;
        a[3] = g1;
        a[4] = h1;
        a[5] = z1;
        a[6] = q1;
        a[7] = t1; // terran main boss
        a[8] = k1; // zerg main boss
    }
     
    /**
     * test to the programmer
     */
    public void kiir()
    {
        setupplayer();
        System.out.println("kivalasztott haracter number:" +heroCharacterF);
        //a[2].info();
        
        
    }
     
    /**
     * fightWithEnemy method 
     * variables get values
     *          defend = 5;
     *           magicCounter = 3;
     * 
     * if (heroCharacterF   checking the race and create enemy
     *  do  - while attack include switch case options
     *  1: attack
     *  2: defend
     *  3: magic
     *  4: exit the game
     *  switch case calls methods
     * if (a[heroCharacterF].getHealth() 0){System.out.print("GAME OVER");} checking hero health
      *      if (a[enemy].getHealth() 0){System.out.print("Victory ");}   checking enemy health
       *     
        *    win++; increase the victory number
     */
    public void fightWithEnemy()
     {
         defend = 5;
         magicCounter = 3;
         System.out.println("====");
         System.out.println("main character");
         a[heroCharacterF].info();

         if (heroCharacterF < 4) {
             do {
                 enemy = r.nextInt(3) + 4;
                 System.out.println(a[enemy].getHealth());
             } while (a[enemy].getHealth() < 0);

             System.out.println("====");
             System.out.println("Your ENEMY character");
             a[enemy].info();
         }
         if (heroCharacterF > 3) {
             do {
                 enemy = r.nextInt(3) + 1;
                 System.out.println(a[enemy].getHealth());
             } while (a[enemy].getHealth() < 0);
            
             System.out.println("====");
             System.out.println("Your ENEMY character");
             a[enemy].info();
         }
        
       
            do{
            // different attack
            do{
                System.out.println("Your choose Attack :1 Defend :2 Magic :3 Run Away :4 ");
                Scanner h = new Scanner(System.in);
                 if (h.hasNextInt()) 
                 {
                  attachChoose=h.nextInt();
                 }
                 
                 switch(attachChoose)
                 {
                     case 1:    // attack
                         attack();
                         break;
                     case 2:    //defend
                         defend();
                         break;
                     case 3: //magic
                         magic();       
                         break;
                     case 4:
                         System.out.println("You are coward ");
                         System.exit(0);
                         break;
                 }
                    
            }while((attachChoose != 1) && (attachChoose != 2) && (attachChoose != 3) && (attachChoose != 4));
            
            
        
            }while((a[enemy].getHealth()>=1) && (a[heroCharacterF].getHealth()>=1));
            
            if (a[heroCharacterF].getHealth()<0){System.out.println("GAME OVER");}
            if (a[enemy].getHealth()<0){System.out.println("Victory ");}
            
            win++;
            a[heroCharacterF].setToughness(a[heroCharacterF].getToughness()+15);
            a[heroCharacterF].setLevel(a[heroCharacterF].getLevel()+2);
            a[heroCharacterF].info();
        
     }
    
    /**
     * it is similar that fight with enamy method add extra option change the hero
     */
    public void fightMainBoss()
     {
         defend = 5;
         magicCounter = 3;
         System.out.println("====");
         System.out.println("main character");
         a[heroCharacterF].info();

         if (heroCharacterF < 4) {
             enemy = 8;

             System.out.println("====");
             System.out.println("Your ENEMY character");
             a[enemy].info();
         }
         if (heroCharacterF > 3) {
             enemy = 7;
             System.out.println("====");
             System.out.println("Your ENEMY character");
             a[enemy].info();
         }
        
        //int magicCounter=3;
       
            do{
            // different attack
            do{
                System.out.println("Your choose Attack :1 Defend :2 Magic :3 Run Away :4 Change the caracter : 5");
                Scanner h = new Scanner(System.in);
                 if (h.hasNextInt()) 
                 {
                  attachChoose=h.nextInt();
                 }
                 
                 switch(attachChoose)
                 {
                     case 1:    // attack
                         attack();
                         break;
                     case 2:    //defend
                         defend();
                         break;
                     case 3: //magic
                         magic();       
                         break;
                     case 4:
                         System.out.println("You are coward ");
                         System.exit(0);
                         break;
                     case 5:    // character change
                         charactercChangeMethod();
                         break;
                 }
                    
            }while((attachChoose != 1) && (attachChoose != 2) && (attachChoose != 3) && (attachChoose != 4));
            
            
        
            }while((a[enemy].getHealth()>=1) && (a[heroCharacterF].getHealth()>=1));
            
            
            if (a[heroCharacterF].getHealth()<0){System.out.println("GAME OVER you should be careful your soul is gone");}
            if (a[enemy].getHealth()<0){System.out.println("WINNER  The main boss is gone Happy end ");}
            win++;
        
     }
    
    /*
     * attack method
        dice checker hero dice vs enemy dice
        who has a bigger will make attack
    setting health point 
    *
    */
    private void attack() {

        dice = r.nextInt(6) + 1;
        dice2 = r.nextInt(6) + 1;
        System.out.println("---------------------------------------------");
        System.out.println(" ");
        System.out.println("Your dice : " + dice + " Enemy dice : " + dice2);
        System.out.println(" ");
        if (dice >= dice2) {
            System.out.println("Your character made a attack"); // you have bigger dice so you are making the attack
            a[heroCharacterF].attack();
            a[enemy].setHealth(a[enemy].getHealth() - (a[heroCharacterF].getAttackPoint() + a[heroCharacterF].getLevel()));
            System.out.println("====");
            System.out.println("Your ENEMY character");
            a[enemy].info();
        }
        if (dice < dice2) {
            System.out.println("Enemy mades a attack"); // the enemy dice is bigger He will make attack
            a[enemy].attack();
            a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() - a[enemy].getAttackPoint());
            System.out.println("====");
            System.out.println("Your HERO character");
            a[heroCharacterF].info();
        }

    }
    
    
    /*
        defend
        If the fight happening The user can choose the defend action. If the user use the defend He can get extra healtpoint and gives a contra attack
        use dice user dice comper the enemy dice
    */
    
    
    private void defend() {
        System.out.println("You can dedend yourself: " + defend);
        dice = r.nextInt(6) + 1;
        dice2 = r.nextInt(6) + 1;
        System.out.println("---------------------------------------------");
        System.out.println("Your dice : " + dice + " Enemy dice2 : " + dice2);
        if (defend > 0) {
            if (dice > dice2) // hero dice is bigger
            {
                System.out.println("Good defend you get extra health point and your enemy lost health because  your toughness"); //  defend get extra  healthpoint enemy lose healtboint
                a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() + 2 + a[heroCharacterF].getLevel());
                System.out.println("====");
                System.out.println("Your HERO character");
                a[heroCharacterF].info();
                a[enemy].setHealth(a[enemy].getHealth() - a[heroCharacterF].getToughness());
                System.out.println("The enemy lost : " + a[heroCharacterF].getToughness());
                System.out.println("====");
                System.out.println("Your ENEMY character");
                a[enemy].info();
            }

            if (dice <= dice2) // enemy dice is smaller
            {
                System.out.println("You could not defend yourself you lost health");
                a[enemy].attack();
                a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() - (a[enemy].getAttackPoint() + (a[enemy].getToughness() % 2)));
                System.out.println("====");
                System.out.println("Your HERO character");
                a[heroCharacterF].info();
                System.out.println("====");
                System.out.println("Your ENEMY character");
                a[enemy].info();
            }
            defend--;
        } else {
            System.out.println("No more block/defend");
        }
    }
    
    /**
    *   magic
    *
    *   paper rock scissors simple game 
    * it was randomly get skills hero and enemy
    * Rock–paper–scissors is a hand game usually played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are "rock", "paper", and "scissors".
    *
    */
    
    private void magic() {
        // "laser gun point 20">"plasma gun point 15 you can use only 3 times    "magic knife","plasma gun","laser gun"
        // plasma gun point 15 ">"magic knife pomt 12"                             ko  rock        papir paper      ollo Scissors
        // "magic knife pomt 12">laser gun 20                                          0            1               2
        int magicworkCounter = 0;
        if (magicCounter > 0) {
            System.out.println(" ");
            System.out.println("magic = -20 healtpoint");
            System.out.println(a[heroCharacterF].getSkill());
            System.out.println(a[enemy].getSkill());
            if ((a[heroCharacterF].getSkillposition() == 0) && (a[enemy].getSkillposition() == 2)) {
                a[enemy].setHealth(a[enemy].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your ENEMY character");
                a[enemy].info();
                System.out.println("You used your magic great attack");
            }
            if ((a[heroCharacterF].getSkillposition() == 1) && (a[enemy].getSkillposition() == 0)) {
                a[enemy].setHealth(a[enemy].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your ENEMY character");
                a[enemy].info();
                System.out.println("You used your magic great attack");
            }
            if ((a[heroCharacterF].getSkillposition() == 2) && (a[enemy].getSkillposition() == 1)) {
                a[enemy].setHealth(a[enemy].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your ENEMY character");
                a[enemy].info();
                System.out.println("You used your magic great attack");
            }
            if ((a[enemy].getSkillposition() == 0) && (a[heroCharacterF].getSkillposition() == 2)) {
                a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your HERO character");
                a[heroCharacterF].info();
                System.out.println("You have been defeated by enemy`s magic");
            }
            if ((a[enemy].getSkillposition() == 1) && (a[heroCharacterF].getSkillposition() == 0)) {
                a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your HERO character");
                a[heroCharacterF].info();
                System.out.println("You have been defeated by enemy`s magic");
            }
            if ((a[enemy].getSkillposition() == 2) && (a[heroCharacterF].getSkillposition() == 1)) {
                a[heroCharacterF].setHealth(a[heroCharacterF].getHealth() - 20);
                System.out.println("====");
                System.out.println("Your HERO character");
                a[heroCharacterF].info();
                System.out.println("You have been defeated by enemy`s magic");
            }
            if (a[enemy].getSkillposition() == a[heroCharacterF].getSkillposition()) {
                System.out.println("Your magic is equal with the enemy magic");
            }
            magicCounter--; // only 3 times you can use magic
        } else {
            System.out.println("No more magic");
        }

    }
    
    /*
        character change
        user can change hero caracter IF you are fight with the main boss
        optiona to change the hero character depend from race
     Scanner h2 = new Scanner(System.in) keyboard inpute
    
     
        
    */
    private void charactercChangeMethod() {
        chaCh = 0;
        do {

            if (heroCharacterF < 4) {
                System.out.println("Marine :1 Reaper :2 Ghost :3 ");
                do {
                    Scanner h2 = new Scanner(System.in);
                    if (h2.hasNextInt()) {

                        chaCh = h2.nextInt();
                    }
                } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));
                System.out.println("Your new character ");
                switch (chaCh) {
                    case 1:
                        heroCharacterF = 1;
                        break;
                    case 2:
                        heroCharacterF = 2;
                        break;
                    case 3:
                        heroCharacterF = 3;
                        break;
                }
                a[heroCharacterF].info();

            }
            if (heroCharacterF > 3) {
                System.out.println("Hydralisk :1 Zergling :2 Queen :3 ");
                do {
                    Scanner h2 = new Scanner(System.in);
                    if (h2.hasNextInt()) {

                        chaCh = h2.nextInt();
                    }
                } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));
                System.out.println("Your new character ");
                switch (chaCh) {
                    case 1:
                        heroCharacterF = 4;
                        break;
                    case 2:
                        heroCharacterF = 5;
                        break;
                    case 3:
                        heroCharacterF = 6;
                        break;
                }
                a[heroCharacterF].info();
            }
        } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));

    }
    

    
 /**
 *  
 * 
     * @param m1
     * @param h1
 */
    
    public void test(Marine m1,Hydralisk h1) {
        System.out.println("test working");
        m1.info();
        System.out.println("hyra");
        h1.info();
        
       
        
       
            do{
            // different attack
            do{
                System.out.println("Your choose Attack :1 Defend :2 Magic :3 Run Away :4 Change the caracter : 5");
                Scanner h = new Scanner(System.in);
                 if (h.hasNextInt()) 
                 {
                  attachChoose=h.nextInt();
                 }
                 
                 switch(attachChoose)
                 {
                     case 1:    // attack
                         
                        dice = r.nextInt(6)+1;
                        dice2 = r.nextInt(6)+1;
                        System.out.println("---------------------------------------------");
                        System.out.println("Your dice : " + dice +" Enemy dice2 : " + dice2);
                        
                        if (dice >= dice2)
                        {
                            m1.info();
                        }
                        if (dice < dice2)
                        {
                            h1.info();
                        }
                         
                         break;
                     case 2:    //defend
                         
                        dice = r.nextInt(6)+1;
                        dice2 = r.nextInt(6)+1;
                        System.out.println("---------------------------------------------");
                        System.out.println("Your dice : " + dice +" Enemy dice2 : " + dice2);
                        
                        if (dice >= dice2)
                        {
                          System.out.println("Good defend you get extra health point and your enemy lost health because  your toughness"); //  defend get extra  healthpoint enemy lose healtboint
                          m1.info();
                        }
                        
                         if (dice < dice2)
                        {
                            System.out.println("You could not defend yourself you lost health");
                            h1.info();
                        }
                         break;
                     case 3: //magic
                         
                         break;
                     case 4:
                         System.out.println("You are coward ");
                         System.exit(0);
                         break;
                     case 5:    // character change
                         int chaCh = 0;
                         do {

                             if (heroCharacterF < 4) {
                                 System.out.println("Marine :1 Reaper :2 Ghost :3 ");
                                 do {
                                     Scanner h2 = new Scanner(System.in);
                                     if (h2.hasNextInt()) {

                                         chaCh = h2.nextInt();
                                     }
                                 } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));
                                 System.out.println("Your new character ");
                                 switch (chaCh) {
                                     case 1:
                                          m1.info();
                                         break;
                                     case 2:
                                         m1.info();
                                         break;
                                     case 3:
                                         m1.info();
                                         break;
                                 }
                                
                                             
                             }
                             if (heroCharacterF > 3) {
                                 System.out.println("Hydralisk :1 Zergling :2 Queen :3 ");
                                 do {
                                     Scanner h2 = new Scanner(System.in);
                                     if (h2.hasNextInt()) {

                                         chaCh = h2.nextInt();
                                     }
                                 } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));
                                 System.out.println("Your new character ");
                                 switch (chaCh) {
                                     case 1:
                                          h1.info();
                                         break;
                                     case 2:
                                          h1.info();
                                         break;
                                     case 3:
                                          h1.info();
                                         break;
                                 }
                                
                             }
                         } while ((chaCh != 1) && (chaCh != 2) && (chaCh != 3));
     
                         break;
                 }
                    
            }while((attachChoose != 1) && (attachChoose != 2) && (attachChoose != 3) && (attachChoose != 4));
            
            
        
            }while(h1.getHealth()>=1);
        
            
            win++;
        
     }
    
    /**
     * @return
     */
    public int getWin() {
        return win;
    }

    /**
     * @param win
     */
    public void setWin(int win) {
        this.win = win;
    }
    
    
    
    }
    
    
    
    
    

