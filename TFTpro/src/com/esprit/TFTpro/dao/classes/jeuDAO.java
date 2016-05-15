/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.IjeuDAO;
import com.esprit.TFTpro.entities.jeu;
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
public class jeuDAO implements IjeuDAO{

      private Connection connection;

    public jeuDAO() {
       connection= DataSource.getInstance().getConnection();
    }

    
    @Override
    public void genererPari(jeu jeu) {
       try {
            String query="INSERT INTO jeu(idmatches1_id,cagnotte,idmatches2_id,idmatches3_id,idmatches4_id,idmatches5_id,idmatches6_id,idmatches7_id,idmatches8_id,idmatches9_id,idmatches10_id) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =connection.prepareStatement(query);
            ps.setInt(1,jeu.getIdMatch());
             ps.setInt(2,jeu.getCagnotte());
             ps.setInt(3,jeu.getIdMatch2());
         ps.setInt(4,jeu.getIdMatch3());
          ps.setInt(5,jeu.getIdMatch4());
           ps.setInt(6,jeu.getIdMatch5());
            ps.setInt(7,jeu.getIdMatch6());
             ps.setInt(8,jeu.getIdMatch7());
              ps.setInt(9,jeu.getIdMatch8());
               ps.setInt(10,jeu.getIdMatch9());
                ps.setInt(11,jeu.getIdMatch10());

            ps.executeUpdate();

            
        }
   
   catch (SQLException ex) 
   {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
   } }

    @Override
    public List<jeu> select() {
    List<jeu> list = new ArrayList<>();
        String requete = "select id,idmatches1_id,idmatches2_id,idmatches3_id,idmatches4_id,idmatches5_id,idmatches6_id,idmatches7_id,idmatches8_id,idmatches9_id,idmatches10_id,cagnotte from jeu";
        try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                jeu jeu = new jeu();
                jeu.setId(resultat.getInt(1));
                jeu.setIdMatch(resultat.getInt(2));
               
               
                 
                jeu.setIdMatch2(resultat.getInt(3));
                jeu.setIdMatch3(resultat.getInt(4));
                jeu.setIdMatch4(resultat.getInt(5));
                jeu.setIdMatch5(resultat.getInt(6));
                jeu.setIdMatch6(resultat.getInt(7));
                jeu.setIdMatch7(resultat.getInt(8));
                jeu.setIdMatch8(resultat.getInt(9));
                jeu.setIdMatch9(resultat.getInt(10));
               jeu.setIdMatch10(resultat.getInt(11));
               jeu.setCagnotte(resultat.getInt(12));
               
                
                
                




                list.add(jeu);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        } }
     public List<jeu> select4() {
    List<jeu> list = new ArrayList<>();
        String requete = "SELECT * FROM `jeu` inner join `pari` on jeu.id=pari.idjeu_id  ";
        try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                jeu jeu = new jeu();
                jeu.setId(resultat.getInt(1));
                jeu.setIdMatch(resultat.getInt(2));
                jeu.setCagnotte(resultat.getInt(3));
                jeu.setIdMatch2(resultat.getInt(4));
                jeu.setIdMatch3(resultat.getInt(5));
                jeu.setIdMatch4(resultat.getInt(6));
                jeu.setIdMatch5(resultat.getInt(7));
                jeu.setIdMatch6(resultat.getInt(8));
                jeu.setIdMatch7(resultat.getInt(9));
                jeu.setIdMatch8(resultat.getInt(10));
                jeu.setIdMatch9(resultat.getInt(11));
               jeu.setIdMatch10(resultat.getInt(12));
               jeu.setNbGagnant(resultat.getInt(13));
                
                
                




                list.add(jeu);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        } }
    
}
