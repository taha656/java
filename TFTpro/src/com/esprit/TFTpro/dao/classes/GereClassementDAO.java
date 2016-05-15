/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.Utilisateur;

import com.esprit.hellopi.dao.interfaces.IClassement; 
import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariem R
 */
public class GereClassementDAO implements IClassement{
     private Connection connection;
    private PreparedStatement pst;
    private ResultSet rs;
    public GereClassementDAO() {
        connection=DataSource.getInstance().getConnection();
        
    }

    public List<Utilisateur> clasement() {
         List<Utilisateur> joueurs = new ArrayList<>();
        String requete = "select prenom,nom,rang from Utilisateurs where Fonction = 'Joueur' order by rang desc ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            GereClassementDAO jd = new GereClassementDAO();
            while (resultat.next()) {
                Utilisateur j = new Utilisateur();
                
                j.setNom(resultat.getString(1));
                j.setPrenom(resultat.getString(2));
                j.setRang(resultat.getInt(3));
                
                
              joueurs.add(j);
                
            }
            return joueurs;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des classements " + ex.getMessage());
            return null;
        }
    }

    
    
    
}
