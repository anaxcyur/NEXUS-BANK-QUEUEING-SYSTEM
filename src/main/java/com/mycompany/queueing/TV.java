/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.queueing;

import java.awt.Color;

/**
 *
 * @author lucky
 */

public class TV extends javax.swing.JFrame {


//    fsjdfkasjfkfdss
    public TV() {
        initComponents();
         waitingA.setBackground(new Color(0, 0, 0, 0)); 
         waitingB.setBackground(new Color(0, 0, 0, 0)); 
         waitingC.setBackground(new Color(0, 0, 0, 0)); 
         waitingA.setOpaque(false);
         waitingB.setOpaque(false);
         waitingC.setOpaque(false);
         jScrollPane1.setOpaque(false);
         jScrollPane1.getViewport().setOpaque(false);
         jScrollPane2.setOpaque(false);
         jScrollPane2.getViewport().setOpaque(false);
         jScrollPane3.setOpaque(false);
         jScrollPane3.getViewport().setOpaque(false);
         waitingA.setEditable(false);
         waitingB.setEditable(false);
         waitingC.setEditable(false);        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        serveA = new javax.swing.JLabel();
        serveB = new javax.swing.JLabel();
        serveC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        waitingA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        waitingB = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        waitingC = new javax.swing.JTextArea();
        TVbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(755, 383));
        setMinimumSize(new java.awt.Dimension(790, 400));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        serveA.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        serveA.setForeground(new java.awt.Color(255, 153, 0));
        serveA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(serveA);
        serveA.setBounds(90, 140, 150, 80);

        serveB.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        serveB.setForeground(new java.awt.Color(255, 153, 0));
        serveB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(serveB);
        serveB.setBounds(320, 140, 150, 80);

        serveC.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        serveC.setForeground(new java.awt.Color(255, 153, 0));
        serveC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(serveC);
        serveC.setBounds(560, 140, 150, 80);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);

        waitingA.setEditable(false);
        waitingA.setColumns(20);
        waitingA.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        waitingA.setForeground(new java.awt.Color(255, 153, 0));
        waitingA.setRows(5);
        waitingA.setBorder(null);
        jScrollPane1.setViewportView(waitingA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 260, 130, 130);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);

        waitingB.setEditable(false);
        waitingB.setColumns(20);
        waitingB.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        waitingB.setForeground(new java.awt.Color(255, 153, 0));
        waitingB.setRows(5);
        waitingB.setBorder(null);
        jScrollPane2.setViewportView(waitingB);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(340, 260, 130, 130);

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);

        waitingC.setEditable(false);
        waitingC.setColumns(20);
        waitingC.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        waitingC.setForeground(new java.awt.Color(255, 153, 0));
        waitingC.setRows(5);
        waitingC.setBorder(null);
        jScrollPane3.setViewportView(waitingC);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(570, 260, 130, 130);

        TVbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final Design/TV.png"))); // NOI18N
        jPanel1.add(TVbg);
        TVbg.setBounds(0, 0, 794, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TVbg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel serveA;
    public static javax.swing.JLabel serveB;
    public static javax.swing.JLabel serveC;
    public static javax.swing.JTextArea waitingA;
    public static javax.swing.JTextArea waitingB;
    public static javax.swing.JTextArea waitingC;
    // End of variables declaration//GEN-END:variables
}
