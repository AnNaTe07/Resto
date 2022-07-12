/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ProductoData;
import Modelos.Producto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Best smite LAS
 */
public class Productos extends javax.swing.JPanel {

    private ProductoData pd;
    private Producto productoElegido;

    private DefaultTableModel modelo;

    public Productos(ProductoData pd) {
        this.pd = pd;
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();
        disableAlertas();
        desactivarCampos();
        jpBuscar.setVisible(false);

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
        jLabel2 = new javax.swing.JLabel();
        jcbListar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtCantidad = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jpEliminar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jpBuscar = new javax.swing.JPanel();
        jlBuscar = new javax.swing.JLabel();
        jpGuardar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jpActualizar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jpNuevo1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(64, 44, 72));
        setPreferredSize(new java.awt.Dimension(1000, 610));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 19, 32));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    GESTIÓN DE PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, -1));

        jcbListar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcbListar.setMaximumRowCount(4);
        jcbListar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "Nombre", "Cantidad", "Comestible", "Bebida sin alcohol", "Bebida con alcohol" }));
        jcbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListarActionPerformed(evt);
            }
        });
        add(jcbListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 170, -1));

        jtProductos.setBackground(new java.awt.Color(204, 204, 255));
        jtProductos.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 630, 130));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTAR  POR");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 130, 60));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 50));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 130, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 130, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 130, 30));

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 100, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, 50));

        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });
        add(jtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 100, 30));

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 100, 30));

        jtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadKeyTyped(evt);
            }
        });
        add(jtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 100, 30));

        jlPrecio.setForeground(new java.awt.Color(204, 0, 51));
        jlPrecio.setText("* INGRESE  PRECIO *");
        add(jlPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 140, 20));

        jlId.setForeground(new java.awt.Color(204, 0, 51));
        jlId.setText("* INGRESE  ID *");
        add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 90, 20));

        jlNombre.setForeground(new java.awt.Color(204, 0, 51));
        jlNombre.setText("* INGRESE NOMBRE *");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 130, 20));

        jlCantidad.setForeground(new java.awt.Color(204, 0, 51));
        jlCantidad.setText("* INGRESE  CANTIDAD *");
        add(jlCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 150, 20));

        jlCategoria.setForeground(new java.awt.Color(204, 0, 51));
        jlCategoria.setText("* INGRESE  CATEGORIA *");
        add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 160, 20));

        jpEliminar.setBackground(new java.awt.Color(198, 174, 206));
        jpEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEliminarMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(64, 44, 72));
        jLabel16.setText("ELIMINAR");

        javax.swing.GroupLayout jpEliminarLayout = new javax.swing.GroupLayout(jpEliminar);
        jpEliminar.setLayout(jpEliminarLayout);
        jpEliminarLayout.setHorizontalGroup(
            jpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpEliminarLayout.setVerticalGroup(
            jpEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEliminarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 90, 30));

        jpBuscar.setBackground(new java.awt.Color(198, 174, 206));
        jpBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBuscarMouseExited(evt);
            }
        });

        jlBuscar.setBackground(new java.awt.Color(64, 44, 72));
        jlBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlBuscar.setForeground(new java.awt.Color(64, 44, 72));
        jlBuscar.setText("  BUSCAR");

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 90, 30));

        jpGuardar.setBackground(new java.awt.Color(198, 174, 206));
        jpGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpGuardarMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 44, 72));
        jLabel14.setText("GUARDAR");

        javax.swing.GroupLayout jpGuardarLayout = new javax.swing.GroupLayout(jpGuardar);
        jpGuardar.setLayout(jpGuardarLayout);
        jpGuardarLayout.setHorizontalGroup(
            jpGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGuardarLayout.setVerticalGroup(
            jpGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGuardarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 90, 30));

        jpActualizar.setBackground(new java.awt.Color(198, 174, 206));
        jpActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpActualizarMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(64, 44, 72));
        jLabel15.setText(" ACTUALIZAR");

        javax.swing.GroupLayout jpActualizarLayout = new javax.swing.GroupLayout(jpActualizar);
        jpActualizar.setLayout(jpActualizarLayout);
        jpActualizarLayout.setHorizontalGroup(
            jpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActualizarLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpActualizarLayout.setVerticalGroup(
            jpActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 90, 30));

        jpNuevo1.setBackground(new java.awt.Color(198, 174, 206));
        jpNuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpNuevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpNuevo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpNuevo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpNuevo1MouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(64, 44, 72));
        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(64, 44, 72));
        jLabel17.setText("   NUEVO");

        javax.swing.GroupLayout jpNuevo1Layout = new javax.swing.GroupLayout(jpNuevo1);
        jpNuevo1.setLayout(jpNuevo1Layout);
        jpNuevo1Layout.setHorizontalGroup(
            jpNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpNuevo1Layout.setVerticalGroup(
            jpNuevo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevo1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jpNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 90, 30));

        jcbCategoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Bebida s/ alcohol", "Bebida c/ alcohol" }));
        add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jpEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarMouseExited
        jpEliminar.setBackground(new Color(198, 174, 206));
    }//GEN-LAST:event_jpEliminarMouseExited

    private void jpEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarMouseEntered
        jpEliminar.setBackground(new Color(233, 223, 236));
    }//GEN-LAST:event_jpEliminarMouseEntered

    private void jpBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarMouseEntered
        jpBuscar.setBackground(new Color(233, 223, 236));
    }//GEN-LAST:event_jpBuscarMouseEntered

    private void jpBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarMouseExited
        jpBuscar.setBackground(new Color(198, 174, 206));
    }//GEN-LAST:event_jpBuscarMouseExited

    private void jpGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuardarMouseEntered
        jpGuardar.setBackground(new Color(233, 223, 236));
    }//GEN-LAST:event_jpGuardarMouseEntered

    private void jpGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuardarMouseExited
        jpGuardar.setBackground(new Color(198, 174, 206));
    }//GEN-LAST:event_jpGuardarMouseExited

    private void jpActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarMouseEntered
        jpActualizar.setBackground(new Color(233, 223, 236));
    }//GEN-LAST:event_jpActualizarMouseEntered

    private void jpActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarMouseExited
        jpActualizar.setBackground(new Color(198, 174, 206));
    }//GEN-LAST:event_jpActualizarMouseExited

    private void jcbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListarActionPerformed

        llenarTabla();
    }//GEN-LAST:event_jcbListarActionPerformed

    private void jpNuevo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevo1MouseEntered
        jpNuevo1.setBackground(new Color(233, 223, 236));
    }//GEN-LAST:event_jpNuevo1MouseEntered

    private void jpNuevo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevo1MouseExited
        jpNuevo1.setBackground(new Color(198, 174, 206));
    }//GEN-LAST:event_jpNuevo1MouseExited

    private void jpBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBuscarMouseClicked

        borrarFilas();
        int seleccion = jcbListar.getSelectedIndex();

        if(!jtNombre.getText().equals("")){
            if (seleccion == 1) {

                String nombre = jtNombre.getText();
                for (Producto p : pd.obtenerProductosXnombre(nombre)) {
                    String categoria;
                    if (p.getCategoria() == 0) {
                        categoria = "Comestible";
                        modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                    } else if (p.getCategoria() == 1) {
                        categoria = "bebida sin alcohol";
                        modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                    } else {
                        categoria = "bebida con alcohol";
                        modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"LLene el campo primero"); 
        } 

        
        try {
        if (seleccion == 2) {
            int stock = Integer.parseInt(jtCantidad.getText());
            for (Producto p : pd.productosXStock(stock)) {
                String categoria;
                if (p.getCategoria() == 0) {
                    categoria = "Comestible";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else if (p.getCategoria() == 1) {
                    categoria = "bebida sin alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else {
                    categoria = "bebida con alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                }
            }
        }
        }catch(NumberFormatException e){
                           JOptionPane.showMessageDialog(null,"LLene el campo primero"); 
                 }
        limpiarCampos();

    }//GEN-LAST:event_jpBuscarMouseClicked

    private void jpNuevo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevo1MouseClicked
        activarAlertas();
        activarCampos();

    }//GEN-LAST:event_jpNuevo1MouseClicked

    private void jpGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuardarMouseClicked
        Producto producto = new Producto();
        try{
        producto.setActivo(true);
        producto.setCantidad(Integer.parseInt(jtCantidad.getText()));
        producto.setCategoria(jcbCategoria.getSelectedIndex());
        producto.setNombre(jtNombre.getText());
        producto.setPrecio(Double.parseDouble(jtPrecio.getText()));

        if(pd.agregarProducto(producto)){
            JOptionPane.showMessageDialog(null,"Producto guardado correctamente");
        }
        limpiarCampos();
        desactivarCampos();
        disableAlertas();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"complete los campos para guardar correctamente");
        }
        
        
    }//GEN-LAST:event_jpGuardarMouseClicked

    private void jpActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarMouseClicked
         try{
        Producto productoNew = new Producto();
        productoNew.setIdProducto(Integer.parseInt(jtID.getText()));
        productoNew.setCantidad(Integer.parseInt(jtCantidad.getText()));
       
        if (jcbCategoria.getSelectedIndex() == 0) {
            productoNew.setCategoria(0);
        } else if (jcbCategoria.getSelectedIndex() == 1) {
            productoNew.setCategoria(1);
        } else if (jcbCategoria.getSelectedIndex() == 2) {
            productoNew.setCategoria(2);
        }
        productoNew.setNombre(jtNombre.getText());
        productoNew.setPrecio(Double.parseDouble(jtPrecio.getText()));

        if (pd.modificarProducto(productoNew)) {
            JOptionPane.showMessageDialog(null, "producto modificado con exito");
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"complete los campos para actualizar correctamente");
        }

    }//GEN-LAST:event_jpActualizarMouseClicked

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        disableAlertas();
        activarCampos();
        int filaElegida = jtProductos.getSelectedRow();

        if (filaElegida != -1) {
            int idProducto = (Integer) jtProductos.getValueAt(filaElegida, 0);
            String nombre = (String) jtProductos.getValueAt(filaElegida, 1);
            double precio = (Double) jtProductos.getValueAt(filaElegida, 2);
            String categoria = (String) jtProductos.getValueAt(filaElegida, 3);
            int stock = (Integer) jtProductos.getValueAt(filaElegida, 4);

            jtID.setText(idProducto + "");
            jtNombre.setText(nombre);
            jtPrecio.setText(precio + "");
            if (categoria.equalsIgnoreCase("Comestible")) {
                jcbCategoria.setSelectedIndex(0);
            } else if (categoria.equalsIgnoreCase("Bebida sin alcohol")) {
                jcbCategoria.setSelectedIndex(1);
            } else if (categoria.equalsIgnoreCase("Bebida con alcohol")) {
                jcbCategoria.setSelectedIndex(2);
            }
            jtCantidad.setText(stock + "");

        }
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jpEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEliminarMouseClicked
        try{
        int idProducto = Integer.parseInt(jtID.getText());

        if (pd.borrarProducto(idProducto)) {
            JOptionPane.showMessageDialog(null, "producto eliminado con exito");
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"complete los campos para actualizar correctamente");
        }
    }//GEN-LAST:event_jpEliminarMouseClicked

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtIDKeyTyped

    private void jtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtCantidadKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbListar;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JPanel jpActualizar;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JPanel jpEliminar;
    private javax.swing.JPanel jpGuardar;
    private javax.swing.JPanel jpNuevo1;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {

        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID Producto");
        columnas.add("Nombre");
        columnas.add("Precio");
        columnas.add("Categoria");
        columnas.add("Cantidad");

        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        jtProductos.setModel(modelo);
    }

    public void disableAlertas() {
        jlCantidad.setVisible(false);
        jlCategoria.setVisible(false);
        jlId.setVisible(false);
        jlPrecio.setVisible(false);
        jlNombre.setVisible(false);
    }

    public void activarAlertas() {
        jlCantidad.setVisible(true);
        jlCategoria.setVisible(true);
        jlPrecio.setVisible(true);
        jlNombre.setVisible(true);
    }

    private void borrarFilas() {

        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    private void llenarTabla() {
        disableAlertas();
        borrarFilas();
        int seleccion = jcbListar.getSelectedIndex();
        System.out.println(seleccion);
        if (seleccion == 0) {
            System.out.println("llenando2");
            for (Producto p : pd.obtenerProductos()) {
                String categoria;
                if (p.getCategoria() == 0) {
                    categoria = "Comestible";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else if (p.getCategoria() == 1) {
                    categoria = "bebida sin alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else {
                    categoria = "bebida con alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                }
            }
        } else if (seleccion == 1) {
            jpBuscar.setVisible(true);
            jtNombre.setEnabled(true);
            jlNombre.setVisible(true);
            jtCantidad.setEnabled(false);
            jlCantidad.setVisible(false);

        } else if (seleccion == 2) {
            jpBuscar.setVisible(true);
            jtCantidad.setEnabled(true);
            jlCantidad.setVisible(true);
            jtNombre.setEnabled(false);
            jlNombre.setVisible(false);
        } else if (seleccion == 3) {
            jpBuscar.setVisible(false);
            jtCantidad.setEnabled(false);
            jlCantidad.setVisible(false);
            jtNombre.setEnabled(false);
            jlNombre.setVisible(false);
            for (Producto p : pd.buscarXCategoria(0)) {
                String categoria;
                if (p.getCategoria() == 0) {
                    categoria = "Comestible";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else if (p.getCategoria() == 1) {
                    categoria = "bebida sin alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else {
                    categoria = "bebida con alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                }
            }
        } else if (seleccion == 4) {
            jpBuscar.setVisible(false);
            jtCantidad.setEnabled(false);
            jlCantidad.setVisible(false);
            jtNombre.setEnabled(false);
            jlNombre.setVisible(false);
            for (Producto p : pd.buscarXCategoria(1)) {
                String categoria;
                if (p.getCategoria() == 0) {
                    categoria = "Comestible";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else if (p.getCategoria() == 1) {
                    categoria = "bebida sin alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else {
                    categoria = "bebida con alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                }
            }
        } else if (seleccion == 5) {
            jpBuscar.setVisible(false);
            jtCantidad.setEnabled(false);
            jlCantidad.setVisible(false);
            jtNombre.setEnabled(false);
            jlNombre.setVisible(false);
            for (Producto p : pd.buscarXCategoria(2)) {
                String categoria;
                if (p.getCategoria() == 0) {
                    categoria = "Comestible";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else if (p.getCategoria() == 1) {
                    categoria = "bebida sin alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                } else {
                    categoria = "bebida con alcohol";
                    modelo.addRow(new Object[]{p.getIdProducto(), p.getNombre(), p.getPrecio(), categoria, p.getCantidad()});
                }
            }
        }
    }

    public void desactivarCampos() {
        jtCantidad.setEnabled(false);
        jcbCategoria.setEnabled(false);
        jtID.setEnabled(false);
        jtNombre.setEnabled(false);
        jtPrecio.setEnabled(false);

    }

    public void activarCampos() {
        jtCantidad.setEnabled(true);
        jcbCategoria.setEnabled(true);
        jtNombre.setEnabled(true);
        jtPrecio.setEnabled(true);
    }

    public void limpiarCampos() {
        jtCantidad.setText("");
        jtID.setText("");
        jtNombre.setText("");
        jtPrecio.setText("");

    }

}
