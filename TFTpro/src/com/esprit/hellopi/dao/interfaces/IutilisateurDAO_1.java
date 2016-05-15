/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Utilisateur;

/**
 *
 * @author Hama
 */
public interface IutilisateurDAO_1 {
    
        Utilisateur authentification(String email,String Pwd);
      void update(Utilisateur m);

}
