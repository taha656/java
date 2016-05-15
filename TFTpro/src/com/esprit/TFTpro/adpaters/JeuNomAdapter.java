/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.jeuDAO;
import com.esprit.TFTpro.entities.jeu;
import com.esprit.TFTpro.gui.gererPariFrame3;


import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Taha
 */
public class JeuNomAdapter extends AbstractTableModel{
      List<jeu> jeux;
    
    String[] data = {"Id","match1","match2","match3","match4","match5","match6","match7","match8","match9","match10","Cagnotte"};
  public JeuNomAdapter() {
      
        jeux = new jeuDAO().select();
           connection= DataSource.getInstance().getConnection();
    }
       
   private Connection connection;
    
    
 
  
  
  
    @Override
     public int getRowCount() {
        return jeux.size();
    }
     
     @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }

      @Override
    public int getColumnCount() {
        return data.length;
                                }
    
       @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
            return jeux.get(rowIndex).getId();
            case 1:
                int a=jeux.get(rowIndex).getIdMatch();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+a+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                      String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
            case 2:
                int b=jeux.get(rowIndex).getIdMatch2();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+b+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
            case 3:
                int c=jeux.get(rowIndex).getIdMatch3();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+c+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
            case 4:
                int d=jeux.get(rowIndex).getIdMatch4();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+d+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            case 5:
             int e=jeux.get(rowIndex).getIdMatch5();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+e+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }

                case 6:
               int f=jeux.get(rowIndex).getIdMatch6();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+f+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }

                    case 7:
               int g=jeux.get(rowIndex).getIdMatch7();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+g+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }

                        case 8:
                int h=jeux.get(rowIndex).getIdMatch8();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+h+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }

                            case 9:
                int i=jeux.get(rowIndex).getIdMatch9();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+i+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
                                       case 10:
               int j=jeux.get(rowIndex).getIdMatch10();
               try {
                String sql="select nomjoueur1,nomjoueur2 from matches where id="+j+"";
                PreparedStatement ps=connection.prepareStatement(sql);
                ResultSet res =ps.executeQuery();
                while(res.next())
                {
                     String m1=res.getString("nomjoueur1");
                     String m2=res.getString("nomjoueur2");
            return m1+m2;} } catch (SQLException ex) {
                Logger.getLogger(gererPariFrame3.class.getName()).log(Level.SEVERE, null, ex);
            }
                                
                                                  case 11:
            return jeux.get(rowIndex).getCagnotte();
        
            default:
            return null;
        }
    }
    
}
