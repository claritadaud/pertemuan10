
package pertemuan10;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author ririn
 * tgl = 2024-05-20
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        
    }
    
    private static void listall() throws SQLException{
        Connection cnn = Koneksi.getKoneksi();
        if(cnn.isClosed()){
            System.out.println("Koneksi Gagal");
        
        }else{
            PreparedStatement PS = cnn.prepareStatement("select * from datateman");
            ResultSet rs = PS.executeQuery();
            
            while(rs.next()){
                System.out.println("No Record:"+ rs.getInt("idteman"));
                System.out.println("Nama :"+ rs.getString("nama"));
                System.out.println("Alamat :"+ rs.getString("alamat"));
                System.out.println("Telepon :"+ rs.getString("telp"));
            }
            
            cnn.close();
            
        }
       
        
    }
    
}
