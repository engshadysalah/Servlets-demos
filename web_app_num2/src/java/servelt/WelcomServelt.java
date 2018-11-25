/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rm
 */
public class WelcomServelt extends HttpServlet {

   
    // to excute code if typ of requst is get or post
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String n=request.getParameter("name");
        
        FileWriter file=new FileWriter("F:\\JAVA\\Java ee\\Serv&Jsp_Elkdah\\WEb\\Vedio_num5\\user.txt");
        BufferedWriter buff=new BufferedWriter(file);
        buff.write(n);
        buff.close();
        
        
        // PrintWriter out = response.getWriter();
        if(n.length() <4){
            //Presention
            //small.html
            
             //servelt tell prowser to make redirecto to this small.htmal
            response.sendRedirect("small.html");
             //then prowser send another requst to small.html
            
            //Status code =301 in response
            //then proswer know that prowser will requst to another page and search about location small.html
            
            
        /*out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet WelcomServelt</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b>name is smallll </b>");
        out.println("</body>");
        out.println("</html>");
        */ }
        
        else{
            //Presention
            //welcom.html
            
             //servelt tell prowser to make redirecto to this welcom.htmal
            response.sendRedirect("welcom.html");
             //then prowser send another requst to welcom.html
            
            
           /* out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet WelcomServelt</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b>name is </b>"+n);
        out.println("</body>");
        out.println("</html>"); */}
}

@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
