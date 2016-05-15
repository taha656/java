/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;


import com.esprit.TFTpro.entities.Commentaire;
import com.esprit.hellopi.dao.interfaces.Icomm; 
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
public class CommentaireDAO {
   private Connection connection;

    public CommentaireDAO() {
       connection= DataSource.getInstance().getConnection();
    }

    
   
  
     public void add(Commentaire Commentaire){
    
            try 
        {
            String query="INSERT INTO Commentaire (`com`,`email`,`idforum`) VALUES(?,?,?) ";

            PreparedStatement ps =connection.prepareStatement(query);
              
            ps.setString(1,Commentaire.getCom());
            ps.setString(2,Commentaire.getEmail());
             ps.setInt(3,Commentaire.getIdforum());
             ps.executeUpdate();
//            ps.setDate(3, forum.getPublished_at());
        } catch (SQLException ex) {
            Logger.getLogger(ForumDAO.class.getName()).log(Level.SEVERE, null, ex);
        }}

  
//     public List<Commentaire> comment() {
//         List<Commentaire> joueurs = new ArrayList<>();
//        String requete = "select com,email from Commentaire ";
//        try {
//            Statement statement = connection
//                    .createStatement();
//            ResultSet resultat = statement.executeQuery(requete);
//            CommentaireDAO jd = new CommentaireDAO();
//            while (resultat.next()) {
//                Commentaire j = new Commentaire();
//                
////                j.setId(resultat.getInt(1));
//                j.setCom(resultat.getString(1));
//                 j.setEmail(resultat.getString(2));
//                
//                
//              joueurs.add(j);
//                
//            }
//            return joueurs;
//        } catch (SQLException ex) {
//            System.out.println("erreur lors du chargement des classements " + ex.getMessage());
//            return null;
//        }
//       
//    }

//
//   
//
////    @Override
////    public void affiche(Commentaire Commentaire) {
////       String requete = "select * from Commentaire";
////        try {
////            Statement statement = connection
////                    .createStatement();
////            ResultSet resultat = statement.executeQuery(requete);
////            CommentaireDAO fd = new CommentaireDAO();
////            while (resultat.next()) {
////                Commentaire f = new Commentaire();
////                
////                f.setCom(resultat.getString(2));
////                System.out.println(requete);
////                
////
////                
////                
////            }
////            
////        } catch (SQLException ex) {
////            System.out.println("erreur lors du chargement des formation " + ex.getMessage());
////            
////    }  
////    }
////    public ArrayList<String> afficheCommentaire(int id)
////    {
////        ArrayList<String> commentaires = new ArrayList<String>();
////        
////         
////        try {
////             Statement statement = connection
////                     .createStatement();
////            ResultSet resultSet=statement.executeQuery("select id,com from Commentaire");
////            while(resultSet.next())
////            {
////                commentaires.add(""+resultSet.getInt(1)+" "+resultSet.getString(2));
////                    
////            }            
////        } catch (SQLException ex) {
////            System.out.println(ex.getMessage());
////        }
////        finally
////        {
////            return commentaires;
////        }     
////    }   
//
//  
//     public void deleteCommantaire(int id) {
//        String requete = "delete from Commentaire where id=?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(requete);
//            ps.setInt(1, id);
//            ps.executeUpdate();
//            System.out.println("Commentaire supprimée");
//        } catch (SQLException ex) {
//            System.out.println("erreur lors de la suppression " + ex.getMessage());
//        }
//    }
//
//    public void updateCommentaire(Commentaire c) {
//        String requete = "update Commentaire where com=?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(requete);
//            ps.setString(1,c.getCom());
//
//            ps.executeUpdate();
//            System.out.println("Mise à jour effectuée avec succès");
//        } catch (SQLException ex) {
//            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
//        }
//    }
 public List<Commentaire> comment2() {
        List<Commentaire> joueurs = new ArrayList<>();
        String requete = "select c.idforum,c.com,c.email,e.id from forum e, Commentaire c where  e.id = c.idforum";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            CommentaireDAO jd = new CommentaireDAO();
            while (resultat.next()) {
                Commentaire j = new Commentaire();
               
//                j.setId(resultat.getInt(1));
                j.setIdforum(resultat.getInt(1));
                j.setCom(resultat.getString(2));
                j.setEmail(resultat.getString(3));
             
                
              joueurs.add(j);
                
            }
            return joueurs;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des classements " + ex.getMessage());
            return null;
        }
       
    }
   
   
}
