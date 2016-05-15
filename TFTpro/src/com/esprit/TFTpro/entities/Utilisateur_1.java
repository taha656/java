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
public class Utilisateur_1 {
    private Integer iduser;
  private String email;
    private String pwd;
   private float solde;

    public Utilisateur_1() {
    }

    public Utilisateur_1(Integer iduser, String email, String pwd, float solde) {
        this.iduser = iduser;
        this.email = email;
        this.pwd = pwd;
        this.solde = solde;
        
    }

   
    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
}
