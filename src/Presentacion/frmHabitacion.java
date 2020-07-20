/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.vHabitacion;
import Logica.fHabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmHabitacion extends javax.swing.JFrame {

    /**
     * Creates new form frmHabitacion
     */
    public frmHabitacion() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    private String accion = "guardar";

    void ocultar_columnas() {
        TableHabitaciones.getColumnModel().getColumn(0).setMaxWidth(0);
        TableHabitaciones.getColumnModel().getColumn(0).setMinWidth(0);
        TableHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void inhabilitar() {
        txtIDHabitacion.setVisible(false);
        cbbPiso.setEnabled(false);
        TxtNumero.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtCaracteristica.setEnabled(false);
        TxtPrecioDiario.setEnabled(false);
        cbbEstado.setEnabled(false);
        cbbTipo.setEnabled(false);
        BtnGuardar.setEnabled(false);
        BtnCancelar.setEnabled(false);
        BtnEliminar.setEnabled(false);
        txtIDHabitacion.setText("");
        TxtPrecioDiario.setText("");
        txtCaracteristica.setText("");

    }

    public void habilitar() {

        cbbPiso.setEnabled(true);
        TxtNumero.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtCaracteristica.setEnabled(true);
        TxtPrecioDiario.setEnabled(true);
        cbbEstado.setEnabled(true);
        cbbTipo.setEnabled(true);
        BtnGuardar.setEnabled(true);
        BtnCancelar.setEnabled(true);
        BtnEliminar.setEnabled(true);
        txtIDHabitacion.setText("");
        TxtPrecioDiario.setText("");
        txtCaracteristica.setText("");

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fHabitacion func = new fHabitacion();
            modelo = func.mostrar(buscar);
            TableHabitaciones.setModel(modelo);
            ocultar_columnas();
            total.setText("Total de registros " + func.totalregistros);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIDHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbbPiso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JScrollPane();
        txtCaracteristica = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabelh = new javax.swing.JLabel();
        TxtPrecioDiario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbbTipo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHabitaciones = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numero");

        TxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Piso");

        cbbPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        cbbPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPisoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion");

        txtCaracteristica.setColumns(20);
        txtCaracteristica.setRows(5);
        txtCaracteristicas.setViewportView(txtCaracteristica);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Caracteristicas");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabelh.setBackground(new java.awt.Color(0, 0, 0));
        jLabelh.setText("Precio Diario");

        TxtPrecioDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioDiarioActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estado");

        cbbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado", "Mantenimiento" }));
        cbbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbEstadoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo De Habitacion");

        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Matrimonial", "Presidencial", " " }));
        cbbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnNuevo)
                .addGap(95, 95, 95)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(BtnCancelar)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIDHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbPiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabelh)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtPrecioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIDHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelh)
                    .addComponent(TxtPrecioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TableHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableHabitaciones);

        jLabel8.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        total.setText("Total de Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(total)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbPisoActionPerformed
        // TODO add your handling code here:
        cbbPiso.transferFocus();
    }//GEN-LAST:event_cbbPisoActionPerformed

    private void cbbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbEstadoActionPerformed
        // TODO add your handling code here:
        cbbEstado.transferFocus();
    }//GEN-LAST:event_cbbEstadoActionPerformed

    private void cbbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTipoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        BtnGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if (TxtNumero.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar un numero de habitacion");
            TxtNumero.requestFocus();
            return;

        }
        if (txtDescripcion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar una Descripcion de habitacion");
            txtDescripcion.requestFocus();
            return;

        }
        if (TxtPrecioDiario.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar un precio de habitacion");
            TxtPrecioDiario.requestFocus();
            return;

        }
        if (txtCaracteristica.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Ingresar una caracteristica de habitacion");
            txtCaracteristica.requestFocus();
            return;

        }
        vHabitacion dts = new vHabitacion();
        fHabitacion func = new fHabitacion();
        dts.setNumero(TxtNumero.getText());
        int seleccionado = cbbPiso.getSelectedIndex();
        dts.setPiso(cbbPiso.getItemAt(seleccionado));
        dts.setDescripcion(txtDescripcion.getText());
        dts.setCaracteristicas(txtCaracteristica.getText());
        dts.setPreciodiario(Double.parseDouble(TxtPrecioDiario.getText()));
        seleccionado = cbbEstado.getSelectedIndex();
        dts.setEstado(cbbEstado.getItemAt(seleccionado));
        seleccionado = cbbTipo.getSelectedIndex();
        dts.setTipo_habitacion(cbbTipo.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La habitacion fue guardada exitosamente");
                mostrar("");
                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdhabitacion(Integer.parseInt(txtIDHabitacion.getText()));
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La habitacion fue editada exitosamente");
                inhabilitar();
            }

        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        if (!txtIDHabitacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar la habitacion", "confirmar", 2);

            if (confirmacion == 0) {
                fHabitacion func = new fHabitacion();
                vHabitacion dts = new vHabitacion();
                dts.setIdhabitacion(Integer.parseInt(txtIDHabitacion.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        mostrar(Buscar.getText());
        mostrar(Buscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroActionPerformed
        // TODO add your handling code here:
        TxtNumero.transferFocus();
    }//GEN-LAST:event_TxtNumeroActionPerformed

    private void TxtPrecioDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioDiarioActionPerformed
        // TODO add your handling code here:
        TxtPrecioDiario.transferFocus();
    }//GEN-LAST:event_TxtPrecioDiarioActionPerformed

    private void TableHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHabitacionesMouseClicked
        // TODO add your handling code here:
        BtnGuardar.setText("Editar");
        habilitar();
        BtnEliminar.setEnabled(true);
        accion = "editar";

        int fila = TableHabitaciones.rowAtPoint(evt.getPoint());
        txtIDHabitacion.setText(TableHabitaciones.getValueAt(fila, 0).toString());
        TxtNumero.setText(TableHabitaciones.getValueAt(fila, 1).toString());
        cbbPiso.setSelectedItem(TableHabitaciones.getValueAt(fila, 2).toString());
        txtDescripcion.setText(TableHabitaciones.getValueAt(fila, 3).toString());
        txtCaracteristica.setText(TableHabitaciones.getValueAt(fila, 4).toString());
        TxtPrecioDiario.setText(TableHabitaciones.getValueAt(fila, 5).toString());
        cbbEstado.setSelectedItem(TableHabitaciones.getValueAt(fila, 2).toString());
        cbbTipo.setSelectedItem(TableHabitaciones.getValueAt(fila, 2).toString());

    }//GEN-LAST:event_TableHabitacionesMouseClicked

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField Buscar;
    private javax.swing.JTable TableHabitaciones;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtPrecioDiario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbbEstado;
    private javax.swing.JComboBox<String> cbbPiso;
    private javax.swing.JComboBox<String> cbbTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel total;
    private javax.swing.JTextArea txtCaracteristica;
    private javax.swing.JScrollPane txtCaracteristicas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIDHabitacion;
    // End of variables declaration//GEN-END:variables
}
