/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/**
 *
 * @author Ivan Matto
 */

public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Class.forName("org.mariadb.jdbc.Driver"); //Cargo el driver
        
        String URL = "jdbc:mariadb://localhost:3306/universidadulp";
            String usuario="root";
            String password="";
            Connection con = DriverManager.getConnection(URL, usuario, password); //Establezco la conexion
            
//            //Insertamos los 3 alumnos
            
//            String sql = "INSERT INTO alumno(nombre,apellido,dni,fechaN,estado) VALUE"
//                    + "('Agustin','Garcia',38972875,1996-05-12,false),"
//                    + "('Matias','Aguilera',37928134,1996-02-20,true),"
//                    + "('Nicolas','Valdez',34982732,1993-08-13,true)";
//            
//            PreparedStatement ps=con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if(filas>0){
//                
//                JOptionPane.showMessageDialog(null,"Alumno Agregado a la BD exitosamente");
//            }
                    
////                        //Proseguimos a insertar las materias
//            String sql = "INSERT INTO materia(año,estado,nombre) VALUES"
//                    + "( 1,'true','Ingles'),"
//                    + "( 1,'true','Matematica'),"
//                    + "( 2,'true','Electronica I'),"
//                    + "( 3,'true','Lengua')";
//            PreparedStatement ps=con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if(filas>0){
//            
//            JOptionPane.showMessageDialog(null,"Materia cargada a la BD con exito");
//        }

                        
//                      //Precedemos a inscribir a 3 alumnos en 2 materias y cargamos a la BD
//            String sql="INSERT INTO inscripcion(nota,id_alumno,id_materia)VALUES"
//                    + "(10,2,1),"
//                    + "(7.50,2,2),"
//                    + "(3,1,2),"
//                    + "(8,3,3),"
//                    + "(6,1,1)";
//            
//            PreparedStatement ps=con.prepareStatement(sql);
//            int filas=ps.executeUpdate();
//            if(filas>0){
//                
//                JOptionPane.showMessageDialog(null,"Alumnos inscriptos a materias cargados exitosamente");
//                
//            }

            //Buscar los alumnos con nota > 8
//            
//            String sql="SELECT  a.* FROM alumno a JOIN inscripcion i ON (a.id_alumno=i.id_alumno)WHERE i.nota >8";
//            PreparedStatement ps=con.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                int id=rs.getInt("id_alumno");
//                int dni=rs.getInt("dni");
//                String apellido=rs.getString("apellido");
//                String nombre=rs.getString("nombre");
//                LocalDate fechaN=rs.getDate("fechaN").toLocalDate();
//                boolean estado=rs.getBoolean("estado");
//                
//                
//                 System.out.println("-----------------------------");
//                 System.out.println("Dni "+dni);
//                 System.out.println("Apellido "+apellido);
//                 System.out.println("Fecha "+fechaN.toString());
//            }
//            con.close();

            //Desincribir a un alumno de las materias
            
//            String sql="DELETE FROM inscripcion WHERE id_alumno = 2 AND id_materia = 1";
//           PreparedStatement ps = con.prepareStatement(sql);
//           int fila = ps.executeUpdate();
//           if(fila>0){
//               JOptionPane.showMessageDialog(null, "Alumno removido de la materia con exito");
//           }else{
//               
//               JOptionPane.showMessageDialog(null,"No se encontro ninguna inscripcion");
//           }
//           
//           con.close();
            
            
            
            
            
            
            
        }catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        }catch(SQLException ex){
            int error=ex.getErrorCode();
            if(error==1146){
                JOptionPane.showMessageDialog(null,"Tabla inexistente");
            }else if(error==1062){
            
                JOptionPane.showMessageDialog(null,"Dni duplicado");
            }else if(error==1049){
            
                JOptionPane.showMessageDialog(null,"BD inexistente");
            }else {
            
                JOptionPane.showMessageDialog(null,"Error SQL");
                
            }
        }
    
    }
    
}
