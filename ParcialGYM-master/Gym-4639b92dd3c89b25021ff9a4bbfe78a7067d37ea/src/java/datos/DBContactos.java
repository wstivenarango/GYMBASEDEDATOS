/*
 * DBContactos.java
 * 
 * Created on 7/04/2008, 10:26:02 PM
 */
package datos;

import java.sql.*;
import Logica.Usuario;

public class DBContactos {

    DBConexion cn;

    public DBContactos() {
        cn = new DBConexion();
    }

    public ResultSet getContactoById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_apellido, "
                + " con_telefono_domicilio, "
                + " con_telefono_oficina,"
                + " con_celular, "
                + " con_correo, "
                + " con_direccion_residencia,"
                + " con_direccion_trabajo "
                + " FROM contactos "
                + " WHERE con_id = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla contactos
     */
    public ResultSet getContactos() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT con_id, "
                + " con_nombre, "
                + " con_apellido, "
                + " con_telefono_domicilio, "
                + " con_telefono_oficina,"
                + " con_celular, "
                + " con_correo, "
                + " con_direccion_residencia,"
                + " con_direccion_trabajo "
                + " FROM contactos "
                + " ORDER BY con_nombre, con_apellido ");

        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarContacto(Usuario c) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("insert into contactos (con_nombre, "
                    + " con_apellido,"
                    + " con_telefono_domicilio,"
                    + " con_telefono_oficina,"
                    + " con_celular,"
                    + " con_correo,"
                    + " con_direccion_residencia,"
                    + " con_direccion_trabajo) "
                    + " values(?,?,?,?,?,?,?,?)");
            pstm.setString(1, c.getNombre());
            pstm.setInt(2, c.getEdad());
            pstm.setFloat(3, c.getPeso());
            pstm.setFloat(4, c.getEstatura());
            pstm.setFloat(4, c.getImc());
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void EditarUsuario(Usuario c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("update contactos set con_nombre = ?, "
                    + " con_apellido = ?,"
                    + " con_telefono_domicilio = ?,"
                    + " con_telefono_oficina = ?,"
                    + " con_celular = ?,"
                    + " con_correo = ?,"
                    + " con_direccion_residencia = ?,"
                    + " con_direccion_trabajo = ? "
                    + " where con_id = ?");
            pstm.setString(1, c.getNombre());
            pstm.setInt(2, c.getEdad());
            pstm.setFloat(3, c.getPeso());
            pstm.setFloat(4, c.getEstatura());
            pstm.setFloat(4, c.getImc());

            
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarUsuario(Usuario c) {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("delete from contactos "
                    + " where con_id = ?");

            pstm.setString(1, c.getNombre());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public String getMensaje() {
        return cn.getMensaje();
    }
}
