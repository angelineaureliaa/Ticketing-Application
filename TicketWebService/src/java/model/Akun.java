/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Akun extends MyModel {

    private int id;
    private String username;
    private String password;
    private String nama;

    public Akun(int id, String username, String password, String nama) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Akun(String username, String password, String nama) {
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Akun() {
    }

    @Override
    public void insertData() {
        try {
            boolean res = false;
            if (res == false) //jika username tidak terdaftar di database//
            {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("INSERT INTO akun(username, password, nama) VALUES (?, ?,?)");
                sql.setString(1, this.username);
                sql.setString(2, this.password);
                sql.setString(3, this.nama);
                sql.executeUpdate();
                sql.close();
            } else //jika username terdaftar di database//
            {
                throw new Exception("Username already used, please change with another username");
            }
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(Akun.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean isLogin(String uname, String pwd) {
        Boolean result = false;
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sqlCheck = (PreparedStatement) MyModel.conn.prepareStatement("select * from akun where username=? and password=?" + "limit 1");
                sqlCheck.setString(1, uname);
                sqlCheck.setString(2, pwd);
                ResultSet res = sqlCheck.executeQuery();
                while (res.next()) {
                    result = true;
                }
                sqlCheck.close();
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        return result;
    }

    public boolean checkUsername(String _username) { //cek username udah terdaftar di database atau belum//
        boolean cekUsername = false;
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from akun");
            while (this.result.next()) {
                Akun akun = new Akun(this.result.getString("username"),
                        this.result.getString("password"), this.result.getString("nama"));
                if (this.result.getString("username").equals(_username)) {
                    cekUsername = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        return cekUsername;
    }

    public ArrayList<String> display() {
        ArrayList<String> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from akun where username='" + this.username + "' and password = '" + password + "'");
            while (this.result.next()) {
                Akun a = new Akun(this.result.getString("username"), this.result.getString("password"), this.result.getString("nama"));
                System.out.println(a);
                collections.add(a.getUsername());
                collections.add(a.getPassword());
                collections.add(a.getNama());
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        return collections;
    }

    public Akun bacaDataSatu(String kriteria, String nilai) {
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("select * from akun where username= ?");
            statement.setString(1, nilai);
            ResultSet res = statement.executeQuery();
            if (res.next()) { // Memeriksa apakah ada hasil
                Akun a = new Akun(res.getInt("id"),
                        res.getString("username"),
                        res.getString("password"),
                        res.getString("nama"));
                return a;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("ERROR di baca akun" + e.getMessage());
            return null;
        }

    }

    @Override
    public ArrayList<Object> viewListData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
