
package clases;



public class mostrar {
    

     clases.conexionMySQL bd = new clases.conexionMySQL();
    int i =0;
    public void mostrar_datos(){
        limpiar_tabla();
        try{
            bd.conectarBaseDeDatos();
            i=0;
            bd.resultado=bd.sentencia.executeQuery("SELECT*FROM ,alumnos order by id desc");
            if(bd.resultado != null){
                while (bd.resultado.next()){
                proyecto_conexion.inicio.MiTabla.setValueAt(""+bd.resultado.getString("id"), i, 0);
                proyecto_conexion.inicio.MiTabla.setValueAt(""+bd.resultado.getString("nombres"), i, 1);
                proyecto_conexion.inicio.MiTabla.setValueAt(""+bd.resultado.getString("apellidos"), i, 2);
                proyecto_conexion.inicio.MiTabla.setValueAt(""+bd.resultado.getString("edad"), i, 3);
                proyecto_conexion.inicio.MiTabla.setValueAt(""+bd.resultado.getString("direccion"), i, 4);
                i=i+1;
            }
            }
}catch (Exception e){
    
}
    
}
    public void limpiar_tabla(){
        for (int j=0; j<proyecto_conexion.inicio.MiTabla.getRowCount();j++){
            proyecto_conexion.inicio.MiTabla.setValueAt("", j, 0);
            proyecto_conexion.inicio.MiTabla.setValueAt("", j, 1);
            proyecto_conexion.inicio.MiTabla.setValueAt("", j, 2);
            proyecto_conexion.inicio.MiTabla.setValueAt("", j, 3);
            proyecto_conexion.inicio.MiTabla.setValueAt("", j, 4);
        }
            
        }
    }
    