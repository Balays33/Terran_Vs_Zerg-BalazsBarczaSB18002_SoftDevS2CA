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


public abstract class Terran extends Race {

    //constructor

    /**
     *constructor
     */
    public Terran() {
    }

    /**
     *
     * @param name
     * @param level
     */
    public Terran(String name,int level)
    {
        super(name,level);
    }

    /**
     * pass value
     * @param name
     * @param level
     * @param health
     * @param toughness
     */
    public Terran(String name,int level,int health,int toughness)
    {
        super(name,level,health,toughness);  
    }
}
