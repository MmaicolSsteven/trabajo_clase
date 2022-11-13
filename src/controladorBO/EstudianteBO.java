/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorBO;

import EstudianteDAO.EstudianteDAO;
import EstudianteDAO.IEstudianteDAO;
import java.util.List;
import ModeloVO.EstudianteVO;

public class EstudianteBO {
    
   private IEstudianteDAO edao;
   
   //llenar el arreglo
   public EstudianteBO(){
       edao=new EstudianteDAO();
   }
   //insertar estudainte que se le pasa como parametro
   public boolean insertarEstudiante(EstudianteVO estudiante){
       return edao.insertar_estudiante(estudiante);
   }
    // actualiza un estudiante que se le pasa como parametro
   public boolean actualizarEstudiante(EstudianteVO estudiante){
       return edao.actualizar_estudiante(estudiante);
   }
   //elimanar estudiante que se le pasa como paametro
   public boolean eliminarEstudiante(EstudianteVO estudiante){
       return edao.eliminar_estudiante(estudiante.getCorreoInst());
   }
   //obtenie toda la lista de estudiantes
   public List<EstudianteVO> obtenerEstudiantes(){
       return edao.consultar_todos();   
}
//obtene un estduante e acuerdo al correo pasado como parametro
   public EstudianteVO obtenerEstudiante(String CorreoInst){
       return edao.consultar_por_correo(CorreoInst);
   }
}
