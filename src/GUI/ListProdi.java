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
public class ListProdi extends javax.swing.JFrame {

    /**
     * Creates new form ListProdi
     */
    public ListProdi() {
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

        DetailProdi = new javax.swing.JPanel();
        desfieldArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabeljudul = new javax.swing.JLabel();
        jLabeldeskripsi = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();
        ListProdi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJudul = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelJudul1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DetailProdi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        desfieldArea.setViewportView(jTextArea1);

        DetailProdi.add(desfieldArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 270, 120));

        jLabeljudul.setBackground(new java.awt.Color(0, 0, 0));
        jLabeljudul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeljudul.setText("Judul                         :");
        DetailProdi.add(jLabeljudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabeldeskripsi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeldeskripsi.setText("Deskripsi                   :");
        DetailProdi.add(jLabeldeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jButton6.setText("Approve");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        DetailProdi.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 90, -1));

        jButton7.setText("Kembali");
        DetailProdi.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));
        DetailProdi.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 270, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Detail Tugas Akhir Mahasiswa");
        DetailProdi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        BACKGROUND.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BACKGROUND.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasmine\\Pictures\\backlist.png")); // NOI18N
        DetailProdi.add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(DetailProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        ListProdi.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("List Prodi");
        jLabel5.setToolTipText("");
        ListProdi.add(jLabel5);
        jLabel5.setBounds(300, 120, 130, 30);

        jButton3.setText("Simpan");
        ListProdi.add(jButton3);
        jButton3.setBounds(570, 380, 73, 23);

        jButton4.setText("Kembali");
        ListProdi.add(jButton4);
        jButton4.setBounds(50, 380, 69, 23);

        tabelJudul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "judul", "Deskripsi", "tgl. Pengajuan", "Acc Dosen", "Ket.", "Acc Prodi", "Ket."
            }
        ));
        jScrollPane1.setViewportView(tabelJudul);

        ListProdi.add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 600, 200);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasmine\\Pictures\\backlist.png")); // NOI18N
        ListProdi.add(jLabel9);
        jLabel9.setBounds(0, 0, 690, 460);

        tabelJudul1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "judul", "Deskripsi", "tgl. Pengajuan", "Acc Dosen", "Ket.", "Acc Prodi", "Ket."
            }
        ));
        jScrollPane2.setViewportView(tabelJudul1);

        ListProdi.add(jScrollPane2);
        jScrollPane2.setBounds(40, 170, 600, 200);

        getContentPane().add(ListProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ListProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListProdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JPanel DetailProdi;
    private javax.swing.JPanel ListProdi;
    private javax.swing.JScrollPane desfieldArea;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeldeskripsi;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelJudul;
    private javax.swing.JTable tabelJudul1;
    // End of variables declaration//GEN-END:variables
}
