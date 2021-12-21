package Dominio;
import java.sql.*;

public class TestConexion {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;
        
        try {
            cn = conexion.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM BC01dbservice.enfermedades");
            
            while (rs.next()) {
                String nom_enfermedad = rs.getString(1);
                String sintomas = rs.getString(2);
                int duracion = rs.getInt(3);
                String gravedad = rs.getString(2);
                
                System.out.println(nom_enfermedad + " - " + sintomas + " - " + duracion + "-" + gravedad);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        } finally {
            try {
                if (rs!= null) {
                    rs.close();
                }
                
                if (stm != null) {
                    stm.close();
                }
                
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
}
