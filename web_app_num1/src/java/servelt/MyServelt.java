/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rm
 */
public class MyServelt extends HttpServlet {

    int count=0;
   
    
     @Override //Excute only on for ex :servelt connect db and need to read id only one mara in life of servelt by container
                //when close concat calling destory method to kill the object & init method
    public void init(ServletConfig config) throws ServletException {
        super.init(config); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" hhiiiiiiiiiiiiiiiiiii");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // how send data to client
        
        //getWriter() to Write in response
        //out : is object that take data and put it into response
       
        //////////////////////////
        //logic or business : code of java that excute
        Date d=new Date();
        int houres=d.getHours();
        
        
        count++;
        ///////////////////////////////
        
        //////////////////
       //presention : is html that appear
       
        PrintWriter out=response.getWriter();
        out.println("<html><body> ");
        out.println("<b> yarab </b> <br>");
        out.println("<b> You are the Visitor num </b> "+count+"<br>");  /// to show data when condation done
        if(count ==2 ){
         out.println("<b> Mabrook u win  </b> <br>" );
        }
        out.println("<b> Clock: houres  </b>"+houres );
        
        out.println("</body> <html>");
       /////////////////
        
    }

   

    
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   

}
