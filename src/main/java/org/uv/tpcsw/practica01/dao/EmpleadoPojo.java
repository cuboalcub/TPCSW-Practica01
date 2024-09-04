
package org.uv.tpcsw.practica01.dao;

/**
 *
 * @author abisai
 */
public class EmpleadoPojo {
    private String clave;
    private String nombre;
    private String telefono;
    private String direccion;    

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    

}
