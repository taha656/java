/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;
import java.sql.Date;
/**
 *
 * @author lenovo
 */


public class Session_1 {
     
 private int id; 
 private String nomarbitre;
 private int idutilisateur_id;
 private int duree;
 private String type;
 private String date_debut;
 private String date_fin;
 private String lieu;

    public String getNomarbitre() {
        return nomarbitre;
    }

    public void setNomarbitre(String nomarbitre) {
        this.nomarbitre = nomarbitre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdutilisateur_id(int idutilisateur_id) {
        this.idutilisateur_id = idutilisateur_id;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

   

    public void setType(String type) {
        this.type = type;
    }

    

    public int getId() {
        return id;
    }

    public int getIdutilisateur_id() {
        return idutilisateur_id;
    }

    public int getDuree() {
        return duree;
    }


    public String getType() {
        return type;
    }

    

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_debut() {
        return date_debut;
    }

    


   

    public String getDate_fin() {
        return date_fin;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getLieu() {
        return lieu;
    }

    

    
}
