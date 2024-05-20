//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package interfaz;
import dominio.Rotiseria;
import java.util.*;
import javax.swing.*;
public class VentanaIngresoCategoria extends javax.swing.JFrame {
    private Rotiseria modelo;
    
    public VentanaIngresoCategoria() {
        initComponents();
    }
    
    public VentanaIngresoCategoria(Rotiseria unaRot) {
        modelo = unaRot;
        initComponents();
        optPri1.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoPrioridad = new javax.swing.ButtonGroup();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblPrioridad = new javax.swing.JLabel();
        lblDetalles = new javax.swing.JLabel();
        txtDetalles = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        optPri1 = new javax.swing.JRadioButton();
        optPri2 = new javax.swing.JRadioButton();
        optPri3 = new javax.swing.JRadioButton();
        optPri4 = new javax.swing.JRadioButton();
        optPri5 = new javax.swing.JRadioButton();
        optPri6 = new javax.swing.JRadioButton();
        optPri7 = new javax.swing.JRadioButton();
        optPri8 = new javax.swing.JRadioButton();
        optPri9 = new javax.swing.JRadioButton();
        optPri10 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Categoría");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblDescripcion.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblDescripcion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtDescripcion, gridBagConstraints);

        lblPrioridad.setText("Prioridad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblPrioridad, gridBagConstraints);

        lblDetalles.setText("Detalles:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        getContentPane().add(lblDetalles, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.8;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(txtDetalles, gridBagConstraints);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 10;
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

        grupoPrioridad.add(optPri1);
        optPri1.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri1, gridBagConstraints);

        grupoPrioridad.add(optPri2);
        optPri2.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri2, gridBagConstraints);

        grupoPrioridad.add(optPri3);
        optPri3.setText("3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri3, gridBagConstraints);

        grupoPrioridad.add(optPri4);
        optPri4.setText("4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri4, gridBagConstraints);

        grupoPrioridad.add(optPri5);
        optPri5.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri5, gridBagConstraints);

        grupoPrioridad.add(optPri6);
        optPri6.setText("6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri6, gridBagConstraints);

        grupoPrioridad.add(optPri7);
        optPri7.setText("7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri7, gridBagConstraints);

        grupoPrioridad.add(optPri8);
        optPri8.setText("8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri8, gridBagConstraints);

        grupoPrioridad.add(optPri9);
        optPri9.setText("9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        getContentPane().add(optPri9, gridBagConstraints);

        grupoPrioridad.add(optPri10);
        optPri10.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(optPri10, gridBagConstraints);

        setBounds(0, 0, 615, 403);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Obtengo el dato descripcion (no puede estar vacio):
        String descripcion = txtDescripcion.getText();
        if(descripcion.equals("")){
            JOptionPane.showMessageDialog(this, "El campo Descripción no puede estar vacío", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //Obtengo el dato detalles (asumo que este no tiene que ser obligatorio):
            String detalles = txtDetalles.getText();

            //Recorrer los radio buttons para encontrar el seleccionado con la prioridad:
            int prioridad = 0;
            //Es como un iterator, pero el buttonGroup funciona con Enumeration
            Enumeration<AbstractButton> opciones = grupoPrioridad.getElements();
            while (opciones.hasMoreElements()) {
                AbstractButton opcion = opciones.nextElement();
                if (opcion.isSelected()) {
                    prioridad = Integer.parseInt(opcion.getText());
                }
            }

            if (modelo.categoriaRepetida(descripcion)) {
                JOptionPane.showMessageDialog(this, "Categoría ya ingresada, reintente",
                        "Error", JOptionPane.ERROR_MESSAGE);
                this.limpiarCampos();
            } else {
                modelo.nuevaCategoria(descripcion, prioridad, detalles);
                JOptionPane.showMessageDialog(this, "Categoría ingresada con éxito",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            }
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup grupoPrioridad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JRadioButton optPri1;
    private javax.swing.JRadioButton optPri10;
    private javax.swing.JRadioButton optPri2;
    private javax.swing.JRadioButton optPri3;
    private javax.swing.JRadioButton optPri4;
    private javax.swing.JRadioButton optPri5;
    private javax.swing.JRadioButton optPri6;
    private javax.swing.JRadioButton optPri7;
    private javax.swing.JRadioButton optPri8;
    private javax.swing.JRadioButton optPri9;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDetalles;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtDescripcion.setText("");
        optPri1.setSelected(true);
        txtDetalles.setText("");
    }
}
