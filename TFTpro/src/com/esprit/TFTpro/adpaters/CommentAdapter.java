/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.CommentaireDAO;
import com.esprit.TFTpro.entities.Commentaire;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mariem R
 */
public class CommentAdapter extends AbstractTableModel{
 String[] headers = {"","",""};
    List<Commentaire> users = new ArrayList<>();
        CommentaireDAO jd= new CommentaireDAO();
         public CommentAdapter() {
        
       users = jd.comment2();
        
    }

  
     @Override
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
//            case 0:
//                return users.get(rowIndex).getId();
            case 0:
                return users.get(rowIndex).getIdforum();
            case 1:
                return users.get(rowIndex).getCom();
                 case 2:
                return users.get(rowIndex).getEmail();
                
           
            
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
