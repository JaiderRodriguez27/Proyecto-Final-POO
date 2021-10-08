
package Conex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jaider
 */
public class Conexion {
    
    private final String base= "alfa_omega_bd";
    private final String user= "root";
    private final String password= "holasoyyo20";
    private final String url= "jdbc:mysql://localhost:3306/"+base;
    private Connection con;
    
    public Connection getConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
   /* public static void main(String[] args){
        Conexion cn= new Conexion();
        
        Statement st;
        ResultSet rs;
        
        try{
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from productos");
            while(rs.next()){
                System.out.println(rs.getInt("id"));
            }
            cn.con.close();
        }catch(Exception e){
            System.err.println("Error: "+e);
        }
        
    }*/
}
