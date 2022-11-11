/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lenovo
 */
public class LoginController extends HttpServlet {

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
         HttpSession session = request.getSession();
        if(request.getParameter("lg") != null){
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        if(request.getParameter("lo") != null){
            session.setAttribute("user", null);
            request.getRequestDispatcher("trangchu.jsp").forward(request, response);
        }
        String user = request.getParameter("username");
        String pass = request.getParameter("pass");

        if (user.equals("admin") && pass.equals("123123")) {
            session.setAttribute("user", user);
            
            Product p = new Product();
            ArrayList<Product> lstProduct = new ArrayList<Product>();
            lstProduct = p.getListProduct("", "", "", "", "");
            request.setAttribute("lstProduct", lstProduct);
            request.getRequestDispatcher("quanly.jsp").forward(request, response);
        } else {
            String mes = "Sai ten dang nhap hoac mat khau";
            request.setAttribute("mes", mes);
            request.getRequestDispatcher("login.jsp").forward(request, response);
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
