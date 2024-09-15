/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Reservation_Acara extends MyModel {

    private int id;
    private Acara acara;
    private Akun akun;
    private Date tanggal_pembelian;
    private Date tanggal_acara;
    private String status;

    public Reservation_Acara(Acara acara, Akun akun, Date tanggal_pembelian, Date tanggal_acara, String status) {
        this.acara = acara;
        this.akun = akun;
        this.tanggal_pembelian = tanggal_pembelian;
        this.tanggal_acara = tanggal_acara;
        this.status = status;
    }

    public Reservation_Acara(int id, Acara acara, Akun akun, Date tanggal_pembelian, Date tanggal_acara, String status) {
        this.id = id;
        this.acara = acara;
        this.akun = akun;
        this.tanggal_pembelian = tanggal_pembelian;
        this.tanggal_acara = tanggal_acara;
        this.status = status;
    }

    public Reservation_Acara() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Acara getAcara() {
        return acara;
    }

    public void setAcara(Acara acara) {
        this.acara = acara;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }

    public Date getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(Date tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public Date getTanggal_acara() {
        return tanggal_acara;
    }

    public void setTanggal_acara(Date tanggal_acara) {
        this.tanggal_acara = tanggal_acara;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("insert into reservation_acara (acara_id, akun_id, tanggal_pembelian, tanggal_acara, status) values (?,?,?,?,?)");
                sql.setInt(1, getAcara().getId());
                sql.setInt(2, getAkun().getId());
                sql.setDate(3, getTanggal_pembelian());
                sql.setDate(4, getTanggal_acara());
                sql.setString(5, getStatus());
                sql.executeUpdate();
            } else {
                System.out.println("Koneksi Hilang");
            }
        } catch (Exception e) {
            System.out.println("Error di insert acara: " + e);
        }

    }

    @Override
    public void updateData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("update reservation_acara set acara_id=?, akun_id=?, "
                        + "tanggal_pembelian, tanggal_acara=?, status=? where id=?");
                sql.setInt(1, getAcara().getId());
                sql.setInt(2, getAkun().getId());
                sql.setDate(3, getTanggal_pembelian());
                sql.setDate(4, getTanggal_acara());
                sql.setString(5, getStatus());
                sql.setInt(6, getAcara().getId());
                sql.setInt(7, getAkun().getId());
                sql.executeUpdate();
//                UPDATE `ticketing`.`reservation_acara` SET `status`='Pending' WHERE `';
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
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement("delete from reservation_acara where id=?");
                sql.setInt(1, getAcara().getId());
                sql.setInt(2, getAkun().getId());

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
            this.result = this.statement.executeQuery("select * from reservation_acara RA inner join acara A inner join akun AK");
            while (this.result.next()) {
                Acara acara = new Acara(this.result.getString("nama_acara"),
                        this.result.getString("kategori"),
                        this.result.getString("lokasi"),
                        this.result.getDate("tanggal_acara"));
                Akun akun = new Akun(this.result.getString("username"),
                        this.result.getString("password"),
                        this.result.getString("nama"));
                Reservation_Acara racr = new Reservation_Acara(acara, akun,
                        this.result.getDate("tanggal_pembelian"),
                        this.result.getDate("tanggal_acara"),
                        this.result.getString("status"));

                collections.add(racr);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return collections;
    }

    public ArrayList<Object> bacaDataPending(Akun akun) {
        ArrayList<Object> collections = new ArrayList<Object>();
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("select RA.id as reservation_id, A.id as acara_id, A.nama_acara, A.kategori, A.lokasi, A.tanggal_acara, "
                                                                        + "AK.username, AK.password, AK.nama, RA.tanggal_pembelian, RA.tanggal_acara AS ra_tanggal_acara, RA.status "
                                                                        + "from reservation_acara RA inner join acara A on RA.acara_id = A.id inner join akun AK on RA.akun_id = AK.id "
                                                                        + "where RA.status = 'Pending' AND AK.username = ?"
            );
            statement.setString(1, akun.getUsername());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Acara acara = new Acara(
                        result.getInt("acara_id"),
                        result.getString("nama_acara"),
                        result.getString("kategori"),
                        result.getString("lokasi"),
                        result.getDate("tanggal_acara")
                );
                Akun ak = new Akun(
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("nama")
                );
                Reservation_Acara racr = new Reservation_Acara(
                        result.getInt("reservation_id"),
                        acara,
                        ak,
                        result.getDate("tanggal_pembelian"),
                        result.getDate("ra_tanggal_acara"),
                        result.getString("status")
                );

                collections.add(
                        String.valueOf(racr.getId()) + "-m"
                        + acara.getId() + "-m"
                        + acara.getNama_acara() + "-m"
                        + acara.getKategori() + "-m"
                        + acara.getLokasi() + "-m"
                        + racr.getTanggal_acara() + "-m#"
                );
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return collections;
    }

    public boolean updateStatus(int id) {
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("update reservation_acara set status='Selesai' where id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error di update status selesai: " + ex);
            return false;
        }
    }

    public Reservation_Acara selectReservationAcaraById(int id) {
        try {
            PreparedStatement statement = MyModel.conn.prepareStatement("select RA.id as reservation_id, A.id as acara_id, A.nama_acara, A.kategori, A.lokasi, A.tanggal_acara, "
                                                                        + "AK.username, AK.password, AK.nama, RA.tanggal_pembelian, RA.tanggal_acara AS ra_tanggal_acara, RA.status "
                                                                        + "from reservation_acara RA inner join acara A on RA.acara_id = A.id inner join akun AK on RA.akun_id = AK.id "
                                                                        + "where RA.status = 'Pending' AND AK.username = ?"
            );
            statement.setString(1, akun.getUsername());
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                Acara acara = new Acara(
                        result.getInt("acara_id"),
                        result.getString("nama_acara"),
                        result.getString("kategori"),
                        result.getString("lokasi"),
                        result.getDate("tanggal_acara")
                );
                Akun ak = new Akun(
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("nama")
                );
                Reservation_Acara racr = new Reservation_Acara(
                        result.getInt("reservation_id"),
                        acara,
                        ak,
                        result.getDate("tanggal_pembelian"),
                        result.getDate("ra_tanggal_acara"),
                        result.getString("status")
                );
                return racr;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error di select acara id: " + ex);
            return null;
        }
    }
}
