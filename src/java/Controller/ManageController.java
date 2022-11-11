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

/**
 *
 * @author lenovo
 */
public class ManageController extends HttpServlet {

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
        String masp = request.getParameter("maSP");
        String tenSP = request.getParameter("tenSP");
        String type = request.getParameter("type");
        String gia = request.getParameter("gia");
        String kichthuoc = request.getParameter("kichthuoc");
        String thongtinSP = request.getParameter("thongtinSP");
        String anhSP = request.getParameter("anhSP");
        String id = request.getParameter("id");
        Product p = new Product();
        
        if(request.getParameter("add") != null){
            
            boolean stt = p.insert(masp, tenSP, type, gia, kichthuoc, thongtinSP, anhSP);
            if(stt){
                request.getRequestDispatcher("ListProductController").forward(request, response);
            }else{
                request.getRequestDispatcher("themsanpham.jsp").forward(request, response);
            }
        }
        
        if(request.getParameter("delete") != null){
            boolean stt = p.delete(id);
            if(stt){
                request.getRequestDispatcher("ListProductController").forward(request, response);
            }else{
                request.getRequestDispatcher("ListProductController").forward(request, response);
            }
        }
        
        if(request.getParameter("update") != null){
           
            boolean stt = p.update(masp, tenSP, type, gia, kichthuoc, thongtinSP, anhSP);
            if(stt){
                request.getRequestDispatcher("ListProductController").forward(request, response);
            }else{
                request.getRequestDispatcher("ListProductController").forward(request, response);
            }
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
