
package javaproject;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import panamahitek.Arduino.PanamaHitek_Arduino;


public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    public Main() {
        initComponents();
        setResizable(false);
        
        Image Icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        setIconImage(Icon);
        try {
            Arduino.arduinoTX("COM2", 9600);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Arduino.sendData("o");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HomeAutomation = new javax.swing.JLabel();
        SpeakerON = new javax.swing.JButton();
        LightON = new javax.swing.JButton();
        FanON = new javax.swing.JButton();
        FanOFF = new javax.swing.JButton();
        LightOFF = new javax.swing.JButton();
        SpeakerOFF = new javax.swing.JButton();
        TV = new javax.swing.JLabel();
        Light = new javax.swing.JLabel();
        Fan = new javax.swing.JLabel();
        Lights = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Automation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeAutomation.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        HomeAutomation.setForeground(new java.awt.Color(255, 255, 255));
        HomeAutomation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeAutomation.setText("Home Automation");
        jPanel1.add(HomeAutomation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 490, -1));

        SpeakerON.setBackground(new java.awt.Color(51, 0, 0));
        SpeakerON.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        SpeakerON.setForeground(new java.awt.Color(255, 255, 255));
        SpeakerON.setText("ON");
        SpeakerON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SpeakerON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakerONActionPerformed(evt);
            }
        });
        jPanel1.add(SpeakerON, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, 30));

        LightON.setBackground(new java.awt.Color(51, 0, 0));
        LightON.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        LightON.setForeground(new java.awt.Color(255, 255, 255));
        LightON.setText("ON");
        LightON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LightON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightONActionPerformed(evt);
            }
        });
        jPanel1.add(LightON, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, 30));

        FanON.setBackground(new java.awt.Color(51, 0, 0));
        FanON.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        FanON.setForeground(new java.awt.Color(255, 255, 255));
        FanON.setText("ON");
        FanON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FanON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FanONActionPerformed(evt);
            }
        });
        jPanel1.add(FanON, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, 30));

        FanOFF.setBackground(new java.awt.Color(51, 0, 0));
        FanOFF.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        FanOFF.setForeground(new java.awt.Color(255, 255, 255));
        FanOFF.setText("OFF");
        FanOFF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FanOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FanOFFActionPerformed(evt);
            }
        });
        jPanel1.add(FanOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 30));

        LightOFF.setBackground(new java.awt.Color(51, 0, 0));
        LightOFF.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        LightOFF.setForeground(new java.awt.Color(255, 255, 255));
        LightOFF.setText("OFF");
        LightOFF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LightOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightOFFActionPerformed(evt);
            }
        });
        jPanel1.add(LightOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 30));

        SpeakerOFF.setBackground(new java.awt.Color(51, 0, 0));
        SpeakerOFF.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        SpeakerOFF.setForeground(new java.awt.Color(255, 255, 255));
        SpeakerOFF.setText("OFF");
        SpeakerOFF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SpeakerOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakerOFFActionPerformed(evt);
            }
        });
        jPanel1.add(SpeakerOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 110, 30));

        TV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TV.setForeground(new java.awt.Color(255, 255, 255));
        TV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TV.setText("Speaker");
        jPanel1.add(TV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        Light.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Light.setForeground(new java.awt.Color(255, 255, 255));
        Light.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Light.setText("Light");
        jPanel1.add(Light, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        Fan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Fan.setForeground(new java.awt.Color(255, 255, 255));
        Fan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fan.setText("Fan");
        jPanel1.add(Fan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        Lights.setBackground(new java.awt.Color(51, 51, 51));
        Lights.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lights.setForeground(new java.awt.Color(0, 153, 51));
        Lights.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corridor", "Living Room", "Bed Room" }));
        Lights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightsActionPerformed(evt);
            }
        });
        jPanel1.add(Lights, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        Back.setBackground(new java.awt.Color(102, 102, 102));
        Back.setForeground(new java.awt.Color(51, 255, 0));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ermias Firdawok\\Desktop\\Java Project\\Main.JPG")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        setBounds(0, 0, 676, 439);
    }// </editor-fold>//GEN-END:initComponents

    private void LightONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LightONActionPerformed
        
        if (LightControl.equals("Corridor")){
            try {
                Arduino.sendData("a");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(LightControl.equals("Living Room")){
            try {
                Arduino.sendData("c");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(LightControl.equals("Bed Room")){
            try {
                Arduino.sendData("e");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
    }//GEN-LAST:event_LightONActionPerformed

    private void LightOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LightOFFActionPerformed
        if (LightControl.equals("Corridor")){
            try {
                Arduino.sendData("b");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(LightControl.equals("Living Room")){
            try {
                Arduino.sendData("d");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(LightControl.equals("Bed Room")){
            try {
                Arduino.sendData("f");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_LightOFFActionPerformed

    private void FanONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FanONActionPerformed
        try {
            Arduino.sendData("g");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_FanONActionPerformed

    private void FanOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FanOFFActionPerformed
        try {
            Arduino.sendData("h");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FanOFFActionPerformed

    private void LightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LightsActionPerformed
        LightControl =(String)Lights.getSelectedItem();
       
        
        
    }//GEN-LAST:event_LightsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Start start = new Start();
        start.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void SpeakerONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakerONActionPerformed
        try {
            Arduino.sendData("i");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SpeakerONActionPerformed

    private void SpeakerOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakerOFFActionPerformed
        try {
            Arduino.sendData("j");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SpeakerOFFActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
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
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private String LightControl;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Fan;
    private javax.swing.JButton FanOFF;
    private javax.swing.JButton FanON;
    private javax.swing.JLabel HomeAutomation;
    private javax.swing.JLabel Light;
    private javax.swing.JButton LightOFF;
    private javax.swing.JButton LightON;
    private javax.swing.JComboBox<String> Lights;
    private javax.swing.JButton SpeakerOFF;
    private javax.swing.JButton SpeakerON;
    private javax.swing.JLabel TV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
