package a;

public class Personas {

    protected String nombres;
    protected String apellidos;
    protected String genero;
    protected String direccion;
    protected String lugar;
    protected String fecha;
    protected String motivo;
    protected String medico;

    public Personas(String nombres, String apellidos, String genero,
            String direccion, String lugar, String fecha, String motivo, String medico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.motivo = motivo;
        this.medico = medico;

    }

    public Personas() {
        this.nombres = "";
        this.apellidos = "";
        this.genero = "";
        this.direccion = "";
        this.lugar = "";
        this.fecha = "";
        this.motivo = "";
        this.medico = "";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

}
