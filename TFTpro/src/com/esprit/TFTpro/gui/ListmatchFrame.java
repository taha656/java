/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.gui;
import com.esprit.TFTpro.adpaters.MatcheAdapter; 

import com.esprit.TFTpro.adpaters.MatcheAdapter2;

import com.esprit.TFTpro.dao.classes.MatcheDAO;
import com.esprit.hellopi.dao.interfaces.ImatcheDAO; 
import com.esprit.TFTpro.entities.Matche;
import com.esprit.technique.DataSource;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hama
 */
public class ListmatchFrame extends javax.swing.JFrame {

    /**
     * Creates new form ListmatchFrame
     */
       private Connection connection;
static ResultSet res;
    private Object nom;
      TextField JTextField;
    int y=0;
    int x;
      public String recuperermailticket1(String email)
    {
        
        meyel2.setText(email);
        return email; 
        
    }
    public ListmatchFrame() {
        initComponents();
         x=0;
        connection= DataSource.getInstance().getConnection();
        
        
        DataSource.getInstance();
      ImatcheDAO dao=new MatcheDAO() {};
        Matche Matche= new Matche();
        
         connection= DataSource.getInstance().getConnection();
 
        DataSource.getInstance();
        
  
        
        
                 String sql="Select nom from utilisateur where role='joueur'"; 
                 String sqlu="Select nom from stade "; 
                 String sqlmodif="Select id from matches "; 

              try {
 PreparedStatement ps=connection.prepareStatement(sql);
 PreparedStatement psu=connection.prepareStatement(sqlu);

            ResultSet res = ps.executeQuery();
            ResultSet resu = psu.executeQuery();

            while(res.next() && resu.next() )
            {
                
 nomjoueur1_ajout.addItem(res.getString("nom"));
 
 //nomjoueur1_modif.addItem(res.getString("nom"));

 nomjoueur2_ajout.addItem(res.getString("nom"));
//nomjoueur2_modif.addItem(res.getString("nom"));

  
  nomstade_ajout.addItem(resu.getString("nom"));
//nomstade_modif.addItem(resu.getString("nom"));


        }
              }
              catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

              try {
 PreparedStatement psmodif=connection.prepareStatement(sqlmodif);

            ResultSet resmodif = psmodif.executeQuery();

            while(resmodif.next() )
            {
//  modif_id.addItem(resmodif.getString("id"));

        }
              }
              catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     

        
        
        
        
        
        
        
        
        
        
        
                 String sqlrechercher="Select id from matches "; 

             try {
 PreparedStatement psrech=connection.prepareStatement(sqlrechercher);
  PreparedStatement pssupp=connection.prepareStatement(sqlrechercher);
        
            ResultSet resrech= psrech.executeQuery();
            ResultSet ressupp= pssupp.executeQuery();

            while(resrech.next() && ressupp.next()  )
            {
                
//  rechercher_id_match.addItem(resrech.getString("id"));
//  supprimer_id_match.addItem(ressupp.getString("id"));
             
            }
            
            
            
              }
              catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
               
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableaffichermatch = new javax.swing.JTable();
        supprimer_match = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomjoueur1_ajout = new javax.swing.JComboBox<String>();
        modif_match_ok = new javax.swing.JButton();
        nomjoueur2_ajout = new javax.swing.JComboBox<String>();
        nomstade_ajout = new javax.swing.JComboBox<String>();
        ajoutmatch_ok = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lMatchId = new javax.swing.JLabel();
        rechmatch = new javax.swing.JTextField();
        resultat_ajout = new javax.swing.JComboBox<String>();
        typematch_ajout = new javax.swing.JComboBox<String>();
        dcnx = new javax.swing.JButton();
        meyel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableaffichermatch.setModel(new MatcheAdapter());
        tableaffichermatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableaffichermatchMouseClicked(evt);
            }
        });
        tableaffichermatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableaffichermatchKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableaffichermatch);

        supprimer_match.setText("Supprimer");
        supprimer_match.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_matchActionPerformed(evt);
            }
        });

        jLabel2.setText("joueur2");

        jLabel3.setText("joueur1");

        jLabel4.setText("Stade");

        jLabel1.setText("Type");

        jLabel5.setText("Resultat");

        modif_match_ok.setText("modifier");
        modif_match_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif_match_okActionPerformed(evt);
            }
        });

        nomstade_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomstade_ajoutActionPerformed(evt);
            }
        });

        ajoutmatch_ok.setText("Ajouter");
        ajoutmatch_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutmatch_okActionPerformed(evt);
            }
        });

        jLabel13.setText("Id");

        rechmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechmatchActionPerformed(evt);
            }
        });
        rechmatch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rechmatchPropertyChange(evt);
            }
        });

        resultat_ajout.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2-0", "2-1", "0-2", "1-2" }));

        typematch_ajout.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "amateur", "professionel" }));

        dcnx.setText("Se déconnecter");
        dcnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcnxActionPerformed(evt);
            }
        });

        jLabel6.setText("Welcome ");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rechmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ajoutmatch_ok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(supprimer_match)
                                .addGap(18, 18, 18)
                                .addComponent(modif_match_ok))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomjoueur1_ajout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomjoueur2_ajout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomstade_ajout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lMatchId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultat_ajout, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typematch_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(766, 766, 766)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(dcnx))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(meyel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(184, 184, 184)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(rechmatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(27, 27, 27)
                        .addComponent(dcnx))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(meyel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(lMatchId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(nomjoueur1_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomjoueur2_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomstade_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(typematch_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(resultat_ajout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modif_match_ok)
                                .addComponent(supprimer_match))
                            .addComponent(ajoutmatch_ok))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void supprimer_matchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_matchActionPerformed

        
                ImatcheDAO dao = new MatcheDAO();

               MatcheAdapter ma = new MatcheAdapter();
        int x = tableaffichermatch.getSelectedRow();
        
        if(x == -1){
            
        JOptionPane.showMessageDialog(null, "\"Veuillez sélectioné une session !\"");
            
        }else{

            int Idmatche = Integer.parseInt(ma.getValueAt(x, 0).toString());
         //   System.out.println(id);
            new MatcheDAO().Supprimer(Idmatche);
           // sa.stades = new stadeDAO().select();
                        
        }
      
        tableaffichermatch.setModel(new MatcheAdapter());// TODO add your handling code here:

        
        
        
        
        
                
        
        
                
        
    }//GEN-LAST:event_supprimer_matchActionPerformed

    private void modif_match_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modif_match_okActionPerformed

        // TODO add your handling code here:
        
        DataSource.getInstance();
        MatcheAdapter sa = new MatcheAdapter();
        int x = tableaffichermatch.getSelectedRow();
        ImatcheDAO dao=new MatcheDAO();
        Matche matche= new Matche();
        matche.setIdmatche(Integer.parseInt(lMatchId.getText()));
        System.out.println(matche.getIdmatche());
        
          matche.setNom_joueur1(nomjoueur1_ajout.getSelectedItem().toString());
        matche.setNom_joueur2(nomjoueur2_ajout.getSelectedItem().toString());
        matche.setNom_stade(nomstade_ajout.getSelectedItem().toString());
        matche.setResultat(resultat_ajout.getSelectedItem().toString());
        matche.setType(typematch_ajout.getSelectedItem().toString());
        
        
        dao.update(matche);
        tableaffichermatch.setModel(new MatcheAdapter());
        JOptionPane.showMessageDialog(null, "Votre stade a ete modifier", "", JOptionPane.WARNING_MESSAGE);
        tableaffichermatch.setModel(new MatcheAdapter());// TODO add your handling code here:

        
   
        
    
        
        
        ///////////:::taaaaaahaaaa
        
        
        
    }//GEN-LAST:event_modif_match_okActionPerformed

    private void nomstade_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomstade_ajoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomstade_ajoutActionPerformed

    private void ajoutmatch_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutmatch_okActionPerformed
        // TODO add your handling code here:
      //  MatcheAdapter m = new MatcheAdapter();
        
        
     //   JTable model =JTable tableaffichermatch.getModel();
     
        DataSource.getInstance();
        ImatcheDAO dao=new MatcheDAO();
        Matche matche= new Matche();
        matche.setNom_joueur1(nomjoueur1_ajout.getSelectedItem().toString());
        matche.setNom_joueur2(nomjoueur2_ajout.getSelectedItem().toString());
        matche.setNom_stade(nomstade_ajout.getSelectedItem().toString());
        matche.setResultat(resultat_ajout.getSelectedItem().toString());
        matche.setType(typematch_ajout.getSelectedItem().toString());
        dao.add(matche);
        tableaffichermatch.setModel(new MatcheAdapter());

      //  model.addRow(new Object[]{nomjoueur1_ajout.getSelectedItem().toString(),nomjoueur2_ajout.getSelectedItem().toString(),nomstade_ajout.getSelectedItem().toString(),resultat_ajout.getText(),typematch_ajout.getText()});
        
    }//GEN-LAST:event_ajoutmatch_okActionPerformed

    private void tableaffichermatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableaffichermatchMouseClicked
        // TODO add your handling code here:
       
             
             
             
             
             
             
             
             
             //////////////////////////////////////////
            
             
             
             
             
             
                          
   
        
             
        
    }//GEN-LAST:event_tableaffichermatchMouseClicked

    private void tableaffichermatchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableaffichermatchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableaffichermatchKeyPressed

    private void rechmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechmatchActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_rechmatchActionPerformed
   public String genCod(String email)
    {
        
        meyel2.setText(email);
        return email;
        
        
    }
   
    private void rechmatchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rechmatchPropertyChange
        // TODO add your handling code here
        ImatcheDAO dao = new MatcheDAO();
        Matche match = new Matche();
        String s=rechmatch.getText();
        tableaffichermatch.setModel(new MatcheAdapter2(s));



    }//GEN-LAST:event_rechmatchPropertyChange

    private void dcnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcnxActionPerformed
        // TODO add your handling code here:
    Connect l =new  Connect();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_dcnxActionPerformed

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
            java.util.logging.Logger.getLogger(ListmatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListmatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListmatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListmatchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListmatchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutmatch_ok;
    private javax.swing.JButton dcnx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMatchId;
    private javax.swing.JLabel meyel2;
    private javax.swing.JButton modif_match_ok;
    private javax.swing.JComboBox<String> nomjoueur1_ajout;
    private javax.swing.JComboBox<String> nomjoueur2_ajout;
    private javax.swing.JComboBox<String> nomstade_ajout;
    private javax.swing.JTextField rechmatch;
    private javax.swing.JComboBox<String> resultat_ajout;
    private javax.swing.JButton supprimer_match;
    private javax.swing.JTable tableaffichermatch;
    private javax.swing.JComboBox<String> typematch_ajout;
    // End of variables declaration//GEN-END:variables
}
