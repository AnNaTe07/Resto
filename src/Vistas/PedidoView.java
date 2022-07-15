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
import java.sql.Date;
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
    private ArrayList<DetallePedido> detalles ;
    private ArrayList<Pedido> pedidos;
    private MesaData mesada;
    private MeseroData meseroda;
    private ProductoData productoda;
    private PedidoData pedidoda;
    private DetalleData detalleda ;

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
        detalles = detalleda.todoDetalleDePedidoSelect();
        initComponents();
        cargarCombo();
        armaCabeceraTablaProducto();
        armaCabeceraTablaPedidos();
        cargarProductos();
        cargarPedidosActivos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jbHistorial = new javax.swing.JButton();
        jtSubtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jcbCant = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jCBAgregaMesa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCBAgregaMozo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFBuscaProducto = new javax.swing.JTextField();
        jCBCategoria = new javax.swing.JComboBox<>();
        jBLimpiar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jcMesa = new javax.swing.JCheckBox();
        jcPedido = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdateFecha = new com.toedter.calendar.JDateChooser();
        CBMozo = new javax.swing.JComboBox<>();
        CBMesas = new javax.swing.JComboBox<>();
        jtIdPedido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcFecha = new javax.swing.JCheckBox();
        jcMozo = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jBBuscarPedido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 900));
        setPreferredSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBackground(new java.awt.Color(64, 44, 72));

        jBCancelar.setBackground(new java.awt.Color(51, 0, 51));
        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar pedido");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jbHistorial.setBackground(new java.awt.Color(51, 0, 51));
        jbHistorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbHistorial.setForeground(new java.awt.Color(255, 255, 255));
        jbHistorial.setText("Historial de pedidos");
        jbHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialActionPerformed(evt);
            }
        });

        jtSubtotal.setEditable(false);
        jtSubtotal.setBackground(new java.awt.Color(234, 231, 231));
        jtSubtotal.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subtotal");

        jBAgregar.setBackground(new java.awt.Color(51, 0, 51));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jcbCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));
        jcbCant.setSelectedIndex(1);
        jcbCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCantActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cant.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesa");

        jCBAgregaMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAgregaMozoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mozo");

        jTProductos.setBackground(new java.awt.Color(64, 44, 72));
        jTProductos.setForeground(new java.awt.Color(255, 255, 255));
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

        jTPedidos.setBackground(new java.awt.Color(64, 44, 72));
        jTPedidos.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Producto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria");

        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Todos los productos>", "Platos principales", "Bebidas sin alcohol", "Bebidas con alcohol" }));
        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(51, 0, 51));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar campos");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(51, 0, 51));
        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jcMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesaActionPerformed(evt);
            }
        });

        jcPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPedidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pedido N.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mesa");

        CBMesas.setToolTipText("");

        jtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdPedidoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha");

        jcFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFechaActionPerformed(evt);
            }
        });

        jcMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMozoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mozo");

        jBBuscarPedido.setBackground(new java.awt.Color(51, 0, 51));
        jBBuscarPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBBuscarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscarPedido.setText("Buscar");
        jBBuscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPedidoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel10.setText("PEDIDOS REALIZADOS");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel3.setText("CARGA DE PEDIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(202, 202, 202)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCBAgregaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(jCBAgregaMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbCant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBAgregar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbHistorial)
                        .addGap(119, 119, 119)
                        .addComponent(jBCancelar)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFBuscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBLimpiar)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBMesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jcMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBMozo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jBBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(450, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcPedido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(jcMozo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcMesa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcFecha))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(CBMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jdateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTFBuscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jCBAgregaMozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCBAgregaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jcbCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbHistorial)
                            .addComponent(jBCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
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

        int cant = modelo2.getRowCount()-1 ;
        for (int i = cant; i >= 0; i--) {

            modelo2.removeRow(i);
        }

    }

    
    //CARGA PRODUCTOS
    public void cargarProductos() {
        
        borrarFilasTabla();
        if (jCBCategoria.getSelectedIndex() == 0) {
            for (Producto prod : productos) {
                String categoria = "";
                if (prod.isActivo() == true) {
                    int aux = prod.getCategoria();
                    switch(aux){
                        case 0:
                            categoria = "Comestible";
                            break;
                        case 1:
                            categoria = "Bebida s/Alcohol";
                            break;
                        case 2:
                            categoria ="Bebida c/Alcohol";
                            break;
                    }
                    modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio(), categoria});
                }
            }
        } else {
            for (Producto prod : productos) {
                if (prod.isActivo() == true && prod.getCategoria() == jCBCategoria.getSelectedIndex() - 1) {
                    modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio()});
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
    
    //CARGAR DETALLE EN TABLA PEDIDOS
  public void cargarPedidosActivos() {
        borrarFilasTablaPedido();

        ArrayList<DetallePedido> depe = detalleda.todoDetalleDePedidoSelect();

        for (DetallePedido ped : depe) {

            if (ped.isExpirado() != true) {
                modelo2.addRow(new Object[]{ped.getDped().isActivo(), ped.getDped().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getDped().getMesa(), ped.getDped().getFecha(), ped.getDped().getHorario(), ped.getDped().getSubTotal()});
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

        ArrayList<Pedido> depe = pedidoda.listaPedidosxMesa(((Mesa) CBMesas.getSelectedItem()).getIdMesa(), LocalDate.parse(jdateFecha.getDate().toString()));
        for (Pedido ped : depe) {
            if (ped.isActivo() != true) {
                modelo2.addRow(new Object[]{ped.isActivo(), ped.isCobrado(), null, null, null, ped.getMesa().getIdMesa(), ped.getFecha(), ped.getHorario(), ped.getSubTotal()});
            }
        }

    }

    //CARGAR DETALLE DE PEDIDOS ACTIVOS NO EXPIRADOS POR ID
    public void cargarPedidoPorId() {
        borrarFilasTablaPedido();
        int id = Integer.parseInt(jtIdPedido.getText());
        DetallePedido ped = detalleda.detallePedidoPorId(id);

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
        if(!"".equals(jTFBuscaProducto.getText())){
            borrarFilasTabla();
            ArrayList<Producto> prodNomb = productoda.obtenerProductosXnombre(jTFBuscaProducto.getText());

            if (prodNomb != null) {
                for (Producto prod : prodNomb) {
                    if (prod.isActivo()) {
                        modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombre(), prod.getCantidad(), prod.getPrecio(), prod.getCategoria()});
                    }
                }
            } else {

                JOptionPane.showMessageDialog(null, "No se ha encontrado un producto con ese nombre.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre.");
        }

    }//GEN-LAST:event_jBBuscarActionPerformed
    
    // AGREGAR PEDIDOS
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
         int fila = jTProductos.getSelectedRow();
        if(fila != -1){
            Mesa mesa = (Mesa) jCBAgregaMesa.getSelectedItem();
            Mesero mozo = (Mesero) jCBAgregaMozo.getSelectedItem();
            Double subTotal;
            int cant = jcbCant.getSelectedIndex() ;
            Producto prod = null;
            prod = productoda.obtenerProductoXId(Integer.parseInt(jTProductos.getValueAt(fila, 0).toString()));
                    //JOptionPane.showMessageDialog(null, "Nombre "+ prod.getNombre());
            subTotal = cant * prod.getPrecio();
            jtSubtotal.setText(subTotal.toString());
            Pedido pedido = new Pedido(mesa, mozo, subTotal);
            pedidoda.cargarPedido(pedido);
            pedido = pedidoda.obtenerPedidoXId(18);
            DetallePedido detape = new DetallePedido(pedido, prod, cant, false);
            detalleda.agregarPedido(detape);
            cargarPedidosActivos();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.");
        }

    }//GEN-LAST:event_jBAgregarActionPerformed

    // CANCELAR PEDIDO
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
    
        int idDetalle = (int)jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 2);
        DetallePedido detape = detalleda.detallePedidoPorId(idDetalle);
        Pedido pedi = detape.getPed();
        meseroda.cancelarPedido(pedi);
        detalleda.detallePedidoPorId(idDetalle).setExpirado(true);
        cargarPedidosActivos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    //LIMPIA CAMPOS EN AGREGAR PEDIDO
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        jCBCategoria.setSelectedIndex(0);
        jTFBuscaProducto.setText("");
        jCBAgregaMozo.setSelectedIndex(-1);
        jCBAgregaMesa.setSelectedIndex(-1);
        jcbCant.setSelectedIndex(0);
        jtSubtotal.setText("");

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

            modelo2.addRow(new Object[]{ped.getPed().isActivo(), ped.getPed().isCobrado(), ped.getIdDetalle(), ped.getProd().getNombre(), ped.getCant(), ped.getPed().getMesa().getIdMesa(), ped.getPed().getFecha(), ped.getPed().getHorario(), ped.getPed().getSubTotal()});

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

    private void jcbCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCantActionPerformed
        int cant = jcbCant.getSelectedIndex() ;
        Producto prod = new Producto();
        prod = productoda.obtenerProductoXId(Integer.parseInt(jTProductos.getValueAt(jTProductos.getSelectedRow(), 0).toString()));
        Double st = cant * prod.getPrecio();
        jtSubtotal.setText(st.toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCantActionPerformed

    private void jCBAgregaMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAgregaMozoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAgregaMozoActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFBuscaProducto;
    private javax.swing.JTable jTPedidos;
    private javax.swing.JTable jTProductos;
    private javax.swing.JButton jbHistorial;
    private javax.swing.JCheckBox jcFecha;
    private javax.swing.JCheckBox jcMesa;
    private javax.swing.JCheckBox jcMozo;
    private javax.swing.JCheckBox jcPedido;
    private javax.swing.JComboBox<String> jcbCant;
    private com.toedter.calendar.JDateChooser jdateFecha;
    private javax.swing.JTextField jtIdPedido;
    private javax.swing.JTextField jtSubtotal;
    // End of variables declaration//GEN-END:variables
}
