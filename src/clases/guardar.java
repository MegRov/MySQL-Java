
package clases;

import javax.swing.JOptionPane;


public class guardar {
clases.conexionMySQL bd = new clases.conexionMySQL();

public void registrar_alumno(String id,String nombres, String apellidos, String edad, String direccion){
    
    try{
        bd.conectarBaseDeDatos();
        bd.sentencia.execute("Insert into alumnos (id,nombres,apellidos,edad,direccion) values("+id+",'"+nombres+"','"+edad+"','"+direccion+"')");
        
        JOptionPane.showMessageDialog(null, "EL alumno fue registrado correctamente", " .::MENSAJE::.", JOptionPane.INFORMATION_MESSAGE);;
        
    }catch (Exception e) {
        
    }
}
}
