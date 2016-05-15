/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Ticket;
import java.util.List;

/**
 *
 * @author Hama
 */
public interface IticketDAO {
                void add(Ticket Ticket);

       List<Ticket> select();

    public void update(Ticket ticket);

}
