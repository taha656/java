/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

/**
 *
 * @author Hama
 */
public class Ticket {
 int idticket;
 public int prix;
 public int nbtotal;
 public String joueurs;

    public String getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(String joueurs) {
        this.joueurs = joueurs;
    }
 

    public int getIdticket() {
        return idticket;
    }

    public void setIdticket(int idticket) {
        this.idticket = idticket;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNbtotal() {
        return nbtotal;
    }

    public void setNbtotal(int nbtotal) {
        this.nbtotal = nbtotal;
    }

   

   

 
    
}
