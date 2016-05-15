/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.TFTpro.dao.classes;

import com.esprit.technique.DataSource;
import com.mysql.jdbc.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author lenovo
 */
public class AddImageDAO {
    
    public static AddImageDAO instance;
    public Statement statement;
    
    
    public AddImageDAO()
    {
        try {
            statement = DataSource.
                    getInstance().getConnection().
                    createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
  public static AddImageDAO getInstance() {
        if (instance == null)
            instance = new AddImageDAO();
        return instance;
    }
    
 public ImageIcon getImage(int id)
    {
        ResultSet resultSet;
        try {
            resultSet = statement.executeQuery("select * from image1 where id='"+id+"'");
            if(resultSet.next())
            {
                Blob blob = (Blob) resultSet.getBlob("image");
                return new ImageIcon(blob.getBytes(1, (int)blob.length()));
            }
        } catch (SQLException ex) {
        }
        return null;
    }   
    
    
    
}
