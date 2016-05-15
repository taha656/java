/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.Article;

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
 * @author lenovo
 */
public class ArticleDao {
    
     private Connection connection;
        public ArticleDao() {
         connection = DataSource.getInstance().getConnection();
    }
    
        public void add(Article Ar) {
        try {
            String requete="INSERT INTO article(sujet,date) VALUES(?,?)";                                                                                      

            PreparedStatement ps =connection.prepareStatement(requete);
            ps.setString(1,Ar.getSujet());

            ps.setString(2,Ar.getDate());
            

            ps.executeUpdate();

        } catch (SQLException ex) {
            //Logger.getLogger(SessionDAO.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("erreur lors de l'insertion "+ex.getMessage());

        }
    }
        
        public List<Article> select() {
        
        List<Article> list1 = new ArrayList<>();
    
        String requete = "select * from article";
        try {
            Statement statement = 
                    
                    connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ImageDao iii = new ImageDao();

           while (resultat.next()) {
                Article ar = new Article();
                ar.setId(resultat.getInt(1));
                ar.setSujet(resultat.getString(2));
                ar.setDate(resultat.getString(3));

                
                


                list1.add(ar);
            }
        }
           
           catch (SQLException ex) {
            System.out.println("erreur lors du chargement des images " + ex.getMessage());
            return null;
        }
            return list1;
        }
        
        public List<Article> select1() {
        
        List<Article> liste = new ArrayList<>();
    
        String requete = "select * from article";
        try {
            Statement statement = 
                    
                    connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ImageDao iii = new ImageDao();

           while (resultat.next()) {
                Article a = new Article();
                a.setId(resultat.getInt(1));
                a.setSujet(resultat.getString(2));
                a.setDate(resultat.getString(3));

                
                


                liste.add(a);
            }
        }
           
           catch (SQLException ex) {
            System.out.println("erreur lors du chargement des images " + ex.getMessage());
            return null;
        }
            return liste;
        }
    }

        
        
        
        
        
        
        

