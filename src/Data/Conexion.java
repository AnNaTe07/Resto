package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private String url = "jdbc:mysql://localhost/universidadclase";
    private String usuario = "root";
    private String password = "";

    private Connection conexion;

    public Conexion(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
        }

    }

    public Connection getConexion(){
        try{
            if (conexion == null) {
            // Setup the connection with the DB
            conexion = DriverManager
                    .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                            + "&user=" + usuario + "&password=" + password);
            //JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con la base de datos");
        }
        return conexion;
    }
}
