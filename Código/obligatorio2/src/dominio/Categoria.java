//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;
import java.io.Serializable;

public class Categoria implements Comparable, Serializable {

    private String descripcion;
    private int prioridad;
    private String detalle;
    private static final long serialVersionUID = 1L;


    //GETTERS & SETTERS
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String unaDescripcion) {
        this.descripcion = unaDescripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int unaPrioridad) {
        this.prioridad = unaPrioridad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String unDetalle) {
        this.detalle = unDetalle;
    }

    //CONSTRUCTOR
    //El constructor sin parametros es solo para inicializar 
    //cuando no hay ninguna categoria seleccionada aun.
    public Categoria(){
        
    }
    
    public Categoria(String unaDescripcion, int unaPrioridad, String unDetalle) {
        this.setDescripcion(unaDescripcion);
        this.setPrioridad(unaPrioridad);
        this.setDetalle(unDetalle);
    }

    @Override
    public int compareTo(Object obj) {
        return this.getDescripcion().compareTo(((Categoria) obj).getDescripcion());
    }
    
    @Override
    public String toString(){
        return this.getDescripcion();
    }
}
