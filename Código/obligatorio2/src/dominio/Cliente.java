//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;
import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String direccion;
    private String telefono;
    private static final long serialVersionUID = 1L;

    
    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String unTelefono) {
        this.telefono = unTelefono;
    }
    
    //CONSTRUCTOR
    //El constructor sin parametros es solo para inicializar 
    //cuando no hay ningun cliente seleccionado aun.
    public Cliente() {
        
    }
    
    public Cliente(String unNombre, String unaDireccion, String unTelefono) {
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setTelefono(unTelefono);
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getDireccion() + " - " + this.getTelefono() + ")";
    }
}
