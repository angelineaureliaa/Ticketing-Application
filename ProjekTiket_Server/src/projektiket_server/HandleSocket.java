/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projektiket_server;

import java.awt.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author User
 */
public class HandleSocket extends Thread{
    
    FormServer parent;
    Socket client;
    DataOutputStream out;
    BufferedReader in;
    
    public HandleSocket(FormServer _parent, Socket _client){
        this.parent = _parent;
        this.client = _client;
        
        try {
            out= new DataOutputStream(client.getOutputStream());
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (Exception e) {
            System.out.println("Error di handlesocket " + e);
        }
    }
    
    public void sendChat(String tmp){
        try {
            out.writeBytes(tmp+"\n");
        } catch (Exception e) {
            System.out.println("Error di sendchat : "+e);
        }
    }
    
    @Override
    public void run(){
        while(true){
            try {
                String tmp = in.readLine();
                parent.showChat(tmp);
                
                
            } catch (Exception e) {
                System.out.println("error di method run : "+e);
            }
        }
    }
}
