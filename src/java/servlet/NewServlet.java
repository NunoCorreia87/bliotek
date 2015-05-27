package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bliotek.*;
import bliotek.utilizador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nuno
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
          
            
            /* TODO output your page here. You may use following sample code. */
            String RegisterUsername = request.getParameter("userRegister");
            String RegisterPassword = request.getParameter("password1");
            
            
            //HttpSession session = request.getSession();
            //session.setAttribute("userRegister", RegisterUsername);
            
            out.println("hello"+RegisterUsername);
            //utilizador nUti = new utilizador((String) session.getAttribute("userRegister"));
           // out.println("hello"+(String) session.getAttribute("newUsername"));
            //novoUtilizador novo = new novoUtilizador();
            //novo.registaUtilizador(nUti);
          utilizador uti = new utilizador();
          uti.setNome(RegisterUsername);
          uti.setPassword(RegisterPassword);
          String teste = uti.getNome();
          String password = uti.getPassword();
            System.out.println("Teste"+teste);
            System.out.println("Teste"+password);
          novoUtilizador novo = new novoUtilizador();  
          novo.registaUtilizador(uti);
        }
 
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
