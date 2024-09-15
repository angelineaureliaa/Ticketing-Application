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

/**
 *
 * @author User
 */
public class Tempat extends MyModel{
    private int id;
    private String nama;
    private String lokasi;
    
    public Tempat(int id, String nama, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public Tempat(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }
    
    public Tempat(String nama) {
        this.nama = nama;
    }
    
    public Tempat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into tempat (nama, lokasi) values (?,?)");
                sql.setString(1, getNama());
                sql.setString(2, getLokasi());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di insert tempat: " + e);
        }
    }
    
    @Override
    public void updateData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("update tempat set nama=?, lokasi=?");
                sql.setString(1, getNama());
                sql.setString(2, getLokasi());
                sql.executeUpdate();
//                UPDATE ticketing.reservation_acara SET status='Pending' WHERE `';
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di update acara: " + e);
        }
    }
    
    @Override
    public void deleteData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("delete from tempat where id=?");
                sql.setString(1, getNama());
                sql.setString(2, getLokasi());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di delete acara: " + e);
        }
    }
    
    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select nama from tempat");
            while (this.result.next()) {
               Tempat tempat = new Tempat(this.result.getString("nama"));
               collections.add(String.valueOf(tempat.getNama()) + "#");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return collections;
    }
    
    
     
    public Tempat bacaDataTempat(String kriteria, String nilai) {
        try  {
            PreparedStatement statement = MyModel.conn.prepareStatement("select * from tempat where nama= ?");
            statement.setString(1, nilai);
            ResultSet res = statement.executeQuery();
            if (res.next()) {
               Tempat tempat = new Tempat(
                       res.getInt("id"),
                       res.getString("nama"),
                       res.getString("lokasi"));
               return tempat;
            } else {
                return null;
            } 
        } 
        catch (SQLException e) 
        {
            System.out.println("ERROR di baca tempat" + e.getMessage());
            return null;
        }
    }
}
