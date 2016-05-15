/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.IacheterticketDAO;
import com.esprit.TFTpro.entities.Ticket;
import com.esprit.TFTpro.entities.Utilisateur;
import com.esprit.technique.DataSource;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hama
 */
public class AcheterticketDAO implements IacheterticketDAO{
    
       TextField JTextField;
    private Connection connection;
static ResultSet res;
    private Object nom;
    public AcheterticketDAO() {
        
        connection= DataSource.getInstance().getConnection();
               
  }
    
    public void update(Ticket m) {
        
        
        
                      String query= " UPDATE ticket SET nombreTotal=?   WHERE joueurs=? "; 

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,m.getNbtotal());
          //System.out.println(ticket.getJoueurs());  
            ps.setString(2,m.getJoueurs());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        }   
        catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }   

    
}

    @Override
    public void update(Utilisateur utilisateur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
