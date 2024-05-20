//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaIngresoProducto extends javax.swing.JFrame implements Observer{
    private Rotiseria modelo;
    
    public VentanaIngresoProducto() {
        initComponents();
    }

    public VentanaIngresoProducto(Rotiseria unaRot) {
        modelo = unaRot;
        modelo.addObserver(this);
        initComponents();
        lstCategorias.setListData(modelo.getListaCategorias().toArray());
        lstCategorias.setSelectedIndex(0);
        update(null, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategorias = new javax.swing.JList();
        lblCategorias = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Producto");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Nombre: ");
        lblNombre.setMaximumSize(null);
        lblNombre.setMinimumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtNombre, gridBagConstraints);

        lblPrecio.setText("Precio: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblPrecio, gridBagConstraints);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btnIngresar, gridBagConstraints);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnSalir, gridBagConstraints);

        jScrollPane1.setViewportView(lstCategorias);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        lblCategorias.setText("Categorías");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 14;
        getContentPane().add(lblCategorias, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(txtPrecio, gridBagConstraints);

        setBounds(0, 0, 615, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        String precioString = txtPrecio.getText();
        //Chequear los campos obligatorios:
        if(nombre.equals("") || precioString.equals("")){
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos",
                        "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Categoria> categorias = new ArrayList(lstCategorias.getSelectedValuesList());

            // Chequear si categorías está vacío y mostrar error si es así
            if (categorias.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Seleccione una o más categorías a las cuales agregar el producto",
                        "Error", JOptionPane.ERROR_MESSAGE);

                return;
            }
            
            float precio = 0;
            boolean correcto = false;
            while (!correcto) {
                try {       //Exception por si ingresa algo no numerico:
                    precio = Float.parseFloat(precioString);
                    if(precio<0){
                        JOptionPane.showMessageDialog(this, "El precio no puede ser menor a 0, reingrese",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        txtPrecio.setText("");
                        return;
                    } else {
                        if(precio==0){
                            int eleccion = JOptionPane.showConfirmDialog(rootPane, 
                                    "Está por ingresar un producto gratuito, ¿desea confirmar?", "Atención", 
                                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                            if(eleccion==0){
                                correcto = true;
                            } else {
                                txtPrecio.setText("");
                                return;
                            }
                        } else {
                            correcto = true;
                        }
                    }
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El precio debe ser numérico, reingrese",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    txtPrecio.setText("");

                    // Se retorna para no continuar la ejecución del código si hubo un error
                    return;
                }
            }

            
            if (modelo.productoRepetido(nombre)) {
                JOptionPane.showMessageDialog(this, "Producto ya ingresado, reintente",
                        "Error", JOptionPane.ERROR_MESSAGE);
                this.limpiarCampos();
            } else {
                modelo.nuevoProducto(nombre, precio, categorias);
                JOptionPane.showMessageDialog(this, "Producto ingresado con éxito",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            }
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JList lstCategorias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        lstCategorias.setListData(modelo.getListaCategorias().toArray());
    }
    
    private void limpiarCampos(){
        txtNombre.setText("");
        txtPrecio.setText("");
        lstCategorias.setSelectedIndex(0);
    }
}
