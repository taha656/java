/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.ForumDAO;
import com.esprit.TFTpro.entities.forum;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mariem R
 */
public class ListeForumAdapter extends AbstractTableModel{
    String[] headers = {"Id","Titre", "Description"};
   public List<forum> forum = new ArrayList<>();
        ForumDAO jd= new ForumDAO();
         public ListeForumAdapter() {
        
        forum = jd.DisplayAll();
        
    }

  
     @Override
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
                  case 0:
                return forum.get(rowIndex).getId();
            case 1:
                return forum.get(rowIndex).getTitreDuForum();
            case 2:
                return forum.get(rowIndex).getDescription();
            
            
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return forum.size();
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
