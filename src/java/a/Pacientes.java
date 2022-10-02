package a;

import a.Personas;
import javax.swing.JOptionPane;

public class Pacientes extends Personas {

    private int codigo = 0;

    public Pacientes() {

    }

    public Pacientes(int codigo, String nombres, String apellidos, String genero,
            String direccion, String lugar, String fecha, String motivo, String medico) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.motivo = motivo;
        this.medico = medico;
    }

    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "\n Codigo: " + codigo
                + "\n Nombre: " + nombres
                + "\n Apellido: " + apellidos
                + "\n Genero: " + genero
                + "\n Direccion: " + direccion
                + "\n Lugar: " + lugar
                + "\n Fecha: " + fecha
                + "\n Motivo: " + motivo
                + "\n Medico: " + medico);
    }

}
