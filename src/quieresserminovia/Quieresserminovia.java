/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quieresserminovia;

import javax.swing.UIManager;

/**
 *
 * @author linuxitos
 */
public class Quieresserminovia {
    /**
    * @param args the command line arguments
    */
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
	Main logIn = new Main();
        logIn.setVisible(true);
        String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(str);
        } catch(Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
}
