
package Conex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author jaider
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alfa_omega_bd","root","holasoyyo20");
        }catch(Exception e){
            System.err.println("Error: "+e);
        }
}
    public static void main(String[] args){
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
        
    }
}
