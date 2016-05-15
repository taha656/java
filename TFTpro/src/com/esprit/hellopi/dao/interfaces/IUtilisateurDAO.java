/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author Asma
 */
public interface IUtilisateurDAO {
     void ajout(Utilisateur Utilisateur);

  
    void ajoutjoueur(Utilisateur user);
    void ajoutarbitre(Utilisateur user);
    void ajoutmedecin (Utilisateur user);
    void ajoutrespensable(Utilisateur user);
    List<Utilisateur> Listutilisateur();
    Utilisateur autorise(Utilisateur user);
    Utilisateur bloquer(Utilisateur user);
    Utilisateur authentification(String email,String Pwd);
      void update(Utilisateur m);

  
}


