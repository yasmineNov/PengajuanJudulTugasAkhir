package Program;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  yasmine
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/
import Program.DatabaseMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 927fd807-b949-4e6d-beec-64d2ca2b5219 */
public class Mahasiswa extends User {
   /** @pdOid f2dfbd51-23ab-4002-a586-9752369920f8 */
   private String nim;
   
   /** @pdRoleInfo migr=no name=Prodi assc=mhsToProdi mult=0..1 */
   public Prodi mhsToProdi;
   
   /** @pdOid ad498514-13a1-4828-a02c-197193fcde38 */
   public Mahasiswa() {
      // TODO: implement
   }
   
   public Mahasiswa(String nama, String nik, String jenisKelamin, String tanggalLahir, String alamat, String noTelp, String email, String agama, String nim, int idProdi) {
      // TODO: implement
      super(nama, nik, jenisKelamin, tanggalLahir, alamat, noTelp, email, agama);
       setNim(nim);
       mhsToProdi = new Prodi().getSingleDatabase(idProdi);
   }
   
   /** @param newNim
    * @pdOid 9fe59fe6-2b2a-45cd-84f8-cb322dda8c66 */
   public void setNim(String newNim) {
      nim = newNim;
   }
   
   /** @pdOid 0a8fee72-104f-49e9-a2a7-1483c3f9603f */
   public String getNim() {
      return nim;
   }

   @SuppressWarnings("unchecked")
   public ArrayList<Mahasiswa> getAllDatabase(){
       ArrayList<Mahasiswa> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM mahasiswa";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Mahasiswa maha = new Mahasiswa();
               maha.setNim(rs.getString("nim"));
               maha.mhsToProdi = new Prodi().getSingleDatabase(rs.getInt("idProdi"));
               maha.setNama(rs.getString("nama"));
               maha.setNik(rs.getString("nik"));
               maha.setJenisKelamin(rs.getString("jenisKelamin"));
               maha.setTanggalLahir(rs.getString("tanggalLahir"));
               maha.setAlamat(rs.getString("alamat"));
               maha.setNoTelp(rs.getString("noTelp"));
               maha.setEmail(rs.getString("email"));
               maha.setAgama(rs.getString("agama"));
               list.add(maha);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Mahasiswa getSingleDatabase(String kunci){
       Mahasiswa maha = new Mahasiswa();
       String query = "SELECT * FROM mahasiswa WHERE nim = (?)";
       try{
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               maha.setNim(rs.getString("nim"));
               maha.mhsToProdi = new Prodi().getSingleDatabase(rs.getInt("idProdi"));
               maha.setNama(rs.getString("nama"));
               maha.setNik(rs.getString("nik"));
               maha.setJenisKelamin(rs.getString("jenisKelamin"));
               maha.setTanggalLahir(rs.getString("tanggalLahir"));
               maha.setAlamat(rs.getString("alamat"));
               maha.setNoTelp(rs.getString("noTelp"));
               maha.setEmail(rs.getString("email"));
               maha.setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return maha;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, getNim());
           
           if(mhsToProdi != null)
               statement.setInt(2, mhsToProdi.getIdProdi());
           else
               statement.setString(2, null);
           statement.setString(3, getNama());
           statement.setString(4, getNik());
           statement.setString(5, getJenisKelamin());
           statement.setString(6, getTanggalLahir());
           statement.setString(7, getAlamat());
           statement.setString(8, getNoTelp());
           statement.setString(9, getEmail());
           statement.setString(10, getAgama());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}