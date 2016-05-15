/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;


public class Utilisateur{
    int id;
    String nom;
    String prenom;
    int age;
    int CIN;
   int rang ; 
      private Integer iduser;
 String   niveauarbitre ; 

    private String pwd;
   private float solde;
 
    String grade;
    int exp;
    String cat;
    String role;
    String Fonction ; 
    String autorisation;
    String email;
    String login;
    String password;

    public Integer getIduser() {
        return iduser;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "user{" + "id user=" + id + ", nom user=" + nom+ ", prenom user=" + prenom+ ", age user=" + age + ", CIN user=" + CIN  + ", grade user=" + grade + ", exp user=" + exp + ", cat user=" + cat + ", Fonction=" + Fonction + ", autorisation=" + autorisation + ", email=" + email + ", login=" + login + ", password=" + password + '}';
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFonction() {
        return Fonction;
    }

    public void setFonction(String Fonction) {
        this.Fonction = Fonction;
    }

    public String getAutorisation() {
        return autorisation;
    }

    public void setAutorisation(String autorisation) {
        this.autorisation = autorisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur(int id, String nom, String prenom, int age, int CIN, String grade, int exp, String cat, String role, String Fonction, String autorisation, String email, String login, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.CIN = CIN;
        this.grade = grade;
        this.exp = exp;
        this.cat = cat;
        this.role = role;
        this.Fonction = Fonction;
        this.autorisation = autorisation;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public Utilisateur(int id, String email) {
        this.id = id;
        this.email = email;
    }

    

    

    

 
    public Utilisateur() {
    }

    public Utilisateur(int id) {
        this.id = id;
    }

 
}
