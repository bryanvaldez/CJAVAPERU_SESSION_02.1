package cjava_pruebas;

import cjava_entidades.Persona;

public class Prueba01 {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", true);
        //persona.setCodigo(200);
        System.out.println("codigo: "+persona.getCodigo());
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("genero: "+persona.isGenero());
        
        Persona persona2 = new Persona("Julio", true);
        System.out.println("codigo: "+persona.getCodigo());
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("genero: "+persona.isGenero());
    }
    
}
