/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.entities;

/**
 *
 * @author lenovo
 */
public class Image1 {
    private int id;
    private byte[] img;
   
    private String description ;

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

  

    public int getId() {
        return id;
    }

    public byte[] getImg() {
        return img;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    

    
    
    
    

}
