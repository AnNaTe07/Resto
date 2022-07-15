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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jbReservas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtReserva = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jcbHoras = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbRealizaReserva = new javax.swing.JButton();
        jbFecha = new javax.swing.JRadioButton();
        jbID = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jcbMesas = new javax.swing.JComboBox<>();

        jLabel1.setText("Reservas");

        jLabel7.setText("Mesa");

        jLabel8.setText("Nombre");

        jLabel9.setText("Dni");

        jLabel10.setText("Fecha");

        jLabel11.setText("Hora");

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

        jbReservas.setText("Listar Reservas");
        jbReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservasActionPerformed(evt);
            }
        });

        jLabel5.setText("Reserva n°");

        jtReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtReservaKeyTyped(evt);
            }
        });

        jbBuscar.setText("Buscar Reserva");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar Reserva");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbModificar.setText("Cambiar Reserva");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jcbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

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

        jbRealizaReserva.setText("Realizar reserva");
        jbRealizaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizaReservaActionPerformed(evt);
            }
        });

        jbFecha.setText("Fecha");

        jbID.setText("ID");

        jLabel2.setText("Por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(90, 90, 90)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jcbHoras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(70, 70, 70))
                                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jbRealizaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbFecha)
                                    .addComponent(jbID)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(82, 82, 82)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 312, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(465, 465, 465)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 438, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jbRealizaReserva))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbModificar)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbReservas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
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
