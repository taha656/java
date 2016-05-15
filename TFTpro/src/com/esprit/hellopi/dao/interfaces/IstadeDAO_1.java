/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import java.util.List;
import com.esprit.TFTpro.entities.stade;

/**
 *
 * @author Taha
 */
public interface IstadeDAO_1 {
     void add(stade stade);
       List<stade> select();
        List<stade> select2(String a);
      void Supprimer(int id);
      stade Rechercher(String n);
       void Update(stade stade);

    public stade Rechercher(int id);
}
