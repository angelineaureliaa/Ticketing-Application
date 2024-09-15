/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public abstract class MyModel {

    protected static Connection conn;
    protected Statement statement;
    protected ResultSet result;

    public MyModel() {
        this.conn = this._getConnection();
        this.statement = null;
        this.result = null;
    }

    private Connection _getConnection() {
        if (MyModel.conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                MyModel.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketingbaru", "root", "");
            } catch (Exception ex) {
                System.out.println("Error connecting to database: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return MyModel.conn;
    }

    public abstract void insertData();

    public abstract void updateData();

    public abstract void deleteData();

    public abstract ArrayList<Object> viewListData();
}
