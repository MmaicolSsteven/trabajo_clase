package EstudianteDAO;

import java.util.List;
import ModeloVO.EstudianteVO;

public interface IEstudianteDAO {
    public boolean insertar_estudiante(EstudianteVO estudiante);
    public boolean actualizar_estudiante(EstudianteVO estudiante);
    public boolean eliminar_estudiante(String CorreoInst);
    public List<EstudianteVO> consultar_todos();
    public EstudianteVO consultar_por_correo(String CorreoInst);
}
