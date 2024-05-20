//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;

import java.util.*;
import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private float precio;
    private ArrayList<Categoria> listaCategorias;
    private static final long serialVersionUID = 1L;

    
    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float unPrecio) {
        this.precio = unPrecio;
    }
    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }
 
    //CONSTRUCTOR
    public Producto(String unNombre, float unPrecio){
        listaCategorias = new ArrayList<Categoria>();
        this.setNombre(unNombre);
        this.setPrecio(unPrecio);
    }
    public Producto(){
        listaCategorias = new ArrayList<Categoria>();
        this.setNombre("sin nombre");
        this.setPrecio(0);
    }
    
    public void agregarCategoria(Categoria unaCategoria){
        this.getListaCategorias().add(unaCategoria);
    }
    
    @Override
    public String toString() {
        return this.getNombre() + " $" + this.getPrecio();
    }
}
