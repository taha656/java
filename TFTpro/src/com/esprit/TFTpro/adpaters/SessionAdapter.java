/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.SessionDAO;
import com.esprit.TFTpro.entities.Session;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class SessionAdapter extends AbstractTableModel {
    
   public List<Session> listses = new ArrayList<>();
    String[] data = {"Id","Arbitre","Durée", "Date_debut","Date_fin","Type","Lieu"};
    
    public SessionAdapter() {
        listses = new SessionDAO().select();
    }
    @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return listses.size();

    }

    @Override
    public int getColumnCount() {
                return data.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
            return "" + listses.get(rowIndex).getId();           

            case 1:
                return "" + listses.get(rowIndex).getNomarbitre();

            case 2:
                return "" + listses.get(rowIndex).getDuree();           

            case 3:
                return "" + listses.get(rowIndex).getDate_debut();

            case 4:
               return "" + listses.get(rowIndex).getDate_fin();

            case 5:
               return "" + listses.get(rowIndex).getType();
            case 6:
               return "" + listses.get(rowIndex).getLieu();

            default:
                return null;
        }
        
    }
    
}
