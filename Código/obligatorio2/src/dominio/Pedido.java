//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;

import java.util.*;
import java.io.Serializable;

public class Pedido implements Serializable {

    private int numero;
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;
    private String observaciones;
    private static final long serialVersionUID = 1L;

    
    //CONSTRUCTOR
    public Pedido(int unNumero){
        this.setNumero(unNumero);
        listaProductos = new ArrayList<Producto>();
    }
    
    public Pedido(Cliente unCliente, String unaObs, int unNumero){
        this.setNumero(unNumero);
        this.setCliente(unCliente);
        this.setObservaciones(unaObs);
        listaProductos = new ArrayList<Producto>();
    }
    
    //GETTERS & SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int unNumero) {
        numero = unNumero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarProducto(Producto unProducto) {
        this.getListaProductos().add(unProducto);
    }
    
    public void quitarProducto(Producto unProducto) {
        this.getListaProductos().remove(unProducto);
    }
    
    public void vaciarPedido() {
        this.getListaProductos().removeAll(this.getListaProductos());
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public float calcularTotal() {
        float total = 0;
        Iterator<Producto> it = this.getListaProductos().iterator();
        while (it.hasNext()) {
            Producto j = it.next();
            total += j.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString(){
        return this.getNumero()+" "+this.getCliente().getNombre();
    }

}
