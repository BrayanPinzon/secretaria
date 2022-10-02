package a;


public class Principal {

    public static void Principal() {
        Pacientes p1 = new Pacientes(100, "Julian", "Ruiz", "Hombre", "carrera 20 #4-51", "Mosquera",
                "02 / 05 / 2021", "ruptura de brazo", "Luis Sanchez");
        Pacientes p2 = new Pacientes(640, "Pedro", "Hernandez", "Hombre", "calle 10 #22a-55", "Funza",
                "30 / 10 / 2019", "accidente automovilistico", "Luis Sanchez");
        Pacientes p3 = new Pacientes(321, "Sadith", "Manjarez", "Mujer", "carrera 15 #5-98", "Bogota",
                "25 / 01/ 2021", "intoxicacion etilica", "Juan Leon");
        Pacientes p4 = new Pacientes(112, "Andres", "Marulanda", "Hombre", "carrera 18 #15-02", "Mosquera",
                "10 / 02/ 2022", "Problrmas oculares", "Juan Leon");

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();
        
        Doctores d1 = new Doctores("julian", "ruiz", "Hombre", "carrera 20 #4-51",
                "Mosquera", "02 / 05 / 2021", "ruptura de brazo", "luis Sanchez");
        Doctores d2 = new Doctores("Pedro", "Hernandes", "Hombre", "calle 10 #22a-55",
                "Funza", "30 / 10 / 2019", "accidente automovilistico", "Luis Sanchez");
        Doctores d3 = new Doctores("Sadith", "Manjarez", "Mujers", "carrera 15 #5-98",
                "Bogota", "25 / 01/ 2021", "intoxicacion etilica", "Juan Leon");
        Doctores d4 = new Doctores("Andres", "Marulanda", "Hombre", "carrera 18 #15-02",
                "Mosquera", "10 / 02/ 2022", "Problrmas oculares", "Juan Leon");

        d1.imprimir();
        d2.imprimir();
        d3.imprimir();
        d4.imprimir();

    }
}
