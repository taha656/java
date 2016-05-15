/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.jeuDAO;
import com.esprit.TFTpro.entities.jeu;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Taha
 */
public class JeuAdapter2 extends AbstractTableModel{
      List<jeu> jeux;
    
    String[] data = {"Id","match1","match2","match3","match4","match5","match6","match7","match8","match9","match10","Cagnotte"};
  public JeuAdapter2() {
      
        jeux = new jeuDAO().select();
        
    }
    
 
  
  
  
    @Override
     public int getRowCount() {
        return jeux.size();
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
            return jeux.get(rowIndex).getId();
            case 1:
            return jeux.get(rowIndex).getIdMatch();
            case 2:
            return jeux.get(rowIndex).getIdMatch2();
            case 3:
            return jeux.get(rowIndex).getIdMatch3();
            case 4:
            return jeux.get(rowIndex).getIdMatch4();
            
            case 5:
            return jeux.get(rowIndex).getIdMatch5();

                case 6:
            return jeux.get(rowIndex).getIdMatch6();

                    case 7:
            return jeux.get(rowIndex).getIdMatch7();

                        case 8:
            return jeux.get(rowIndex).getIdMatch8();

                            case 9:
            return jeux.get(rowIndex).getIdMatch9();
                                       case 10:
            return jeux.get(rowIndex).getIdMatch10();
                                
                                                  case 11:
            return jeux.get(rowIndex).getCagnotte();
           
            default:
            return null;
        }
    }
    
}
