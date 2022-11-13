package EstudianteDAO;

import Conexion.BaseConexion;
import ModeloVO.EstudianteVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO extends BaseConexion implements IEstudianteDAO {

    @Override
    public boolean insertar_estudiante(EstudianteVO estudiante) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("insert into estudiamtes (Nombre, Apellidos, Nacimiento, Programa, Celular, CorreoInst) values(?,?,?,?,?,?)");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getPrograma());
            sentencia.setLong(5, estudiante.getCelular());
            sentencia.setString(6, estudiante.getCorreoInst());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    @Override
    public boolean actualizar_estudiante(EstudianteVO estudiante) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("update estudiantes set nombre=?, apellidos=?, nacimiento=?, Programa=?, Celular=? where CorreoInst=?");
            sentencia.setString(1, estudiante.getNombres());
            sentencia.setString(2, estudiante.getApellidos());
            sentencia.setString(3, estudiante.getNacimiento());
            sentencia.setString(4, estudiante.getPrograma());
            sentencia.setLong(5, estudiante.getCelular());
            sentencia.setString(6, estudiante.getCorreoInst());
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    @Override
    public boolean eliminar_estudiante(String CorreoInst) {
        try {
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("delete from estudiantes where CorreoInst=?");
            sentencia.setString(1, CorreoInst);
            sentencia.executeUpdate();
            desconectar();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    @Override
    public List<EstudianteVO> consultar_todos() {
        try {
            List<EstudianteVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("Select ' from estudiantes");
            ResultSet datos = sentencia.executeQuery();
            while (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setApellidos(datos.getString("apellidos"));
                estudiante.setNombres(datos.getString("nombres"));
                estudiante.setNacimiento(datos.getString("nacimiento"));
                estudiante.setPrograma(datos.getString("programa"));
                estudiante.setCelular(datos.getLong("celular"));
                estudiante.setCorreoInst(datos.getString("correo inst"));
                estudiantes.add(estudiante);
            }
            desconectar();
            return estudiantes;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    @Override
    public EstudianteVO consultar_por_correo(String CorreoInst) {
        try {
    List<EstudianteVO> estudiantes = new ArrayList();
            conectar();
            PreparedStatement sentencia = conexion.prepareStatement("select * from estudiantes where CorreoInst =?");
            sentencia.setString(1, CorreoInst);
            ResultSet datos = sentencia.executeQuery();
            if (datos.next()) {
                EstudianteVO estudiante = new EstudianteVO();
                estudiante.setApellidos(datos.getString("Apellidos"));
                estudiante.setNombres(datos.getString("Nombres"));
                estudiante.setNacimiento(datos.getString("Nacimiento"));
                estudiante.setPrograma(datos.getString("Programa"));
                estudiante.setCelular(datos.getLong("Celular"));
                estudiante.setCorreoInst(datos.getString("CorreoInst"));
                desconectar();
                return estudiante; 
        }
            else {
            desconectar (); 
            return null; 
            }
        } catch (Exception e) {
        System.out.println("Error: "+e);
        return null; 
        }
    }
}
