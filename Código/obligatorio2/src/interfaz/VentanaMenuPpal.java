//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaMenuPpal extends javax.swing.JFrame implements Observer {

    private Rotiseria modelo;

    public VentanaMenuPpal() {
        initComponents();
    }

    public VentanaMenuPpal(Rotiseria unaRot) {
        modelo = unaRot;
        modelo.addObserver(this);
        initComponents();

        String[] opciones = {"Datos guardados", "Datos de prueba", "Sistema vacío"};
        int eleccion = JOptionPane.showOptionDialog(this,
                "¿Cómo desea comenzar el programa?", "Inicio", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opciones, opciones[0]);
        //Eleccion devuelve la posicion en el array de opciones de la opcion elegida
        if (eleccion == 0) { //Datos guardados
            try {
                deserializar("archivo");
            } catch (IOException | ClassNotFoundException e){
                JOptionPane.showMessageDialog(this, "No hay datos guardados, se iniciará el sistema vacío",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } else if (eleccion == 1) { //Datos de prueba
            leerArchivo(cargarArchivo());
        }
        this.update(null, null);
    }

    private void agregarBotones() {
        // Limpiar la lista previa de productos para que no se acumulen
        pnlProductos.removeAll();
        pnlProductos.revalidate();
        pnlProductos.repaint();

        Iterator iter = modelo.getListaProductos().iterator();
        String categoriaSeleccionada = (String) comboCategorias.getSelectedItem();
        if (categoriaSeleccionada != null) {
            while (iter.hasNext()) {
                Producto p = (Producto) iter.next();
                ArrayList<Categoria> categorias = new ArrayList(p.getListaCategorias());
                categorias.removeIf(s -> !s.toString().equals(categoriaSeleccionada)); // Filtrar solo la categoría seleccionada
                if (!categorias.isEmpty()) {
                    JButton nuevo = new JButton(" ");
                    nuevo.setMargin(new Insets(-5, -5, -5, -5));
                    nuevo.setBackground(Color.BLACK);
                    nuevo.setForeground(Color.WHITE);
                    nuevo.setText(p.toString());
                    nuevo.addActionListener(new ProductoListener());
                    pnlProductos.add(nuevo);
                }
            }
        }
    }

    public String cargarArchivo() {
        JFileChooser seleccionador = new JFileChooser();
        FileNameExtensionFilter filtrar = new FileNameExtensionFilter(
                "Archivos compatibles: .csv", "csv");
        seleccionador.setFileFilter(filtrar);
        int result = seleccionador.showOpenDialog(this);
        String res = "";
        if (result != JFileChooser.CANCEL_OPTION) {
            res = seleccionador.getSelectedFile().getAbsolutePath();
        }

        return res;

    }

    public void leerArchivo(String archivo) {
        ArchivoLectura arch = new ArchivoLectura(archivo);
        arch.lecturaDatos(modelo);
    }

    public void deserializar(String dato) throws IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("archivo");
        ObjectInputStream datos = new ObjectInputStream(archivo);
        modelo.cargarDatos((Rotiseria) datos.readObject());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordenCategorias = new javax.swing.ButtonGroup();
        elegirArchivo = new javax.swing.JFileChooser();
        pnlIzq = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        pnlElegirCliente = new javax.swing.JPanel();
        btnElegirCliente = new javax.swing.JButton();
        lblDatosCliente = new javax.swing.JLabel();
        pnlObservaciones = new javax.swing.JPanel();
        lblObservaciones = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        pnlSeleccionOrden = new javax.swing.JPanel();
        optAlfabetico = new javax.swing.JRadioButton();
        optPrioridad = new javax.swing.JRadioButton();
        pnlCategorias = new javax.swing.JPanel();
        comboCategorias = new javax.swing.JComboBox<>();
        pnlProductos = new javax.swing.JPanel();
        pnlDer = new javax.swing.JPanel();
        pnlIngresos = new javax.swing.JPanel();
        btnIngresoCliente = new javax.swing.JButton();
        btnIngresoCategoria = new javax.swing.JButton();
        btnIngresoProducto = new javax.swing.JButton();
        btnVerPedidos = new javax.swing.JButton();
        pnlPedido1 = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();
        lblTotalPedido = new javax.swing.JLabel();
        pnlPedido2 = new javax.swing.JPanel();
        lstProductosPedido = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabarPedido = new javax.swing.JButton();

        elegirArchivo.setDialogTitle("Elegir Archivo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rotisería");
        setPreferredSize(new java.awt.Dimension(885, 359));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlIzq.setLayout(new java.awt.GridLayout(3, 0));

        pnlCliente.setLayout(new java.awt.GridLayout(3, 0));

        pnlElegirCliente.setBackground(new java.awt.Color(204, 255, 204));
        pnlElegirCliente.setLayout(new java.awt.GridLayout(0, 2));

        btnElegirCliente.setText("Elegir Cliente");
        btnElegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirClienteActionPerformed(evt);
            }
        });
        pnlElegirCliente.add(btnElegirCliente);
        pnlElegirCliente.add(lblDatosCliente);

        pnlCliente.add(pnlElegirCliente);

        pnlObservaciones.setBackground(new java.awt.Color(204, 255, 204));
        pnlObservaciones.setLayout(new java.awt.GridLayout(0, 2));

        lblObservaciones.setText("Observaciones");
        pnlObservaciones.add(lblObservaciones);
        pnlObservaciones.add(txtObservaciones);

        pnlCliente.add(pnlObservaciones);

        pnlSeleccionOrden.setLayout(new java.awt.GridLayout(0, 2));

        ordenCategorias.add(optAlfabetico);
        optAlfabetico.setText("Orden Alfabético");
        optAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAlfabeticoActionPerformed(evt);
            }
        });
        pnlSeleccionOrden.add(optAlfabetico);

        ordenCategorias.add(optPrioridad);
        optPrioridad.setText("Orden de Prioridad");
        optPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPrioridadActionPerformed(evt);
            }
        });
        pnlSeleccionOrden.add(optPrioridad);

        pnlCliente.add(pnlSeleccionOrden);

        pnlIzq.add(pnlCliente);

        pnlCategorias.setLayout(new java.awt.GridLayout(1, 0));

        comboCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriasItemStateChanged(evt);
            }
        });
        comboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasActionPerformed(evt);
            }
        });
        pnlCategorias.add(comboCategorias);

        pnlIzq.add(pnlCategorias);

        pnlProductos.setBackground(new java.awt.Color(204, 255, 204));
        pnlProductos.setLayout(new java.awt.GridLayout(3, 0));
        pnlIzq.add(pnlProductos);

        getContentPane().add(pnlIzq);

        pnlDer.setLayout(new java.awt.GridLayout(3, 0));

        pnlIngresos.setLayout(new java.awt.GridLayout(0, 4));

        btnIngresoCliente.setText("Clientes");
        btnIngresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoClienteActionPerformed(evt);
            }
        });
        pnlIngresos.add(btnIngresoCliente);

        btnIngresoCategoria.setText("Categorías");
        btnIngresoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoCategoriaActionPerformed(evt);
            }
        });
        pnlIngresos.add(btnIngresoCategoria);

        btnIngresoProducto.setText("Productos");
        btnIngresoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoProductoActionPerformed(evt);
            }
        });
        pnlIngresos.add(btnIngresoProducto);

        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });
        pnlIngresos.add(btnVerPedidos);

        pnlDer.add(pnlIngresos);

        pnlPedido1.setBackground(new java.awt.Color(204, 255, 204));
        pnlPedido1.setLayout(new java.awt.GridLayout(2, 1));

        btnReiniciar.setText("Reiniciar Pedido");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        pnlPedido1.add(btnReiniciar);

        lblTotalPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlPedido1.add(lblTotalPedido);

        pnlDer.add(pnlPedido1);

        pnlPedido2.setLayout(new java.awt.GridLayout(0, 3));

        lstProductosPedido.setViewportView(lstProductos);

        pnlPedido2.add(lstProductosPedido);

        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });
        pnlPedido2.add(btnEliminarItem);

        btnGrabarPedido.setText("Grabar Pedido");
        btnGrabarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarPedidoActionPerformed(evt);
            }
        });
        pnlPedido2.add(btnGrabarPedido);

        pnlDer.add(pnlPedido2);

        getContentPane().add(pnlDer);

        setBounds(0, 0, 910, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoClienteActionPerformed
        VentanaIngresoCliente v = new VentanaIngresoCliente(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_btnIngresoClienteActionPerformed

    private void btnIngresoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoCategoriaActionPerformed
        VentanaIngresoCategoria v = new VentanaIngresoCategoria(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_btnIngresoCategoriaActionPerformed

    private void btnIngresoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoProductoActionPerformed
        VentanaIngresoProducto v = new VentanaIngresoProducto(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_btnIngresoProductoActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        VentanaListadoPedidos v = new VentanaListadoPedidos(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void btnElegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirClienteActionPerformed
        VentanaElegirCliente v = new VentanaElegirCliente(modelo);
        v.setVisible(true);
    }//GEN-LAST:event_btnElegirClienteActionPerformed

    private void optPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPrioridadActionPerformed
        modelo.ordenCategoriasPri();
        this.update(null, null);
    }//GEN-LAST:event_optPrioridadActionPerformed

    private void optAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAlfabeticoActionPerformed
        modelo.ordenCategoriasAlfab();
        this.update(null, null);
    }//GEN-LAST:event_optAlfabeticoActionPerformed

    private void comboCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriasItemStateChanged
        this.agregarBotones();
    }//GEN-LAST:event_comboCategoriasItemStateChanged

    private void comboCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriasActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        this.resetearCampos();
        update(null, null);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        ArrayList<Producto> productos = new ArrayList(lstProductos.getSelectedValuesList());
        Iterator it = productos.iterator();
        while (it.hasNext()) {
            Producto p = (Producto) it.next();
            modelo.getPedidoActual().quitarProducto(p);
        }
        lstProductos.setListData(modelo.getPedidoActual().getListaProductos().toArray());
        update(null, null);
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void btnGrabarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarPedidoActionPerformed
        //Agrego al pedido actual el cliente seleccionado y las observaciones indicadas
        //Los productos ya se agregan al pedido actual al presionar el boton del producto
        if (modelo.getClienteSeleccionado() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (modelo.getPedidoActual().getListaProductos().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se puede ingresar pedido sin productos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modelo.getPedidoActual().setCliente(modelo.getClienteSeleccionado());
                modelo.getPedidoActual().setObservaciones(txtObservaciones.getText());
                //Agrego al sistema el pedido actual
                modelo.agregarPedidos(modelo.getPedidoActual());
                JOptionPane.showMessageDialog(this, "Pedido ingresado con éxito",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
                this.resetearCampos();
            }
        }
    }//GEN-LAST:event_btnGrabarPedidoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FileOutputStream ff;
        try {
            ff = new FileOutputStream("archivo");
            ObjectOutputStream datos = new ObjectOutputStream(ff);
            datos.writeObject(modelo);
            datos.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error de guardado",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegirCliente;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnGrabarPedido;
    private javax.swing.JButton btnIngresoCategoria;
    private javax.swing.JButton btnIngresoCliente;
    private javax.swing.JButton btnIngresoProducto;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JFileChooser elegirArchivo;
    private javax.swing.JLabel lblDatosCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JList lstProductos;
    private javax.swing.JScrollPane lstProductosPedido;
    private javax.swing.JRadioButton optAlfabetico;
    private javax.swing.JRadioButton optPrioridad;
    private javax.swing.ButtonGroup ordenCategorias;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlDer;
    private javax.swing.JPanel pnlElegirCliente;
    private javax.swing.JPanel pnlIngresos;
    private javax.swing.JPanel pnlIzq;
    private javax.swing.JPanel pnlObservaciones;
    private javax.swing.JPanel pnlPedido1;
    private javax.swing.JPanel pnlPedido2;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JPanel pnlSeleccionOrden;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        //Actualizar combo de categorias
        String cat = "";
        if (comboCategorias.getSelectedItem() != null) {
            cat = comboCategorias.getSelectedItem().toString();
        }

        comboCategorias.removeAllItems();
        Iterator it = modelo.getListaCategorias().iterator();
        while (it.hasNext()) {
            Categoria c = (Categoria) it.next();
            comboCategorias.addItem(c.toString());
            if (c.toString().equals(cat)) {
                comboCategorias.setSelectedItem(cat);
            }
        }

        //Actualizar botones segun categoria
        this.agregarBotones();

        //Actualizar etiqueta cliente
        if (modelo.getClienteSeleccionado() != null) {
            lblDatosCliente.setText(modelo.getClienteSeleccionado().toString());
        }

        //Mostrar datos de pedido
        float total = modelo.getPedidoActual().calcularTotal();
        int numPedido = modelo.getPedidoActual().getNumero();
        lblTotalPedido.setText("Pedido " + numPedido + " $" + total);
        lstProductos.removeAll();
        lstProductos.setListData(modelo.getPedidoActual().getListaProductos().toArray());
    }

    private class ProductoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            //Agregar el producto a la lista del pedido
            Producto elegido = new Producto();
            Iterator it = modelo.getListaProductos().iterator();
            while (it.hasNext()) {
                Producto p = (Producto) it.next();
                if (p.toString().equals(cual.getText())) {
                    elegido = p;
                }
            }
            modelo.getPedidoActual().agregarProducto(elegido);

            update(null, null);
        }
    }

    private void resetearCampos() {
        //Actualizo etiquetas
        lblDatosCliente.setText("");
        txtObservaciones.setText("");
        lblTotalPedido.setText("Pedido " + modelo.getPedidoActual().getNumero() + " $" + 0);
        //Elimino productos seleccionados
        modelo.getPedidoActual().vaciarPedido();
        lstProductos.removeAll(); 
        //Elimino seleccion de cliente
        modelo.setClienteSeleccionado(null);
        //Reseteo seleccion de categorias
        optAlfabetico.setSelected(false);
        optPrioridad.setSelected(false);
        if (!modelo.getListaCategorias().isEmpty()) {
            comboCategorias.setSelectedIndex(0);
        }
        this.agregarBotones();
    }
}
