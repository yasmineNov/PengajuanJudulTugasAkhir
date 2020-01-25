package Program;

/***********************************************************************
 * Module:  Prodi.java
 * Author:  yasmine
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

import Program.DatabaseMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 506cf010-d445-4eaf-a481-119a5f20bc8b */
public class Prodi {
   /** @pdOid dc558f07-2d3d-4017-9927-b605e64bd929 */
   private int idProdi;
   /** @pdOid dc73b909-f254-4796-8efc-27801d2f8682 */
   private String namaProdi;
   
   /** @pdOid 1ff90d4b-0ada-42d8-9e6d-4a131afa01cc */
   public Prodi() {
      // TODO: implement
   }
   
   public Prodi(int idProdi, String namaProdi) {
      // TODO: implement
       setIdProdi(idProdi);
       setNamaProdi(namaProdi);
   }
   
   /** @pdOid f1ed3324-c351-40b2-a576-e011ec0325d1 */
   public int getIdProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid 7bab3865-e65a-40bd-adc4-4047b7a53a76 */
   public void setIdProdi(int newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid 87b18a9c-59b4-425e-a8ff-c201b5411222 */
   public String getNamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid 25fe06ce-a878-4ece-b22c-bee491a03fc2 */
   public void setNamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }
   
   @SuppressWarnings("unchecked")

   public ArrayList<Prodi> getAllDatabase(){
        ArrayList<Prodi> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM prodi";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Prodi pro = new Prodi();
               pro.setIdProdi(rs.getInt("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));

               list.add(pro);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return list;
   }

   public Prodi getSingleNamaDatabase(String kunci){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE namaProdi = (?)";
       try{
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, kunci);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               pro.setIdProdi(rs.getInt("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return pro;
   }

   public Prodi getSingleDatabase(int kunci){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE idProdi = (?)";
       try{
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, kunci);
           ResultSet rs = statement.executeQuery();

           if(rs.next()){
               pro.setIdProdi(rs.getInt("idProdi"));
               pro.setNamaProdi(rs.getString("namaProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return pro;
   }

   public void insertToDatabase(){
       try{
           String query = "INSERT INTO prodi VALUES (?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, getIdProdi());
           statement.setString(2, getNamaProdi());           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
       }
   }

   public void updateDatabase(){
       try{
           String query = "UPDATE prodi SET namaProdi = (?) WHERE idProdi = (?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, getNamaProdi());           
           statement.setInt(2, getIdProdi());

           statement.execute();
           statement.close();
       }
       catch(SQLException e){         
       }
   }
}