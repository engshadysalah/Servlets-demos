/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author rm
 */
public class connect_db_listner implements ServletContextListener {

    @Override//execute when container work and make context
    public void contextInitialized(ServletContextEvent sce) {
        //conect db
         Statement st = null;
        try{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection conect = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "root", "root");
          st = conect.createStatement();
            
            sce.getServletContext().setAttribute("conect_db", st);
            
            
        }catch(Exception e){e.printStackTrace();}
        //
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
