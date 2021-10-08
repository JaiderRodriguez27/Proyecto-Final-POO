/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conex.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaider
*/ 
public class SqlProductos extends Conexion{
    
    public boolean registrarProducto(Producto producto){
        PreparedStatement ps = null;
        Connection con= getConexion();
        
        String sql= "INSERT INTO clientes (Id,Nombre,Precio,Cantidad_actual,Cantidad_minima_permitida,Bajo_pedido,Descripcion,Pais_procedencia,Fabricante,Peso_gramos,Garantia_dias,Id_Proveedor,Tipo_Producto,Ruta_imagen) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, producto.getId());
            
            
            
            ps.execute();//Ejecutar insercion
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
