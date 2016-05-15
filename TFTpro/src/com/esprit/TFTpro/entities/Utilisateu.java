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
public class Utilisateu {
    private int id ;
    private String username ;
    private String username_canonical ;
    private String email ;
    private String email_canonical ;
    private String salt ;
    private String password ;
    private String prenom_user ;
    private String nom_user ;
    private int rangjoueur ;

    public Utilisateu(int id, String username, String username_canonical, String email, String email_canonical, String salt, String password, String prenom_user, String nom_user) {
        this.id = id;
        this.username = username;
        this.username_canonical = username_canonical;
        this.email = email;
        this.email_canonical = email_canonical;
        this.salt = salt;
        this.password = password;
        this.prenom_user = prenom_user;
        this.nom_user = nom_user;
    }
public Utilisateu(){}
    @Override
    public String toString() {
        return "Utilisateurs{" + "id=" + id + ", username=" + username + ", username_canonical=" + username_canonical + ", email=" + email + ", email_canonical=" + email_canonical + ", salt=" + salt + ", password=" + password + ", prenom_user=" + prenom_user + ", nom_user=" + nom_user + ", rangjoueur=" + rangjoueur + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername_canonical() {
        return username_canonical;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_canonical() {
        return email_canonical;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public int getRangjoueur() {
        return rangjoueur;
    }

    public void setRangjoueur(int rangjoueur) {
        this.rangjoueur = rangjoueur;
    }
    
    
    
    
}
