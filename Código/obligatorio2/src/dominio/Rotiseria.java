//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;

import java.util.*;
import java.io.Serializable;

public class Rotiseria extends Observable implements Serializable {

    private Cliente clienteSeleccionado;
    private Pedido pedidoActual;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private static final long serialVersionUID = 1L;

    //GETTERS
    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente unCliente) {
        this.clienteSeleccionado = unCliente;
        setChanged();
        notifyObservers();
    }

    public Pedido getPedidoActual() {
        return pedidoActual;
    }

    public void setPedidoActual(Pedido unPedido) {
        this.pedidoActual = unPedido;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    //AGREGAR A LISTAS
    public void agregarCliente(Cliente unCliente) {
        this.getListaClientes().add(unCliente);
        setChanged();
        notifyObservers();
    }

    public void agregarPedidos(Pedido unPedido) {
        this.getListaPedidos().add(unPedido);
        int numero = this.getListaPedidos().size() + 1;
        this.setPedidoActual(new Pedido(numero));
        setChanged();
        notifyObservers();
    }

    public void agregarCategoria(Categoria unaCategoria) {
        this.getListaCategorias().add(unaCategoria);
        setChanged();
        notifyObservers();
    }

    public void agregarProductos(Producto unProducto) {
        this.getListaProductos().add(unProducto);
        setChanged();
        notifyObservers();
    }

    //CONSTRUCTOR
    public Rotiseria() {
        pedidoActual = new Pedido(1);
        listaClientes = new ArrayList<Cliente>();
        listaPedidos = new ArrayList<Pedido>();
        listaCategorias = new ArrayList<Categoria>();
        listaProductos = new ArrayList<Producto>();
    }

    public boolean clienteRepetido(String nombre) {
        boolean esta = false;
        Iterator<Cliente> it = this.getListaClientes().iterator();
        while (it.hasNext() && !esta) {
            Cliente j = it.next();
            if (j.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                esta = true;
            }
        }
        return esta;
    }

    public void nuevoCliente(String nombre, String dir, String tel) {
        Cliente c = new Cliente(nombre, dir, tel);
        this.agregarCliente(c);
    }

    public ArrayList<String> busquedaCliente(String palabra) {
        ArrayList<String> lista = new ArrayList<String>();
        Iterator<Cliente> it = this.getListaClientes().iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.toString().toUpperCase().contains(palabra.toUpperCase())) {
                lista.add(c.toString());
            }
        }

        return lista;
    }

    public Cliente elegirCliente(String cliente) {
        Cliente clienteElegido = new Cliente();
        boolean encontrado = false;
        Iterator<Cliente> it = this.getListaClientes().iterator();
        while (it.hasNext() && !encontrado) {
            Cliente c = it.next();
            if (c.toString().contains(cliente)) {
                encontrado = true;
                clienteElegido = c;
            }
        }

        return clienteElegido;
    }

    public boolean productoRepetido(String nombre) {
        boolean esta = false;
        Iterator<Producto> it = this.getListaProductos().iterator();
        while (it.hasNext() && !esta) {
            Producto p = it.next();
            if (p.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                esta = true;
            }
        }
        return esta;
    }

    public void nuevoProducto(String nombre, float precio, ArrayList<Categoria> unaLista) {
        Producto p = new Producto(nombre, precio);
        Iterator it = unaLista.iterator();
        while (it.hasNext()) {
            Categoria unaC = (Categoria) it.next();
            p.agregarCategoria(unaC);
        }
        this.agregarProductos(p);
    }

    public boolean categoriaRepetida(String descripcion) {
        boolean esta = false;
        Iterator<Categoria> it = this.getListaCategorias().iterator();
        while (it.hasNext() && !esta) {
            Categoria c = it.next();
            if (c.getDescripcion().toUpperCase().equals(descripcion.toUpperCase())) {
                esta = true;
            }
        }
        return esta;
    }

    public Categoria buscarCategoria(String descripcion) {
        boolean esta = false;
        Categoria cat = new Categoria();
        Iterator<Categoria> it = this.getListaCategorias().iterator();
        while (it.hasNext() && !esta) {
            Categoria c = it.next();
            if (c.getDescripcion().toUpperCase().equals(descripcion.toUpperCase())) {
                esta = true;
                cat = c;
            }
        }
        return cat;
    }

    public void nuevaCategoria(String descripcion, int prioridad, String detalles) {
        Categoria c = new Categoria(descripcion, prioridad, detalles);
        this.agregarCategoria(c);
    }

    public ArrayList<Categoria> ordenCategoriasAlfab() {
        Collections.sort(this.getListaCategorias());
        return this.getListaCategorias();
    }

    public ArrayList<Categoria> ordenCategoriasPri() {
        Collections.sort(this.getListaCategorias(), new CriterioPrioridad());
        return this.getListaCategorias();
    }

    public void cargarDatos(Rotiseria datos) {
        this.listaClientes = datos.listaClientes;
        this.listaPedidos = datos.listaPedidos;
        this.listaCategorias = datos.listaCategorias;
        this.listaProductos = datos.listaProductos;
        this.pedidoActual.setNumero(this.listaPedidos.size()+1);
    }
}
