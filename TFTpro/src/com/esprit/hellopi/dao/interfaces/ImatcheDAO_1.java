/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;

import com.esprit.TFTpro.entities.Matche;
import com.esprit.TFTpro.entities.Ticket;
import java.util.List;

/**
 *
 * @author Hama
 */
public interface ImatcheDAO_1 {
    
            void add(Matche Matche);
      List<Matche> select();
   public void removematcheById(int id_matche);
    public void update(Matche matche);

    
    public void Supprimer(int idmatch);

   // public Matche Rechercher(Integer n );

   List<Matche> recherchermatche(int a);

    public Matche Rechercher (int s);

    public void affecterarbitre(Matche matche);




}
