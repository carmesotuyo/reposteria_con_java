//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;

import dominio.Rotiseria;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class VentanaElegirCliente extends javax.swing.JFrame implements Observer {

    private Rotiseria modelo;

    public VentanaElegirCliente() {
        initComponents();
    }

    public VentanaElegirCliente(Rotiseria unaRot) {
        modelo = unaRot;
        modelo.addObserver(this);
        initComponents();
        this.update(null, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList();
        btnElegir1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Elegir Cliente");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btnBuscar, gridBagConstraints);

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
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btnSalir, gridBagConstraints);

        lblClientes.setText("Clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 14;
        getContentPane().add(lblClientes, gridBagConstraints);

        jScrollPane2.setViewportView(lstClientes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        btnElegir1.setText("Elegir");
        btnElegir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegir1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btnElegir1, gridBagConstraints);

        btnReset.setText("Resetear");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btnReset, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtBuscar, gridBagConstraints);

        setBounds(0, 0, 615, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String palabra = txtBuscar.getText();
        lstClientes.setListData(modelo.busquedaCliente(palabra).toArray());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtBuscar.setText("");
        lstClientes.setListData(modelo.getListaClientes().toArray());
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnElegir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegir1ActionPerformed

        if (lstClientes.getSelectedValue() != null) {
            String cliente = (String) lstClientes.getSelectedValue().toString();
            modelo.setClienteSeleccionado(modelo.elegirCliente(cliente));
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_btnElegir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElegir1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JList lstClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        lstClientes.setListData(modelo.getListaClientes().toArray());
    }
}
