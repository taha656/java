
package com.esprit.TFTpro.entities;


public class stade {
    private int id;
    private String nom;
    private int capacite;
    private String typeDeTerrain;
    private int surface;
private byte [] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
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
