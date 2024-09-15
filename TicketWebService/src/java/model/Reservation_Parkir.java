/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Reservation_Parkir extends MyModel {

    private int id;
    private String nomor_parkir;
    private String tanggal_pembelian;
    private String tanggal_parkir;
    private String lantai;
    private Akun akun;
    private Tempat tempat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomor_parkir() {
        return nomor_parkir;
    }

    public void setNomor_parkir(String nomor_parkir) {
        this.nomor_parkir = nomor_parkir;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public String getTanggal_parkir() {
        return tanggal_parkir;
    }

    public void setTanggal_parkir(String tanggal_parkir) {
        this.tanggal_parkir = tanggal_parkir;
    }

    public String getLantai() {
        return lantai;
    }

    public void setLantai(String lantai) {
        this.lantai = lantai;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }

    public Tempat getTempat() {
        return tempat;
    }

    public void setTempat(Tempat tempat) {
        this.tempat = tempat;
    }

    public Reservation_Parkir(String nomor_parkir, String tanggal_pembelian, String tanggal_parkir, String lantai, Akun akun, Tempat tempat) {
        this.nomor_parkir = nomor_parkir;
        this.tanggal_pembelian = tanggal_pembelian;
        this.tanggal_parkir = tanggal_parkir;
        this.lantai = lantai;
        this.akun = akun;
        this.tempat = tempat;
    }

    public Reservation_Parkir() {
    }

    public Reservation_Parkir(String nomor_parkir) {
        this.nomor_parkir = nomor_parkir;
    }

    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select *from reservation_parkir RP inner join tempat T inner join akun A");
            while (this.result.next()) {
                Tempat tempat = new Tempat(this.result.getString("nama"),
                        this.result.getString("lokasi"));
                Akun akun = new Akun(this.result.getString("username"),
                        this.result.getString("password"),
                        this.result.getString("nama"));
                Reservation_Parkir rp = new Reservation_Parkir(this.result.getString("nomor_parkir"),
                        this.result.getString("tanggal_pembelian"),
                        this.result.getString("tanggal_acara"),
                        this.result.getString("status"), akun, tempat);

                collections.add(rp);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return collections;
    }

    public ArrayList<String> bacaReservasi(String tempat, String lantai, String tanggal) {
        ArrayList<String> collections = new ArrayList<String>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select RP.nomor_parkir from reservation_parkir RP inner join tempat T where T.nama='" + tempat + "' "
                                                      + "and RP.lantai='" + lantai + "' and RP.tanggal_parkir='" + tanggal + "'");
            while (this.result.next()) {
                String noParkir = this.result.getString("nomor_parkir");

                collections.add(noParkir);
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return collections;
    }

    public ArrayList<String> bacaSlot(String slot, String tempat, String lantai, String tanggal) {
        ArrayList<String> collections = new ArrayList<String>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select RP.nomor_parkir from reservation_parkir RP inner join tempat T where T.nama='" + tempat + "' "
                    + "and RP.lantai='" + lantai + "' and Rp.nomor_parkir='" + slot + "' and RP.tanggal_parkir='" + tanggal + "'");
            while (this.result.next()) {
                String noParkir = this.result.getString("nomor_parkir");

                collections.add(noParkir);
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return collections;
    }

    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into reservation_parkir (nomor_parkir, tanggal_pembelian, tanggal_parkir, lantai, akun_id, tempat_id) values (?,?,?,?,?,?)");
                sql.setString(1, getNomor_parkir());
                sql.setString(2, getTanggal_pembelian());
                sql.setString(3, getTanggal_parkir());
                sql.setString(4, getLantai());
                sql.setInt(5, getAkun().getId());
                sql.setInt(6, getTempat().getId());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di insert reservation parkir: " + e);
        }
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
