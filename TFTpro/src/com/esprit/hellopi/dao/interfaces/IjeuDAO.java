/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.jeu;

import java.util.List;

/**
 *
 * @author Taha
 */
public interface IjeuDAO {
 public void  genererPari(jeu jeu);
 List<jeu> select();
}
