/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;


import com.esprit.TFTpro.dao.classes.ImageDao;
import com.esprit.TFTpro.entities.Image1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class ImageAdapterClient extends AbstractTableModel {
    
     public List<Image1> listimg = new ArrayList<>();
    String[] data = {"Image","Description"};
    
    public ImageAdapterClient() {
        listimg = new ImageDao().select1();
    }
    
    

    @Override
    public int getRowCount() {
                        return listimg.size();

        
    }

    @Override
    public int getColumnCount() {
        return data.length;

        
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
            return "" + listimg.get(rowIndex).getImg();

            case 1:
                return "" + listimg.get(rowIndex).getDescription();
            default:
                return null;   
        }     
        
    }
    
    @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
