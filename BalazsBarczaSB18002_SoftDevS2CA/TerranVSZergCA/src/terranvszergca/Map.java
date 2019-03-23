/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terranvszergca;


import java.util.Scanner;

/**
 *
 * @author  Balazs Barcza
 *          SB18002
 *          November 2018
 */

/**
 *  default constructor
 * matrix x and y value
 * story object from Story class
 */
public class Map {
    
    private int[][] mapArrey = new int[3][3];
    private int xmove = 2;
    private int ymove = 2;
    Story story = new Story();
    private char e;
    
    /**
     * mapHike method include the movement
     * input 1 character n,s,e,w change the x and the y value and other character gives default information about the map
     * mappingGame method basic layout about the map
     *  do - while loop exit only with the right character
     * nSWE method possible movement on the map
     */
    public void mapHike()
    {
        boolean exittheLOOP =false;
        do{ 
            mappingGame();
        nSWE();
        Scanner input = new Scanner(System.in);
        char e = input.next().charAt(0);
        switch (e) {
            case 'n':
                if (ymove>1)
                {
                     System.out.print(" -up");
                     ymove--;
                     exittheLOOP = true;
                } else System.out.println("You can not move you are on the edge of the map");
                break;
            case 's':
                if (ymove<3)
                {
                     System.out.print("-down");
                     ymove++;
                     exittheLOOP = true;
                } else System.out.println("You can not move you are on the edge of the map");
                break;
            case 'w':
               if (xmove>1)
                {
                     System.out.print(" -left");
                     xmove--;
                     exittheLOOP = true;
                } else System.out.println("You can not move you are on the edge of the map");
                break;
            case 'e':
                if (xmove<3)
                {
                     System.out.print(" -right");
                     xmove++;
                     exittheLOOP = true;
                } else System.out.println("You can not move you are on the edge of the map");
                break;
            case 'q':
                System.exit(0);
                break;
            default: 
                System.out.println("Please move your caracter");
                System.out.println("This is the map ");
                mappingGame();
                break;
                
        }
        }while(exittheLOOP != true );
        exittheLOOP = false;
        
    }
    
    // 
    private void nSWE() {
        if (xmove == 1 && ymove == 1) {
            System.out.println("south : s east :e   | help : h EXIT : q ");
        }
        if (xmove == 1 && ymove == 2) {
            System.out.println("north : n south : s east :e  | help : h EXIT : q ");
        }
        if (xmove == 1 && ymove == 3) {
            System.out.println("north : n  east :e  | help : h EXIT : q ");
        }
        if (xmove == 2 && ymove == 1) {
            System.out.println("south : s east :e west :w  | help : h EXIT : q ");
        }
        if (xmove == 2 && ymove == 2) {
            System.out.println("north : n south : s east :e west :w  | help : h EXIT : q ");
        }
        if (xmove == 2 && ymove == 3) {
            System.out.println("north : n east :e west :w  | help : h EXIT : q ");
        }
        if (xmove == 3 && ymove == 1) {
            System.out.println("south : s  west :w  | help : h EXIT : q  ");
        }
        if (xmove == 3 && ymove == 2) {
            System.out.println("north : n south : s west :w  | help : h EXIT : q ");
        }
        if (xmove == 3 && ymove == 3) {
            System.out.println(" north : n  west :w  | help : h EXIT : q ");
        }
    }
    
    /**
     * basic visual layout from 2 dimension vector
     */
    public void mappingGame()
    {
                System.out.println(" ");
                System.out.println("|--------------------------------|");
                System.out.println("| story 11 | story 21 | story 31 |");
                System.out.println("|--------------------------------|");
                System.out.println("| story 12 | story 22 | story 32 |");
                System.out.println("|--------------------------------|");
                System.out.println("| story 13 | story 23 | story 33 |");
                System.out.println("|--------------------------------|");
                System.out.println(" ");
    }
    
    // getter and setter

    /**
     * get x move
     * @return
     */

    public int getXmove() {
        return xmove;
    }

    /**
     * set x move
     * @param xmove
     */
    public void setXmove(int xmove) {
        this.xmove = xmove;
    }

    /**
     * get y move
     * @return
     */
    public int getYmove() {
        return ymove;
    }

    /**
     * set y move
     * @param ymove
     */
    public void setYmove(int ymove) {
        this.ymove = ymove;
    }
    
    
  

    
    
}
