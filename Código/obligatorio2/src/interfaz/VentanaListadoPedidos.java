//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;

import dominio.Rotiseria;
import dominio.Pedido;
import java.util.*;
import javax.swing.JOptionPane;

public class VentanaListadoPedidos extends javax.swing.JFrame implements Observer {

    private Rotiseria modelo;

    public VentanaListadoPedidos() {
        initComponents();
    }

    public VentanaListadoPedidos(Rotiseria unaRot) {
        modelo = unaRot;
        modelo.addObserver(this);
        initComponents();
        update(null, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblMonto = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        btnElegir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList();
        lblPedidos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPedidos = new javax.swing.JList();
        lblDatos = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblObservacionesTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Pedidos");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblMonto.setText("---");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        getContentPane().add(lblMonto, gridBagConstraints);

        lblProductos.setText("Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        getContentPane().add(lblProductos, gridBagConstraints);

        btnElegir.setText("Elegir");
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnElegir, gridBagConstraints);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.02;
        getContentPane().add(btnSalir, gridBagConstraints);

        jScrollPane1.setViewportView(lstProductos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        lblPedidos.setText("Pedidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        getContentPane().add(lblPedidos, gridBagConstraints);

        jScrollPane2.setViewportView(lstPedidos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        lblDatos.setText("Datos de Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(lblDatos, gridBagConstraints);

        lblTotal1.setText("Total: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        getContentPane().add(lblTotal1, gridBagConstraints);

        lblObservaciones.setText("Observaciones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        getContentPane().add(lblObservaciones, gridBagConstraints);

        lblObservacionesTexto.setText("---");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        getContentPane().add(lblObservacionesTexto, gridBagConstraints);

        setBounds(0, 0, 615, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        //Actualizar la lista de productos segun la eleccion de la lista:
        if (lstPedidos.getSelectedValue() != null) {
            Pedido pedido = (Pedido) lstPedidos.getSelectedValue();
            lstProductos.setListData(pedido.getListaProductos().toArray());
            lblDatos.setText(pedido.getCliente().toString());
            lblObservacionesTexto.setText(pedido.getObservaciones());
            float total = pedido.calcularTotal();
            lblMonto.setText("$"+total);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnElegirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblObservacionesTexto;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JList lstPedidos;
    private javax.swing.JList lstProductos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        lstPedidos.removeAll();
        lstPedidos.setListData(modelo.getListaPedidos().toArray());
    }
}
