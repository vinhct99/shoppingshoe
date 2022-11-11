/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class Order {
    private String maDH, maSP, tenSP, tenKH, diachiKH, sodienthoai, ghichu, email;
    private Float size, tongtien;
    private int soluong;

    Connection con;
    Statement stm;
    ResultSet rs;
    
    public Order() {
        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
    }

    public Order(String maSP, String tenSP, String tenKH, String diachiKH, String sodienthoai, String ghichu, String email, Float size, Float tongtien) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenKH = tenKH;
        this.diachiKH = diachiKH;
        this.sodienthoai = sodienthoai;
        this.ghichu = ghichu;
        this.email = email;
        this.size = size;
        this.tongtien = tongtien;
        
        try {
            con = (new DBContext().getConnection());
            System.out.println("connect successfully");
        } catch (Exception e) {
            System.out.println("Connect fail: " + e.getMessage());
        }
    }

    

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
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

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiachiKH() {
        return diachiKH;
    }

    public void setDiachiKH(String diachiKH) {
        this.diachiKH = diachiKH;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getTongtien() {
        return tongtien;
    }

    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public boolean addToOrder(String a, String b, String c, String d, String e, String f, String g, String h, String i ) {
        try {
            stm = con.createStatement();
            String strInsert = "Insert into Dathang values('" + a + "', '" + b + "', '" + c + "', '"+ d +"', '"+ e +"', '"+ f +"', '"+ g +"', '"+ h +"', '"+ i +"')";
            stm.execute(strInsert);

            return true;
        } catch (Exception ex) {
            System.out.println("fail: " + ex.getMessage());
            return false;
        }

    }
    
}
