/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.gui;


import com.esprit.TFTpro.adpaters.ResultAdapter;
import com.esprit.TFTpro.adpaters.ResultAdapter2; 
import com.esprit.TFTpro.dao.classes.MatcheDAO;
import com.esprit.TFTpro.dao.classes.ResultDAO; 
import com.esprit.hellopi.dao.interfaces.IresultDAO;
import com.esprit.TFTpro.entities.Result;
import com.esprit.technique.DataSource;
import java.awt.TextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Hama
 */
public class ResultFrame extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    
 TextField JTextField;
private java.sql.Connection connection;
static ResultSet res;
    private Object nom;    

    int resultatjoueur1=0;
    int resultatjoueur2=0;
    
    public ResultFrame() {
        
        
        initComponents();
        
        
        
        
        connection=DataSource.getInstance().getConnection();
        
        DataSource.getInstance();
        IresultDAO dao=new ResultDAO() {};
       Result result= new Result();
                 String sql="Select nom from utilisateur where role='joueur'"; 

              try {
 PreparedStatement ps=connection.prepareStatement(sql);
 PreparedStatement psu=connection.prepareStatement(sql);

            ResultSet res = ps.executeQuery();
            ResultSet resu = psu.executeQuery();

            while(res.next() && resu.next()  )
            {
 joueur1_ajoutresultat.addItem(res.getString("nom"));
  joueur2_ajoutresultat.addItem(res.getString("nom"));
// modifier_joueur1_resultat.addItem(res.getString("nom"));
 //modifier_joueur2_resultat.addItem(res.getString("nom"));

        }
            
              }
                catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       public String recuperermailticket1(String email)
    {
        
        meyel.setText(email);
        return email;
        
        
    }
       
       
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajout_result = new javax.swing.JButton();
        joueur1_ajoutresultat = new javax.swing.JComboBox<>();
        joueur2_ajoutresultat = new javax.swing.JComboBox<>();
        set1joueur1_ajoutresultat = new javax.swing.JComboBox<>();
        set1joueur2_ajoutresultat = new javax.swing.JComboBox<>();
        set2joueur2_ajoutresultat = new javax.swing.JComboBox<>();
        set2joueur1_ajoutresultat = new javax.swing.JComboBox<>();
        set3joueur1_ajoutresultat = new javax.swing.JComboBox<>();
        set3joueur2_ajoutresultat = new javax.swing.JComboBox<>();
        modifier_result = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableresult = new javax.swing.JTable();
        supprimerresultat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dcnx = new javax.swing.JButton();
        meyel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gagnant = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResultatId = new javax.swing.JLabel();
        rechercheresultat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ajout_result.setText("Ajouter");
        ajout_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout_resultActionPerformed(evt);
            }
        });

        set1joueur1_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        set1joueur1_ajoutresultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set1joueur1_ajoutresultatActionPerformed(evt);
            }
        });

        set1joueur2_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        set2joueur2_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        set2joueur1_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        set3joueur1_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        set3joueur2_ajoutresultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        modifier_result.setText("Modifier");
        modifier_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_resultActionPerformed(evt);
            }
        });

        jTableresult.setModel(new ResultAdapter());
        jTableresult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableresultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableresult);

        supprimerresultat.setText("Supprimer");
        supprimerresultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerresultatActionPerformed(evt);
            }
        });

        jLabel11.setText("Joueur1");

        jLabel12.setText("Joueur2");

        jLabel13.setText("Set 1");

        jLabel14.setText("Set 2");

        jLabel15.setText("Set 3");

        dcnx.setText("Se déconnecter");
        dcnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcnxActionPerformed(evt);
            }
        });

        meyel.setText("jLabel2");

        jLabel6.setText("Welcome ");

        jLabel1.setText("Gagnant");

        jLabel2.setText("Id résultat");

        ResultatId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultatIdMouseClicked(evt);
            }
        });

        rechercheresultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheresultatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResultatId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(set2joueur1_ajoutresultat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(set3joueur1_ajoutresultat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(set1joueur2_ajoutresultat, 0, 42, Short.MAX_VALUE)
                                            .addComponent(set2joueur2_ajoutresultat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(set3joueur2_ajoutresultat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(79, 79, 79)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rechercheresultat, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(dcnx))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(meyel)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(40, 40, 40)
                                .addComponent(set1joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gagnant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(joueur2_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 728, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajout_result)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(modifier_result, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(supprimerresultat)))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResultatId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(meyel)
                                    .addComponent(rechercheresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dcnx)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(joueur2_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(set1joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(set1joueur2_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(set2joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(set2joueur2_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(set3joueur1_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(set3joueur2_ajoutresultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gagnant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supprimerresultat)
                            .addComponent(modifier_result)
                            .addComponent(ajout_result))
                        .addGap(156, 156, 156))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajout_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout_resultActionPerformed
        // TODO add your handling code here:
        DataSource.getInstance();
        IresultDAO dao=new ResultDAO();
        Result result= new Result();
       // result.setJoueur1(joueur1_ajoutresultat.getText());
       // result.setJoueur1(joueur2_ajoutresultat.getText());

       
  
  result.setJoueur1(joueur1_ajoutresultat.getSelectedItem().toString());
  result.setJoueur2(joueur2_ajoutresultat.getSelectedItem().toString());
  result.setSet1joueur1(Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet2joueur1(Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet3joueur1(Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet1joueur2(Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()));
  result.setSet2joueur2(Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()));
  result.setSet3joueur2(Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()));

  
  
  //calculer resultat
  
  if (Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
  if (Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
   if (Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
   
   
    
  if (Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
  if (Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
   if (Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
   
   if (resultatjoueur1>resultatjoueur2)
   { 

       gagnant.setText(joueur1_ajoutresultat.getSelectedItem().toString());
       
   }
  else  if (resultatjoueur1<resultatjoueur2)
   { 

       gagnant.setText(joueur2_ajoutresultat.getSelectedItem().toString());
       
   }
   
result.setGagnant(gagnant.getText());

  if ((set2joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set2joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set2joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set2joueur2_ajoutresultat.getSelectedItem().toString().equals("7") ) && (set3joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set3joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set3joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set3joueur2_ajoutresultat.getSelectedItem().toString().equals("7")) && (set1joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set1joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set1joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set1joueur2_ajoutresultat.getSelectedItem().toString().equals("7")) )
  {
               dao.add(result);

  }
   else 
   {
       
JOptionPane.showMessageDialog(null, "\"Verifier les valeurs !\"");
   
 
   }
        
  jTableresult.setModel(new ResultAdapter());// TODO add your handling code here:
  
  resultatjoueur1=0;
  resultatjoueur2=0;
  
    }//GEN-LAST:event_ajout_resultActionPerformed

    private void set1joueur1_ajoutresultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set1joueur1_ajoutresultatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_set1joueur1_ajoutresultatActionPerformed

    private void modifier_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_resultActionPerformed
        // TODO add your handling code here:
        DataSource.getInstance();
        ResultAdapter sa = new ResultAdapter();
        int x = jTableresult.getSelectedRow();
        IresultDAO dao=new ResultDAO();
        Result result= new Result();
        result.setIdresultat(Integer.parseInt(ResultatId.getText()));
        
  result.setJoueur1(joueur1_ajoutresultat.getSelectedItem().toString());
  result.setJoueur2(joueur2_ajoutresultat.getSelectedItem().toString());
  result.setSet1joueur1(Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet2joueur1(Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet3joueur1(Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()));
  result.setSet1joueur2(Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()));
  result.setSet2joueur2(Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()));
  result.setSet3joueur2(Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()));
        

  if (Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
  if (Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
   if (Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()) > Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur1= resultatjoueur1+1;  
  }
   
   
    
  if (Integer.parseInt(set1joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set1joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
  if (Integer.parseInt(set2joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set2joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
   if (Integer.parseInt(set3joueur1_ajoutresultat.getSelectedItem().toString()) < Integer.parseInt(set3joueur2_ajoutresultat.getSelectedItem().toString()))
  {
   resultatjoueur2= resultatjoueur2+1;  
  }
   
   if (resultatjoueur1>resultatjoueur2)
   { 

       gagnant.setText(joueur1_ajoutresultat.getSelectedItem().toString());
       
   }
  else  if (resultatjoueur1<resultatjoueur2)
   { 

       gagnant.setText(joueur2_ajoutresultat.getSelectedItem().toString());
       
   }
   
   
        
result.setGagnant(gagnant.getText());


if ((set2joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set2joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set2joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set2joueur2_ajoutresultat.getSelectedItem().toString().equals("7") ) && (set3joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set3joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set3joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set3joueur2_ajoutresultat.getSelectedItem().toString().equals("7")) && (set1joueur1_ajoutresultat.getSelectedItem().toString().equals("6") || set1joueur2_ajoutresultat.getSelectedItem().toString().equals("6") || set1joueur1_ajoutresultat.getSelectedItem().toString().equals("7") || set1joueur2_ajoutresultat.getSelectedItem().toString().equals("7")) )
  {
        
        dao.update(result);
        JOptionPane.showMessageDialog(null, "Votre stade a ete modifier", "", JOptionPane.WARNING_MESSAGE);
        jTableresult.setModel(new ResultAdapter());
        
  }
   else 
   {
       
JOptionPane.showMessageDialog(null, "\"Verifier les valeurs !\"");
   
 
   }
        
        
        
    }//GEN-LAST:event_modifier_resultActionPerformed

    private void supprimerresultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerresultatActionPerformed
        // TODO add your handling code here:
         IresultDAO dao = new ResultDAO();

               ResultAdapter ma = new ResultAdapter();
        int x = jTableresult.getSelectedRow();
        
        if(x == -1){
            
        JOptionPane.showMessageDialog(null, "\"Veuillez sélectioné une session !\"");
            
        }
        else{

            int Idresultat = Integer.parseInt(ma.getValueAt(x, 0).toString());
         //   System.out.println(id);
            new ResultDAO().Supprimer(Idresultat);
           // sa.stades = new stadeDAO().select();
        }
      
        jTableresult.setModel(new ResultAdapter());// TODO add your handling code here:

        
        
    }//GEN-LAST:event_supprimerresultatActionPerformed

    private void dcnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcnxActionPerformed
        // TODO add your handling code here:
        Connect l =new  Connect();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_dcnxActionPerformed

    private void jTableresultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableresultMouseClicked
        // TODO add your handling code here:
          int x = jTableresult.getSelectedRow();
                   ResultAdapter sa = new ResultAdapter();

  String id = sa.getValueAt(x, 0).toString();
  
  ResultatId.setText(id);
    }//GEN-LAST:event_jTableresultMouseClicked

    private void ResultatIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultatIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultatIdMouseClicked

    private void rechercheresultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheresultatActionPerformed
        // TODO add your handling code here:
                        IresultDAO dao = new ResultDAO();
        
        Result result = new Result();
        String s=rechercheresultat.getText();

        
        jTableresult.setModel(new ResultAdapter2(s));

    }//GEN-LAST:event_rechercheresultatActionPerformed

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
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ResultatId;
    private javax.swing.JButton ajout_result;
    private javax.swing.JButton dcnx;
    private javax.swing.JLabel gagnant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableresult;
    private javax.swing.JComboBox<String> joueur1_ajoutresultat;
    private javax.swing.JComboBox<String> joueur2_ajoutresultat;
    private javax.swing.JLabel meyel;
    private javax.swing.JButton modifier_result;
    private javax.swing.JTextField rechercheresultat;
    private javax.swing.JComboBox<String> set1joueur1_ajoutresultat;
    private javax.swing.JComboBox<String> set1joueur2_ajoutresultat;
    private javax.swing.JComboBox<String> set2joueur1_ajoutresultat;
    private javax.swing.JComboBox<String> set2joueur2_ajoutresultat;
    private javax.swing.JComboBox<String> set3joueur1_ajoutresultat;
    private javax.swing.JComboBox<String> set3joueur2_ajoutresultat;
    private javax.swing.JButton supprimerresultat;
    // End of variables declaration//GEN-END:variables
}
