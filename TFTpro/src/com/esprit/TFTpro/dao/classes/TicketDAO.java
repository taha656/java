/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.IticketDAO;

import com.esprit.TFTpro.entities.Ticket;
import com.esprit.TFTpro.entities.Ticket;

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
 * @author Hama
 */
public class TicketDAO implements IticketDAO {
Connection connection;

 public TicketDAO() {
        
        connection= DataSource.getInstance().getConnection();
               
       
  }



    @Override
    public void add(Ticket Ticket) {

 try {

  String query="INSERT INTO ticket (joueurs,prix,nombreTotal)VALUES(?,?,?)";
  PreparedStatement ps =connection.prepareStatement(query);
  ps.setString(1,Ticket.getJoueurs());
  ps.setInt(2,Ticket.getPrix());
  ps.setInt(3,Ticket.getNbtotal());

            ps.executeUpdate();
 
        } 
   catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    
    
    public List<Ticket> select() {
  List<Ticket> list = new ArrayList<>();
        String requete = "select * from ticket ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
                Ticket ticket = new Ticket();
                   ticket.setIdticket(resultat.getInt(1));
                   ticket.setJoueurs(resultat.getString(2));
                   ticket.setPrix(resultat.getInt(3));
                   ticket.setNbtotal(resultat.getInt(4));

                   
                list.add(ticket);    
                                    }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }    }
        
    public void update(Ticket m) {
    
        
        
            String query = "UPDATE ticket SET joueurs=?,prix=?,nombreTotal=?  WHERE id=?"; 
     
       
            
        try {
            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1,m.getJoueurs());
            ps.setInt(2,m.getPrix());
            ps.setInt(3,m.getNbtotal());
            ps.setInt(4,m.getIdticket());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            
        }   
        catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }   

 

    
}

    public List<Ticket> select2(String a) {
       List<Ticket> list = new ArrayList<>();
        String requete = "select * from ticket where ticket.joueurs like '%"+a+"%' ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                                     
                Ticket ticket = new Ticket();
                   ticket.setIdticket(resultat.getInt(1));
                   ticket.setJoueurs(resultat.getString(2));
                   ticket.setPrix(resultat.getInt(3));
                   ticket.setNbtotal(resultat.getInt(4));

                   
                list.add(ticket);    
                
                
                                       }
            return list; 
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        
    }
}

    public void Supprimer(int Idticket) {

        try {
            String query = "DELETE FROM ticket WHERE id='"+Idticket+"'";
            PreparedStatement ps = connection.prepareStatement(query);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MatcheDAO.class.getName()).log(Level.SEVERE, null, ex);
                                   System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }
        

    }
}
