package Vistas;

import Data.MesaData;
import Data.ReservaData;
import Modelos.Mesa;
import Modelos.Reserva;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservaView extends javax.swing.JInternalFrame {

    private ReservaData rd;
    private Reserva reserva;
    private DefaultTableModel modelo;
    private MesaData md;
    private Mesa mesa;

    public ReservaView(ReservaData rd, MesaData md) {
        this.rd = rd;
        this.md = md;
        initComponents();
        limpiarCampos();
        modelo = new DefaultTableModel();
        armarTabla();
        llenarComboBMesa();
        jtReserva.setEnabled(false);
        desactivarCampos();
        jdFecha.setMinSelectableDate(date);
        
    }

    private void limpiarCampos() {
        jtDni.setText("");
        jtNombre.setText("");
        jdFecha.setDate(null);
    }

    private void armarTabla() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("ID reserva");
        columnas.add("Mesa");
        columnas.add("Nombre");
        columnas.add("Dni");
        columnas.add("Fecha");
        columnas.add("Hora");

        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        jtReservas.setModel(modelo);
    }

    private void limpiarTabla() {
        int a = jtReservas.getRowCount() - 1;
        if (a > -1) {
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesBuscar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtReserva = new javax.swing.JTextField();
        jcbMesas = new javax.swing.JComboBox<>();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jcbHoras = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbRealizaReserva = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbID = new javax.swing.JRadioButton();
        jbFecha = new javax.swing.JRadioButton();
        jbCancelar = new javax.swing.JButton();
        jbReservas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 590));
        setMinimumSize(new java.awt.Dimension(1100, 590));
        setPreferredSize(new java.awt.Dimension(1100, 590));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(64, 44, 72));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Reserva n°");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Mesa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Dni");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Fecha");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Hora");

        jtReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtReservaKeyTyped(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jcbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jtReservas.setBackground(new java.awt.Color(64, 44, 72));
        jtReservas.setForeground(new java.awt.Color(255, 255, 255));
        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtReservasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtReservas);

        jbBuscar.setBackground(new java.awt.Color(51, 0, 51));
        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(240, 240, 240));
        jbBuscar.setText("Buscar Reserva");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbRealizaReserva.setBackground(new java.awt.Color(51, 0, 51));
        jbRealizaReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRealizaReserva.setForeground(new java.awt.Color(240, 240, 240));
        jbRealizaReserva.setText("Realizar reserva");
        jbRealizaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizaReservaActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(51, 0, 51));
        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(240, 240, 240));
        jbModificar.setText("Cambiar Reserva");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Por");

        jbID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbID.setForeground(new java.awt.Color(240, 240, 240));
        jbID.setText("ID");

        jbFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbFecha.setForeground(new java.awt.Color(240, 240, 240));
        jbFecha.setText("Fecha");

        jbCancelar.setBackground(new java.awt.Color(51, 0, 51));
        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(240, 240, 240));
        jbCancelar.setText("Cancelar Reserva");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbReservas.setBackground(new java.awt.Color(51, 0, 51));
        jbReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbReservas.setForeground(new java.awt.Color(240, 240, 240));
        jbReservas.setText("Listar Reservas");
        jbReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel1.setText("Reservas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(279, 279, 279)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbRealizaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jbRealizaReserva))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbReservas)
                                .addComponent(jbCancelar))))
                    .addComponent(jbModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservasActionPerformed

        limpiarTabla();
        System.out.println("si");

        for (Reserva aux : rd.obtenerReservas()) {
            modelo.addRow(new Object[]{aux.getIdReserva(), aux.getIdMesa(), aux.getNombre(), aux.getDni(), aux.getFecha(), aux.getHora()});
        }
    }//GEN-LAST:event_jbReservasActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        botonesBuscar.add(jbID);
        botonesBuscar.add(jbFecha);

        if (jbID.isSelected()) {

            limpiarTabla();
            jtReserva.setEnabled(true);
            if (!jtReserva.getText().isEmpty()) { //CONTROLO Q NO ESTE VACIO
                if (rd.obtenerReservaxId(Integer.parseInt(jtReserva.getText())) == null) {//CONTROLO Q DEVUELVA NULL
                    JOptionPane.showMessageDialog(null, "No existe una reserva con ese ID");
                    limpiarCampos();
                } else {
                    Reserva reservab = rd.obtenerReservaxId(Integer.parseInt(jtReserva.getText()));
                    modelo.addRow(new Object[]{reservab.getIdReserva(), reservab.getIdMesa(), reservab.getNombre(), reservab.getDni(), reservab.getFecha(), reservab.getHora()});
                    jtReserva.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un ID primero");
            }
        } else if (jbFecha.isSelected()) {
            limpiarTabla();
            if (jdFecha.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha primero");
            } else {
                Date f = jdFecha.getDate();
                String fecha = (f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).toString();
                System.out.println(fecha);
                int cont = 0;
                for (Reserva aux : rd.buscarReservaXFecha(fecha)) {
                    modelo.addRow(new Object[]{aux.getIdReserva(), aux.getIdMesa(), aux.getNombre(), aux.getDni(), aux.getFecha(), aux.getHora()});
                    cont += 1;
                }
                if (cont == 0) {
                    JOptionPane.showMessageDialog(null, "No existe reserva en esa fecha");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        int id = Integer.parseInt(jtReserva.getText());

        if (rd.borrarReserva(id)) {
            JOptionPane.showMessageDialog(null, "Eliminado con exito con exito");
        }

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped

        // no permite ingresar letras en el campo dni
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtReservaKeyTyped

        // no permite ingresar letras en el campo reserva
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtReservaKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped

        // no permite ingresar numeros en el campo nombre
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Reserva reservaN = new Reserva();
        jbModificar.setEnabled(false);
        jtNombre.setEnabled(true);
        jtDni.setEnabled(true);

        if (jtNombre.getText() == null && jtDni.getText() == null) {
            JOptionPane.showMessageDialog(null, "Llene los campos a modificar");
        } else {
            reservaN.setNombre(jtNombre.getText());
            int idN = Integer.parseInt(jtReserva.getText());
            reservaN.setIdReserva(Integer.parseInt(jtReserva.getText()));
            int mesa1 = (int) jcbMesas.getSelectedItem();
            int hora = jcbHoras.getSelectedIndex();
            reservaN.setIdMesa(mesa1);
            /////comparar fechas apra modificar reserva
            Date f = jdFecha.getDate();
            String fecha = (f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).toString();
            int repetido = 0;
            for (Reserva aux : rd.buscarReservaXFecha(fecha)) {
                if (aux.getIdReserva() != idN && (aux.getIdMesa() == mesa1 && (hora >= aux.getHora() && hora <= (aux.getHora() + 2)))) {
                    repetido += 1;
                }
            }
            if (repetido == 0) {
                Date j = jdFecha.getDate();
                LocalDate fecha2 = f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                reservaN.setFecha(fecha2);
                reservaN.setHora(jcbHoras.getSelectedIndex());
                reservaN.setDni(Integer.parseInt(jtDni.getText()));

                if (rd.modificarReserva(reservaN)) {
                    JOptionPane.showMessageDialog(null, "modificado con exito");

                }
            } else {
                JOptionPane.showMessageDialog(null, "La mesa ya esta reservada");
            }
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbRealizaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizaReservaActionPerformed

        
        if (jtNombre.getText() != null && jtDni.getText() != null && jdFecha.getDate() != null) {
            int mesaN = (int) (jcbMesas.getSelectedItem());
            String nombre = jtNombre.getText();
            int dni = Integer.parseInt(jtDni.getText());
            Date f = jdFecha.getDate();
            LocalDate fecha = f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            int hora = jcbHoras.getSelectedIndex();

            Reserva reservaN = new Reserva();
            String fecha2 = (f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).toString();
            int repetido = 0;
            for (Reserva aux : rd.buscarReservaXFecha(fecha2)) {
                if (aux.getIdMesa() == mesaN && (hora >= aux.getHora() && hora <= (aux.getHora() + 2))) {
                    repetido += 1;
                }
            }
            if (repetido == 0) {
                Date j = jdFecha.getDate();
                LocalDate fecha21 = j.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                reservaN.setFecha(fecha21);
                reservaN.setHora(jcbHoras.getSelectedIndex());
                reservaN.setDni(Integer.parseInt(jtDni.getText()));

                reservaN = new Reserva(nombre, dni, fecha, hora, mesaN, true);
                rd.agregarReserva(reservaN);
                JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa ya esta reservada");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos");
            jtDni.setEnabled(true);
            jtNombre.setEnabled(true);
            limpiarCampos();
        }
    }//GEN-LAST:event_jbRealizaReservaActionPerformed

    private void jtReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReservasMouseClicked
        int filaElegida = jtReservas.getSelectedRow();
        jtNombre.setEnabled(true);
        jtDni.setEnabled(true);
        jbModificar.setEnabled(true);
        if (filaElegida != -1) {
            int idReserva = (Integer) jtReservas.getValueAt(filaElegida, 0);
            int mesa1 = (Integer) jtReservas.getValueAt(filaElegida, 1);
            String nombre = (String) jtReservas.getValueAt(filaElegida, 2);
            int dni = (Integer) jtReservas.getValueAt(filaElegida, 3);
            LocalDate fecha = (LocalDate) jtReservas.getValueAt(filaElegida, 4);
            int hora = (Integer) jtReservas.getValueAt(filaElegida, 5);

            jtReserva.setText(idReserva + "");
            jtNombre.setText(nombre);
            Mesa mm = md.obtenerMesaxId(mesa1);

            jcbMesas.setSelectedItem(mesa1);
            jtDni.setText(dni + "");
            ZoneId zona = ZoneId.systemDefault();
            Date fecha2 = Date.from(fecha.atStartOfDay(zona).toInstant());
            jdFecha.setDate(fecha2);
            jcbHoras.setSelectedIndex(hora);

        }
    }//GEN-LAST:event_jtReservasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JRadioButton jbFecha;
    private javax.swing.JRadioButton jbID;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRealizaReserva;
    private javax.swing.JButton jbReservas;
    private javax.swing.JComboBox<String> jcbHoras;
    private javax.swing.JComboBox<Integer> jcbMesas;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtReserva;
    private javax.swing.JTable jtReservas;
    // End of variables declaration//GEN-END:variables
public void desactivarCampos() {
        jtDni.setEnabled(false);
        jtNombre.setEnabled(false);
    }

    public void llenarComboBMesa() {

        for (Mesa aux : md.obtenerMesasActivas()) {
            jcbMesas.addItem(aux.getIdMesa());
        }

    }
    
    LocalDate ldate = LocalDate.now();
    Instant instant = Instant.from(ldate.atStartOfDay(ZoneId.of("GMT")));
    Date date = Date.from(instant);
}
