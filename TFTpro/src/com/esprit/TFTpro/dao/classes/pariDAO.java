/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.pari;

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
public class pariDAO {
      private Connection connection;

    public pariDAO() {
       connection= DataSource.getInstance().getConnection();
    }
     public void ajouterPari(pari pari) {
       try {
            String query="INSERT INTO pari (idjeu_id,choix1,choix2,choix3,choix4,choix5,choix6,choix7,choix8,choix9,choix10) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps =connection.prepareStatement(query);
            ps.setInt(1,pari.getIdjeu());
           //  ps.setInt(2,pari.getPrix());
            // ps.setInt(3,pari.getNbJoke());
         ps.setInt(2,pari.getChoix());
         ps.setInt(3,pari.getChoix2());
         ps.setInt(4,pari.getChoix3());
         ps.setInt(5,pari.getChoix4());
         ps.setInt(6,pari.getChoix5());
         ps.setInt(7,pari.getChoix6());
         ps.setInt(8,pari.getChoix7());
         ps.setInt(9,pari.getChoix8());
         ps.setInt(10,pari.getChoix9());
         ps.setInt(11,pari.getChoix10());
        

            ps.executeUpdate();

            
        }
   
   catch (SQLException ex) 
   {
            Logger.getLogger(pariDAO.class.getName()).log(Level.SEVERE, null, ex);
   } }

    public List<pari> select() {
    List<pari> list = new ArrayList<>();
        String requete = "SELECT * FROM `pari`";
        try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                pari pari = new pari();
                pari.setId(resultat.getInt(1));
                pari.setIdjeu(resultat.getInt(2));
                pari.setIdutilisateur(resultat.getInt(3));
                pari.setPrix(resultat.getInt(4));
                pari.setNbJoke(resultat.getInt(5));
                pari.setChoix(resultat.getInt(6));
                pari.setChoix2(resultat.getInt(7));
                pari.setChoix3(resultat.getInt(8));
                pari.setChoix4(resultat.getInt(9));
                pari.setChoix5(resultat.getInt(10));
                pari.setChoix6(resultat.getInt(11));
               pari.setChoix7(resultat.getInt(12));
               pari.setChoix8(resultat.getInt(13));
                pari.setChoix9(resultat.getInt(14));
                 pari.setChoix10(resultat.getInt(15));
                
                
                




                list.add(pari);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        } }
}
