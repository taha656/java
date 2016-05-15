/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.technique;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asma
 */

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hama
 */
public class DataSource {
private static DataSource INSTANCE = null;
private String url;
private String login;
private String password;
private Properties prop;
private Connection connection;//java.sql


    public DataSource() {
    try {
        prop=new Properties();
        prop.load(new FileInputStream(new File("config.properties")));
        url=prop.getProperty("url");
        login=prop.getProperty("login");
        password=prop.getProperty("password");
        connection=DriverManager.getConnection(url,login,password);

        if(connection.isValid(1000))
            System.out.println("ok");
        else 
            System.out.println("no cnx");
    } 
    
    catch (IOException |SQLException ex) {
       Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);

}
        //LEKHRA F TRY CATCH W TZID IMPORT

    }

    public Connection getConnection() {
        return connection;
    }
    
    
    public static DataSource getInstance(){
        if (INSTANCE==null)
        {
            INSTANCE=new DataSource();
        }
        return INSTANCE;
    }



    
}
