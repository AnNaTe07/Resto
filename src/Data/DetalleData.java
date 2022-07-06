/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.Connection;

/**
 *
 * @author Samir
 */
public class DetalleData {
    Connection con = null;
    
    
    public DetalleData(Conexion conex) {
        
        con = conex.getConexion();
    }
    
    
    
    
    
}
