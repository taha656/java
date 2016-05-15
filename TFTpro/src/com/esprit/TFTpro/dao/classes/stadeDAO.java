/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;


import com.esprit.hellopi.dao.interfaces.IstadeDAO;
import com.esprit.TFTpro.entities.stade;
import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taha
 */
public class stadeDAO implements IstadeDAO{
    
    private Connection connection;

    public stadeDAO() {
       connection= DataSource.getInstance().getConnection();
    }

    
   
    
    
    
    
    
    public void add(stade stade) {
   try {
            String query="INSERT INTO stade(nom,capacite,typeDeTerrain,surface,image) VALUES(?,?,?,?,?)";

            PreparedStatement ps =connection.prepareStatement(query);
            ps.setString(1,stade.getNom());
            ps.setInt(2,stade.getCapacite());
            ps.setString(3,stade.getTypeDeTerrain());
            ps.setInt(4,stade.getSurface());
             ps.setBytes(5,stade.getImage());
             ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(stadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }
    
        public List<stade> select2(String a) {
       
          stade s = new stade();
        List<stade> list = new ArrayList<>();
        String requete = "select * from stade where stade.nom like '%"+a+"%'";
        try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                stade sess = new stade();
                sess.setId(resultat.getInt(1));
                sess.setNom(resultat.getString(2));
                sess.setCapacite(resultat.getInt(3));
                sess.setTypeDeTerrain(resultat.getString(4));
                sess.setSurface(resultat.getInt(3));
                




                list.add(sess);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }

    public List<stade> select() {
       
          
        List<stade> list = new ArrayList<>();
        String requete = "select * from stade";
        try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                stade sess = new stade();
                sess.setId(resultat.getInt(1));
                sess.setNom(resultat.getString(2));
                sess.setCapacite(resultat.getInt(3));
                sess.setTypeDeTerrain(resultat.getString(4));
                sess.setSurface(resultat.getInt(5));
                 sess.setImage(resultat.getBytes(6));
                




                list.add(sess);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
    }
    
    
     public void Supprimer(int id) {

       String requete = "delete from stade where id= ?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    
    }
     
      public stade Rechercher(String n) {
        stade s=new stade();
        try {
            String query = "SELECT * FROM stade WHERE stade.id ='"+n+"'" ;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs=  ps.executeQuery(query);

            while (rs.next()) {
                s.setId(rs.getInt(1));
                s.setNom(rs.getString(2));
                s.setCapacite(rs.getInt(3));
                s.setTypeDeTerrain(rs.getString(4));
                s.setSurface(rs.getInt(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(stadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return s;
    }
      
      
          public void Update(stade stade) {

         try {
            String query = "UPDATE stade SET nom=? , capacite=? , typeDeTerrain=? , surface=? WHERE stade.id='"+stade.getId()+"'";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, stade.getNom()) ;
            ps.setInt(2, stade.getCapacite());
            ps.setString(3, stade.getTypeDeTerrain());
            ps.setInt(4, stade.getSurface());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(stadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    @Override
    public stade Rechercher(int id) {
    stade s=new stade();
        try {
            String query = "SELECT * FROM stade WHERE stade.id ='"+id+"'" ;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs=  ps.executeQuery(query);

            while (rs.next()) {
                s.setId(rs.getInt(1));
                s.setNom(rs.getString(2));
                s.setCapacite(rs.getInt(3));
                s.setTypeDeTerrain(rs.getString(4));
                s.setSurface(rs.getInt(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(stadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return s; }


    
}
