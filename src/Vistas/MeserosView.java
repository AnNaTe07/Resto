/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.MeseroData;
import Modelos.Mesero;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duvar
 */
public class MeserosView extends javax.swing.JInternalFrame {

    private MeseroData md;
    private DefaultTableModel modelo;
    public MeserosView(MeseroData mesero) {
        initComponents();
        md = mesero;
        modelo = new DefaultTableModel();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        opcionesLista();
        armarTabla();
        llenarTablaActivos();
    }

    private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("DNI");
        columnas.add("Telefono");
        
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        jtLista.setModel(modelo);
    }
    
    private void limpiarTabla() {
       int a = jtLista.getRowCount()-1;
          for (int i = a; i >= 0; i--) {
              modelo.removeRow(i);
          }
    }
    
    private void llenarTablaActivos(){
          limpiarTabla();
          ArrayList<Mesero> listaMeseros = md.obtenerMeserosActivos();
          
          for (Mesero mesero : listaMeseros) {
             
            modelo.addRow(new Object[]{mesero.getNombre(), mesero.getApellido(), mesero.getDni(), mesero.getTelefono()});
        }
      }
    private void llenarTablaInactivos(){
          limpiarTabla();
          ArrayList<Mesero> listaMeseros = md.obtenerMeserosInactivos();
          
          for (Mesero mesero : listaMeseros) {
  
            modelo.addRow(new Object[]{mesero.getNombre(), mesero.getApellido(), mesero.getDni(), mesero.getTelefono()});
        }
      }
    
    private void opcionesLista(){
        MouseListener mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int x = jtLista.getSelectedRow();
                if(x > -1){
                    jbEliminar.setEnabled(true);
                    jbModificar.setEnabled(true);
                }
 
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
               
            }

            @Override
            public void mouseExited(MouseEvent me) {
               
            }
            
        };
        jtLista.addMouseListener(mouse);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbActivo = new javax.swing.JCheckBox();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbActivos = new javax.swing.JRadioButton();
        rbInactivos = new javax.swing.JRadioButton();

        jLabel6.setText("Meseros View");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtLista);

        jLabel7.setText("Lista de Meseros");

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI:");

        jLabel4.setText("Telefono:");

        cbActivo.setText("Activo");

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("AgregarMesero");

        rbActivos.setSelected(true);
        rbActivos.setText("Activos");
        rbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivosActionPerformed(evt);
            }
        });

        rbInactivos.setText("Inactivos");
        rbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInactivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbActivo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jbAgregar)))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbModificar)
                        .addGap(161, 161, 161))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(rbActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbInactivos)
                        .addGap(141, 141, 141))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbActivos)
                    .addComponent(rbInactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(cbActivo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbAgregar)
                    .addComponent(jbEliminar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int dni = (int) jtLista.getValueAt(jtLista.getSelectedRow(), 2);
        Mesero mesero = md.obtenerMeseroxDNI(dni);
        if(md.borrarMesero(mesero)){
             if(rbActivos.isSelected()){
                    llenarTablaActivos();
                }else{
                    llenarTablaInactivos();
                }
        }
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

         String nombre = (String) jtLista.getValueAt(jtLista.getSelectedRow(), 0);
         String apellido = (String) jtLista.getValueAt(jtLista.getSelectedRow(), 1);
         int dni = (int) jtLista.getValueAt(jtLista.getSelectedRow(), 2);
         int telefono = Integer.parseInt( jtLista.getValueAt(jtLista.getSelectedRow(), 3).toString());
         Mesero meseroModificado = new Mesero(nombre, apellido, dni, telefono);
         md.modificarMesero(meseroModificado);
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        if(rbInactivos.isSelected()){
            Mesero mesero = md.obtenerMeseroxDNI((int) jtLista.getValueAt(jtLista.getSelectedRow(), 2));
            md.activarMesero(mesero);
            llenarTablaInactivos();
        }else{
            try{
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        int DNI = Integer.parseInt(jtDNI.getText());
        int telefono = Integer.parseInt(jtTelefono.getText());
        if(!"".equals(nombre) && !"".equals(apellido)){
            Mesero mesero = new Mesero(nombre, apellido, DNI, telefono, cbActivo.isSelected());
            if(md.agregarMesero(mesero)){
                if(rbActivos.isSelected()){
                    llenarTablaActivos();
                }else{
                    llenarTablaInactivos();
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "El campo nombre y apellido deben ser rellenados");
        }
            
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(this, "El campo DNI y Telefono deben ser llenados con numeros:" + ne);
        }
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void rbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInactivosActionPerformed
        if(rbInactivos.isSelected()){
            rbActivos.setSelected(false);
            limpiarTabla();
            llenarTablaInactivos();
        }
    }//GEN-LAST:event_rbInactivosActionPerformed

    private void rbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivosActionPerformed
        if(rbActivos.isSelected()){
            rbInactivos.setSelected(false);
            limpiarTabla();
            llenarTablaActivos();
        }
    }//GEN-LAST:event_rbActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JRadioButton rbActivos;
    private javax.swing.JRadioButton rbInactivos;
    // End of variables declaration//GEN-END:variables
}
