/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;


import com.esprit.TFTpro.entities.jeu;
import com.esprit.TFTpro.entities.pari;
import java.util.List;

/**
 *
 * @author Taha
 */
public interface IpariDao {
  public void ajouterPari(pari pari);  
  List<jeu> select();
}
