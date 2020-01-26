package Program;

/***********************************************************************
 * Module:  KeputusanDospem.java
 * Author:  yasmine
 * Purpose: Defines the Class KeputusanDospem
 ***********************************************************************/

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 0d512e64-d959-4bd1-a4e5-0fd42cd7ecaf */
public class KeputusanDospem {
   /** @pdOid b3bc1d1d-76ae-449b-a896-f9e47c0e05c2 */
   private int idKeputusanDospem;
   /** @pdOid 20905081-b638-4246-ad59-7bbf80ff996b */
   private java.lang.Boolean statusDospem;
     /** @pdOid e05fdae5-adca-4a70-b2cb-7ec38ed19cbf */
   private Date tglAccDosen;
   
   public KeputusanDospem(){
       
   }
   
   public KeputusanDospem(String npp,int idJudul, Boolean statusDospem){
       setIdKeputusanDospem(getAllDatabase().size() + 1);
       dospem = new Dospem().getSingleDatabase(npp);
       putusanDosen = new Judul().getSingleDatabase(idJudul);
       setStatusDospem(statusDospem);
       setTglAccDosen(new Date());
   }
   
   public Date getTglAccDosen() {
        return tglAccDosen;
    }

    public void setTglAccDosen(Date tglAccDosen) {
        this.tglAccDosen = tglAccDosen;
    }
   
   /** @pdRoleInfo migr=no name=Judul assc=judulAccDosen mult=1..1 side=A */
   public Judul putusanDosen;
   /** @pdRoleInfo migr=no name=Dospem assc=accDospem mult=1..1 side=A */
   public Dospem dospem;
   
   /** @param newIdKeputusanDospem
    * @pdOid ea195881-6b5a-48b1-b24b-73554fc7cb77 */
   public void setIdKeputusanDospem(int newIdKeputusanDospem) {
      idKeputusanDospem = newIdKeputusanDospem;
   }
   
   /** @param newStatusDospem
    * @pdOid 671b0685-7f52-42e4-8554-86a76ee904ba */
   public void setStatusDospem(java.lang.Boolean newStatusDospem) {
      statusDospem = newStatusDospem;
   }
   
   /** @pdOid 02a180cd-1eeb-4e33-847c-f209aa53427c */
   public int getIdKeputusanDospem() {
      return idKeputusanDospem;
   }
   
   /** @pdOid a29e1854-7bc9-4572-9787-3bbe2abea795 */
   public java.lang.Boolean getStatusDospem() {
      return statusDospem;
   }

   public ArrayList<KeputusanDospem> getAllDatabase(){
        ArrayList<KeputusanDospem> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM keputusandospem";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               KeputusanDospem Kd = new KeputusanDospem();
               Kd.setIdKeputusanDospem(rs.getInt("idKeputusanDospem"));
               Kd.dospem = new Dospem().getSingleDatabase(rs.getString("npp"));
               Kd.putusanDosen = new Judul().getSingleDatabase(rs.getInt("idJudul"));
               Kd.setStatusDospem(rs.getBoolean("statusDospem"));
               Kd.setTglAccDosen(rs.getDate("tglAccDosen"));

               list.add(Kd);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return list;
   }
   
    public KeputusanDospem getSingleDatabase(int kunci) {
        KeputusanDospem Kd = new KeputusanDospem();
        String query = "SELECT * FROM keputusandospem WHERE idKeputusanDospem = (?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
            statement.setInt(1, kunci);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Kd.setIdKeputusanDospem(rs.getInt("idKeputusanDospem"));
                Kd.dospem = new Dospem().getSingleDatabase(rs.getString("npp"));
                Kd.putusanDosen = new Judul().getSingleDatabase(rs.getInt("idJudul"));
                Kd.setStatusDospem(rs.getBoolean("statusDospem"));
                Kd.setTglAccDosen(rs.getDate("tglAccDosen"));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
        }
        return Kd;
    }
    
    public void insertToDatabase(){
       try{
           String query = "INSERT INTO keputusandospem VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setInt(1, getIdKeputusanDospem());
           statement.setString(2, dospem.getNpp());           
           statement.setInt(3, putusanDosen.getIdJudul());           
           statement.setBoolean(4, getStatusDospem());
           java.sql.Date sqlDate = new java.sql.Date(getTglAccDosen().getTime());
           statement.setDate(5, sqlDate);
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
       }
   }
}