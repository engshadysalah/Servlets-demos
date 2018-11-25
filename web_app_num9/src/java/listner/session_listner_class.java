package listner;


import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author rm
 */
public class session_listner_class implements HttpSessionListener, HttpSessionAttributeListener {

    int x=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    
        System.out.println(se.getSession().getId()+"     ===>>>>    session created");
        
        x++;
            //  getServletContext().setInitParameter(x);
            // to know num of vistores
            // ???????????  
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
       
         System.out.println("session is killed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
         System.out.println("attributeAdded");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
       System.out.println("attributeRemoved");    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
