/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;


import java.sql.Date;

/**
 *
 * @author Mariem R
 */
public class forum {
    
    
    private int id ;
    private String titre_du_forum ;
    private String Description ;
    private Date published_at ;

    public forum() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre_du_forum() {
        return titre_du_forum;
    }

    public forum(String titre_du_forum, String Description) {
        this.titre_du_forum = titre_du_forum;
        this.Description = Description;
    }

    public forum(String titre_du_forum, String Description, Date published_at) {
        this.titre_du_forum = titre_du_forum;
        this.Description = Description;
        this.published_at = published_at;
    }

    public int getId() {
        return id;
    }

   
    public String getTitreDuForum() {
        return titre_du_forum;
    }

    public void setTitre_du_forum(String titre_du_forum) {
        this.titre_du_forum = titre_du_forum;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getPublished_at() {
        return published_at;
    }

    public void setPublished_at(Date published_at) {
        this.published_at = published_at;
    }
    
    
    
    
    
}
