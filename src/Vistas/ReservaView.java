
package Vistas;

import Data.ReservaData;
import Modelos.Reserva;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservaView extends javax.swing.JInternalFrame {

    private ReservaData rd;
    private Reserva reserva;
    private DefaultTableModel modelo;
    
    public ReservaView(ReservaData rd) {
        this.rd=rd;
        initComponents();
        limpiarCampos();   
        modelo = new DefaultTableModel();
        armarTabla();    
    }
    
    private void limpiarCampos() {
        jtReserva.setText("");
        jtMesa.setText("");
        jtDni.setText("");
        jtNombre.setText("");
        jdFecha.setDate(null);
    }
      
     
    private void armarTabla(){
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
       int a = jtReservas.getRowCount()-1;
         if(a > -1){
              for (int i = a; i >= 0; i--) {
              modelo.removeRow(i);
          }
         }
    }
      
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbReservas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtReserva = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jcbHoras = new javax.swing.JComboBox<>();
        jcbMinutos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbRealizaReserva = new javax.swing.JButton();
        jtHora = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jLabel1.setText("Reservas");

        jLabel7.setText("Mesa");

        jLabel8.setText("Nombre");

        jLabel9.setText("Dni");

        jLabel10.setText("Fecha");

        jLabel11.setText("Hora");

        jtMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMesaActionPerformed(evt);
            }
        });
        jtMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesaKeyTyped(evt);
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

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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

        jdFecha.setDateFormatString("dd/MM/yyyy HH:mm:ss\n");

        jcbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));

        jcbMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

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
        jScrollPane2.setViewportView(jtReservas);

        jbRealizaReserva.setText("Realizar reserva");
        jbRealizaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizaReservaActionPerformed(evt);
            }
        });

        jtHora.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jbCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jbGuardar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jcbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jbRealizaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(82, 82, 82)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbRealizaReserva)))
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
                    .addComponent(jcbMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar)
                    .addComponent(jbReservas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(296, 296, 296))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservasActionPerformed
   
        limpiarTabla();
        System.out.println("si");
        
        for (Reserva aux : rd.obtenerReservas()) {
            modelo.addRow(new Object[]{aux.getIdReserva(),aux.getIdMesa(), aux.getNombre(), aux.getDni(), aux.getFecha(),});
        }
    }//GEN-LAST:event_jbReservasActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
      
         //validar que reserva n° no este vacio
        if(!jtReserva.getText().isEmpty()){
        try{
      
        int reserva = Integer.parseInt(jtReserva.getText());
        Reserva aux =rd.obtenerReservaxId(reserva);
        if((aux != null)&& (aux.isActivo())){
            
            jtMesa.setText(aux.getIdMesa()+"");
            jtDni.setText(aux.getDni()+"");
            jtNombre.setText(aux.getNombre());
            jdFecha.setDate(Date.valueOf(aux.getFecha()));
          //  jtHora.setText(aux.getHora().getHour()+":"+aux.getHora().getMinute()+"");
             
           // jcbHoras.setSelectedIndex(aux.getHora().getHour());
           // jcbMinutos.setSelectedIndex(aux.getHora().getMinute());
            jbCancelar.setEnabled(true);
            jbModificar.setEnabled(true); 
            
        }else{
            JOptionPane.showMessageDialog(this,"No hay reserva asociada a ese número");
            }
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Complete el campo 'número de reserva' correctamente");
                limpiarCampos();
        }
        }else{
            JOptionPane.showMessageDialog(this,"Debe ingresar el número de reserva para buscarlo");
            limpiarCampos();
        }
        
       
        
  
      
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
   
            
        
        //validar que reserva n° no este vacio
        if(!jtReserva.getText().isEmpty()){
        try{
      
        int idReserva = Integer.parseInt(jtReserva.getText());
        Reserva aux =rd.obtenerReservaxId(idReserva);
        if((aux != null)&& (aux.isActivo())){
            if (rd.borrarReserva(idReserva)) {
                  JOptionPane.showMessageDialog(null, "La reserva cancelada exitosamente.");
            }
                        
        }else{
            JOptionPane.showMessageDialog(this,"No hay reserva asociada a ese número");
            }
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Complete el campo 'número de reserva' correctamente");
                limpiarCampos();
        }
        }else{
            JOptionPane.showMessageDialog(this,"Debe ingresar el número de reserva para buscarlo");
            limpiarCampos();
        }
           
        
      
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        
        // no permite ingresar letras en el campo dni
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9'){
        evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtReservaKeyTyped
     
        // no permite ingresar letras en el campo reserva
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9'){
        evt.consume();
        }
    }//GEN-LAST:event_jtReservaKeyTyped

    private void jtMesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMesaKeyTyped
       
        // no permite ingresar letras en el campo mesa
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9'){
        evt.consume();
        }
    }//GEN-LAST:event_jtMesaKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
     
         // no permite ingresar numeros en el campo nombre
        char c = evt.getKeyChar();
        
        if((c<'a'||c>'z') && (c<'A'||c>'Z') && (c!= ' ')){
        evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
         int id=0;
        try{
            id=Integer.parseInt(jtReserva.getText());
        
        
        //validar si el nombre y dni no estan vacios
        if(!jtNombre.getText().isEmpty() || !jtDni.getText().isEmpty()){
            
        String nombre=jtNombre.getText();
        int dni=Integer.parseInt(jtDni.getText());
      
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fecha = formato.format(jdFecha.getDate());
        LocalDateTime fechaR = LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        int mesa = Integer.parseInt(jtMesa.getText());
        
       /*
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm"); 
        //String hora=fhora.format(jtHora.getText());
        String h =jcbHoras.getSelectedIndex()+"";
        String m=jcbMinutos.getSelectedIndex()+"";
        String hora=(h+m);
        JOptionPane.showMessageDialog(null,hora);
        LocalTime horaR= LocalTime.parse(hora,DateTimeFormatter.ofPattern("HH:mm"));
        
        */
        
      //  LocalTime hora= jtHora.setText(aux.getHora().getHour()+":"+aux.getHora().getMinute()+"");
             
          //  jcbHoras.setSelectedIndex();
          //  jcbMinutos.setSelectedIndex(aux.getHora().getMinute());
        
        
         
        Reserva r=new Reserva(id,nombre,dni,fechaR,  mesa, true);
        if(rd.modificarReserva(r)){ 
            // String reserva=jtReserva.getText();
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nReserva n°: "+jtReserva.getText()+"\nNombre: "+jtNombre.getText()+"\nDni: "+dni+"\nMesa: "+mesa+"\nFecha y hora: "+fechaR);
             limpiarCampos();
            // jbModificar.setEnabled(false);
             //jbCancelar.setEnabled(false); 
       
        }else{
             JOptionPane.showMessageDialog(this, "Error al intentar modificar los datos, intentelo nuevamente");
        }  
        }else{
              JOptionPane.showMessageDialog(this, "Llene los campos nombre y dni correctamente");

        }
         
        
        }catch(NumberFormatException | NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
        }      
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        //validar si el nombre y dni no estan vacios
        if(!jtNombre.getText().isEmpty() && !jtDni.getText().isEmpty()){
          try{
         int dni=Integer.parseInt(jtDni.getText()); 
     
         String nombre=jtNombre.getText();    
         
         
         
         //Obtenemos la fecha del jcalendar y la pasamos a LocalDate            
     
         jdFecha.setMinSelectableDate(new Date(15,07,2022)); 
         Calendar fechaActual = new GregorianCalendar();
         int mesActual = fechaActual.get(Calendar.MONTH);  
         int diaActual = fechaActual.get(Calendar.DATE);

         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
         String fecha = formato.format(jdFecha.getDate());        
         
         String [] partes = fecha.split("-");
         String mes = partes[1];
         String dia = partes[0];
        
         int mesReserva = Integer.parseInt(mes)- mesActual;
         int diaReserva = Integer.parseInt(dia) - diaActual;
    
         
         LocalDate fechaR = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
         
        int mesa = Integer.parseInt(jtMesa.getText());        
       
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
        String hora=fhora.format(jtHora.getText());
       // String h =jcbHoras.getSelectedIndex()+"";
       // String m=jcbMinutos.getSelectedIndex()+"";
//        String hora= fhora.format(h+m+"00");
      //  String hora= fhora.format(jtHora.getText());
      //  LocalTime horaR= LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
        
       
        

         Reserva r=new Reserva(nombre,dni,fechaR, mesa, true);
         jtReserva.setText(r.getIdReserva()+"");
         int idReserva=Integer.parseInt(jtReserva.getText());
         if((mesReserva>1 || mesReserva<0 )&&(diaReserva>31)){// Las Reservas se toman hasta con 1 mes de anticipacion
             JOptionPane.showMessageDialog(this,"Fecha ingresada incorrecta, las reservas se tomas desde el dia actual hasta 31 dias posteriores");
         }else if( rd.agregarReserva(r)){    
                jtReserva.setText(r.getIdReserva()+"");
                idReserva=Integer.parseInt(jtReserva.getText());
                JOptionPane.showMessageDialog(this,"\nReserva n°: "+jtReserva+"\nNombre: "+jtNombre.getText()+"\nDni: "+dni+"\nMesa: "+mesa+"\nFecha: "+fechaR+"\nHora: "+horaR+"\nReserva agregada con éxito!");
                limpiarCampos();
            }
         }catch(NumberFormatException | NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
         } 
        }else{
             JOptionPane.showMessageDialog(this, "Llene los campos nombre y dni correctamente");

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMesaActionPerformed

    private void jbRealizaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizaReservaActionPerformed
    /*    LocalDate dateCompare = null;
        try{
        Date d = (Date) jdFecha.getDate();
        
        dateCompare = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        for(Reserva aux : rd.obtenerReservas()){
             if(aux.getFecha().equals(dateCompare)){
                 System.out.println("las fechas son iguales");
             }
         }
        
        }catch(NullPointerException e){
            System.out.println("llene campos");
        }*/
    }//GEN-LAST:event_jbRealizaReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRealizaReserva;
    private javax.swing.JButton jbReservas;
    private javax.swing.JComboBox<String> jcbHoras;
    private javax.swing.JComboBox<String> jcbMinutos;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtReserva;
    private javax.swing.JTable jtReservas;
    // End of variables declaration//GEN-END:variables
}
