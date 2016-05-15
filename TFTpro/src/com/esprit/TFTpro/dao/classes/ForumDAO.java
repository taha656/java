                                                                                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.forum;

import com.esprit.hellopi.dao.interfaces.IforumDAO;
import com.esprit.technique.DataSource;
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
 * @author Mariem R
 */
public class ForumDAO  implements IforumDAO{
    private Connection connection;

    public ForumDAO() {
       connection= DataSource.getInstance().getConnection();
    }

    @Override
    public void add(forum forum) {
    
        try 
        {
            String query="INSERT INTO forum (`Description`,`titre_du_forum`) VALUES(?,?)";

            PreparedStatement ps =connection.prepareStatement(query);
               ps.setString(1,forum.getDescription());
               ps.setString(2,forum.getTitreDuForum());
        
            
             ps.executeUpdate();
//            ps.setDate(3, forum.getPublished_at());
        } catch (SQLException ex) {
            Logger.getLogger(ForumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    

//    @Override
//    public List<forum> select() {
//        
//        List<forum> formations = new ArrayList<>();
//        String requete = "select * from formation";
//        try {
//            Statement statement = connection
//                    .createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//            ForumDAO fd = new ForumDAO();
//            while (resultat.next()) {
//                forum f = new forum();
//                
//                f.setTitre_du_forum(resultat.getString(2));
//                f.setDescription(resultat.getString(3));
//                f.setPublished_at(resultat.getDate(4));
//                
//
//                forum.add();
//            }
//            return forum;
//        } catch (SQLException ex) {
//            System.out.println("erreur lors du chargement des formation " + ex.getMessage());
//            return null;
//    }

   
    @Override
    public List<forum> DisplayAll() {
         List<forum> forum = new ArrayList<>();
        String requete = "select * from forum";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ForumDAO fd = new ForumDAO();
            while (resultat.next()) {
                forum f = new forum();
                  f.setId(resultat.getInt(1));
                f.setTitre_du_forum(resultat.getString(2));
                f.setDescription(resultat.getString(3));
//                f.setPublished_at(resultat.getDate(4));
              
                

                forum.add(f);
            }
            return forum;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des formation " + ex.getMessage());
            return null;
    }
       
    }

    @Override
    public forum findForumBySubject(String subject) {
          String requete = "SELECT * FROM forum WHERE sujet=? ";

        forum s = null;
        try {
            PreparedStatement statement = connection.prepareStatement(requete);
            statement.setString(1, subject);
            ResultSet rs = statement.executeQuery();
            s = new forum();
            while (rs.next()) {
             s.getTitreDuForum();
             s.getDescription();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return s;
    }

   public void deleteses(int id) {
       
        String requete = "delete from forum where id= ?";
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



   
        
        
    }

