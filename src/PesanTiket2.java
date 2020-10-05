
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PesanTiket2 extends javax.swing.JFrame {

    private String tgl;
 
    /**
     * Creates new form PesanTiket2
     */
    public PesanTiket2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ktp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kode = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        bagasi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Maskapai = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tanggal = new com.toedter.calendar.JDateChooser();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Lengkap");

        jLabel2.setText("No KTP");

        jLabel3.setText("Kode Penerbangan");

        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        jLabel4.setText("Bagasi");

        harga.setEditable(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        bagasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20 Kg", "30 Kg", "40 Kg" }));
        bagasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagasiActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga yang harus dibayar");

        jLabel6.setText("Halaman Pemesanan");

        jLabel7.setText("Maskapai");

        Maskapai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garuda Indonesia", "Sriwijaya", "Lion Air" }));
        Maskapai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaskapaiActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga");

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel10.setText("Tanggal Keberangkatan");

        Tanggal.setDateFormatString("yyyy-MMM-dd");
        Tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TanggalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(ktp)
                            .addComponent(total)
                            .addComponent(Tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Maskapai, javax.swing.GroupLayout.Alignment.TRAILING, 0, 199, Short.MAX_VALUE)
                            .addComponent(kode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bagasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel6)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(ktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Maskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(bagasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String Nama;
        try{
            String sql = "Insert into transaksi (nama,no_ktp,tanggal_keberangkatan,bagasi,total_harga,kode_penerbangan) "
                    + "value ('"+nama.getText()+"','"+ktp.getText()+"','"
                    +tgl+"','"+bagasi.getSelectedItem()
                    +"','"+total.getText()+"','"+kode.getSelectedItem()+"');";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            dispose();
            Nama = (String) nama.getText();
            new Output(Nama).setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bagasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagasiActionPerformed
        // TODO add your handling code here:
        int denda = 0;
        
        if(bagasi.getSelectedItem().equals("20 Kg")){
            denda = 0;
        }else if(bagasi.getSelectedItem().equals("30 Kg")){
            denda = 20000;
        }else{
            denda = 30000;
        }
        
        int Total = 0;
        int hrg2 = Integer.parseInt(harga.getText());
        Total = hrg2 + denda;
        total.setText(""+Total);
    }//GEN-LAST:event_bagasiActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_totalActionPerformed

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
            String Kode = null;
            Kode = kode.getSelectedItem().toString();
        try {
            if(Kode != null){
            Connection konek = new koneksi().configDB();
            Statement stat = konek.createStatement();
            String sql = "select harga from jadwal where kode_penerbangan ='"+Kode+"'";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                String Sharga = rs.getString("harga");
                int hrg = Integer.parseInt(Sharga);
                harga.setText(""+hrg);
            }
            konek.close();
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Kode Penerbangan Tidak Ada");
        }
    }//GEN-LAST:event_kodeActionPerformed

    private void MaskapaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaskapaiActionPerformed
        String maskapai = Maskapai.getSelectedItem().toString();
        
        try{
           kode.removeAllItems();
           Connection konek = new koneksi().configDB();
           Statement stat = konek.createStatement();
           String sql = "Select kode_penerbangan from jadwal "
                   + "where maskapai='" + maskapai +"'";
           ResultSet rs = stat.executeQuery(sql);
           while(rs.next()){
               String kode1 = rs.getString("kode_penerbangan");
               
               kode.addItem(kode1);
           }
           konek.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "menu kosong!");
       }
            
        
    }//GEN-LAST:event_MaskapaiActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_hargaActionPerformed

    private void TanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TanggalPropertyChange
        // TODO add your handling code here:
        
        if(Tanggal.getDate()!= null){
            SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
            tgl = format.format(Tanggal.getDate());
        }
    }//GEN-LAST:event_TanggalPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesanTiket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanTiket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanTiket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanTiket2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanTiket2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Maskapai;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JComboBox<String> bagasi;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> kode;
    private javax.swing.JTextField ktp;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
