
package clases;

import javax.swing.JOptionPane;

public class eliminar {

clases.conexionMySQL bd = new clases.conexionMySQL();

public void eliminar_alumno (String ide){
    try{
        bd.conectarBaseDeDatos();
        
        bd.sentencia.execute("Delete From alumnos WHERE id=('"+ide+"')");
        
        JOptionPane.showMessageDialog(null,"El alumno fue eliminado correctamente", " .::MENSAJE::.",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception e){
        
    }
}
}
