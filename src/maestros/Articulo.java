/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestros;

/**
 *
 * @author PC22
 */
public class Articulo {
    private Rubro rubro;
    private Subrubro subrubro;
    private String nombre;
    private Integer codigo; 
    private String descripcion; 

    public Rubro getRubro() {
        return rubro;
    }

    public Subrubro getSubrubro() {
        return subrubro;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
            
}
