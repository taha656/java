/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.hellopi.dao.interfaces.IUtilisateurDAO;
import com.esprit.TFTpro.entities.Utilisateur;
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

public class UtilisateurDAO  implements IUtilisateurDAO{
    
    private Connection connection;

    public UtilisateurDAO() {
       connection= DataSource.getInstance().getConnection();
    }

    @Override
    public void ajout(Utilisateur user) {
    try {
        

            String req = "insert into utilisateurs (nom,prenom,age,CIN,Fonction,username,password,autorisation) values (?,?,?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(req);
            st.setString(1, user.getNom());
            st.setString(2, user.getPrenom());
            st.setInt(3, user.getAge());
            st.setInt(4, user.getCIN());
            
            st.setString(5,user.getFonction()); 
           
            st.setString(6, user.getLogin());
            st.setString(7, user.getPassword());
            st.setString(8, user.getAutorisation());
            

            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    }
   

   @Override
    public List<Utilisateur> Listutilisateur() {

        List<Utilisateur> users = new ArrayList<>();
        String requete = "SELECT `id`, `nom`, `prenom`, `Fonction`,`email`,`autorisation` FROM `utilisateurs`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            UtilisateurDAO userdao = new UtilisateurDAO();
            while (resultat.next()) {
                Utilisateur user = new Utilisateur();
                user.setId(resultat.getInt(1));
                user.setNom(resultat.getString(2));
                user.setPrenom(resultat.getString(3));
                user.setFonction(resultat.getString(4));
                user.setEmail(resultat.getString(5));
                user.setAutorisation(resultat.getString(6));
                  

                users.add(user);
            }
            return users;
        } catch (SQLException ex) {
            System.out.println("Erreur " + ex.getMessage());
            return null;
        }
    }

    @Override
    public Utilisateur autorise(Utilisateur user) {
try
        {
             Statement statement = connection
                    .createStatement();
            statement.executeUpdate("update utilisateurs set autorisation='autorisé' where id ='"+user.getId()+"'");
             System.out.println("L'utilisateur est maintenant autorisé  ");
        
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return user;  
    } 
   
    @Override
    public Utilisateur bloquer(Utilisateur user) {
 try
        {
             Statement statement = connection
                    .createStatement();
             statement.executeUpdate("update utilisateurs set autorisation='not ok' where id='"+user.getId()+"'");
            System.out.println("Utilisateur bloqué ");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return user;
    }
   
    @Override
    public void ajoutarbitre(Utilisateur user) {
 try {
        
        

            String req = "insert into utilisateurs (nom,prenom,age,CIN,exp,cat,Fonction,username,password,autorisation,email,roles) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, user.getNom());
            ps.setString(2, user.getPrenom());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getCIN());
            ps.setInt(5, user.getExp());
            ps.setString(6, user.getCat());
            ps.setString(7,user.getFonction());
            ps.setString(8, user.getLogin());
            ps.setString(9, user.getPassword());
            ps.setString(10, user.getAutorisation());
            ps.setString(11, user.getEmail());
            ps.setString(12, user.getRole());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        }

    @Override
    public void ajoutjoueur(Utilisateur user) {

 try {
        
        

            String req = "insert into utilisateurs (nom,prenom,age,CIN,grade,cat,Fonction,username,password,autorisation,email) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, user.getNom());
            ps.setString(2, user.getPrenom());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getCIN());
            ps.setString(5, user.getGrade());
            ps.setString(6, user.getCat());
            ps.setString(7,user.getFonction());
            ps.setString(8, user.getLogin());
            ps.setString(9, user.getPassword());
            ps.setString(10, user.getAutorisation());
            ps.setString(11, user.getEmail());
            

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public void ajoutmedecin(Utilisateur user) {


 try {
        
        

            String req = "insert into utilisateurs (nom,prenom,age,CIN,exp,Fonction,login,password,autorisation,email) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, user.getNom());
            ps.setString(2, user.getPrenom());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getCIN());
            ps.setInt(5, user.getExp());
            ps.setString(6,user.getFonction());
            ps.setString(7, user.getLogin());
            ps.setString(8, user.getPassword());
            ps.setString(9, user.getAutorisation());
            ps.setString(10, user.getEmail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ajoutrespensable(Utilisateur user) {


 try {
        

            String req = "insert into utilisateurs (nom,prenom,age,CIN,exp,Fonction,login,password,autorisation,email) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, user.getNom());
            ps.setString(2, user.getPrenom());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getCIN());
                     
            ps.setInt(5, user.getExp());
            ps.setString(6,user.getFonction());
            ps.setString(7, user.getLogin());
            ps.setString(8, user.getPassword());
            ps.setString(9, user.getAutorisation());
            ps.setString(10, user.getEmail());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   

    }

 
         public List<Utilisateur> select() {
       
          
        List<Utilisateur> list = new ArrayList<>(); 
    
        try {

            String query = "select * from utilisateurs";
            PreparedStatement ps=connection.prepareStatement(query);
          
            ResultSet resultat = ps.executeQuery();
            
            
            
            while (resultat.next())
            {
                Utilisateur Utilisateur = new Utilisateur();
                Utilisateur.setIduser(resultat.getInt(1));
                Utilisateur.setEmail(resultat.getString(2));
                Utilisateur.setPwd(resultat.getString(3));
                Utilisateur.setSolde(resultat.getInt(4));
              list.add(Utilisateur);
            }
            
            
            return list;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }
         }
    
    public Utilisateur authentification(String email, String pwd) {
    Utilisateur Utilisateur = new Utilisateur();
        try {

            String query = "select * from utilisateurs where utilisateurs.email=? AND utilisateurs.password=? ";
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setString(1,email);
            ps.setString(2,pwd);
            ResultSet resultat = ps.executeQuery();
            
            
            
            while (resultat.next())
            {
                
                Utilisateur.setIduser(resultat.getInt(1));
                Utilisateur.setEmail(resultat.getString(2));
                Utilisateur.setPwd(resultat.getString(3));
                Utilisateur.setSolde(resultat.getInt(4));
             
            }
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(Utilisateur==null)
        {
            return  null;
        }
        else
            return Utilisateur; 
    }
    
      public void update(Utilisateur m) {
        
        
        
                      String query= " UPDATE utilisateurs SET solde=?   WHERE email=? "; 

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setFloat(1,m.getSolde());
          //System.out.println(ticket.getJoueurs());  
            ps.setString(2,m.getEmail());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        }   
        catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());

        }   

    
      }
   
                
    
    }
