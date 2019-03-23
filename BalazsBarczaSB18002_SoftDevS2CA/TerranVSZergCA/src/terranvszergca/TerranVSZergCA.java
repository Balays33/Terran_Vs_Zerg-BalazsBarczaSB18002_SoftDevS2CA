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
 *          barczabalazs@gmail.com
 */
public class TerranVSZergCA {

    /**
     * @param args the command line arguments
     * This is the main Class 
     * I have created a LogialPRO object it call run game
     * I have used my object and It call the run() method from the LogialPro class
     * I left the main class clear If the future I want add extra game or etc...
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LogialPRO rungame = new LogialPRO();
        rungame.run();
    }
    
}
