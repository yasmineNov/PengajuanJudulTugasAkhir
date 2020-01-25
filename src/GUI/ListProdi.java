/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Program.*;

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

    public ListProdi(Prodi prodi) {
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
        tabelProdi = new javax.swing.JScrollPane();
        TBdos = new javax.swing.JTable();
        setujuButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DetailProdi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "judul", "Deskripsi", "ket.", "Acc Dosen", "Ket.", "Acc Prodi", "Ket."
            }
        ));
        TBdos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBdosMouseClicked(evt);
            }
        });
        tabelProdi.setViewportView(TBdos);

        DetailProdi.add(tabelProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 600, 160));

        setujuButton.setText("Setuju");
        setujuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuButtonActionPerformed(evt);
            }
        });
        DetailProdi.add(setujuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 90, -1));

        kembaliButton.setText("Kembali");
        DetailProdi.add(kembaliButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Daftar Tugas Akhir Mahasiswa");
        DetailProdi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        BACKGROUND.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        BACKGROUND.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasmine\\Pictures\\backlist.png")); // NOI18N
        DetailProdi.add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        getContentPane().add(DetailProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setujuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setujuButtonActionPerformed

    private void TBdosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBdosMouseClicked
   
    }//GEN-LAST:event_TBdosMouseClicked

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
    private javax.swing.JTable TBdos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton setujuButton;
    private javax.swing.JScrollPane tabelProdi;
    // End of variables declaration//GEN-END:variables
}
