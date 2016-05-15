/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Session;
import java.util.List;


/**
 *
 * @author lenovo
 */
public interface IsessionDAO {
    
public void add(Session ses);
    List<Session> select();

    public void deleteses(int id);
  public void updateSession(Session se );

    
   
    
}
