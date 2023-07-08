/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quieresserminovia;

import javax.swing.UIManager;

/**
 *
 * @author blip
 */
public class Quieresserminovia {
    /**
    * @param args the command line arguments
    */
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
	Main logIn = new Main();
        logIn.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
}
