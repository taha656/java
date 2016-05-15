/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.ImatcheDAO;
import com.esprit.TFTpro.entities.Matche;

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
public class MatcheDAO implements ImatcheDAO{
    TextField JTextField;
    private Connection connection;
static ResultSet res;
    private Object nom;
    public MatcheDAO() {
        
        connection= DataSource.getInstance().getConnection();
               
       
  }

          
       
       
       
    public void add(Matche matche) {       
   try {
            String query="INSERT INTO matches(nomjoueur1,nomjoueur2,nomstade,types,resultat) VALUES(?,?,?,?,?)";
            PreparedStatement ps =connection.prepareStatement(query);
            ps.setString(1,matche.getNom_joueur1());
            ps.setString(2,matche.getNom_joueur2());
            ps.setString(3,matche.getNom_stade());
            ps.setString(4,matche.getResultat());
            ps.setString(5,matche.getType());

            ps.executeUpdate();

            
        }
   
   catch (SQLException ex) 
   {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
   }    
    
    }
    
    
    
    
        public List<Matche> select() {
            
            
       List<Matche> list = new ArrayList<>();
        String requete = "select * from matches ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
                Matche matche = new Matche();
                matche.setIdmatche(resultat.getInt(1));
                matche.setNom_joueur1(resultat.getString(2));
                matche.setNom_joueur2(resultat.getString(3));
                matche.setNom_stade(resultat.getString(4));
                matche.setType(resultat.getString(5));
                matche.setResultat(resultat.getString(6));
                matche.setNomarbitre(resultat.getString(7));
                   
                list.add(matche);    
                                    }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
        
    }
            public List<Matche> select3() {
            
            
       List<Matche> list = new ArrayList<>();
        String requete = "select id,nomjoueur1,nomjoueur2,nomstade,nomarbitre from matches where resultat is NULL";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
                Matche matche = new Matche();
                matche.setIdmatche(resultat.getInt(1));
                                matche.setNom_joueur1(resultat.getString(2));

                matche.setNom_joueur2(resultat.getString(3));
                matche.setNom_stade(resultat.getString(4));
                
                
                matche.setNomarbitre(resultat.getString(5));
                   
                list.add(matche);    
                                    }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
        
    }
    
        
        
        
/*
        
           public List<Matche> recherchermatche(int a)
           {
       List<Matche> list = new ArrayList<>();
        String requete = "select * from matches  WHERE matches.id="+a+"";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            PreparedStatement ps = connection.prepareStatement(requete);


            while (resultat.next()) {

                Matche matche = new Matche();

                matche.setIdmatche(resultat.getInt(1));
                matche.setNom_joueur1(resultat.getString(2));

                matche.setNom_joueur2(resultat.getString(3));
                matche.setNom_stade(resultat.getString(4));

                matche.setType(resultat.getString(5));
                matche.setResultat(resultat.getString(6));
                
                list.add(matche);
            }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
  */  
    
        
     public void Supprimer(int Idmatche) {


        try {
            String query = "DELETE FROM matches WHERE id='"+Idmatche+"'";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
                                   System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }
        
    
    }
     
     
     
     
     
     
    public Matche Rechercher(int n) {
        
        Matche s=new Matche();
        try {
      
            
            String query = "SELECT * FROM matches WHERE matches.id ='"+n+"'";      
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs=  ps.executeQuery(query);

            
            while (rs.next()) {
                
                
                s.setIdmatche(rs.getInt(1));
                s.setNom_joueur1(rs.getString(2) );
                s.setNom_joueur2(rs.getString(3) );
            
                
                               }
 
        
            
             
        }
        
        
        catch  (SQLException ex) {
                Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
                                }
        

    return s;
    }
      
            public List<Matche> select2(String a) {
       
          Matche matches = new Matche();
        List<Matche> list = new ArrayList<>();
        String requete = "select * from matches where matches.nomjoueur1 like '%"+a+"%'";
        try {
    
            java.sql.Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                        
                Matche matche = new Matche();
                matche.setIdmatche(resultat.getInt(1));
                matche.setNom_joueur1(resultat.getString(2));
                matche.setNom_joueur2(resultat.getString(3));
                matche.setNom_stade(resultat.getString(4));
                matche.setType(resultat.getString(5));
                matche.setResultat(resultat.getString(6));
                matche.setNomarbitre(resultat.getString(7));
                   
                list.add(matche); 

            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }

            
    @Override
    public void update(Matche m) {
    
        
        
            String query = "UPDATE matches SET nomjoueur1=?,nomjoueur2=?,nomstade=?,types=?,resultat=?   WHERE id=?"; 
     
       
            
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,m.getNom_joueur1());
            ps.setString(2,m.getNom_joueur2());
            ps.setString(3,m.getNom_stade());
            ps.setString(4,m.getType());
            ps.setString(5,m.getResultat());
            
            ps.setInt(6,m.getIdmatche());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        }   
        catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }   

 
    
}
    
     public void affecterarbitre(Matche m) {
    
        
        
            String query = "UPDATE matches SET nomarbitre=?   WHERE id=?"; 
     
       
            
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,m.getNomarbitre());
          
            
            ps.setInt(2,m.getIdmatche());
            ps.executeUpdate();
            System.out.println("Arbitre affecté avec succé");
        }   
        catch (SQLException ex) {
            System.out.println("erreur lors de l'affectation " + ex.getMessage());

        }   

 
    
}
    
    
    
  
    /*

    public void supprimer(Matche matche) {
            try {
            String query = "DELETE FROM matches WHERE idmatche='"+matche.getIdmatche()+"'";
            PreparedStatement ps = connection.prepareStatement(query);
           
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
          }
*/

    @Override
    public List<Matche> recherchermatche(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void removematcheById(int id_matche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 

   
    

 
 
    
  
   
  
}
