
package clases;

import javax.swing.JOptionPane;

public class buscar {
    clases.conexionMySQL bd = new clases.conexionMySQL();
    
    public void buscar_alumno(String buscar_id){
        try{
            bd.conectarBaseDeDatos();
            bd.resultado= bd.sentencia.executeQuery("SELECT * FROM alumnos WHERE id = '"+ buscar_id + "'");
            if(bd.resultado != null){
                while (bd.resultado.next()){
                    proyecto_conexion.inicio.i.setText(""+ bd.resultado.getString("id"));
                    proyecto_conexion.inicio.i.setText(""+ bd.resultado.getString("nombres"));
                    proyecto_conexion.inicio.i.setText(""+ bd.resultado.getString("apellidos"));
                    proyecto_conexion.inicio.i.setText(""+ bd.resultado.getString("edad"));
                    proyecto_conexion.inicio.i.setText(""+ bd.resultado.getString("direccion"));
                    
                }
            }else {
                JOptionPane.showMessageDialog(null, "Ningun dato encontrado", "Mensaje de informacion", JOptionPane.PLAIN_MESSAGE);
               }
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e, ".::MENSAJE::.", 
               JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
