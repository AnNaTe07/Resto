
package Vistas;

import Data.ReservaData;
import Modelos.Reserva;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservaView extends javax.swing.JInternalFrame {

    private ReservaData rd;
    private DefaultTableModel modelo;
    private ArrayList <Reserva> listaReservas;
    
    public ReservaView(ReservaData rd) {
       
        initComponents();
        limpiarCampos();   
        this.rd=rd;
        modelo = new DefaultTableModel();
        listaReservas = rd.obtenerReservas();
        armarTabla();
        
    }
    
      private void limpiarCampos() {
        jtMesa.setText("");
        jtDni.setText("");
        jtNombre.setText("");
        jtHora.setText("");
        jdFecha.setCalendar(null);
        
        limpiarTabla();
        jbModificar.setEnabled(false);
        jtReservas.setVisible(false);
        jbCancelar.setEnabled(false);
    }
      
     
        private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtHora = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbReservas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtReserva = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();

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

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mesa", "Nombre", "Dni", "Fecha", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtReservas);

        jLabel7.setText("Mesa");

        jLabel8.setText("Nombre");

        jLabel9.setText("Dni");

        jLabel10.setText("Fecha");

        jLabel11.setText("Hora");

        jtMesa.setText("jTextField1");
        jtMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesaKeyTyped(evt);
            }
        });

        jtNombre.setText("jTextField2");
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtDni.setText("jTextField4");
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtHora.setText("jTextField5");

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

        jtReserva.setText("jTextField1");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jbCancelar)
                                .addGap(3, 3, 3)))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar)
                    .addComponent(jbReservas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservasActionPerformed
   
       // limpiarTabla();
        java.util.List<Reserva> Reservas = rd.obtenerReservas();
        
        for (Reserva aux : Reservas) {
            modelo.addRow(new Object[]{aux.getIdMesa(), aux.getNombre(), aux.getDni(), aux.getFecha(),  aux.getHora()});
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
            jtHora.setText(aux.getHora()+"");
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
        
        if((c<'a'||c>'z') && (c<'A'||c>'Z')){
        evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
         int id=0;
        try{
            id=Integer.parseInt(jtReserva.getText());
        
        
        //validar si el nombre y dni no estan vacios
        if(!jtNombre.getText().isEmpty() && !jtDni.getText().isEmpty()){
            
        String nombre=jtNombre.getText();
        int dni=Integer.parseInt(jtDni.getText());
      
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(jdFecha.getDate());
        LocalDate fechaR = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int mesa = Integer.parseInt(jtMesa.getText());
        
       
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
        String hora= fhora.format(jtHora.getText());
        LocalTime horaR= LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
         
        Reserva r=new Reserva(id,nombre,dni,fechaR, horaR, mesa, true);
        if(rd.modificarReserva(r)){ 
             String legajo=jtReserva.getText();
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nReserva n°: "+jtReserva+"\nNombre: "+jtNombre.getText()+"\nDni: "+dni+"\nMesa: "+mesa+"\nFecha: "+fechaR+"\nHora: "+horaR);
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
        String hora= fhora.format(jtHora.getText());
        LocalTime horaR= LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));

         Reserva r=new Reserva(nombre,dni,fechaR, horaR, mesa, true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbReservas;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtHora;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtReserva;
    private javax.swing.JTable jtReservas;
    // End of variables declaration//GEN-END:variables
}
