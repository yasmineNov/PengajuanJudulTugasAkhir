/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author yasmine
 */
public class DetailProdi extends javax.swing.JFrame {

    /**
     * Creates new form DetailProdi
     */
    public DetailProdi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pengajuan = new javax.swing.JPanel();
        judulnama = new javax.swing.JTextField();
        desfieldArea = new javax.swing.JScrollPane();
        deskripsides = new javax.swing.JTextArea();
        jLabeltopjudul = new javax.swing.JLabel();
        ajukanButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabeljudul = new javax.swing.JLabel();
        jLabeldeskripsi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pengajuan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judulnama.setText(" ");
        judulnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulnamaActionPerformed(evt);
            }
        });
        pengajuan.add(judulnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 400, -1));

        deskripsides.setColumns(20);
        deskripsides.setRows(5);
        desfieldArea.setViewportView(deskripsides);

        pengajuan.add(desfieldArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 400, 120));

        jLabeltopjudul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeltopjudul.setText("Detail Pengajuan Judul Mahasiswa");
        pengajuan.add(jLabeltopjudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        ajukanButton.setBackground(new java.awt.Color(255, 204, 0));
        ajukanButton.setText("Ajukan");
        ajukanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajukanButtonActionPerformed(evt);
            }
        });
        pengajuan.add(ajukanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        pengajuan.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabeljudul.setBackground(new java.awt.Color(0, 0, 0));
        jLabeljudul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeljudul.setText("Judul                         :");
        pengajuan.add(jLabeljudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabeldeskripsi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldeskripsi.setText("Deskripsi                   :");
        pengajuan.add(jLabeldeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasmine\\Pictures\\backlist.png")); // NOI18N
        pengajuan.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void judulnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulnamaActionPerformed

    private void ajukanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajukanButtonActionPerformed

    }//GEN-LAST:event_ajukanButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DetailProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailProdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajukanButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane desfieldArea;
    private javax.swing.JTextArea deskripsides;
    private javax.swing.JLabel jLabeldeskripsi;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JLabel jLabeltopjudul;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField judulnama;
    private javax.swing.JPanel pengajuan;
    // End of variables declaration//GEN-END:variables
}
