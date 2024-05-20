//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;
import dominio.Rotiseria;
import javax.swing.JOptionPane;

public class VentanaIngresoCliente extends javax.swing.JFrame {
    private Rotiseria modelo;
    
    public VentanaIngresoCliente() {
        initComponents();
    }
    
    public VentanaIngresoCliente(Rotiseria unaRot) {
        modelo = unaRot;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Cliente");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Nombre: ");
        lblNombre.setMaximumSize(null);
        lblNombre.setMinimumSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtNombre, gridBagConstraints);

        lblDireccion.setText("Dirección: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtDireccion, gridBagConstraints);

        lblTelefono.setText("Teléfono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblTelefono, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtTelefono, gridBagConstraints);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnSalir, gridBagConstraints);

        setBounds(0, 0, 615, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacío", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();
            if (modelo.clienteRepetido(nombre)) {
                JOptionPane.showMessageDialog(this, "Cliente ya ingresado, reintente",
                        "Error", JOptionPane.ERROR_MESSAGE);
                this.limpiarCampos();
            } else {
                modelo.nuevoCliente(nombre, direccion, telefono);
                JOptionPane.showMessageDialog(this, "Cliente ingresado con éxito",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }
    
}
