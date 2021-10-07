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
public class SqlClientes extends Conexion {
    
    public boolean registrar(Cliente cliente){
        PreparedStatement ps = null;
        Connection con= getConexion();
        
        String sql= "INSERT INTO clientes (idUnico,Nombre,Direccion,Numero_Telefono,Correo) VALUES(?,?,?,?,?)";
        
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, cliente.getIdUnico());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getNumeroTelefono());
            ps.setString(5, cliente.getCorreo());
            ps.execute();//Ejecutar insercion
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
