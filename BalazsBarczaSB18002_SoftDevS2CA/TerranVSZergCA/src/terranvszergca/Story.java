/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terranvszergca;

/**
 *
 * @author  Balazs Barcza
 *          SB18002
 *          November 2018
 */

public class Story {
    
    private int xmove;
    private int ymove;
    private int stroynumber;
    private boolean stroyf11= false;
    private boolean stroyf31= false;
    private boolean stroyf13= false;

    /**
     * default constructor
     */
    public Story() {
    }
    
    /**
     *
     * @param Xmove
     * @param Ymove
     */
    public Story(int Xmove,int Ymove)
    {
        this.xmove = Xmove;
        this.ymove = Ymove;
        
    }
    
    /**
     *
     * @param Xmove
     * @param Ymove
     */
    public void storyline(int Xmove, int Ymove) 
    {
        this.xmove = Xmove;
        this.ymove = Ymove;
        xmove = xmove * 10;
        stroynumber = xmove + ymove;
        

        switch (stroynumber) {
            case 11:
                story11();
                break;
            case 12:
                story12();
                break;
            case 13:
                story13();
                break;
            case 21:
                story21();
                break;
            case 22:
                story22();
                break;
            case 23:
                story23();
                break;
            case 31:
                story31();
                break;
            case 32:
                story32();
                break;
            case 33:
                story33();
                break;
        }

    }
    
    /**
     * story11 this method include print out 
     */
    public void story11()
     {
         System.out.println(" ");
         System.out.println("story11");
         System.out.println("You swam to the Hudson river bridge .Your mission to take  over the bridge and control the transport between New York and New Jersey.");
     }

    /**
     *story12 this method include print out 
     */
    public void story12()
     {
         System.out.println(" ");
         System.out.println("story12");
         System.out.println("No enemy activity. You have to climb the Empire State Building. You found a inventory. ");
     }

    /**
     *story13 this method include print out 
     */
    public void story13()
     {
         System.out.println(" ");
         System.out.println("story13");
         System.out.println("You have to fight to take over the communication cell of New York. heavy battlezone. ");
     }

    /**
     * story21 this method include print out 
     */
    public void story21()
     {
         System.out.println(" ");
         System.out.println("story21");
         System.out.println("You arrived to Bronx. You updated your defend system you got extra toughness.");
         
     }

    /**
     *  story22 this method include print out 
     */
    public void story22()
     {
         System.out.println(" ");
         System.out.println("story22");
         System.out.println("You are in  the Central Park Manhattan. This is safe zone no enemy activity.");

     }

    /**
     * story23 this method include print out 
     */
    public void story23()
     {
         System.out.println(" ");
         System.out.println("story23");
         System.out.println("You landed in Brooklyn. Extra health point +1.");
     }

    /**
     * story31 this method include print out 
     */
    public void story31()
     {
         System.out.println(" ");
         System.out.println("story31");
         System.out.println("You took the train You are in the John F. Kennedy Airport. Battle is on.");

     }

    /**
     *  story32 this method include print out 
     */
    public void story32()
     {
         System.out.println(" ");
         System.out.println("story32");
         System.out.println("Prepare yourself to the fight.");
     }

    /**
     *  story33 this method include print out 
     */
    public void story33()
     {
         System.out.println(" ");
         System.out.println("story33");
         System.out.println("You are arrived to Fort Tilden This is where the main bosse’s ship is docked. You take over the ship, you win the battle");
         System.out.println("You need 3 victory If you want to fight with the MAIN BOSS");
         System.out.println("on the finale battle you get some help your unit ready to fight so do not forget to change your characters");
     }

