
package clases;

import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class conexionMySQL{
    public static Connection conexion;
    public Statement sentencia;
    private Principal prin;
    public ResultSet resultado;
    
    public void conectarBaseDeDatos(){
        try{
            final String CONTROLADOR = "org.gtj.mm.mysql.Driver";
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/colegio","root","");
            sentencia = conexion.createStatement();
            
        }catch(ClassNotFoundException ex1){
            ex1.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,"Error Carga Driver");
            System.exit(1);
              
        }catch (SQLException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error creacion statement");
            System.exit(1);
        }
    }
    
    public void desconectarBaseDeDatos(){
        try{
            if(conexion != null){
                if (sentencia != null){
                    sentencia.close();
                }
                conexion.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
