/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

/**
 *
 * @author Taha
 */
public class stade_1 {
    private int id;
    private String nom;
    private int capacite;
    private String typeDeTerrain;
    private int surface;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getTypeDeTerrain() {
        return typeDeTerrain;
    }

    public void setTypeDeTerrain(String typeDeTerrain) {
        this.typeDeTerrain = typeDeTerrain;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
    
}
