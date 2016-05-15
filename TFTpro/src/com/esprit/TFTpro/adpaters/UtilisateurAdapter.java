/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;


import com.esprit.TFTpro.dao.classes.UtilisateurDAO;
import com.esprit.TFTpro.entities.Utilisateur;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Taha
 */
public class UtilisateurAdapter extends AbstractTableModel{
     List<Utilisateur> utilisateurs;
    String[] data ={"idUser","email"};
    
   public UtilisateurAdapter() {
       
        utilisateurs = new UtilisateurDAO().select();
        
    }

    
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getRowCount() {
        return utilisateurs.size();
    }

    
    public int getColumnCount() {
        return data.length;
    }

  

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       switch(columnIndex){
           case 0:
               return utilisateurs.get(rowIndex).getIduser();
           case 1:
               return utilisateurs.get(rowIndex).getEmail();
             
                   default:
                       return null;
       }
    }
    
}


