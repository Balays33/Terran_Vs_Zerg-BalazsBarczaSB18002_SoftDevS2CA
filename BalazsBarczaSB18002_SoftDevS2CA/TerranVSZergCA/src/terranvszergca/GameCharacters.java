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

public class GameCharacters {
    
    private String playername;

    /**
     * declaration of variables
     * global variables
     * choosecharacterRace - race Terran or Z
     * heroCharacter - choose of hero integer 
     * r random declaration
     */
    public int choosecharacterRace;
    private int heroCharacter;
    private boolean choosecharacterTest = true;
    Random r = new Random();
    
    /**
     * declaration of objects
     */
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
    Race myHERO;
    
    //method
    // System ask the name and save into the playername

    /**
     * get name method scanner input keyboard characters
     *  string getnameplayer
     * system output name of the player
     */
    public void getname() {
        System.out.println("What is your name :");
        Scanner n = new Scanner(System.in);
        if (n.hasNext()) {
            String getnameplayer = n.nextLine();
            playername = getnameplayer;

        }
        System.out.println("Welcome " + playername + " good luck enjoy the game");

    }
    
    // race choose

    /**
     * choosecharacterMethod method 
     * system input with checking the input is correct
     * choosecharacterRace = c1.nextInt(); integer the input
     * h.hasNextInt()   h has to be integer
     */
    public void choosecharacterMethod() {


        do {
            System.out.print("Please type 1 or 2 : ");
            Scanner c1 = new Scanner(System.in);
            if (c1.hasNextInt()) {
                choosecharacterRace = c1.nextInt();
                if ((choosecharacterRace == 1) || (choosecharacterRace == 2)) {
                    System.out.println("Thanks  " + playername);
                    switch (choosecharacterRace) {
                        case 1:
                            System.out.println("Your race is TERRAN");
                            do {
                                System.out.println("Your have to choose main hero");
                                System.out.println("Marine or Reaper or Ghost");
                                System.out.println(" 1     or  2     or  3");
                                Scanner h = new Scanner(System.in);
                                if (h.hasNextInt()) {
                                    heroCharacter = h.nextInt();

                                }

                            } while ((heroCharacter != 1) && (heroCharacter != 2) && (heroCharacter != 3));
                            

                            this.choosecharacterRace = 1;
                            break;
                        case 2:
                            System.out.println("Your race is ZERG ");
                            do {
                                System.out.println("Your have to choose main hero");
                                System.out.println("Hydralisk or Zergling or Queen");
                                System.out.println(" 4       or  5       or  6");
                                Scanner h = new Scanner(System.in);
                                if (h.hasNextInt()) {
                                    heroCharacter = h.nextInt();

                                }

                            } while ((heroCharacter != 4) && (heroCharacter != 5) && (heroCharacter != 6));
                            

                            this.choosecharacterRace = 2;
                            break;
                    }
                    choosecharacterTest = false;

                }
            }
            
        } while (choosecharacterTest);
        
        
        
        

    }
    
    /**
     * setupplayer method create array A 0-8 positions fill up with objects
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
     * chooseHERO method return with the player spec informations
     * switch - case
     */
    public void chooseHERO()
    {
        System.out.println("This is your hero spect");
        setupplayer();
        
        switch (heroCharacter) {
                                case 1:
                                    a[heroCharacter].info();
                                    break;
                                case 2:
                                    
                                    a[heroCharacter].info();
                                    break;
                                case 3:
                                    
                                    a[heroCharacter].info();
                                    break;
                                case 4:
                                    
                                    a[heroCharacter].info();
                                    break;
                                case 5:
                                   
                                    a[heroCharacter].info();
                                    break;
                                case 6:
                                    
                                    a[heroCharacter].info();
                                    break;
                            }
        myHERO = a[heroCharacter];
    }
    
    /**
     * the objects setup back to the next game
     */
    public void setBackCharacter()
    {
                    m1.setNEWhealth();
                    r1.setNEWhealth();
                    g1.setNEWhealth();
                    h1.setNEWhealth();
                    z1.setNEWhealth();
                    q1.setNEWhealth();
    }
    /**
     * get player name
     * @return
     */
    public String getPlayername() {
        return playername;
    }

    /**
     * set player name
     * @param playername
     */
    public void setPlayername(String playername) {
        this.playername = playername;
    }

    /**
     * get character race
     * @return
     */
    public int getChoosecharacterRace() {
        return choosecharacterRace;
    }

    /**
     * set character race
     * @param choosecharacterRace
     */
    public void setChoosecharacterRace(int choosecharacterRace) {
        this.choosecharacterRace = choosecharacterRace;
    }

    /**
     * getHeroCharacter
     * @return
     */
    public int getHeroCharacter() {
        return heroCharacter;
    }

    /**
     *  setHeroCharacter
     * @param heroCharacter
     */
    public void setHeroCharacter(int heroCharacter) {
        this.heroCharacter = heroCharacter;
    }

    /**
     *
     * @return
     */
    public Marine getM1() {
        return m1;
    }

    /**
     *
     * @param m1
     */
    public void setM1(Marine m1) {
        this.m1 = m1;
    }

    /**
     *
     * @return
     */
    public Hydralisk getH1() {
        return h1;
    }

    /**
     *
     * @param h1
     */
    public void setH1(Hydralisk h1) {
        this.h1 = h1;
    }

    /**
     *
     * @return
     */
    public Race getMyHERO() {
        return myHERO;
    }

    /**
     *
     * @param myHERO
     */
    public void setMyHERO(Race myHERO) {
        this.myHERO = myHERO;
    }

    /**
     *
     * @return
     */
    public Ghost getG1() {
        return g1;
    }

    /**
     *
     * @param g1
     */
    public void setG1(Ghost g1) {
        this.g1 = g1;
    }

    /**
     *
     * @return
     */
    public Reaper getR1() {
        return r1;
    }

    /**
     *
     * @param r1
     */
    public void setR1(Reaper r1) {
        this.r1 = r1;
    }

    /**
     *
     * @return
     */
    public Zergling getZ1() {
        return z1;
    }

    /**
     *
     * @param z1
     */
    public void setZ1(Zergling z1) {
        this.z1 = z1;
    }

    /**
     *
     * @return
     */
    public Queen getQ1() {
        return q1;
    }

    /**
     *
     * @param q1
     */
    public void setQ1(Queen q1) {
        this.q1 = q1;
    }

    /**
     *
     * @return
     */
    public Kerrigan getK1() {
        return k1;
    }

    /**
     *
     * @param k1
     */
    public void setK1(Kerrigan k1) {
        this.k1 = k1;
    }

    /**
     *
     * @return
     */
    public TychusFindlay getT1() {
        return t1;
    }

    /**
     *
     * @param t1
     */
    public void setT1(TychusFindlay t1) {
        this.t1 = t1;
    }

   

   
    
    
    
    
    
}
