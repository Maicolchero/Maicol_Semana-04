/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana_04_maicol_gozme;

import Vista.Registro;

/**
 *
 * @author User 17
 */
public class Semana_04_Maicol_Gozme {

    public static void main(String[] args) {
             try {
            // Set HiFi Look and Feel from JTattoo
              javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
} catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(Semana_04_Maicol_Gozme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(Semana_04_Maicol_Gozme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(Semana_04_Maicol_Gozme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Semana_04_Maicol_Gozme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}

         java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Registro().setVisible(true);
        }
    });
    }
}
