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
public class Mail {
    
   private String mailAddressSender ;
    private String pwd ;
    private String mailAddressRecipient ; 
    private String mailObject ;
    private String mailSubject ;

    public void setMailAddressSender(String mailAddressSender) {
        this.mailAddressSender = mailAddressSender;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setMailAddressRecipient(String mailAddressRecipient) {
        this.mailAddressRecipient = mailAddressRecipient;
    }

    public void setMailObject(String mailObject) {
        this.mailObject = mailObject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailAddressSender() {
        return mailAddressSender;
    }

    public String getPwd() {
        return pwd;
    }

    public String getMailAddressRecipient() {
        return mailAddressRecipient;
    }

    public String getMailObject() {
        return mailObject;
    }

    public String getMailSubject() {
        return mailSubject;
    }
  
    
    
}
