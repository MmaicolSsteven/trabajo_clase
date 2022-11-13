package ModeloVO;

public class EstudianteVO {
    private String Nombres;
    private String Apellidos;
    private String Nacimiento;
    private String Programa;
    private long Celular;
    private String CorreoInst;
    
    public EstudianteVO(){
        }
    public EstudianteVO(String Nombres,String Apellidos,String Nacimiento,String Programa,long Celular,String CorreoInst){
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Nacimiento = Nacimiento;
    this.Programa = Programa;
    this.Celular = Celular;
    this.CorreoInst = CorreoInst;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Nacimiento
     */
    public String getNacimiento() {
        return Nacimiento;
    }

    /**
     * @param Nacimiento the Nacimiento to set
     */
    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    /**
     * @return the Programa
     */
    public String getPrograma() {
        return Programa;
    }

    /**
     * @param Programa the Programa to set
     */
    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    /**
     * @return the Celular
     */
    public long getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the CorreoInst
     */
    public String getCorreoInst() {
        return CorreoInst;
    }

    /**
     * @param CorreoInst the CorreoInst to set
     */
    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }
    
    }
