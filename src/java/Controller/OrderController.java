/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Order;
import Model.Cart;
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
public class OrderController extends HttpServlet {

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
        if (request.getParameter("thanhtoan") != null) {

            String size = request.getParameter("size");
            String soluong = request.getParameter("soluong");
//        String maSP = request.getParameter("masp");
//        String maSP = request.getParameter("masp");
//        String maSP = request.getParameter("masp");
            Cart c = new Cart();
            ArrayList<Cart> lstCart = new ArrayList<Cart>();
            lstCart = c.getListProductInCart("", "", "");
            request.setAttribute("lstCart", lstCart);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("dathang.jsp").forward(request, response);
        }

        if (request.getParameter("xacnhan") != null) {
            String tenKH = request.getParameter("tenKH");
            String diachiKH = request.getParameter("diachiKH");
            String email = request.getParameter("email");
            String sodienthoai = request.getParameter("sodienthoai");
            String ghichu = request.getParameter("ghichu");
            String tenSP = request.getParameter("tenSP");
            String maSP = request.getParameter("maSP");
            String size = request.getParameter("size");
            String soluong = request.getParameter("soluong");
            String giaSP = request.getParameter("giaSP");
            
            Order o = new Order();
            boolean stt = o.addToOrder(tenKH, diachiKH, sodienthoai, email, ghichu, tenSP, size, soluong, giaSP);
            if(stt){
                request.getRequestDispatcher("newjsp.jsp").forward(request, response);
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
