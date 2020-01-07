
package Tampilan;
import Program.Judul;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class mahasiswa extends javax.swing.JFrame {

    public mahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        belakang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMhs = new javax.swing.JTable();
        JudulBaru = new javax.swing.JPanel();
        labelIdJudul = new javax.swing.JLabel();
        labeljudul = new javax.swing.JLabel();
        labelDes = new javax.swing.JLabel();
        labelDospem = new javax.swing.JLabel();
        idJudulField = new javax.swing.JTextField();
        DospemField = new javax.swing.JTextField();
        namajudulField = new javax.swing.JTextField();
        DesField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ViewAllButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        belakang.setBackground(new java.awt.Color(204, 255, 204));

        tabelMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdJudul", "Judul", "deskripsi", "DosenPembimbing"
            }
        ));
        jScrollPane1.setViewportView(tabelMhs);

        JudulBaru.setBackground(new java.awt.Color(0, 204, 102));

        labelIdJudul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIdJudul.setText("No. Judul              :");

        labeljudul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labeljudul.setText("Judul                   :");

        labelDes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDes.setText("Deskripsi               :");

        labelDospem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDospem.setText("Dosen Pembimbing :");

        idJudulField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idJudulField.setText(" ");

        DospemField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DospemField.setText(" ");

        namajudulField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namajudulField.setText(" ");

        DesField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DesField.setText(" ");

        javax.swing.GroupLayout JudulBaruLayout = new javax.swing.GroupLayout(JudulBaru);
        JudulBaru.setLayout(JudulBaruLayout);
        JudulBaruLayout.setHorizontalGroup(
            JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JudulBaruLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JudulBaruLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JudulBaruLayout.createSequentialGroup()
                                .addComponent(labelDospem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DospemField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JudulBaruLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labeljudul)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namajudulField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JudulBaruLayout.createSequentialGroup()
                                .addComponent(labelDes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DesField, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JudulBaruLayout.createSequentialGroup()
                        .addComponent(labelIdJudul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idJudulField, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        JudulBaruLayout.setVerticalGroup(
            JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JudulBaruLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdJudul)
                    .addComponent(idJudulField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeljudul)
                    .addComponent(namajudulField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDes))
                .addGap(18, 18, 18)
                .addGroup(JudulBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDospem)
                    .addComponent(DospemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ViewAllButton.setText("View All");
        ViewAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");

        javax.swing.GroupLayout belakangLayout = new javax.swing.GroupLayout(belakang);
        belakang.setLayout(belakangLayout);
        belakangLayout.setHorizontalGroup(
            belakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belakangLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(belakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JudulBaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(belakangLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(312, 312, 312)
                        .addComponent(AddButton)
                        .addGap(152, 152, 152)
                        .addComponent(ViewAllButton))
                    .addComponent(jScrollPane1))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        belakangLayout.setVerticalGroup(
            belakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belakangLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(JudulBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(belakangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(ViewAllButton)
                    .addComponent(backButton))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(belakang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(belakang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        Judul jdl = new Judul();
        jdl.setIdJudul(Integer.parseInt(idJudulField.getText()));
        jdl.setNamaJudul(namajudulField.getText());
        jdl.setDeskripsi(DesField.getText());
        
        try {
            jdl.insertDb();
        } catch (Exception ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        idJudulField.setText("");
        namajudulField.setText("");
        DesField.setText("");
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ViewAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllButtonActionPerformed
        Judul jdl = new Judul();
        DefaultTableModel modelTable = (DefaultTableModel) tabelMhs.getModel();
        Object[] atributJudul = new Object[10];
        try {
            ArrayList judulAll = jdl.viewAll(); //harus dikasih try catch
            Iterator listJudul = judulAll.iterator();
            System.out.println("size: "+judulAll.size()); //ok
            int i=0;  
            while(i<judulAll.size()){
                Judul eachjdl;
                eachjdl = (Judul) listJudul.next();
                atributJudul[0] = eachjdl.getIdJudul();
                atributJudul[1] = eachjdl.getNamaJudul();
                atributJudul[2] = eachjdl.getDeskripsi();
                atributJudul[3] = eachjdl.getDospem();
                //System.out.println(eachKepsek.getIdKepsek()+"-"+eachKepsek.getNamaKepsek());
                modelTable.addRow(atributJudul);
                i++;
            }
            tabelMhs.setModel(modelTable);
        } catch (Exception ex) {
            Logger.getLogger(mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewAllButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField DesField;
    private javax.swing.JTextField DospemField;
    private javax.swing.JPanel JudulBaru;
    private javax.swing.JButton ViewAllButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel belakang;
    private javax.swing.JTextField idJudulField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDes;
    private javax.swing.JLabel labelDospem;
    private javax.swing.JLabel labelIdJudul;
    private javax.swing.JLabel labeljudul;
    private javax.swing.JTextField namajudulField;
    private javax.swing.JTable tabelMhs;
    // End of variables declaration//GEN-END:variables
}
