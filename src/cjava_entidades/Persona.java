package cjava_entidades;

import cjava.util.Util;

public class Persona {
    private int codigo;
    private String nombre;
    private boolean genero;

    public Persona() {
        this.codigo = Util.i++;
    }

    public Persona( String nombre, boolean genero) {
        this.codigo =Util.i++;
        this.nombre = nombre;
        this.genero = genero;
        
    }
 
    public int getCodigo() {
        return codigo;
    }
/*
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
}
