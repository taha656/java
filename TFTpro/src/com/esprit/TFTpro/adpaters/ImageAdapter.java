
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
public class ImageAdapter extends AbstractTableModel {
    
    public List<Image1> list1 = new ArrayList<>();
    String[] data = {"Id","Image","Description"};
    
    
    public ImageAdapter() {
        list1 = new ImageDao().select();
    }

    @Override
    public int getRowCount() {
                return list1.size();

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
            return "" + list1.get(rowIndex).getId();           

            case 1:
                return "" + list1.get(rowIndex).getImg();
                
             case 2:
                return "" + list1.get(rowIndex).getDescription();
                
                
                        

         default:
                return null;   
        }
        
        
    }
    
}



    
    
    


