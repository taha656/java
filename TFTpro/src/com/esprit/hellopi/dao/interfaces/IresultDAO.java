/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Matche;
import com.esprit.TFTpro.entities.Result;
import com.esprit.TFTpro.gui.ResultFrame;

/**
 *
 * @author Hama
 */
public interface IresultDAO {

    public void add(Result result);
    public void supprimer(int Idresult);
    public void update(Result result);

    
    
    
}
