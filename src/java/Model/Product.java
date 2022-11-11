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
public class Product {

    private String maSP, tenSP, type, thongtinSP, anhSP;
    private Float gia, kichthuoc;

    Connection con;
    Statement stm;
    ResultSet rs;

    public Product() {
        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
    }

    public Product(String maSP, String tenSP, Float gia, String anhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.anhSP = anhSP;
    }

    public Product(String maSP, String tenSP, String type, String thongtinSP, Float gia, Float kichthuoc, String anhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.type = type;
        this.thongtinSP = thongtinSP;
        this.gia = gia;
        this.kichthuoc = kichthuoc;
        this.anhSP = anhSP;

        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThongtinSP() {
        return thongtinSP;
    }

    public void setThongtinSP(String thongtinSP) {
        this.thongtinSP = thongtinSP;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Float getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(Float kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public boolean insert(String a, String b, String c, String d, String e, String f, String g) {
        try {
            stm = con.createStatement();
            String strInsert = "Insert into Sanpham values('" + a + "', '" + b + "', '" + c + "', '" + d + "', '" + e + "', '" + f + "', '" + g + "')";
            stm.execute(strInsert);

            return true;
        } catch (Exception ex) {
            System.out.println("fail: " + ex.getMessage());
            return false;
        }

    }

    public boolean delete(String a) {
        try {
            stm = con.createStatement();
            String strDelete = "delete from Sanpham";
            if (!a.isEmpty()) {
                strDelete += " where maSP = '" + a + "'";
            }
            stm.execute(strDelete);

            return true;
        } catch (Exception e) {
            System.out.println("fail: " + e.getMessage());
            return false;
        }

    }

    public boolean update(String a, String b, String c, String d, String e, String f, String g) {
        try {
            stm = con.createStatement();
            String strUpdate = "update Sanpham set tenSP = '" + b + "', type = '" + c + "', gia = '" + d + "', kichthuoc = '" + e + "', thongtinSP = '" + f + "', anhSP = '" + g + "' where maSP = '"+ a +"'";
            stm.execute(strUpdate);

            return true;
        } catch (Exception ex) {
            System.out.println("fail: " + ex.getMessage());
            return false;
        }

    }
    
    public ArrayList<Product> getListProduct(String stt) {

        ArrayList<Product> lst = new ArrayList<>();
        String sql = "select * from Sanpham order by gia ";

        
        if (!stt.isEmpty() ) {
            sql += " "+ stt +"";
        }

        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                String type = rs.getString("type");
                Float gia = rs.getFloat("gia");
                Float kichthuoc = rs.getFloat("kichthuoc");
                String thongtinSp = rs.getString("thongtinSP");
                String anhSP = rs.getString("anhSP");

                Product p = new Product(maSP, tenSP, type, thongtinSp, gia, kichthuoc, anhSP);

                lst.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;

    }
    public ArrayList<Product> getListProductByPage(ArrayList<Product> arr, int start, int end){
        ArrayList<Product> lst = new ArrayList<>();
        for (int i = start; i < end; i++) {
            lst.add(arr.get(i));
        }
        return lst;
    }
    
    

    public ArrayList<Product> getListProduct(String brand, String id, String byName, String from, String to) {

        ArrayList<Product> lst = new ArrayList<>();
        String sql = "select * from Sanpham";

        if (!brand.isEmpty()) {
            sql += " where type = '" + brand + "'";
        }

        if (!id.isEmpty()) {
            sql += " where maSP = '" + id + "'";
        }

        if (!byName.isEmpty()) {
            sql += " where tenSP like '%" + byName + "%'";
        }

        if (!from.isEmpty() && !to.isEmpty()) {
            sql += " where gia > '" + from + "' and gia < '" + to + "' ";
        }

        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                String type = rs.getString("type");
                Float gia = rs.getFloat("gia");
                Float kichthuoc = rs.getFloat("kichthuoc");
                String thongtinSp = rs.getString("thongtinSP");
                String anhSP = rs.getString("anhSP");

                Product p = new Product(maSP, tenSP, type, thongtinSp, gia, kichthuoc, anhSP);

                lst.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;

    }

}
