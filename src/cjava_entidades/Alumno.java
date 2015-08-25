package cjava_entidades;

public class Alumno extends Persona{
    private double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(double promedio, String nombre, boolean genero) {
        super(nombre, genero);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        estado = (promedio>=13)?"aporbado" : "desaprobado";
        return estado;
    }

//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
}
