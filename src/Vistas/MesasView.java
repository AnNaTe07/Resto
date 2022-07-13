
package Vistas;

import Data.MesaData;
import Modelos.Mesa;
import Modelos.Reserva;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MesasView extends javax.swing.JInternalFrame {

    private MesaData md;
    private DefaultTableModel modelo;
    private ArrayList <Mesa> listaMesas;
    
    public MesasView(MesaData md) {
        initComponents();
        limpiarCampos();   
        this.md=md;
        modelo = new DefaultTableModel();
        listaMesas = md.obtenerMesasActivas();
        armarTabla();
    }
     private void limpiarCampos() {
        jtMesa.setText("");
        jtCapacidad.setText("");
        jcActivo.setText("");
        bgMesa.clearSelection();
        bgEstado.clearSelection();
             
        limpiarTabla();
     }
     
        private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Mesa");
        columnas.add("Capacidad");
        columnas.add("Estado");
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        listaMesa.setModel(modelo);
    }
        
           
      private void limpiarTabla() {
       int a = listaMesa.getRowCount()-1;
         if(a > -1){
              for (int i = a; i >= 0; i--) {
              modelo.removeRow(i);
          }
         }
    }
        
        
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMesa = new javax.swing.ButtonGroup();
        bgEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrRegistrar = new javax.swing.JRadioButton();
        jrModificar = new javax.swing.JRadioButton();
        jrListar = new javax.swing.JRadioButton();
        jrConsultar = new javax.swing.JRadioButton();
        jbIr = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        jcActivo = new javax.swing.JCheckBox();
        jrLibre = new javax.swing.JRadioButton();
        jrOcupada = new javax.swing.JRadioButton();
        jrAtendida = new javax.swing.JRadioButton();
        jPanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMesa = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("           MESAS");

        bgMesa.add(jrRegistrar);
        jrRegistrar.setText("registrar mesa");
        jrRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRegistrarActionPerformed(evt);
            }
        });

        bgMesa.add(jrModificar);
        jrModificar.setText("Modificar Mesa");

        bgMesa.add(jrListar);
        jrListar.setText("Listar Mesas");

        bgMesa.add(jrConsultar);
        jrConsultar.setText("Consultar Mesa");

        jbIr.setText("Ir");
        jbIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrActionPerformed(evt);
            }
        });

        jLabel2.setText("Mesa");

        jLabel3.setText("Capacidad");

        jLabel5.setText("Estado");

        jLabel6.setText("Activo");

        jtMesa.setText("jTextField1");
        jtMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesaKeyTyped(evt);
            }
        });

        jtCapacidad.setText("jTextField2");
        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyTyped(evt);
            }
        });

        jcActivo.setText("jCheckBox1");

        jrLibre.setText("Libre");

        jrOcupada.setText("Ocupada");

        jrAtendida.setText("Atendida");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrAtendida)
                                    .addComponent(jrOcupada)
                                    .addComponent(jcActivo)
                                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jrLibre))))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jrLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOcupada)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrAtendida)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcActivo)
                    .addComponent(jLabel6)))
        );

        listaMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mesa", "Capacidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaMesa);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrRegistrar)
                                    .addComponent(jrModificar)
                                    .addComponent(jrConsultar)
                                    .addComponent(jrListar))
                                .addGap(35, 35, 35)
                                .addComponent(jbIr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrRegistrar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jrModificar)
                                .addGap(15, 15, 15)
                                .addComponent(jrConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jbIr)))
                        .addGap(18, 18, 18)
                        .addComponent(jrListar))
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRegistrarActionPerformed

    private void jbIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrActionPerformed
       String estado="0", frase="0";
       boolean activo= false;
        try{
        if(jrRegistrar.isSelected()){
            
               //validar si el capacidad y estado no estan vacios
        if(!jtCapacidad.getText().isEmpty() && (jrLibre.isSelected()==false || jrOcupada.isSelected()==false || jrAtendida.isSelected()==false)){
          try{
         int mesa = Integer.parseInt(jtMesa.getText());
         int capacidad=Integer.parseInt(jtCapacidad.getText()); 
         
         if(jrLibre.isSelected()){
             estado="Libre";
         }else if(jrOcupada.isSelected()){
             estado="Ocupada";
         }else if(jrAtendida.isSelected()){
             estado="Atendida";
         }else{
             JOptionPane.showMessageDialog(this, "Debe seleccionar un 'estado'");
         }
         Mesa m = new Mesa(mesa,capacidad, true, estado);
     
         if( md.agregarMesa(m)){    
            JOptionPane.showMessageDialog(this,"\nMesa n°: "+jtMesa+"\nCapacidad: "+jtCapacidad.getText()+"\nEstado: "+estado);
            limpiarCampos();
            }
         }catch(NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
         }
        }
        }    
        
        if(jrModificar.isSelected()){
            
               int id=0;
        try{
            id=Integer.parseInt(jtMesa.getText());
        
        
        //validar si el capacidad y estado no estan vacios
        if(!jtCapacidad.getText().isEmpty() && (jrLibre.isSelected()==false || jrOcupada.isSelected()==false || jrAtendida.isSelected()==false)){
            
        int mesa = Integer.parseInt(jtMesa.getText());
        int capacidad = Integer.parseInt(jtCapacidad.getText());
        
        if(jrLibre.isSelected()){
            estado="Libre";
        }else if(jrOcupada.isSelected()){
            estado="Ocupada";
        }else if(jrAtendida.isSelected()){
            estado="Atendida";
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un 'estado'");
        }
        
        if(jcActivo.isSelected()){
            activo=true;            
        }else{
            frase = "Mesa dada de baja";
        }
       
         
        Mesa m=new Mesa(mesa,capacidad, activo, estado);
        if(md.modificarMesa(m)){ 
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nMesa n°: "+jtMesa.getText()+"\nCapacidad: "+jtCapacidad.getText()+"\nEstado: "+estado+ frase);
             limpiarCampos();
        }else{
             JOptionPane.showMessageDialog(this, "Error al intentar modificar los datos, inténtelo nuevamente");
        }  
        }else{
              JOptionPane.showMessageDialog(this, "Complete los campos capacidad y estado correctamente");

        }
         
        
        }catch(NumberFormatException | NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
        }    
            
        }
        if(jrConsultar.isSelected()){
            
        //validar que mesa no este vacio
        if(!jtMesa.getText().isEmpty()){
        try{
      
        int mesa = Integer.parseInt(jtMesa.getText());
        Mesa aux =md.obtenerMesaxId(mesa);
        if(aux != null){
            
            jtMesa.setText(aux.getIdMesa()+"");
            jtCapacidad.setText(aux.getCapacidad()+"");
            if(aux.getEstado().equalsIgnoreCase("Libre")){
                jrLibre.isSelected();                  
            }else if(aux.getEstado().equalsIgnoreCase("Ocupada")){
                jrOcupada.isSelected();
            }else if(aux.getEstado().equalsIgnoreCase("Atendida")){
               jrAtendida.isSelected();
            }
        if(aux.isActivo()){
            jcActivo.isSelected();
        }else{
            JOptionPane.showMessageDialog(this,"Mesa temporalmente fuera de servicio");
        }      
        }else {
            JOptionPane.showMessageDialog(this,"Número de mesa incorrecto");
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Complete el campo 'número de mesa' correctamente");
            limpiarCampos();
        }
        }else{
            JOptionPane.showMessageDialog(this,"Debe ingresar el número de mesa para buscarlo");
            limpiarCampos();
        }
            
        }
        if(jrListar.isSelected()){
            List<Mesa> listaMesas = md.obtenerMesasActivas();
        
        for (Mesa aux : listaMesas) {
            modelo.addRow(new Object[]{aux.getIdMesa(), aux.getCapacidad(), aux.getEstado(), aux.isActivo()});
        }
            
        }
           
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this,"Complete los campos correctamente");
             limpiarCampos();
        }
        
    }//GEN-LAST:event_jbIrActionPerformed

    private void jtMesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMesaKeyTyped
       
          // no permite ingresar letras en el campo mesa
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9'){
        evt.consume();
        }
    }//GEN-LAST:event_jtMesaKeyTyped

    private void jtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCapacidadKeyTyped
      
          // no permite ingresar letras en el campo mesa
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9'){
        evt.consume();
        }
    }//GEN-LAST:event_jtCapacidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstado;
    private javax.swing.ButtonGroup bgMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbIr;
    private javax.swing.JCheckBox jcActivo;
    private javax.swing.JRadioButton jrAtendida;
    private javax.swing.JRadioButton jrConsultar;
    private javax.swing.JRadioButton jrLibre;
    private javax.swing.JRadioButton jrListar;
    private javax.swing.JRadioButton jrModificar;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JRadioButton jrRegistrar;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtMesa;
    private javax.swing.JTable listaMesa;
    // End of variables declaration//GEN-END:variables
}
