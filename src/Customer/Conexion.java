package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Conexion {
    
    Connection enlazar = null;
    
    public Connection conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No fue posible establecer la conexión");
        }
        return enlazar;
    }
    
}
