/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class Cart {
    private String maSP, tenSP, anhSP;
    private Float gia, size;
    private int soluong;

    Connection con;
    Statement stm;
    ResultSet rs;
    
    public Cart() {
        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
    }

    public Cart(String maSP, String tenSP, Float gia, Float size, int soluong, String anhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.size = size;
        this.soluong = soluong;
        this.anhSP=anhSP;
        
        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
    }

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public boolean addToCart(String a, String b, String c, String d, String e, String f) {
        try {
            stm = con.createStatement();
            String strInsert = "Insert into Giohang values('" + a + "', '" + b + "', '" + c + "', '"+ d +"', '"+ e +"', '"+ f +"')";
            stm.execute(strInsert);

            return true;
        } catch (Exception ex) {
            System.out.println("fail: " + ex.getMessage());
            return false;
        }

    }
    
    
    public boolean updateCart() {
        try {
            stm = con.createStatement();
            String strUpdate = "update Cart set size = '"+ size +"',  soluong = '"+ soluong +"'";
            stm.execute(strUpdate);

            return true;
        } catch (Exception e) {
            System.out.println("fail: " + e.getMessage());
            return false;
        }

    }
    
    public ArrayList<Cart> getListProductInCart(String brand, String id, String To) {
        
        ArrayList<Cart> lst = new ArrayList<>();
        String sql = "select * from Giohang";
        
        
        
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                
                Float gia = rs.getFloat("gia");
                Float kichthuoc = rs.getFloat("size");
                int soluong = rs.getInt("soluong");
                String anhSP=rs.getString("image");

                Cart c = new Cart(maSP, tenSP, gia, kichthuoc, soluong, anhSP);

                lst.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;

    }
    
    public boolean deleteProductInCart(String a) {
        try {
            stm = con.createStatement();
            String strDelete = "delete from Giohang";
            if(!a.isEmpty()){
                strDelete+= " where maSP = '" + a + "'";
            }
            stm.execute(strDelete);

            return true;
        } catch (Exception e) {
            System.out.println("fail: " + e.getMessage());
            return false;
        }

    }
    
    
}
