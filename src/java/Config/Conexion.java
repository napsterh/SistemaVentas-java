
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/sistemaventas_java";
    String user = "root";
    String pass = ""; 
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            //System.err.println("error: " +e);
        }
        return con;
    }
}
