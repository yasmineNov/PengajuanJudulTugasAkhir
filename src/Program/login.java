/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ajeng
 */
public class login {
   private String idLogin;
   private String Password;
   
   public String getIdLogin() {
      return idLogin;
   }
   
   public void setIdLogin(String newIdLogin) {
      idLogin = newIdLogin;
   }
   
   /** @pdOid 7ea50029-c328-4a5c-9992-619499fa3f66 */
   public String getPassword() {
      return Password;
   }
  
   public void setPassword(String newPassword) {
      Password = newPassword;
   }
   
   public ArrayList<login> getAllDatabase(){
        ArrayList<login> list = new ArrayList<>();
       try{
           String query = "SELECT * FROM login";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               login log = new login();
               log.setIdLogin(rs.getString("idLogin"));
               log.setPassword(rs.getString("Password"));

               list.add(log);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
       }
       return list;
   }
   
    public login getSingleDatabase(String kunci) {
        login log = new login();
        String query = "SELECT * FROM login WHERE idlogin = (?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
            statement.setString(1, kunci);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                log.setIdLogin(rs.getString("idLogin"));
                log.setPassword(rs.getString("Password"));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
        }
        return log;
    }
    
    public void insertToDatabase(){
       try{
           String query = "INSERT INTO login VALUES (?, ?)";
           PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(query);
           statement.setString(1, getIdLogin());
           statement.setString(2, getPassword());           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
       }
   }
}
