package a;

import javax.swing.JOptionPane;

public class Doctores extends Personas {

    public Doctores() {

    }

    public Doctores( String medico,String nombres, String apellidos, String genero, 
            String direccion, String lugar, String fecha, String motivo) {
        super(medico,nombres, apellidos, genero, direccion, lugar, fecha, motivo);
    }
 public void imprimir() {
        JOptionPane.showMessageDialog(null, 
                "El medico que los atendio fue: " + medico+
                "\n Nombre: " + nombres
                + "\n Apellido: " + apellidos
                + "\n Genero: " + genero
                + "\n Direccion: " + direccion
                + "\n Lugar: " + lugar
                + "\n Fecha: " + fecha
                + "\n Motivo: " + motivo);
    }
}
