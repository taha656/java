/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.Session;
import com.esprit.hellopi.dao.interfaces.IsessionDAO;
import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.Date;
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
 * @author lenovo
 */
public class SessionDAO implements IsessionDAO {

        private Connection connection;
        public SessionDAO() {
         connection = DataSource.getInstance().getConnection();
    }

    
    
    

    @Override
    public void add(Session ses) {
        try {
            String requete="INSERT INTO session(nomarbitre,duree,date_debut,date_fin,type,lieu) VALUES(?,?,?,?,?,?)";                                                                                      

            PreparedStatement ps =connection.prepareStatement(requete);
            ps.setString(1,ses.getNomarbitre());

            ps.setInt(2,ses.getDuree());
            ps.setString(3,ses.getDate_debut());
            ps.setString(4,ses.getDate_fin());
            ps.setString(5,ses.getType());
            ps.setString(6,ses.getLieu());


            ps.executeUpdate();

        } catch (SQLException ex) {
            //Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("erreur lors de l'insertion "+ex.getMessage());

        }
    }

    @Override
    public List<Session> select() {
        
        List<Session> listses = new ArrayList<>();
        String requete = "select * from session";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Session sess = new Session();
                sess.setId(resultat.getInt(1));
                sess.setNomarbitre(resultat.getString(2));
                sess.setDuree(resultat.getInt(3));
                sess.setDate_debut(resultat.getString(4));
                sess.setDate_fin(resultat.getString(5));
                sess.setType(resultat.getString(6));
                sess.setLieu(resultat.getString(7));




                listses.add(sess);
            }
            return listses;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des sessions " + ex.getMessage());
            return null;
        }
    }
    

    public void deleteses(int id) {
       
        String requete = "delete from session where id= ?";
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
public Session findUserById (String id){
 Session  ss = new Session  (); 
   
   return ss;
  }  
  
  // fadi 
   public void updateSession(Session se ){
        String requete = "update session set duree=?, date_debut=?, date_fin=?, type=?,lieu=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, se.getDuree());
            ps.setString(2, se.getDate_debut());
            ps.setString(3, se.getDate_fin());
            ps.setString(4, se.getType());
            ps.setString(5, se.getLieu());
           
      
            

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    
    
    
    
    
    
}
    public List<Session> select1 (){


        List<Session> listArb = new ArrayList<Session>();

        String requete = "select * from session where nomarbitre='?'";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            SessionDAO SesArb = new SessionDAO();
            while(resultat.next()){
                Session ses =new Session();
                ses.setId(resultat.getInt(1));
                ses.setNomarbitre(resultat.getString(2));
                ses.setDuree(resultat.getInt(3));
                ses.setDate_debut(resultat.getString(4));
                ses.setDate_fin(resultat.getString(5));
                ses.setType(resultat.getString(6));
                ses.setLieu(resultat.getString(7));
                 
                listArb.add(ses);
            }
            return listArb;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de sessions "+ex.getMessage());
            return null;
        }
    }

}
    
    
    

    
    

    

    

    
    

