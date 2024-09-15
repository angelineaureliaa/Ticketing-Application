/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Acara extends MyModel {

    private int id;
    private String nama_acara;
    private String kategori;
    private String lokasi;
    private Date tanggal_acara;
    private int kapasitas_awal;
    private int kapasitas_sisa;

    public int getKapasitas_awal() {
        return kapasitas_awal;
    }

    public void setKapasitas_awal(int kapasitas_awal) {
        this.kapasitas_awal = kapasitas_awal;
    }

    public int getKapasitas_sisa() {
        return kapasitas_sisa;
    }

    public void setKapasitas_sisa(int kapasitas_sisa) {
        this.kapasitas_sisa = kapasitas_sisa;
    }

    public Acara(int id, String nama_acara, String kategori, String lokasi, Date tanggal_acara, int kapasitas_awal, int kapasitas_sisa) {
        this.id = id;
        this.nama_acara = nama_acara;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.tanggal_acara = tanggal_acara;
        this.kapasitas_awal = kapasitas_awal;
        this.kapasitas_sisa = kapasitas_sisa;
    }

    public Acara(int id, String nama_acara, String kategori, String lokasi, Date tanggal_acara) {
        this.id = id;
        this.nama_acara = nama_acara;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.tanggal_acara = tanggal_acara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_acara() {
        return nama_acara;
    }

    public void setNama_acara(String nama_acara) {
        this.nama_acara = nama_acara;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Date getTanggal_acara() {
        return tanggal_acara;
    }

    public void setTanggal_acara(Date tanggal_acara) {
        this.tanggal_acara = tanggal_acara;
    }

    public Acara() {
    }

    public Acara(String nama_acara, String kategori, String lokasi, Date tanggal_acara) {
        this.nama_acara = nama_acara;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.tanggal_acara = tanggal_acara;
    }
    
    //ga dipake
    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into acara (nama_acara,kategori,lokasi,tanggal_acara,kapasitas_awal,kapasitas_sisa) values (?,?,?,?)");
                sql.setString(1, getNama_acara());
                sql.setString(2, getKategori());
                sql.setString(3, getLokasi());
                sql.setDate(4, getTanggal_acara());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di insert acara: " + e);
        }

    }
    
    //ga dipake
    @Override
    public void deleteData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("delete from acara where id=?");
                sql.setInt(1, this.id);

                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di delete acara: " + e);
        }

    }
    
    //buat ditampilin di tabel FORM ACARA
    @Override
    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from acara");
            while (this.result.next()) {
                Acara acr = new Acara(this.result.getInt("id"),
                        this.result.getString("nama_acara"),
                        this.result.getString("kategori"),
                        this.result.getString("lokasi"),
                        this.result.getDate("tanggal_acara"),
                        this.result.getInt("kapasitas_awal"),
                        this.result.getInt("kapasitas_sisa"));
                collections.add(String.valueOf(acr.getId()) + "-m"
                        + String.valueOf(acr.getNama_acara()) + "-m"
                        + String.valueOf(acr.getKategori()) + "-m"
                        + String.valueOf(acr.getLokasi()) + "-m"
                        + String.valueOf(acr.getTanggal_acara()) + "-m"
                        + String.valueOf(acr.getKapasitas_awal()) + "-m"
                        + String.valueOf(acr.getKapasitas_sisa()) + "-m#"); //sebenere # ini buat pemisah antar list acara; -m buat pemisah antar detail per isi list
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return collections;
    }
    
    //buat Reservasi Acara
    public Acara selectAcaraById(int id) {
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("select * from acara where id=?");
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            if (res.next()) {
                Acara acara1 = new Acara(res.getInt("id"),
                        res.getString("nama_acara"),
                        res.getString("kategori"),
                        res.getString("lokasi"),
                        res.getDate("tanggal_acara"),
                        res.getInt("kapasitas_awal"),
                        res.getInt("kapasitas_sisa"));
                return acara1;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error di select acara id: " + ex);
            return null;
        }
    }

    public boolean updateKapasitasSisa(int id, int newKapasitasSisa) {
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("update acara set kapasitas_sisa=? where id=?");
            statement.setInt(1, newKapasitasSisa);
            statement.setInt(2, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error di update kapasitas_sisa: " + ex);
            return false;
        }
    }
    
    
    //ga dipake
    @Override
    public void updateData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("update acara set nama_acara=?, lokasi=?, "
                                        + "tanggal_acara=?, kapasitas_awal=?, kapasitas_sisa=? where id=?");
                sql.setString(1, this.nama_acara);
                sql.setString(2, this.lokasi);
                sql.setDate(3, this.tanggal_acara);
                sql.setInt(4, this.kapasitas_awal);
                sql.setInt(5, this.kapasitas_sisa);
                sql.setInt(6, this.id);
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di update acara: " + e);
        }
    }
}
