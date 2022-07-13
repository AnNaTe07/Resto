
package Vistas;

import Data.MesaData;
import Modelos.Mesa;
import java.util.ArrayList;
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
        jcActivo.setEnabled(false);
    }
     private void limpiarCampos() {
        jtMesa.setText("");
        jtCapacidad.setText("");
        jcActivo.setText("");
        bgMesa.clearSelection();
        bgEstado.clearSelection();             
        
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
       
     private void guardar(){
       String estado="0";
         
      
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
             JOptionPane.showMessageDialog(this, "No seleccionó un 'estado', se le aplicará 'Libre' por defecto");
             estado="Libre";
         }
         
         Mesa m = new Mesa(mesa,capacidad, true, estado);//por defecto se crean activa
     
         if(md.agregarMesa(m)){    
            JOptionPane.showMessageDialog(this,"\nMesa n°: "+jtMesa.getText()+"\nCapacidad: "+jtCapacidad.getText()+"\nEstado: "+estado);
            limpiarCampos();
          }else{
             JOptionPane.showMessageDialog(this,"No se pudo concretar la operación");
         }
         }catch(NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
         }
        }else{
            JOptionPane.showMessageDialog(this,"Complete los campos de la mesa");
        }
     }   
        
     private void modificar(){
         
         if(jrModificar.isSelected()){
            jcActivo.setEnabled(true);
         }
         String estado="0", frase="0";
         boolean activo=false;
           int id=0;
        try{
            id=Integer.parseInt(jtMesa.getText());        
        
        //validar si el capacidad y estado no estan vacios
        if(!jtCapacidad.getText().isEmpty()){ 
            
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
            jrLibre.getFocusCycleRootAncestor();
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
              JOptionPane.showMessageDialog(this, "Complete el campo capacidad correctamente");

        }
         
        
        }catch(NumberFormatException | NullPointerException e){
             JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
        }    
     }
     
     private void buscar(){
         
        jcActivo.setEnabled(true);
         //validar que mesa no este vacio
        if(!jtMesa.getText().isEmpty()){
        try{
      
        int mesa = Integer.parseInt(jtMesa.getText());
        Mesa aux =md.obtenerMesaxId(mesa);
        if(aux != null){
            
            jtMesa.setText(aux.getIdMesa()+"");
            jtCapacidad.setText(aux.getCapacidad()+"");
            if(aux.getEstado().equalsIgnoreCase("Libre")){
                jrLibre.setSelected(true);
            }else if(aux.getEstado().equalsIgnoreCase("Ocupada")){
                jrOcupada.setSelected(true);
            }else if(aux.getEstado().equalsIgnoreCase("Atendida")){
               jrAtendida.setSelected(true);
            }
        if(aux.isActivo()){
            jcActivo.setSelected(true);
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

     private void listarMesasActivas(){
         limpiarTabla();
         listaMesas = md.obtenerMesasActivas();
        
        for (Mesa aux : listaMesas) {
            modelo.addRow(new Object[]{aux.getIdMesa(), aux.getCapacidad(), aux.getEstado(), aux.isActivo()});
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

        bgEstado.add(jrLibre);
        jrLibre.setText("Libre");

        bgEstado.add(jrOcupada);
        jrOcupada.setText("Ocupada");

        bgEstado.add(jrAtendida);
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
    
        try{
        if(jrRegistrar.isSelected()){
      
            guardar();
        } else if(jrModificar.isSelected()){
            jcActivo.setEnabled(true);
            modificar();            
        }else if(jrConsultar.isSelected()){
            
             buscar();            
        }else if(jrListar.isSelected()){
           
            listarMesasActivas();
        }else{
             JOptionPane.showMessageDialog(this,"Debe seleccionar una opción");
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
