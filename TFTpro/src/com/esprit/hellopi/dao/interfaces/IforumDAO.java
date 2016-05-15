/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.hellopi.dao.interfaces;


import com.esprit.TFTpro.entities.forum;
import java.util.List;

/**
 *
 * @author Mariem R
 */
public interface IforumDAO {
            void add(forum forum);
            public List<forum> DisplayAll();
public forum findForumBySubject(String subject) ;
 

    
}
