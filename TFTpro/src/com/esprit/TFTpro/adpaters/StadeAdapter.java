/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;


import com.esprit.TFTpro.dao.classes.stadeDAO;
import com.esprit.TFTpro.entities.stade;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Taha
 */
public class StadeAdapter extends AbstractTableModel{

    List<stade> stades;
    String[] data ={"id","nom","capacite","TypeDeTerrain","surface"};
    
   public StadeAdapter() {
       
        stades = new stadeDAO().select();
        
    }

    @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return stades.size();
    }

    @Override
    public int getColumnCount() {
        return data.length;
    }

  

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
       switch(columnIndex){
           case 0:
               return stades.get(rowIndex).getId();
           case 1:
               return stades.get(rowIndex).getNom();
               case 2:
               return stades.get(rowIndex).getCapacite();
                   case 3:
              return stades.get(rowIndex).getTypeDeTerrain();
                       case 4:
              return stades.get(rowIndex).getSurface();
                   default:
                       return null;
       }
    }
    
}
