/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.gui;

import com.esprit.TFTpro.adpaters.JeuAdapter2;

import com.esprit.TFTpro.gui.gererJeuFrame2;
import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author Taha
 */
public class gererJeuFrame extends javax.swing.JFrame {

    /**
     * Creates new form gererJeuFrame
     */
    public gererJeuFrame() {
        initComponents();
        jTable200.setModel(new JeuAdapter2());
      

  
       connection= DataSource.getInstance().getConnection();
    }
       
   private Connection connection;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane8 = new javax.swing.JScrollPane();
        jTable200 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idpa = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable200.setModel(new JeuAdapter2());
        jScrollPane8.setViewportView(jTable200);

        jLabel1.setText("choisissez un jeu :");

        idpa.setText("jLabel2");

        jButton3.setText("Retour");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Deconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idpa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idpa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // 
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        try {
            //        JeuAdapter2 sa = new JeuAdapter2();
            gererJeuFrame2 j = new gererJeuFrame2();
            int index = jTable200.getSelectedRow();
            TableModel table = jTable200.getModel();
            String idJeu = table.getValueAt(index, 0).toString();
            String match1 = table.getValueAt(index, 1).toString();
            String match2 = table.getValueAt(index, 2).toString();
            String match3 = table.getValueAt(index, 3).toString();
            String match4 = table.getValueAt(index, 4).toString();
            String match5 = table.getValueAt(index, 5).toString();
            String match6 = table.getValueAt(index, 6).toString();
            String match7 = table.getValueAt(index, 7).toString();
            String match8 = table.getValueAt(index, 8).toString();
            String match9 = table.getValueAt(index, 9).toString();
            String match10 = table.getValueAt(index, 10).toString();
            
            String sql="select nomjoueur1,nomjoueur2 from matches where id="+match1+"";
            PreparedStatement ps=connection.prepareStatement(sql);
            ResultSet res =ps.executeQuery();
            while(res.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res.getString("nomjoueur1");
            String m2=res.getString("nomjoueur2");

            j.Lmatch1.setText(m1+" vs "+m2);
            
            }
                   String sql2="select nomjoueur1,nomjoueur2 from matches where id="+match2+"";
            PreparedStatement ps2=connection.prepareStatement(sql2);
            ResultSet res2 =ps2.executeQuery();
            while(res2.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m3=res2.getString("nomjoueur1");
            String m4=res2.getString("nomjoueur2");

            j.Lmatch2.setText(m3+" vs "+m4);
            
            }
                   String sql3="select nomjoueur1,nomjoueur2 from matches where id="+match3+"";
            PreparedStatement ps3=connection.prepareStatement(sql3);
            ResultSet res3 =ps3.executeQuery();
            while(res3.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m5=res3.getString("nomjoueur1");
            String m6=res3.getString("nomjoueur2");

            j.Lmatch3.setText(m5+" vs "+m6);
            
            }
                   String sql4="select nomjoueur1,nomjoueur2 from matches where id="+match4+"";
            PreparedStatement ps4=connection.prepareStatement(sql4);
            ResultSet res4 =ps4.executeQuery();
            while(res4.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res4.getString("nomjoueur1");
            String m2=res4.getString("nomjoueur2");

            j.Lmatch4.setText(m1+" vs "+m2);
            
            }
                   String sql5="select nomjoueur1,nomjoueur2 from matches where id="+match5+"";
            PreparedStatement ps5=connection.prepareStatement(sql5);
            ResultSet res5 =ps5.executeQuery();
            while(res5.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res5.getString("nomjoueur1");
            String m2=res5.getString("nomjoueur2");

            j.Lmatch5.setText(m1+" vs "+m2);
            
            }
                   String sql6="select nomjoueur1,nomjoueur2 from matches where id="+match6+"";
            PreparedStatement ps6=connection.prepareStatement(sql6);
            ResultSet res6 =ps6.executeQuery();
            while(res6.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res6.getString("nomjoueur1");
            String m2=res6.getString("nomjoueur2");

            j.Lmatch6.setText(m1+" vs "+m2);
            
            }
                   String sql7="select nomjoueur1,nomjoueur2 from matches where id="+match7+"";
            PreparedStatement ps7=connection.prepareStatement(sql7);
            ResultSet res7 =ps7.executeQuery();
            while(res7.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res7.getString("nomjoueur1");
            String m2=res7.getString("nomjoueur2");

            j.Lmatch7.setText(m1+" vs "+m2);
            
            }
                   String sql8="select nomjoueur1,nomjoueur2 from matches where id="+match8+"";
            PreparedStatement ps8=connection.prepareStatement(sql8);
            ResultSet res8 =ps8.executeQuery();
            while(res8.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res8.getString("nomjoueur1");
            String m2=res8.getString("nomjoueur2");

            j.Lmatch8.setText(m1+" vs "+m2);
            
            }
                   String sql9="select nomjoueur1,nomjoueur2 from matches where id="+match9+"";
            PreparedStatement ps9=connection.prepareStatement(sql9);
            ResultSet res9 =ps9.executeQuery();
            while(res9.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res9.getString("nomjoueur1");
            String m2=res9.getString("nomjoueur2");

            j.Lmatch9.setText(m1+" vs "+m2);
            
            }
                   String sql10="select nomjoueur1,nomjoueur2 from matches where id="+match10+"";
            PreparedStatement ps10=connection.prepareStatement(sql10);
            ResultSet res10 =ps10.executeQuery();
            while(res10.next())
            {
                j.setVisible(true);
            j.LidJe.setText(idJeu);
            String m1=res10.getString("nomjoueur1");
            String m2=res10.getString("nomjoueur2");

            j.Lmatch10.setText(m1+" vs "+m2);
            
            }
           /* j.Lmatch2.setText(match2);
            j.Lmatch3.setText(match3);
            j.Lmatch4.setText(match4);
            j.Lmatch5.setText(match5);
            j.Lmatch6.setText(match6);
            j.Lmatch7.setText(match7);
            j.Lmatch8.setText(match8);
            j.Lmatch9.setText(match9);
            j.Lmatch10.setText(match10);*/
            
//    comm.pack();
            j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(gererJeuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Accueiladmin l =new  Accueiladmin();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Connect l =new  Connect();
        this.setVisible(false);
        l.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gererJeuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gererJeuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gererJeuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gererJeuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gererJeuFrame().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idpa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JTable jTable200;
    // End of variables declaration//GEN-END:variables
}