package com.esprit.TFTpro.adpaters;


import com.esprit.TFTpro.dao.classes.pariDAO;
import com.esprit.TFTpro.entities.Matche;
import com.esprit.TFTpro.entities.pari;
import com.esprit.technique.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taha
 */
public class JeuJouerAdapter extends AbstractTableModel{
     List<pari> paris;
     private Connection connection;

   
      
    String[] data = {"Id","idjeu","idutilisateur",   "prix",
   "nbJoke",
     "choix",
      "choix2",
      "choix3",
        "choix4",
         "choix5",
         "choix6",
           "choix7",
          "choix8",
             "choix9",
             "choix10","Resultat"};
    
    public JeuJouerAdapter() {
      
        paris = new pariDAO().select();
         connection= DataSource.getInstance().getConnection();
    }
    
 
  
  
  
    @Override
     public int getRowCount() {
        return paris.size();
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
            return paris.get(rowIndex).getId();
            case 1:
            return paris.get(rowIndex).getIdjeu();
            case 2:
            return paris.get(rowIndex).getIdutilisateur();
            case 3:
            return paris.get(rowIndex).getPrix();
            case 4:
            return paris.get(rowIndex).getNbJoke();
            
            case 5:
            return paris.get(rowIndex).getChoix();

                case 6:
            return paris.get(rowIndex).getChoix2();

                    case 7:
            return paris.get(rowIndex).getChoix3();

                        case 8:
            return paris.get(rowIndex).getChoix4();

                            case 9:
            return paris.get(rowIndex).getChoix5();
                                       case 10:
            return paris.get(rowIndex).getChoix6();
                                                  case 11:
            return paris.get(rowIndex).getChoix7();
                                                          case 12:
            return paris.get(rowIndex).getChoix8();
                                                                     case 13:
            return paris.get(rowIndex).getChoix9();
                                                                                case 14:
            return paris.get(rowIndex).getChoix10();
                                                                                                                 case 15:
            // List<Matche> list = new ArrayList<>();
        int res= paris.get(rowIndex).getId();                                                                                                           
        String requete = "SELECT resultat from matches where id=(select idmatch_id from jeu where id=(select idjeu_id from pari where id="+res+"))";
          try {
            java.sql.Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Matche Matche = new Matche();
                Matche.setResultat(resultat.getString(1));
           String a;
            a = Matche.getResultat();
            
           // a = Matche.getResultat();
           // System.out.println(a);
            return a;
            }
            
            return 1;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks " + ex.getMessage());
            return null;
        }  
    }
         return 1;
}}
