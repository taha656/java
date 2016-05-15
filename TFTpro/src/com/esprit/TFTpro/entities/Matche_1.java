/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

import java.util.Date;

/**
 *
 * @author Hama
 */
public class Matche_1 {
 private int idmatche; 
 private String nom_joueur1;
 private String nom_joueur2;
 private String nom_stade;
 private String type;
 private Date date;
 private String resultat;
 private String nomarbitre;

    public String getNomarbitre() {
        return nomarbitre;
    }

    public void setNomarbitre(String nomarbitre) {
        this.nomarbitre = nomarbitre;
    }
 

    public String getNom_joueur1() {
        return nom_joueur1;
    }

    public void setNom_joueur1(String nom_joueur1) {
        this.nom_joueur1 = nom_joueur1;
    }

    public String getNom_joueur2() {
        return nom_joueur2;
    }

    public void setNom_joueur2(String nom_joueur2) {
        this.nom_joueur2 = nom_joueur2;
    }

    public String getNom_stade() {
        return nom_stade;
    }

    public void setNom_stade(String nom_stade) {
        this.nom_stade = nom_stade;
    }

  


    public void setIdmatche(int idmatche) {
        this.idmatche = idmatche;
    }

  

   

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

 
    public int getIdmatche() {
        return idmatche;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public String getResultat() {
        return resultat;
    }
 
 
}
