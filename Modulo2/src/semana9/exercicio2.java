package semana9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class exercicio2 {
    
    private String user;
    private String password;
    private String url;
    private String jdbcDriver;
    
    public void save(){
        user = "root";//readConfig.readLine();
        password = "";//readConfig.readLine();
        url = "jdbc:mysql://localhost/pietas";//"jdbc:mysql://"+readConfig.readLine()+"/basquete";
        jdbcDriver = "com.mysql.jdbc.Driver";
        Connection conn;
        Statement stm;
        try {
            Class.forName(jdbcDriver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            stm = (Statement) conn.createStatement();
            String query = ("INSERT INTO COMANDAS VALUES (0,1,0,'S')");
            stm.executeUpdate(query);
            stm.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(exercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}