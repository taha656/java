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
public class SesArbAdapter extends AbstractTableModel {
    public List<Session> listArb = new ArrayList<>();
    String[] data = {"Id","Arbitre","Durée", "Date_debut","Date_fin","Type","Lieu"};
   
public SesArbAdapter() {
        listArb = new SessionDAO().select();
    }
    @Override
    public int getRowCount() {
        return listArb.size();

    }

    @Override
    public int getColumnCount() {
   return data.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
switch (columnIndex) {
            case 0:
            return "" + listArb.get(rowIndex).getId();           

            case 1:
                return "" + listArb.get(rowIndex).getNomarbitre();

            case 2:
                return "" + listArb.get(rowIndex).getDuree();           

            case 3:
                return "" + listArb.get(rowIndex).getDate_debut();

            case 4:
               return "" + listArb.get(rowIndex).getDate_fin();

            case 5:
               return "" + listArb.get(rowIndex).getType();
            case 6:
               return "" + listArb.get(rowIndex).getLieu();

            default:
                return null;
        }
        
    }
    @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
