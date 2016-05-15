/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;


import com.esprit.TFTpro.entities.stade;
import java.util.List;

/**
 *
 * @author Taha
 */
public interface IstadeDAO {
     void add(stade stade);
       List<stade> select();
        List<stade> select2(String a);
      void Supprimer(int id);
      stade Rechercher(String n);
       void Update(stade stade);

    public stade Rechercher(int id);
}
