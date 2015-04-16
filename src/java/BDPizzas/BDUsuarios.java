/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BDPizzas;

import bbdd.*;
import java.sql.*;
import Clases.*;

/**
 *
 * @author family
 */
public class BDUsuarios {
private static Statement s,s1;
private static Connection c;
private static ResultSet registro;
public static Usuario buscar(String n, BaseDatos BBDD)
	{
            Usuario u=null;
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
            String cadena="SELECT * FROM usuarios WHERE telefono='"+ n +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				u = new Usuario (registro.getInt(1), registro.getString(2), registro.getString(3), registro.getString(4), registro.getString(5));
                                s.close();
				return u;
			}
			s.close();
			return null;
		}
		catch ( SQLException e)
		{	
			return null;
		}
	}

public static boolean insertar(Usuario u, BaseDatos BBDD)
	{
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
            String cadena="INSERT INTO usuarios (nombre, direccion, cpostal, telefono) values('"+u.getNombre()+"','"+u.getDireccion()+"','"+u.getCpostal()+"','"+u.getTelefono()+"')";
                    
			s.executeUpdate(cadena);
                        s.close();
			return true;
		}
		catch ( SQLException e)
		{	
			return false;
		}
	}
public static int actualizar(String d, String t, BaseDatos BBDD)
	{
            Usuario u=null;
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
            String cadena="UPDATE usuarios SET direccion='"+ d + "' WHERE telefono='"+ t +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
                          int res =s.executeUpdate(cadena);
                          return res;
                        }
			s.close();
			return -1;
		}
		catch ( SQLException e)
		{	
			return -2;
		}
	}
}
