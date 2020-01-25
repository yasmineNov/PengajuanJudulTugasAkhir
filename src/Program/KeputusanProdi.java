package Program;

/***********************************************************************
 * Module:  KeputusanProdi.java
 * Author:  yasmine
 * Purpose: Defines the Class KeputusanProdi
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 350e12d0-28bc-4bb2-98b4-4e84a8cff0e6 */
public class KeputusanProdi {
   /** @pdOid df7d697a-8c03-447a-bb85-13a19e0ef8a7 */
   private int idKeputusanProdi;
   /** @pdOid 1175fdd5-6e99-4bd7-9f85-b32e294b099d */
   private java.lang.Boolean statusProdi;
   private Date tglAccProdi;

   public KeputusanProdi(){
       
   }
   
   public KeputusanProdi(Boolean statusDospem){
       setIdKeputusanProdi(getAllDatabase().size() + 1);
       setStatusProdi(statusDospem);
       setTglAccProdi(new Date());
   }
   
    public Date getTglAccProdi() {
        return tglAccProdi;
    }

    public void setTglAccProdi(Date tglAccProdi) {
        this.tglAccProdi = tglAccProdi;
    }
   
   /** @pdRoleInfo migr=no name=Prodi assc=kepProdi mult=1..1 */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=Judul assc=putusanJudul mult=1..1 side=A */
   public Judul putusanJdl;
   
   /** @param newIdKeputusanProdi
    * @pdOid fb8c47e4-2a91-473c-a079-b261a63185f1 */
   public void setIdKeputusanProdi(int newIdKeputusanProdi) {
      idKeputusanProdi = newIdKeputusanProdi;
   }
   
   /** @param newStatusProdi
    * @pdOid ffee3cea-2245-4a4e-ab54-146d48c4bf3d */
   public void setStatusProdi(java.lang.Boolean newStatusProdi) {
      statusProdi = newStatusProdi;
   }
   
   /** @pdOid 1f00ef20-a2e5-4045-be0c-ae5c3cc3acb4 */
   public int getIdKeputusanProdi() {
      return idKeputusanProdi;
   }
   
   /** @pdOid a7f2a1ca-c890-4a16-bc0d-05e3ca0d08a6 */
   public java.lang.Boolean getStatusProdi() {
      return statusProdi;
   }
   
   public ArrayList<KeputusanProdi> getAllDatabase(){
        ArrayList<KeputusanProdi> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM keputusanprodi";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               KeputusanProdi Kp = new KeputusanProdi();
               Kp.setIdKeputusanProdi(rs.getInt("idKeputusanProdi"));
               Kp.prodi = new Prodi().getSingleDatabase(rs.getInt("idProdi"));
               Kp.putusanJdl = new Judul().getSingleDatabase(rs.getInt("idJudul"));
               Kp.setStatusProdi(rs.getBoolean("statusProdi"));
               Kp.setTglAccProdi(rs.getDate("tglAccProdi"));

               list.add(Kp);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return list;
   }
   
    public KeputusanProdi getSingleDatabase(int kunci) {
        KeputusanProdi Kp = new KeputusanProdi();
        String query = "SELECT * FROM keputusanprodi WHERE idKeputusanProdi = (?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
            statement.setInt(1, kunci);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Kp.setIdKeputusanProdi(rs.getInt("idKeputusanProdi"));
                Kp.prodi = new Prodi().getSingleDatabase(rs.getInt("idProdi"));
                Kp.putusanJdl = new Judul().getSingleDatabase(rs.getInt("idJudul"));
                Kp.setStatusProdi(rs.getBoolean("statusProdi"));
               Kp.setTglAccProdi(rs.getDate("tglAccProdi"));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
        }
        return Kp;
    }
    
    public void insertToDatabase(){
       try{
           String query = "INSERT INTO keputusanprodi VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, getIdKeputusanProdi());
           statement.setInt(2, prodi.getIdProdi());           
           statement.setInt(3, putusanJdl.getIdJudul());           
           statement.setBoolean(4, getStatusProdi());
           statement.setDate(5, (java.sql.Date) getTglAccProdi());
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
       }
   }
}