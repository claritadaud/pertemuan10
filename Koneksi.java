
package pertemuan10;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ririn
 * tgl : 2025-20-05
 */
public class Koneksi {
    public static Connection getKoneksi() throws SQLException{
        Connection cnn = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bukuteman", "root", "123456");
            
             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi ke database Gagal");
        }
        return cnn;
    }
    
}
