/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.ResultDAO;
import com.esprit.TFTpro.entities.Matche;
import com.esprit.TFTpro.entities.Result;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hama
 */
public class ResultAdapter extends AbstractTableModel{
        List<Result> result;
    
    String[] data = {"Id","joueur 1","joueur 2","Set1 J1","Set2 J1","Set3 J1","Set1 J2","Set2 J2","Set3 J2","Gagnant"};
  public ResultAdapter() {
        result = new ResultDAO().select();
        
    }
    @Override
    public int getRowCount() {
        return result.size();
    
    }

    @Override
    public int getColumnCount() {
        return data.length;
    }
     public String getColumnName(int column) {
        return data[column]; //To change body of generated methods, choose Tools | Templates.
    }
     

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    switch (columnIndex) {
            case 0:
            return result.get(rowIndex).getIdresultat();
            case 1:
            return result.get(rowIndex).getJoueur1();
            case 2:
            return result.get(rowIndex).getJoueur2();
            case 3:
            return result.get(rowIndex).getSet1joueur1();
            case 4:
            return result.get(rowIndex).getSet2joueur1();
            case 5:
            return result.get(rowIndex).getSet3joueur1();
            case 6:
            return result.get(rowIndex).getSet1joueur2();
            case 7:
            return result.get(rowIndex).getSet2joueur2();
            case 8:
            return result.get(rowIndex).getSet3joueur2();
            case 9:
            return result.get(rowIndex).getGagnant();

            default:
            return null;
        }    }

}
