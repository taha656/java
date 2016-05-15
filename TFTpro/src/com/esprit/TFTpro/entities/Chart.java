/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

/**
 *
 * @author Mariem R
 */
public class Chart {
    private int id ;
    private String situationFamille ;
    private int nbjours ;

    public Chart() {
    }

    public Chart(int id, String situationFamille, int nbjours) {
        this.id = id;
        this.situationFamille = situationFamille;
        this.nbjours = nbjours;
    }

    public int getId() {
        return id;
    }

    public String getSituationFamille() {
        return situationFamille;
    }

    public int getNbjours() {
        return nbjours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSituationFamille(String situationFamille) {
        this.situationFamille = situationFamille;
    }

    public void setNbjours(int nbjours) {
        this.nbjours = nbjours;
    }
    
    
}
