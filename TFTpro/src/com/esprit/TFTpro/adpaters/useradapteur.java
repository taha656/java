/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.UtilisateurDAO;
import com.esprit.TFTpro.entities.Utilisateur;
import com.esprit.hellopi.dao.interfaces.IUtilisateurDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class useradapteur extends AbstractTableModel {

    String[] headers = {"ID", "NOM", "PRENOM", "EMAIL","FONCTION","STATUS"};
    List<Utilisateur> users = new ArrayList<>();
    IUtilisateurDAO userdao;

    public useradapteur() {
        userdao = new UtilisateurDAO();
        users = userdao.Listutilisateur();
    }

    
     @Override
     public Object getValueAt(int rowIndex, int colmunIndex) {
     switch (colmunIndex) {
     case 0:
     return users.get(rowIndex).getId();
     case 1:
     return users.get(rowIndex).getNom();
     case 2:
     return users.get(rowIndex).getPrenom();
          case 3:
     return users.get(rowIndex).getEmail();
               case 4:
     return users.get(rowIndex).getFonction();
                
     case 5:
      return users.get(rowIndex).getAutorisation();
     
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
