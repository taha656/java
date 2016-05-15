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
public class ArticleAdapter  extends AbstractTableModel {
    
    public List<Article> list1  = new ArrayList<>();
    String[] data = {"Id","sujet","date"};
    
public ArticleAdapter() {
        list1 = new ArticleDao().select();
    }
    
    @Override
    public int getRowCount() {
    return list1.size();

        
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
                return "" + list1.get(rowIndex).getSujet();

            case 2:
                return "" + list1.get(rowIndex).getDate(); 
                default:
                return null;

    }
    }
    
     @Override
    public String getColumnName(int column) {
      
    
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
