/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.TFTpro.entities.Image1;

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
public class ImageDao {
    
     private Connection connection;
        public ImageDao() {
         connection = DataSource.getInstance().getConnection();
        }
        
        
        public void add(Image1 im) {
      
             System.out.println("test1");
               try {
            String requete="INSERT INTO image1(img,description) VALUES(?,?)";                                                                                      

            PreparedStatement ps =connection.prepareStatement(requete);
            

            ps.setBytes(1,im.getImg());
            ps.setString(2, im.getDescription());
        
           ps.executeUpdate();
   System.out.println("tes2");
                 
        } catch (SQLException ex) {
            //Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("erreur lors de l'insertion "+ex.getMessage());

        }
    }
         
    public List<Image1> select() {
        
        List<Image1> list1 = new ArrayList<>();
    
        String requete = "select * from image1";
        try {
            Statement statement = 
                    
                    connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ImageDao iii = new ImageDao();

           while (resultat.next()) {
                Image1 img1 = new Image1();
                img1.setId(resultat.getInt(1));
                img1.setImg(resultat.getBytes(2));
                img1.setDescription(resultat.getString(3));

                
                


                list1.add(img1);
            }
        }
           
           catch (SQLException ex) {
            System.out.println("erreur lors du chargement des images " + ex.getMessage());
            return null;
        }
            return list1;
        }
    public List<Image1> select1() {
        
        List<Image1> listimg = new ArrayList<>();
    
        String requete = "select * from image1";
        try {
            Statement statement = 
                    
                    connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ImageDao iii = new ImageDao();

           while (resultat.next()) {
                Image1 img1 = new Image1();
                img1.setId(resultat.getInt(1));
                img1.setImg(resultat.getBytes(2));
                img1.setDescription(resultat.getString(3));

                
                


                listimg.add(img1);
            }
        }
           
           catch (SQLException ex) {
            System.out.println("erreur lors du chargement des images " + ex.getMessage());
            return null;
        }
            return listimg;
        }
    


    }

