/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.ticketing.services;

import com.oracle.wls.shaded.org.apache.bcel.generic.AALOAD;
import com.sun.jmx.snmp.Timestamp;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Akun;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Acara;
import model.Reservation_Acara;
import model.Reservation_Parkir;
import model.Tempat;

/**
 *
 * @author User
 */
@WebService(serviceName = "TicketWebService")
public class TicketWebService {

    Akun akun = new Akun();
    ArrayList<String> listAkun;

    Acara acara = new Acara();
    ArrayList<Object> listAcara;

    Reservation_Acara racr = new Reservation_Acara();
    ArrayList<Object> listPending;

    Tempat tempat = new Tempat();
    ArrayList<Object> listTempat;

    Reservation_Parkir rp = new Reservation_Parkir();
    ArrayList<String> listReservasiParkir;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        if (akun.isLogin(username, password)) {
            return "SUCCESS!";
        } else {
            return "FAILED!";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BacaDataLogin")
    public ArrayList<String> BacaDataLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        akun = new Akun(username, password);
        listAkun = akun.display();
        return listAkun;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "nama") String nama) {
        //TODO write your implementation code here:
        akun.setUsername(username);
        akun.setPassword(password);
        akun.setNama(nama);
        akun.insertData();

        return "TRUE"; //harus ada return soalnya kan public string, kalo gamau gpp tpi pas buat register ini typenya void aja
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bacaDataTabel")
    public ArrayList<Object> bacaDataTabel(@WebParam(name = "username") String hello) {
        //TODO write your implementation code here:
        acara = new Acara();
        listAcara = acara.viewListData();
        return listAcara;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "PesanAcara")
    public String PesanAcara(@WebParam(name = "username") String username, @WebParam(name = "idAcara") String idAcara) {
        //TODO write your implementation code here:
        try {
            akun = akun.bacaDataSatu("", username);
            acara = acara.selectAcaraById(Integer.parseInt(idAcara));
            if (acara != null || akun != null) {
                Reservation_Acara acr = new Reservation_Acara();
                acr.setAkun(akun);
                acr.setAcara(acara);
                acr.setStatus("Pending");
                acr.setTanggal_acara(acara.getTanggal_acara());
                acr.setTanggal_pembelian(Date.valueOf(LocalDate.now()));
                acr.insertData();

                int kapasitasSisa = acara.getKapasitas_sisa();

                if (kapasitasSisa > 0) {
                    kapasitasSisa--;
                    boolean update = acara.updateKapasitasSisa(Integer.parseInt(idAcara), kapasitasSisa);
                }
                return "True";

            } else {
                return "acara kosonnggg";
            }
        } catch (NullPointerException e) {
            // Tangani NullPointerException
            return "Error: Data tidak valid atau tidak ditemukan.";
        } catch (Exception e) {
            // Tangani exception lain
            return "Error: Terjadi kesalahan saat memesan acara.";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bacaDataPending")
    public ArrayList<Object> bacaDataPending(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        akun.setUsername(username);
        racr = new Reservation_Acara();
        listPending = racr.bacaDataPending(akun);
        return listPending;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "claimTicketAcara")
    public String claimTicketAcara(@WebParam(name = "username") String username, @WebParam(name = "idRacr") String idRacr, @WebParam(name = "idAcara") String idAcara) {
        //TODO write your implementation code here:
        try {
            akun = akun.bacaDataSatu("", username);
            acara = acara.selectAcaraById(Integer.parseInt(idAcara));
            if (acara != null || akun != null) {
                racr = new Reservation_Acara();
                //racr = racr.selectReservationAcaraById(Integer.parseInt(idRacr));
                racr.updateStatus(Integer.parseInt(idRacr));
                return "True";
            } else {
                return "gabisa claim bos";
            }
        } catch (NullPointerException e) {
            // Tangani NullPointerException
            return "Error: Data tidak valid atau tidak ditemukan.";
        } catch (Exception e) {
            // Tangani exception lain
            return "Error: Terjadi kesalahan saat memesan acara.";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BacaDataTempat")
    public ArrayList<Object> BacaDataTempat(@WebParam(name = "hello") String hello) {
        //TODO write your implementation code here:
        tempat = new Tempat();
        listTempat = tempat.viewListData();
        System.out.println(listTempat);
        return listTempat;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BacaReservasi")
    public ArrayList<String> BacaReservasi(@WebParam(name = "tempat") String tempat, @WebParam(name = "lantai") String lantai, @WebParam(name = "tanggal") String tanggal) {
        //TODO write your implementation code here:
        rp = new Reservation_Parkir();
        listReservasiParkir = rp.bacaReservasi(tempat, lantai, tanggal);
        System.out.println(listReservasiParkir);
        return listReservasiParkir;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "PesanParkir")
    public String PesanParkir(@WebParam(name = "nomor_parkir") String nomor_parkir, @WebParam(name = "tanggal_pembelian") String tanggal_pembelian, @WebParam(name = "tanggal_parkir") String tanggal_parkir, @WebParam(name = "lantai") String lantai, @WebParam(name = "username") String username, @WebParam(name = "tempatt") String tempatt) {
        //TODO write your implementation code here:
        akun = akun.bacaDataSatu("", username);
        tempat = tempat.bacaDataTempat("", tempatt);
        if (akun != null || tempat != null) {

            Reservation_Parkir reserveParkir = new Reservation_Parkir();
            listReservasiParkir = reserveParkir.bacaSlot(nomor_parkir, tempatt, lantai, tanggal_parkir);
            if (listReservasiParkir.isEmpty()) {
                reserveParkir.setNomor_parkir(nomor_parkir);
                reserveParkir.setTanggal_pembelian(LocalDate.now().toString());
                reserveParkir.setTanggal_parkir(tanggal_parkir);
                reserveParkir.setLantai(lantai);
                reserveParkir.setAkun(akun);
                reserveParkir.setTempat(tempat);
                reserveParkir.insertData();
                return "TRUE";
            } else {
                return "Sudah terdaftar";
            }
        } else {
            return "GAADA WOY";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cekUsername")
    public String cekUsername(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "nama") String nama) {
        //TODO write your implementation code here:
        akun = new Akun(username, password, nama);
        if (akun.checkUsername(username)) {
            return "USERNAME DOBEL";
        } else {
            return "LANJUT";
        }
    }
}
