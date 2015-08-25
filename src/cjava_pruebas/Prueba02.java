package cjava_pruebas;

import cjava_entidades.Alumno;

public class Prueba02 {

    public static void main(String[] args) {
        Alumno a1  = new Alumno(14,"Juan", true);
        Alumno a2  = new Alumno(12,"Julia", true);
        
        System.out.println("codigo: "+a1.getCodigo());
        System.out.println("nombre: "+a1.getNombre());
        System.out.println("genero: "+a1.isGenero());
        System.out.println("promedio: "+a1.getPromedio());
        System.out.println("estaso: "+a1.getEstado());
        System.out.println("                         ");
        System.out.println("codigo: "+a2.getCodigo());
        System.out.println("nombre: "+a2.getNombre());
        System.out.println("genero: "+a2.isGenero());
        System.out.println("promedio: "+a2.getPromedio());
        System.out.println("estaso: "+a2.getEstado());
    }
    
}
