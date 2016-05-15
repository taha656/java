/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.adpaters;

import com.esprit.TFTpro.dao.classes.TicketDAO;
import com.esprit.TFTpro.entities.Ticket;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hama
 */
public class TicketAdapter2 extends AbstractTableModel{
    List<Ticket> tickets;
    String[] data = {"Id","Joueurs","Prix","Nombre"};

    
     public TicketAdapter2(String a) {
      
        tickets = new TicketDAO().select2(a);
                                     }
     
        
     
     
    @Override
    public int getRowCount() {
        return tickets.size();

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
            return tickets.get(rowIndex).getIdticket();
            case 1:
            return tickets.get(rowIndex).getJoueurs();
            case 2:
            return tickets.get(rowIndex).getPrix();
            case 3:
            return tickets.get(rowIndex).getNbtotal();

            default:
            return null;
                }}
    
}
