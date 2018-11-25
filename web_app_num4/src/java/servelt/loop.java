/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java_class.person;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rm
 */
public class loop extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       
       //Recive data and put it in object 
       String n= request.getParameter("name");
       String a= request.getParameter("age");
       String ph= request.getParameter("phone");
       
       //Object from class person that contained data
       person p=new person();
        p.setName(n);
        p.setAge(Integer.parseInt(a));
        p.setPhone(ph);
        
        // 1: Markeشادي: creat servelt context it's includ attribut not paramiter
        //getServletContext().setAttribute("objeeeeeeeeeect", p);
        
        //rather than 1:
        //Session 
         HttpSession session= request.getSession();
          session.setAttribute("objeeeect", p);
        
       
            PrintWriter out = response.getWriter() ;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> looding data </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> tama tahmail el data </h3>");
            out.println("<a href='show_data'> Show Your data </a>");
            out.println("</body>");
            out.println("</html>");
        
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
