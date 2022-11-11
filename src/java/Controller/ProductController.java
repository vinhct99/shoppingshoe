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
public class ProductController extends HttpServlet {

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
//        if (session.getAttribute("user") != null) {
//            String mes = "Access denied";
//            request.setAttribute("mes", mes);
//            request.getRequestDispatcher("newjsp1.jsp").forward(request, response);
//
//        }

        if (request.getParameter("asc") != null) {
            Product p = new Product();
            ArrayList<Product> lstProduct = new ArrayList<Product>();
            lstProduct = p.getListProduct("asc");
            request.setAttribute("lstProduct", lstProduct);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
        }

        if (request.getParameter("desc") != null) {
            Product p = new Product();
            ArrayList<Product> arr = new ArrayList<Product>();
            arr = p.getListProduct("desc");
            int start = 0;
            int end = 9;
            if (arr.size() < 18) {
                end = arr.size();
            }

            if (request.getParameter("start") != null) {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end") != null) {
                end = Integer.parseInt(request.getParameter("end"));
            }

            ArrayList<Product> lstProduct = p.getListProductByPage(arr, start, end);
            request.setAttribute("lstProduct", lstProduct);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
        }
        if (request.getParameter("sanpham") != null) {
            Product p = new Product();
            ArrayList<Product> arr = new ArrayList<Product>();
            arr = p.getListProduct("", "", "", "", "");
            int start = 0;
            int end = 9;
            if (arr.size() < 18) {
                end = arr.size();
            }

            if (request.getParameter("start") != null) {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end") != null) {
                end = Integer.parseInt(request.getParameter("end"));
            }

            ArrayList<Product> lstProduct = p.getListProductByPage(arr, start, end);
            request.setAttribute("lstProduct", lstProduct);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
        }

        if (request.getParameter("btnSearch") != null) {
            String txtSearch = request.getParameter("txtSearch");
            Product p = new Product();
            ArrayList<Product> lstProduct = new ArrayList<Product>();
            lstProduct = p.getListProduct("", "", txtSearch, "", "");
            request.setAttribute("lstProduct", lstProduct);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
        }

        if (request.getParameter("btnSearchGia") != null) {
            String from = request.getParameter("from");
            String to = request.getParameter("to");
            Product p = new Product();
            ArrayList<Product> lstProduct = new ArrayList<Product>();
            lstProduct = p.getListProduct("", "", "", from, to);
            request.setAttribute("lstProduct", lstProduct);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
        }

        //B2: goi model xu ly
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
