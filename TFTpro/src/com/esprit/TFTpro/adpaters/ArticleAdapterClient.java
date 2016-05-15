/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.ArticleDao;
import com.esprit.TFTpro.entities.Article;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class ArticleAdapterClient extends AbstractTableModel {
     
     public List<Article> liste = new ArrayList<>();
    String[] data = {"Sujet","Date"};
    
     public ArticleAdapterClient() {
        liste = new ArticleDao().select1();
    }
    

    @Override
    public int getRowCount() {
        
                        return liste.size();

    }

    @Override
    public int getColumnCount() {
       return data.length;

        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
            return "" + liste.get(rowIndex).getSujet();

            case 1:
                return "" + liste.get(rowIndex).getDate();
            default:
                return null;   
        }    
    }
    
     @Override
    public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
