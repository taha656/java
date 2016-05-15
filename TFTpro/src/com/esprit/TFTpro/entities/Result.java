/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

import com.esprit.hellopi.dao.interfaces.IresultDAO;

/**
 *
 * @author Hama
 */
public class Result  {
    private int idresultat;
    private String joueur1;
    private String joueur2;
    private int set1joueur1;
    private int set2joueur1;
    private int set3joueur1;
    private int set1joueur2;
    private int set2joueur2;
    private int set3joueur2;
    private String gagnant;

    public String getGagnant() {
        return gagnant;
    }

    public void setGagnant(String gagnant) {
        this.gagnant = gagnant;
    }

    
    public int getSet1joueur1() {
        return set1joueur1;
    }

    public void setSet1joueur1(int set1joueur1) {
        this.set1joueur1 = set1joueur1;
    }

    public int getSet2joueur1() {
        return set2joueur1;
    }

    public void setSet2joueur1(int set2joueur1) {
        this.set2joueur1 = set2joueur1;
    }

    public int getSet3joueur1() {
        return set3joueur1;
    }

    public void setSet3joueur1(int set3joueur1) {
        this.set3joueur1 = set3joueur1;
    }

    public int getSet1joueur2() {
        return set1joueur2;
    }

    public void setSet1joueur2(int set1joueur2) {
        this.set1joueur2 = set1joueur2;
    }

    public int getSet2joueur2() {
        return set2joueur2;
    }

    public void setSet2joueur2(int set2joueur2) {
        this.set2joueur2 = set2joueur2;
    }

    public int getSet3joueur2() {
        return set3joueur2;
    }

    public void setSet3joueur2(int set3joueur2) {
        this.set3joueur2 = set3joueur2;
    }


    public int getIdresultat() {
        return idresultat;
    }

    public void setIdresultat(int idresultat) {
        this.idresultat = idresultat;
    }

    public String getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(String joueur1) {
        this.joueur1 = joueur1;
    }

    public String getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(String joueur2) {
        this.joueur2 = joueur2;
    }

 
    
}
