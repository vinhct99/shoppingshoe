/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cart;
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
public class CartController extends HttpServlet {

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
        if (session.getAttribute("user") != null) {
            String mes = "Access denied";
            request.setAttribute("mes", mes);
            request.getRequestDispatcher("newjsp1.jsp").forward(request, response);
            
        }
        
        String id = request.getParameter("id");
        if (request.getParameter("themvaogiohang") != null) {
            String masp = request.getParameter("masp");
            String tensp = request.getParameter("tensp");
            String gia = request.getParameter("gia");
            String anhsp = request.getParameter("anhsp");
            String size = request.getParameter("size");
            String soluong = request.getParameter("soluong");
            String mes = "";
            

            Cart c = new Cart();
            boolean stt = c.addToCart(masp, tensp, gia, anhsp, size, soluong);

            if (stt) {
                mes = "Thêm vào giỏ hàng thành công! Ấn vào giỏ hàng để thanh toán";
                request.setAttribute("mes", mes);

                //B3: tra ve ket qua cho view hien thi
                request.getRequestDispatcher("ProductDetailController").forward(request, response);
            } else {
                mes = "Sản phẩm đã tồn tại trong giỏ hàng";
                request.getRequestDispatcher("ProductDetailController").forward(request, response);
            }
        }

        //if (request.getParameter("giohang") != null) {
            Cart c = new Cart();
            ArrayList<Cart> lstCart = new ArrayList<Cart>();
            lstCart = c.getListProductInCart("", "", "");
            request.setAttribute("lstCart", lstCart);

            //B3: tra ve ket qua cho view hien thi
            request.getRequestDispatcher("giohang.jsp").forward(request, response);
     //   }
        
        if (request.getParameter("xoa") != null) {
            
            

           
            boolean stt = c.deleteProductInCart(id);

            if (stt) {
                
                //B3: tra ve ket qua cho view hien thi
                request.getRequestDispatcher("CartController").forward(request, response);
            } else {
               
                request.getRequestDispatcher("CartController").forward(request, response);
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
