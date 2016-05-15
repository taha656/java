/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.IresultDAO;
import com.esprit.TFTpro.entities.Matche;
import com.esprit.TFTpro.entities.Result;
import com.esprit.TFTpro.gui.ResultFrame;
import com.esprit.technique.DataSource;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hama
 */
public class ResultDAO implements IresultDAO {
     TextField JTextField;
    private Connection connection;
static ResultSet res;
    private Object nom;
      public ResultDAO() {
          connection = DataSource.getInstance().getConnection();
               
  }
         public void add(Result result) {       
   try {
            String query="INSERT INTO resultat(nomjoueur1,nomjoueur2,set1joueur1,set2joueur1,set3joueur1,set1joueur2,set2joueur2,set3joueur2,gagnant) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =connection.prepareStatement(query);
            
            
 ps.setString(1,result.getJoueur1());
 ps.setString(2,result.getJoueur2());
 ps.setInt(3,result.getSet1joueur1());
 ps.setInt(4,result.getSet2joueur1());
 ps.setInt(5,result.getSet3joueur1());
 ps.setInt(6,result.getSet1joueur2());
 ps.setInt(7,result.getSet2joueur2());
 ps.setInt(8,result.getSet3joueur2());
 ps.setString(9,result.getGagnant());

            ps.executeUpdate();
 
        } 
   catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }

          
    @Override
    public void update(Result m) {
    
        
  String query = "UPDATE resultat SET nomjoueur1=?,nomjoueur2=?,set1joueur1=?,set2joueur1=?,set3joueur1=?,set1joueur2=?,set2joueur2=?,set3joueur2=?,gagnant=?  WHERE id=?"; 
     
        try {

       PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1,m.getJoueur1());
            ps.setString(2,m.getJoueur2());
            ps.setInt(3,m.getSet1joueur1());
            ps.setInt(4,m.getSet2joueur1());
            ps.setInt(5,m.getSet3joueur1());
            ps.setInt(6,m.getSet1joueur2());
            ps.setInt(7,m.getSet2joueur2());
            ps.setInt(8,m.getSet3joueur2());
            ps.setString(9,m.getGagnant());
            ps.setInt(10,m.getIdresultat());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        
            }   
        catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        
          
        }   


    
}

    
    
    
      public void Supprimer(int Idresult) {


        try {
            String query = "DELETE FROM resultat WHERE id='"+Idresult+"'";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
                                   System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }
        
   
      }
    
    
    
    
    
    
    
    

    public List<Result> select() {
            
            
       List<Result> list = new ArrayList<>();
        String requete = "select * from resultat ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
         Result result = new Result();
                result.setIdresultat(resultat.getInt(1));
                result.setJoueur1(resultat.getString(2));         
                result.setJoueur2(resultat.getString(3));
                result.setSet1joueur1(resultat.getInt(4));
                result.setSet2joueur1(resultat.getInt(5));
                result.setSet3joueur1(resultat.getInt(6));
                result.setSet1joueur2(resultat.getInt(7));
                result.setSet2joueur2(resultat.getInt(8));
                result.setSet3joueur2(resultat.getInt(9));
                result.setGagnant(resultat.getString(10));
                
                
                list.add(result);    
                
                                     }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        
        
    }    }

    public List<Result> select2(String a) {

                
       List<Result> list = new ArrayList<>();
        String requete = "select * from resultat where resultat.nomjoueur1 like '%"+a+"%' ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
         Result result = new Result();
                result.setIdresultat(resultat.getInt(1));
                result.setJoueur1(resultat.getString(2));         
                result.setJoueur2(resultat.getString(3));
                result.setSet1joueur1(resultat.getInt(4));
                result.setSet2joueur1(resultat.getInt(5));
                result.setSet3joueur1(resultat.getInt(6));
                result.setSet1joueur2(resultat.getInt(7));
                result.setSet2joueur2(resultat.getInt(8));
                result.setSet3joueur2(resultat.getInt(9));
                result.setGagnant(resultat.getString(10));
                
                
                list.add(result);    
                
                                     }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        
        
    }  

    }

    @Override
    public void supprimer(int Idresult) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
  

