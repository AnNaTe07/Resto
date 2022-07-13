/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Samir
 */
import Data.*;
import Modelos.DetallePedido;
import Modelos.Mesa;
import Modelos.Mesero;
import Modelos.Pedido;
import Modelos.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PedidoView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;

    private ArrayList<Mesa> mesas;
    private ArrayList<Producto> productos;
    private ArrayList<Mesero> meseros;
    private ArrayList<DetallePedido> detalles;
    private ArrayList<Pedido> pedidos;
    private MesaData mesada;
    private MeseroData meseroda;
    private ProductoData productoda;
    private PedidoData pedidoda;
    private DetalleData detalleda;

    public PedidoView(MesaData mesaD, MeseroData mozoD, ProductoData produD, PedidoData pedidD, DetalleData detalleD) {

        mesada = mesaD;
        meseroda = mozoD;
        productoda = produD;
        pedidoda = pedidD;
        detalleda = detalleD;
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        mesas = mesada.obtenerMesasActivas();
        productos = productoda.obtenerProductos();
        meseros = meseroda.obtenerMeserosActivos();
        pedidos = pedidoda.mostrarPedidos();
        detalles = detalleda.todoDetalleDePedido();

        cargarCombo();
        armaCabeceraTablaProducto();
        armaCabeceraTablaPedidos();
        cargarProductos();
        cargarPedidosActivos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jCBAgregaMozo = new javax.swing.JComboBox<>();
        jCBAgregaMesa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTFBuscaProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtIdPedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jCBCategoria = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jBAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CBMesas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBBuscarPedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        CBMozo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jcPedido = new javax.swing.JCheckBox();
        jcMesa = new javax.swing.JCheckBox();
        jcMozo = new javax.swing.JCheckBox();
        jcFecha = new javax.swing.JCheckBox();
        jbHistorial = new javax.swing.JButton();

        jLabel1.setText("Mozo");

        jLabel2.setText("Mesa");

        jLabel4.setText("Pedido N.");

        jtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdPedidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setText("Subtotal");

        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Todos los productos>", "Platos principales", "Postres", "Bebidas sin alcohol", "Tragos" }));
        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLabel7.setText("Categoria");

        jLabel8.setText("Producto");

        CBMesas.setToolTipText("");

        jLabel9.setText("Mesa");

        jBCancelar.setText("Cancelar pedido");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBBuscarPedido.setText("Buscar");
        jBBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("CARGA DE PEDIDO");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("PEDIDOS REALIZADOS");

        jBLimpiar.setText("Limpiar campos");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setText("Mozo");

        jLabel12.setText("Fecha");

        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Activo", "ID", "Detalle", "Cantidad", "Mesa", "Fecha ", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTPedidosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTPedidos);

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTProductos);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        jComboBox1.setSelectedIndex(1);

        jLabel13.setText("Cant.");

        jcPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPedidoActionPerformed(evt);
            }
        });

        jcMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesaActionPerformed(evt);
            }
        });

        jcMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMozoActionPerformed(evt);
            }
        });

        jcFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFechaActionPerformed(evt);
            }
        });

        jbHistorial.setText("Historial de pedidos");
        jbHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBAgregaMozo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBAgregaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTFBuscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBBuscar)))
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jcMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtIdPedido))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(4, 4, 4)
                                                .addComponent(CBMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(116, 116, 116)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbHistorial)
                                .addGap(79, 79, 79)
                                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(604, 604, 604))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(682, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jBLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFBuscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jcPedido, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcFecha, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcMesa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CBMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jBBuscarPedido)
                                .addComponent(jLabel11)
                                .addComponent(CBMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcMozo))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCBAgregaMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBAgregaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(103, 103, 103)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarCombo() {

        for (Mesero m : meseros) {
            jCBAgregaMozo.addItem(m);
            CBMozo.addItem(m);

        }
        for (Mesa me : mesas) {
            jCBAgregaMesa.addItem(me);
            CBMesas.addItem(me);
        }

    }

    //ARMAR CABECERA DE PRODUCTOS
    public void armaCabeceraTablaProducto() {

        ArrayList<Object> columns = new ArrayList();
        columns.add("ID");
        columns.add("Producto");
        columns.add("Stock");
        columns.add("Precio");
        columns.add("Categoria");
        columns.add("Cantidad");

        for (Object it : columns) {
            modelo.addColumn(it);
        }
        jTProductos.setModel(modelo);
    }

    //ARMAR CABECERA DE PEDIDOS
    public void armaCabeceraTablaPedidos() {

        ArrayList<Object> columns = new ArrayList();

        columns.add("Entregado");
        columns.add("Cobrado");
        columns.add("ID");
        columns.add("Detalle");
        columns.add("Cantidad");
        columns.add("Mesa");
        columns.add("Fecha");
        columns.add("Hora");
        columns.add("SubTotal");

        for (Object it : columns) {
            modelo2.addColumn(it);
        }
        jTPedidos.setModel(modelo2);
    }

    // BORRAR FILAS DE TABLA PRODUCTO
    public void borrarFilasTabla() {

        int cant = modelo.getRowCount() - 1;
        for (int i = cant; i >= 0; i--) {

            modelo.removeRow(i);
        }

    }

    // BORRAR FILAS DE TABLA PEDIDO
    public void borrarFilasTablaPedido() {

        int cant = modelo2.getRowCount() - 1;
        for (int i = cant; i >= 0; i--) {

            modelo2.removeRow(i);
        }

    }

    
    //CARGA PRODUCTOS
    public void cargarProductos() {
        
        borrarFilasTabla();
        if (jCBCategoria.getSelectedIndex() == 0) {
            for (Producto prod : productos) {
                if (prod.isActivo() == true) {
                    modelo2.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio()});
                }
            }
        } else {
            for (Producto prod : productos) {
                if (prod.isActivo() == true && prod.getCategoria() == jCBCategoria.getSelectedIndex() - 1) {
                    modelo2.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio()});
                }
            }
        }
    }

    // LIMPIA CHECK EN DETALLES DE PEDIDO
    public void limpiaDetalle() {

        jcPedido.setSelected(false);
        jcMesa.setSelected(false);
        jcFecha.setSelected(false);
        jcMozo.setSelected(false);
        jtIdPedido.setText("");
        CBMesas.setSelectedIndex(-1);
        CBMozo.setSelectedIndex(-1);
    }
    
    //CARGAR DETALLE DE TODOS LOS PEDIDOS ACTIVOS NO EXPIRADOS
    public void cargarPedidosActivos() {
        borrarFilasTablaPedido();
        if (jcMesa.isSelected()) {
            ArrayList<DetallePedido> depe = detalleda.todoDetalleDePedidoSelect(false);
            for (DetallePedido ped : depe) {
                if (ped.isExpirado() != true) {
                    modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});
                }
            }
        }
    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR MESA
    public void cargarPedidosMesa() {
        borrarFilasTablaPedido();
        if (jcMesa.isSelected()) {
            ArrayList<DetallePedido> depe = detalleda.detallePedidoPorMesa((Mesa) CBMesas.getSelectedItem());
            for (DetallePedido ped : depe) {
                if (ped.isExpirado() != true) {
                    modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});
                }
            }
        }
    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR MESA Y MOZO
    public void cargarPedidosMesaMozo() {
        borrarFilasTablaPedido();

        ArrayList<DetallePedido> depe = detalleda.detallePedidoPorMesaMozo((Mesa) CBMesas.getSelectedItem(), (Mesero) CBMozo.getSelectedItem());
        for (DetallePedido ped : depe) {
            if (ped.isExpirado() != true) {
                modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});
            }
        }

    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR MOZO
    public void cargarPedidosMozo() {
        borrarFilasTablaPedido();

        ArrayList<DetallePedido> depe = detalleda.detallePedidoPorMozo((Mesero) CBMozo.getSelectedItem());
        for (DetallePedido ped : depe) {
            if (ped.isExpirado() != true) {
                modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});
            }
        }

    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR FECHA
    public void cargarPedidosPorFecha() {
        borrarFilasTablaPedido();

        ArrayList<Pedido> depe = pedidoda.listaPedidosxMesa(((Mesa) CBMesas.getSelectedItem()).getIdMesa(), LocalDate.EPOCH);
        for (Pedido ped : depe) {
            if (ped.isActivo() != true) {
                modelo2.addRow(new Object[]{ped.isActivo(), ped.isCobrado(), null, null, null, ped.getMesa().getIdMesa(), ped.getFecha(), ped.getHorario(), ped.getSubTotal()});
            }
        }

    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR ID
    public void cargarPedidoPorId() {
        borrarFilasTablaPedido();
        
        DetallePedido ped = detalleda.detallePedidoPorId(Integer.parseInt(jtIdPedido.getText()));

        if (ped.isExpirado() != true) {
            modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});
        }

    }


    private void jtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdPedidoActionPerformed

    //BUSCA PRODUCTOS POR NOMBRE
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        jCBCategoria.setSelectedIndex(0);
        ArrayList<Producto> prodNomb = productoda.obtenerProductosXnombre(jTFBuscaProducto.getText());

        if (prodNomb != null) {
            for (Producto prod : prodNomb) {
                if (prod.isActivo()) {
                    modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio()});
                }
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "No se ha encontrado un producto con ese nombre.");
        }


    }//GEN-LAST:event_jBBuscarActionPerformed
    
    // AGREGAR PEDIDOS
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        int fila = jTProductos.getSelectedRow();
        Mesa mesa = (Mesa) jCBAgregaMesa.getSelectedItem();
        Mesero mozo = (Mesero) jCBAgregaMozo.getSelectedItem();
        Double subTotal;

        int cant = (int) (jTProductos.getValueAt(fila, 6));
        Producto prod = new Producto();
        prod.setIdProducto(Integer.parseInt(jTProductos.getValueAt(fila, 1).toString()));
        prod.setNombre(jTProductos.getValueAt(fila, 2).toString());
        prod.setCantidad((int) (jTProductos.getValueAt(fila, 3)));
        prod.setPrecio((Double) (jTProductos.getValueAt(fila, 4)));
        prod.setActivo(true);
        prod.setCategoria((int) (jTProductos.getValueAt(fila, 5)));
        subTotal = cant * ((Double)(jTProductos.getValueAt(fila, 4)));
        Pedido pedido = new Pedido(mesa, mozo, subTotal);
        pedidoda.cargarPedido(pedido);
        DetallePedido detape = new DetallePedido(pedido, prod, cant, true);
        detalleda.agregarPedido(detape);
        cargarPedidosActivos();

    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    //LIMPIA CAMPOS EN AGREGAR PEDIDO
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        jCBCategoria.setSelectedIndex(0);
        jTFBuscaProducto.setText("");
        jCBAgregaMozo.setSelectedIndex(-1);
        jCBAgregaMesa.setSelectedIndex(-1);
        jComboBox1.setSelectedIndex(0);


    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriaActionPerformed
        cargarProductos();
    }//GEN-LAST:event_jCBCategoriaActionPerformed

    private void jTPedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPedidosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPedidosMousePressed

    //CHECKET BUSQUEDA POR NUMERO DE PEDIDO
    private void jcPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPedidoActionPerformed

        if (jcPedido.isSelected()) {
            jcFecha.setSelected(false);
            jcMesa.setSelected(false);
            jcMozo.setSelected(false);
        }

    }//GEN-LAST:event_jcPedidoActionPerformed

    //CHECKET BUSQUEDA POR MESA
    private void jcMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMesaActionPerformed

        if (jcMesa.isSelected()) {
            jcPedido.setSelected(false);
        }

    }//GEN-LAST:event_jcMesaActionPerformed

    // CHECKET BUSQUEDA POR MOZO
    private void jcMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMozoActionPerformed

        if (jcMozo.isSelected()) {
            jcFecha.setSelected(false);
            jcPedido.setSelected(false);
        }

    }//GEN-LAST:event_jcMozoActionPerformed

    private void jcFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcFechaActionPerformed

    //HISTORIAL DE TODOS LOS PEDIDOS
    private void jbHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistorialActionPerformed
        borrarFilasTablaPedido();
        limpiaDetalle();
        ArrayList<DetallePedido> det = detalleda.todoDetalleDePedido();

        for (DetallePedido ped : det) {

            modelo.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});

        }
    }//GEN-LAST:event_jbHistorialActionPerformed

    //BUSQUEDA DE DETALLES DE PEDIDO 
    private void jBBuscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPedidoActionPerformed
        
        if (jcMesa.isSelected()) {
            cargarPedidosMesa();
        } else if (jcMozo.isSelected()) {
            cargarPedidosMozo();
        } else if (jcMesa.isSelected() && jcMozo.isSelected()) {
            cargarPedidosMesaMozo();
        } else if (jcPedido.isSelected()) {
            cargarPedidoPorId();
        } else if (jcFecha.isSelected()){
            cargarPedidosPorFecha();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar alguna opcion para buscar.");
        }

    }//GEN-LAST:event_jBBuscarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Mesa> CBMesas;
    private javax.swing.JComboBox<Mesero> CBMozo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarPedido;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<Mesa> jCBAgregaMesa;
    private javax.swing.JComboBox<Mesero> jCBAgregaMozo;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFBuscaProducto;
    private javax.swing.JTable jTPedidos;
    private javax.swing.JTable jTProductos;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbHistorial;
    private javax.swing.JCheckBox jcFecha;
    private javax.swing.JCheckBox jcMesa;
    private javax.swing.JCheckBox jcMozo;
    private javax.swing.JCheckBox jcPedido;
    private javax.swing.JTextField jtIdPedido;
    // End of variables declaration//GEN-END:variables
}
