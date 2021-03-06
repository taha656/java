/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.MatcheDAO;
import com.esprit.TFTpro.entities.Matche;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Hama
 */
public class MatcheAdapter2 extends AbstractTableModel{
    List<Matche> matches;
    
    String[] data = {"Id","nom joueur 1","nom joueur 2","Stade","Type","Resultat","Arbitre"};
  public MatcheAdapter2(String a) {
      
        matches = new MatcheDAO().select2(a);
        
    }
     public MatcheAdapter2() {
      
        matches = new MatcheDAO().select();
        
    }
    
 
  
  
  
    @Override
     public int getRowCount() {
        return matches.size();
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
            return matches.get(rowIndex).getIdmatche();
            case 1:
            return matches.get(rowIndex).getNom_joueur1();
            case 2:
            return matches.get(rowIndex).getNom_joueur2();
            case 3:
            return matches.get(rowIndex).getNom_stade();
            case 4:
            return matches.get(rowIndex).getType();
            case 5:
            return matches.get(rowIndex).getResultat();
            case 6:
            return matches.get(rowIndex).getNomarbitre();

            default:
            return null;
        }
    }
    
    
    
}
