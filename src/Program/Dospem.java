package Program;

/***********************************************************************
 * Module:  Dospem.java
 * Author:  yasmine
 * Purpose: Defines the Class Dospem
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 8d85be8a-dbe3-464e-8d75-f7acca0d7551 */
public class Dospem extends User {
    public Dospem(){
        
    }
   
   public Dospem(String nama, String nik, String jenisKelamin, String tanggalLahir, String alamat, String noTelp, String email, String agama, String npp) {
      // TODO: implement
      super(nama, nik, jenisKelamin, tanggalLahir, alamat, noTelp, email, agama);
       setNpp(npp);
   } 
   /** @pdOid fd2d5151-baf3-4daf-a627-9d78e6bf83f4 */
   private String npp;
   
   /** @param newNpp
    * @pdOid e65efa28-7ea0-4fb5-959b-537b289c9325 */
   public void setNpp(String newNpp) {
      npp = newNpp;
   }
   
   /** @pdOid c1eacb4c-62a4-40cb-8e26-2daa01f32c38 */
   public String getNpp() {
      return npp;
   }

   public ArrayList<Dospem> getAllDatabase(){
       ArrayList<Dospem> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM dospem";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Dospem dos = new Dospem();
               dos.setNpp(rs.getString("npp"));
               dos.setNama(rs.getString("nama"));
               dos.setNik(rs.getString("nik"));
               dos.setJenisKelamin(rs.getString("jenisKelamin"));
               dos.setTanggalLahir(rs.getString("tanggalLahir"));
               dos.setAlamat(rs.getString("alamat"));
               dos.setNoTelp(rs.getString("noTelp"));
               dos.setEmail(rs.getString("email"));
               dos.setAgama(rs.getString("agama"));
               list.add(dos);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public Dospem getSingleDatabase(String kunci){
       Dospem dos = new Dospem();
       String query = "SELECT * FROM dospem WHERE npp = (?)";
       try{
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               dos.setNpp(rs.getString("npp"));
               dos.setNama(rs.getString("nama"));
               dos.setNik(rs.getString("nik"));
               dos.setJenisKelamin(rs.getString("jenisKelamin"));
               dos.setTanggalLahir(rs.getString("tanggalLahir"));
               dos.setAlamat(rs.getString("alamat"));
               dos.setNoTelp(rs.getString("noTelp"));
               dos.setEmail(rs.getString("email"));
               dos.setAgama(rs.getString("agama"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return dos;
   }
   
   public void insertToDatabase(){
       try{
           String query = "INSERT INTO dospem VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, getNpp());
           statement.setString(2, getNama());
           statement.setString(3, getNik());
           statement.setString(4, getJenisKelamin());
           statement.setString(5, getTanggalLahir());
           statement.setString(6, getAlamat());
           statement.setString(7, getNoTelp());
           statement.setString(8, getEmail());
           statement.setString(9, getAgama());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}