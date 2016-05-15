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
public class Commentaire {
    
   private int id ;

    public Commentaire(int id, String com, String email, int idforum) {
        this.id = id;
        this.com = com;
        this.email = email;
        this.idforum = idforum;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "id=" + id + ", com=" + com + ", email=" + email + ", idforum=" + idforum + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String com ;
    private String email ;
    private int idforum ;

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdforum() {
        return idforum;
    }

    public void setIdforum(int idforum) {
        this.idforum = idforum;
    }

    public Commentaire(String com, String email, int idforum) {
        this.com = com;
        this.email = email;
        this.idforum = idforum;
    }
    public Commentaire(){}

}
