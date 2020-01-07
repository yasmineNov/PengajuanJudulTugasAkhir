package Program;

/***********************************************************************
 * Module:  Judul.java
 * Author:  yasmine
 * Purpose: Defines the Class Judul
 ***********************************************************************/

import Program.DatabaseMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid f4e914d4-dc28-4905-903b-679f000ec620 */
public class Judul {
   /** @pdOid 888386a9-7ef0-49cf-85ac-023ec56629bf */
   private int idJudul;
   /** @pdOid d5758304-cd92-4dde-b148-66ab25ec9f2b */
   private String namaJudul;
   /** @pdOid 5cf58358-6990-4cc2-bc82-49ef22d2a14f */
   private String deskripsi;
    /** @pdOid da8bee77-7c3c-4d47-9cd7-a86b51f06428 */
   private Date tglPengajuan;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=judulMhs mult=1..1 side=A */
   public Mahasiswa mahasiswadalamtugas;
   
   /** @pdOid 412aef13-04af-4105-927e-6df78766ccd9 */
   public int getIdJudul() {
      return idJudul;
   }
   
   /** @param newIdJudul
    * @pdOid f0d11dad-b76a-4b91-b358-a72416604e4f */
   public void setIdJudul(int newIdJudul) {
      idJudul = newIdJudul;
   }
   
   /** @pdOid 7ea50029-c328-4a5c-9992-619499fa3f66 */
   public String getNamaJudul() {
      return namaJudul;
   }
   
   /** @param newNamaJudul
    * @pdOid c3248630-1dc7-4b13-bed6-9964f6a55c3b */
   public void setNamaJudul(String newNamaJudul) {
      namaJudul = newNamaJudul;
   }
   
   /** @pdOid 0f0a4467-b294-428d-9bac-970fa9b6f5f3 */
   public String getDeskripsi() {
      return deskripsi;
   }
   
   /** @param newDeskripsi
    * @pdOid 2f7558c7-41dc-4f24-b5db-b72173d67579 */
   public void setDeskripsi(String newDeskripsi) {
      deskripsi = newDeskripsi;
   }
   
   /** @pdOid b5046b42-8d6a-48ee-b533-5d9738d8e558 */
   public Date getTglPengajuan() {
      return tglPengajuan;
   }
   
   /** @param newTglPengajuan
    * @pdOid 8bc718da-6f24-4cc7-8496-85e584e6433d */
   public void setTglPengajuan(Date newTglPengajuan) {
      tglPengajuan = newTglPengajuan;
   }
   
   /** @pdOid b753f461-7d2c-4f25-91b7-81eb8b1c57b5 */
   public Judul() {
      // TODO: implement
   }
   
   public Judul(String nim, String NamaJudul, String Deskripsi, Date TglPengajuan) {
      // TODO: implement
      autoInsertId();
      mahasiswadalamtugas = new Mahasiswa().getSingleDatabase(nim);
      setNamaJudul(NamaJudul);
      setDeskripsi(Deskripsi);
      setTglPengajuan(TglPengajuan);
   }

    @SuppressWarnings("unchecked")
    public ArrayList<Judul> getAllDatabase(){
       ArrayList<Judul> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM judul";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           
           while(rs.next()){
               Judul jud = new Judul();
               jud.setIdJudul(rs.getInt("idJudul"));
               jud.mahasiswadalamtugas = new Mahasiswa().getSingleDatabase(rs.getString("nim"));

               jud.setNamaJudul(rs.getString("namaJudul"));
               jud.setDeskripsi(rs.getString("deskripsi"));
               jud.setTglPengajuan(rs.getDate("TglPengajuan"));
               list.add(jud);
           }

           statement.close();

           rs.close();

       }

       catch(SQLException e){
       }
       return list;
   }

   public ArrayList<Judul> getAllNimDatabase(String nim){
       ArrayList<Judul> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM judul WHERE nim = (?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, nim);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Judul jud = new Judul();
               jud.setIdJudul(rs.getInt("idJudul"));
               jud.mahasiswadalamtugas = new Mahasiswa().getSingleDatabase(rs.getString("nim"));
               jud.setNamaJudul(rs.getString("namaJudul"));
               jud.setDeskripsi(rs.getString("deskripsi"));
               jud.setTglPengajuan(rs.getDate("TglPengajuan"));
               list.add(jud);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return list;
   }

   public Judul getSingleDatabase(int kunci){
       Judul jud = new Judul();
       String query = "SELECT * FROM judul WHERE idJudul = (?)";
       try{
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               jud.setIdJudul(rs.getInt("idJudul"));
               jud.mahasiswadalamtugas = new Mahasiswa().getSingleDatabase(rs.getString("nim"));
               jud.setNamaJudul(rs.getString("namaJudul"));
               jud.setDeskripsi(rs.getString("deskripsi"));
               jud.setTglPengajuan(rs.getDate("TglPengajuan"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return jud;
   }

   public void insertToDatabase(){
       try{
           String query = "INSERT INTO judul VALUES (?, ?, ?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);

           statement.setInt(1, getIdJudul());
           statement.setString(2, mahasiswadalamtugas.getNim());
           statement.setString(3, getNamaJudul());
           statement.setString(4, getDeskripsi());
           java.sql.Date sqlDate = new java.sql.Date(getTglPengajuan().getTime());
           statement.setDate(5, sqlDate);
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
       }
   }

   public void deleteSingleDatabase(int idJudul){
       try{
           String query = "DELETE FROM judul WHERE idJudul = (?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, idJudul);
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public int getSizeDatabase(){
       int jumlah = getAllDatabase().size();
       if (jumlah < 1)
           return 1;
       else
           return jumlah + 1;
   }

   

   public void autoInsertId(){
       int jumlah = getSizeDatabase();
       setIdJudul(jumlah);
   }
}