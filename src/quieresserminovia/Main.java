/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author linuxitos <linuxitos@gmail.com>
 */
package quieresserminovia;

import java.awt.Image;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author linuxitos
 */
public class Main extends javax.swing.JFrame {

	/**
	 * Creates new form Main
	 */
	public Main() {
            initComponents();
            setLocationRelativeTo(null);
            Image im = null;
            try {
                im = ImageIO.read(getClass().getResource("favicon.png"));
                setIconImage(im);
            } catch (IOException ex) {
                //Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
            }
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            this.setTitle("Quieres ser mi novia?");
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jbSi = new javax.swing.JButton();
        jbNo = new javax.swing.JButton();
        jbMessage = new javax.swing.JLabel();
        jlblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpMain.setLayout(null);

        jbSi.setText("Sí");
        jbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiActionPerformed(evt);
            }
        });
        jpMain.add(jbSi);
        jbSi.setBounds(130, 220, 100, 60);

        jbNo.setText("No");
        jbNo.setOpaque(true);
        jbNo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbNoMouseMoved(evt);
            }
        });
        jbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNoActionPerformed(evt);
            }
        });
        jpMain.add(jbNo);
        jbNo.setBounds(290, 220, 100, 60);

        jbMessage.setFont(new java.awt.Font("AntykwaTorunska Medium", 1, 24)); // NOI18N
        jbMessage.setText("¿Quieres ser mi novi@?");
        jpMain.add(jbMessage);
        jbMessage.setBounds(120, 10, 320, 30);

        jlblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quieresserminovia/back.png"))); // NOI18N
        jpMain.add(jlblBack);
        jlblBack.setBounds(0, 0, 570, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNoActionPerformed
        jbNo.setText("Sí");
	jbSi.setText("No");
	JOptionPane.showMessageDialog(null, "Vez que sí querías!! ❤️\nGracias.","Ah! Te chingé!", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
    }//GEN-LAST:event_jbNoActionPerformed

    private void jbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiActionPerformed
	JOptionPane.showMessageDialog(null, "Te amo ❤️","Gracias ❤️", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
    }//GEN-LAST:event_jbSiActionPerformed

    private void jbNoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNoMouseMoved
        int w = jpMain.getWidth();
	int h = jpMain.getHeight();
        int y = ThreadLocalRandom.current().nextInt(0, h - 60);
        int x = ThreadLocalRandom.current().nextInt(0, w - 90);
	jbNo.setLocation (x, y);
	jbNo.setVisible(true);
    }//GEN-LAST:event_jbNoMouseMoved
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            /*try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                    break;
                            }
                    }
            } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }*/
            //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jbMessage;
    private javax.swing.JButton jbNo;
    private javax.swing.JButton jbSi;
    private javax.swing.JLabel jlblBack;
    private javax.swing.JPanel jpMain;
    // End of variables declaration//GEN-END:variables
}
