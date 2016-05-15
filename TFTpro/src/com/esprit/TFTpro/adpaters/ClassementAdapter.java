/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.GereClassementDAO; 
import com.esprit.TFTpro.entities.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mariem R
 */
public class ClassementAdapter extends AbstractTableModel {
     String[] headers = {"Nom", "Prenom", "Points"};
    List<Utilisateur> users = new ArrayList<>();
        GereClassementDAO jd= new GereClassementDAO();
         public ClassementAdapter() {
        
        users = jd.clasement();
             
        
    }

  
     @Override
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
            case 0:
                return users.get(rowIndex).getNom();
            case 1:
                return users.get(rowIndex).getPrenom();
            case 2:
                return users.get(rowIndex).getRang();
            
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public String getColumnName(int i) {
        return headers[i];
    }
}