    /**
     * TerranAndZergstory this method include print out 
     */
    public void TerranAndZergstory()
    {
        //TERRAN race introduce
        System.out.println("");
        System.out.println("Now you have to choose race");
        System.out.println("");
        System.out.println("1: TERRAN");
        
             System.out.println("The terrans are relative newcomers to the Koprulu sector. They are the descendents of a disastrous colonization expedition launched from Earth centuries ago,");
             System.out.println("its human cargo made up of dissidents and malcontents the government deemed expendable.");
             System.out.println("The survivors of the expedition established three colonies that became the basis for the major power blocs in terran space: the Confederacy,");
             System.out.println("the Kel-Morian Combine, and the Umojan Protectorate. The corrupt Confederacy was overthrown by terrorist and revolutionary Arcturus Mengsk during the chaos of the zerg invasion.");
             System.out.println("Now the Terran Dominion has emerged from the ashes of the old Confederacy as the dominant power, ruled by none other than Emperor Arcturus I.");
             System.out.println("Forced to adapt to the harsh existence on the mostly lifeless worlds of the sector, the terrans are masters of survival. ");
             System.out.println("With neither the advanced technology of the protoss nor the natural prowess of the zerg to rely on, the terran military forces consist of a varied mix of units. ");
             System.out.println("From basic but effective infantry like the Marines to heavily armed battlecruisers, terran units rely on solid armor, plentiful firepower, and strength in numbers to hold the line. ");
             System.out.println("Terrans excel in defensive situations where their bunkers and Siege Tanks really shine.");
         
        //ZERG race introduce
        System.out.println("");
        System.out.println("2: ZERG");
        
             System.out.println("When the zerg first arrived in the Koprulu sector, they were unified by their absolute obedience to the zerg collective sentience known as the Overmind.");
             System.out.println("Overmind directed the actions of every zerg creature in the Swarm, functioning through a hierarchy of lesser sentients.");
             System.out.println("Although the Overmind was primarily driven by its desire to consume and assimilate the advanced protoss race, it found useful but undeveloped material in humanity.");
             System.out.println("By taking a powerful terran psionic, Sarah Kerrigan, the Overmind evolved a new and unique creature: the Queen of Blades. ");
             System.out.println("After the protoss destroyed the Overmind during the invasion of Aiur, the Queen of Blades eventually came to dominate the Swarm.");
             System.out.println("The zerg are entirely unlike the terrans and the protoss. They are composed of many different species that were integrated into the Swarm via zerg infestation. Such creatures are rapidly and selectively evolved into ruthless killing machines to further the driving zerg imperative of achieving absolute domination.");
             System.out.println("The zerg make no use of technology to create their weapons, armor, or starships.");
             System.out.println("Instead, these functions are efficiently fulfilled through biological adaptation and planned mutation of zerg strains.");
             System.out.println("Instead, these functions are efficiently fulfilled through biological adaptation and planned mutation of zerg strains.");
             System.out.println("Even zerg structures are in fact specialized organs within the living, growing organism of a zerg nest.");
             System.out.println("");
         
    }
    
    /**
     *  ZergStory method
     */
    public void ZergStory()
    {
             System.out.println("");
             System.out.println("The alien spaceship arrives on Earth.The mission is take over the headquarters of human resistance.");
             System.out.println("Your job is to locate and destroy the communication cell  that is setup in New York city and connects human resistance army around the world.");
             System.out.println("");
    }
   
    /**
     *  terran method
     */
    public void TerranStory()
    {
             System.out.println("");
             System.out.println("You just survive a Zerg attack on New York City. Your mission is to take back the communication centers.");
             System.out.println("And call for backup and kill the leader of the Zork.");
             System.out.println("");
    }
    
    /**
     *  
     */
    public void resetStory113113()
    {
         stroyf11= false;
         stroyf31= false;
         stroyf13= false;
    }

    /**
     *  get story number
     * @return
     */
    public int getStroynumber() {
        return stroynumber;
    }

  
    /**
     *
     * @param stroynumber
     */
    public void setStroynumber(int stroynumber) {
        this.stroynumber = stroynumber;
    }

    /**
     *
     * @return
     */
    public boolean isStroyf11() {
        return stroyf11;
    }

    /**
     *
     * @param stroyf11
     */
    public void setStroyf11(boolean stroyf11) {
        this.stroyf11 = stroyf11;
    }

    /**
     *
     * @return
     */
    public boolean isStroyf31() {
        return stroyf31;
    }

    /**
     *
     * @param stroyf31
     */
    public void setStroyf31(boolean stroyf31) {
        this.stroyf31 = stroyf31;
    }

    /**
     *
     * @return
     */
    public boolean isStroyf13() {
        return stroyf13;
    }

    /**
     *
     * @param stroyf13
     */
    public void setStroyf13(boolean stroyf13) {
        this.stroyf13 = stroyf13;
    }
    
    
    
}
