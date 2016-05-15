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
public class Utilisateur_2 {
    private Integer iduser;
    
    
    
    private String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    public Integer solde;
    String competencearbitre;
    int experiencearbitre;

  
    String nom_user;
    String prenom_user;
    int age_user;
    int CIN_user;
    String photo_user;
    String grade_user;
    int exp_user;
    String cat_user;
    String autorisation;
    String role;
    String login_user;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public String getCompetencearbitre() {
        return competencearbitre;
    }

    public void setCompetencearbitre(String competencearbitre) {
        this.competencearbitre = competencearbitre;
    }

    public int getExperiencearbitre() {
        return experiencearbitre;
    }

    public void setExperiencearbitre(int experiencearbitre) {
        this.experiencearbitre = experiencearbitre;
    }

    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public int getAge_user() {
        return age_user;
    }

    public void setAge_user(int age_user) {
        this.age_user = age_user;
    }

    public int getCIN_user() {
        return CIN_user;
    }

    public void setCIN_user(int CIN_user) {
        this.CIN_user = CIN_user;
    }

    public String getPhoto_user() {
        return photo_user;
    }

    public void setPhoto_user(String photo_user) {
        this.photo_user = photo_user;
    }

    public String getGrade_user() {
        return grade_user;
    }

    public void setGrade_user(String grade_user) {
        this.grade_user = grade_user;
    }

    public int getExp_user() {
        return exp_user;
    }

    public void setExp_user(int exp_user) {
        this.exp_user = exp_user;
    }

    public String getCat_user() {
        return cat_user;
    }

    public void setCat_user(String cat_user) {
        this.cat_user = cat_user;
    }

    public String getAutorisation() {
        return autorisation;
    }

    public void setAutorisation(String autorisation) {
        this.autorisation = autorisation;
    }
  
    public Utilisateur_2() {
    }

    public Utilisateur_2(Integer iduser, String email, String password, Integer solde) {
        this.iduser = iduser;
        this.email = email;
        this.password = password;
        this.solde = solde;
        
    }

   
    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return password;
    }

    public void setPwd(String password) {
        this.password = password;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    
}
