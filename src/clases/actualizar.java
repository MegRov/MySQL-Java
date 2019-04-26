
package clases;

import javax.swing.JOptionPane;


public class actualizar {
    
    clases.conexionMySQL bd = new clases.conexionMySQL();
    public void actualizar_alumno(String elegir_id, String no,String ape, String ed, String dir){
        
        try{
            bd.conectarBaseDeDatos();
            
            bd.sentencia.execute("UPDATE alumnos SET nombres ='" +no+"' ,apellidos='"+ape+"' ,edad'" +ed+ "' ,direccion'"+dir+elegir_id+"' ");
            
            JOptionPane.showMessageDialog(null, "Los datos del alumno fueron actualizados correctamente", " .::MENSAJE::.", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (Exception e){
            
        }
    }
    
}
