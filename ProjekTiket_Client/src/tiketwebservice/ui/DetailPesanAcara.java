    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tiketwebservice.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class DetailPesanAcara extends javax.swing.JFrame implements Runnable{
    public String usn;
    public String nama_acara;
    public String kategori;
    public String lokasi;
    public Date tanggal_acara;
    public String idAcr;
    
    Socket s;
    Thread t;
    BufferedReader in;
    DataOutputStream out;

    /**
     * Creates new form DetailPesan
     */
    public DetailPesanAcara() {
        try {
            initComponents();
            
            //TCP
            s = new Socket("localhost", 6002);
            if (t == null) {
                t = new Thread(this, "Client");
                t.start();
            }
        } catch (IOException ex) {
            System.out.println("Error di constructor = " + ex);
        }
    }
    
    public void tampil(){
        System.out.println("Masukkkk");
        System.out.println(nama_acara);
        labelNamaAcr.setText(nama_acara);
        labelKat.setText(kategori);
        labelLokasi.setText(lokasi);
        labelNamaAkun.setText(usn);
        labelTgl.setText(tanggal_acara.toString());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        labelNamaAkun = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelKat = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelLokasi = new javax.swing.JLabel();
        labelTgl = new javax.swing.JLabel();
        labelNamaAcr = new javax.swing.JLabel();
        jButtonPesan = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("Nama Pemesan");
        jPanelMain.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        labelNamaAkun.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNamaAkun.setText("namaPemesan");
        jPanelMain.add(labelNamaAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText(":");
        jPanelMain.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 19, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setText(":");
        jPanelMain.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 19, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText(":");
        jPanelMain.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 19, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText(":");
        jPanelMain.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 19, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText(":");
        jPanelMain.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 19, -1));

        labelKat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelKat.setText("kategori");
        jPanelMain.add(labelKat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Lokasi Acara");
        jPanelMain.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Tanggal Acara ");
        jPanelMain.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Kategori");
        jPanelMain.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Nama Acara");
        jPanelMain.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        labelLokasi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLokasi.setText("lokasi");
        jPanelMain.add(labelLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        labelTgl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTgl.setText("tanggal_acara");
        jPanelMain.add(labelTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        labelNamaAcr.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNamaAcr.setText("nama_acara");
        jPanelMain.add(labelNamaAcr, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jButtonPesan.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButtonPesan.setText("Pesan Tiket");
        jButtonPesan.setToolTipText("");
        jButtonPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesanActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 210, 40));

        buttonBack.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buttonBack.setText("<");
        buttonBack.setToolTipText("");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        jPanelMain.add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/images/bgKonfirmasiPemesananAcara.png"))); // NOI18N
        jPanelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesanActionPerformed
        // TODO add your handling code here:
        try {
            String chatClient;
            chatClient = "Pesan Acara-n"+usn+"-m"+idAcr;
            System.out.println(chatClient);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeBytes(chatClient + "\n");
            getMessage();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonPesanActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        Acara form = new Acara();
        form.setVisible(true);
        this.setVisible(false);
        form.usn = usn;
        form.isiData();
        form.tampil();
    }//GEN-LAST:event_buttonBackActionPerformed

    /**
     * @param args the command line arguments
     */
    @Override
    public void run() {
        while (true) {
        }
    }
    
    public void getMessage() throws IOException {
        String chatServer;

        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        chatServer = in.readLine();
        System.out.println(chatServer);
        
        String[] arrayDariServer = chatServer.split("-n");
        String status = arrayDariServer[0];
        
        if(status.equals("Berhasil Reservasi Acara")){
            JOptionPane.showMessageDialog(this, "BERHASIL RESERVASI.\n" + "Acara : " + nama_acara +".\nTanggal Pemesanan : " + 
                                           LocalDate.now().toString());
            Acara form = new Acara();
            form.setVisible(true);
            this.setVisible(false);
            form.tampil();
            form.usn = usn;
            form.isiData();
        }
       
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailPesanAcara().setVisible(true); // Ganti Acara() menjadi DetailPesanAcara()
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButtonPesan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JLabel labelKat;
    private javax.swing.JLabel labelLokasi;
    private javax.swing.JLabel labelNamaAcr;
    private javax.swing.JLabel labelNamaAkun;
    private javax.swing.JLabel labelTgl;
    // End of variables declaration//GEN-END:variables
}
