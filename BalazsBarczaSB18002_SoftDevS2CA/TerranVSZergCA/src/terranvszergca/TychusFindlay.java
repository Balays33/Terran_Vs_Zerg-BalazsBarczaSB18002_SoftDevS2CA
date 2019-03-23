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
public class TychusFindlay extends Terran
{

    /**
     * constructor
     */
    public TychusFindlay() {
    }
    
    /**
     * pass values
     * @param name
     * @param level
     */
    public TychusFindlay(String name,int level)
    {
        super(name,level);
        
        
    }

    /**
     *
     * @param name
     * @param level
     * @param health
     * @param toughness
     */
    public TychusFindlay(String name,int level,int health,int toughness)
    {
        super(name,level,health,toughness);  
    }
}