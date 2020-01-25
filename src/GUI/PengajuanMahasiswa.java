package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import Program.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


public class PengajuanMahasiswa extends javax.swing.JFrame {

    public PengajuanMahasiswa() {
        initComponents();
        getJudul();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMhs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backto = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJudul = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listMhs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel2.setText("X");
        listMhs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        backto.setText("Kembali");
        backto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoActionPerformed(evt);
            }
        });
        listMhs.add(backto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        listMhs.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        save.setText("Simpan");
        listMhs.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        tabelJudul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "judul", "Deskripsi", "tgl. Pengajuan", "Acc Dosen", "Ket.", "Acc Prodi", "Ket."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelJudul);

        listMhs.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 590, 230));
        listMhs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 460));

        getContentPane().add(listMhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 2, 680, 450));

        setSize(new java.awt.Dimension(696, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
      
    }//GEN-LAST:event_tambahActionPerformed

    private void backtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backtoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengajuanMahasiswa().setVisible(true);
                
            }
        });
    }

    public void getJudul(){
        DefaultTableModel model = (DefaultTableModel) tabelJudul.getModel();
        model.setRowCount(0);
        Object[] atribut = new Object[7];
        ArrayList<Judul> listJudul = new Judul().getAllDatabase();
        Iterator<Judul> tiapJudul = listJudul.iterator();
        while(tiapJudul.hasNext()){
            Judul jud = tiapJudul.next();
            
            KeputusanDospem Kd = new KeputusanDospem();
            ArrayList<KeputusanDospem> listKeputusanDospem = new KeputusanDospem().getAllDatabase();
            Iterator<KeputusanDospem> tiapKeputusanDospem = listKeputusanDospem.iterator();
            while(tiapKeputusanDospem.hasNext()){
                KeputusanDospem KdTemp = tiapKeputusanDospem.next();
                if(jud.getIdJudul() == KdTemp.putusanDosen.getIdJudul()){
                    Kd = KdTemp;
                    break;
                }
            }
            
            KeputusanProdi Kp = new KeputusanProdi();
            ArrayList<KeputusanProdi> listKeputusanProdi = new KeputusanProdi().getAllDatabase();
            Iterator<KeputusanProdi> tiapKeputusanProdi = listKeputusanProdi.iterator();
            while(tiapKeputusanProdi.hasNext()){
                KeputusanProdi KpTemp = tiapKeputusanProdi.next();
                if(jud.getIdJudul() == KpTemp.putusanJdl.getIdJudul()){
                    Kp = KpTemp;
                    break;
                }
            }
            
            atribut[0] = jud.getNamaJudul();
            atribut[1] = jud.getDeskripsi();
            atribut[2] = jud.getTglPengajuan();
            atribut[3] = Kd.getStatusDospem();
            atribut[4] = Kd.getTglAccDosen();
            atribut[5] = Kp.getStatusProdi();
            atribut[6] = Kp.getTglAccProdi();
            
            model.addRow(atribut);
        }
        tabelJudul.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listMhs;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelJudul;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
