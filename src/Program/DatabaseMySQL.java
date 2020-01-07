package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseMySQL {

    private static Connection connection = null;
    public static Connection getConnection(){

        if (connection==null){

            try {

                String url = "jdbc:mysql://localhost/";
                //String timezone = "?usetimezone=true&serverTimezone=UTC";
                String namaDB, user, pass;

                namaDB = "last";//sesuaikan dengan nama database di mySQL
                user = "root";//sesuaikan dengan username di mySQL
                pass = "";//sesuaikan dengan password di mySQL default ("")
       
                Class.forName("com.mysql.jdbc.Driver");

                connection = DriverManager.getConnection(url+namaDB, user, pass);

            } catch (ClassNotFoundException | SQLException e) {

                System.out.println("error di sini juga");

                return null;
            }
        }

        return connection;

      }

    public static boolean isConnect(){
        try {
            if (getConnection()==null){
                return false;
            }

        } catch (Exception ex) {
            Logger.getLogger(DatabaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    public ResultSet getConnection(String query) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}

