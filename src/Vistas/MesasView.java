
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
        jcActivo.setSelected(false);
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
       String estado="";
         
      
          //validar si capacidad no esta vacio
        if(!jtCapacidad.getText().isEmpty()){
          //try{
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
            // JOptionPane.showMessageDialog(this,"No se pudo concretar la operación");
         }
      //   }catch(NullPointerException e){
            // JOptionPane.showMessageDialog(this,"Llene los campos correctamente");
      //   }
        }else{
            JOptionPane.showMessageDialog(this,"Complete el campo capacidad");
        }
     }   
        
     private void modificar(){
         
         if(jrModificar.isSelected()){
            jcActivo.setEnabled(true);
         }
         String estado="";
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
            estado = "Mesa dada de baja";
        }
       
         
        Mesa m=new Mesa(mesa,capacidad, activo, estado);
        if(md.modificarMesa(m)){ 
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nMesa n°: "+jtMesa.getText()+"\nCapacidad: "+jtCapacidad.getText()+"\nEstado: "+ estado);
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
        jLabel4 = new javax.swing.JLabel();
        jPanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMesa = new javax.swing.JTable();
        jrRegistrar = new javax.swing.JRadioButton();
        jrModificar = new javax.swing.JRadioButton();
        jrConsultar = new javax.swing.JRadioButton();
        jrListar = new javax.swing.JRadioButton();
        jbIr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtMesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtCapacidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrLibre = new javax.swing.JRadioButton();
        jrOcupada = new javax.swing.JRadioButton();
        jrAtendida = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcActivo = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(64, 44, 72));
        setPreferredSize(new java.awt.Dimension(1000, 610));

        jPanelLista.setBackground(new java.awt.Color(64, 44, 72));

        listaMesa.setBackground(new java.awt.Color(64, 44, 72));
        listaMesa.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        listaMesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaMesa.setForeground(new java.awt.Color(255, 255, 255));
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
        listaMesa.setGridColor(new java.awt.Color(64, 44, 72));
        jScrollPane1.setViewportView(listaMesa);

        jrRegistrar.setBackground(new java.awt.Color(64, 44, 72));
        bgMesa.add(jrRegistrar);
        jrRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jrRegistrar.setText("Registrar Mesa");
        jrRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRegistrarActionPerformed(evt);
            }
        });

        jrModificar.setBackground(new java.awt.Color(64, 44, 72));
        bgMesa.add(jrModificar);
        jrModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrModificar.setForeground(new java.awt.Color(255, 255, 255));
        jrModificar.setText("Modificar Mesa");

        jrConsultar.setBackground(new java.awt.Color(64, 44, 72));
        bgMesa.add(jrConsultar);
        jrConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jrConsultar.setText("Buscar Mesa");

        jrListar.setBackground(new java.awt.Color(64, 44, 72));
        bgMesa.add(jrListar);
        jrListar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrListar.setForeground(new java.awt.Color(255, 255, 255));
        jrListar.setText("Listar Mesas");

        jbIr.setBackground(new java.awt.Color(51, 0, 51));
        jbIr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbIr.setForeground(new java.awt.Color(255, 255, 255));
        jbIr.setText("Ir");
        jbIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel1.setText("           MESAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesa");

        jtMesa.setBackground(new java.awt.Color(64, 44, 72));
        jtMesa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtMesa.setForeground(new java.awt.Color(255, 255, 255));
        jtMesa.setText("jTextField1");
        jtMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacidad");

        jtCapacidad.setBackground(new java.awt.Color(64, 44, 72));
        jtCapacidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        jtCapacidad.setText("jTextField2");
        jtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCapacidadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");

        jrLibre.setBackground(new java.awt.Color(64, 44, 72));
        bgEstado.add(jrLibre);
        jrLibre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrLibre.setForeground(new java.awt.Color(255, 255, 255));
        jrLibre.setText("Libre");

        jrOcupada.setBackground(new java.awt.Color(64, 44, 72));
        bgEstado.add(jrOcupada);
        jrOcupada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrOcupada.setForeground(new java.awt.Color(255, 255, 255));
        jrOcupada.setText("Ocupada");

        jrAtendida.setBackground(new java.awt.Color(64, 44, 72));
        bgEstado.add(jrAtendida);
        jrAtendida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrAtendida.setForeground(new java.awt.Color(255, 255, 255));
        jrAtendida.setText("Atendida");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Activo");

        jcActivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcActivo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrLibre)
                    .addComponent(jcActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrOcupada)
                    .addComponent(jrAtendida))
                .addGap(96, 96, 96)
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbIr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrConsultar)
                    .addComponent(jrListar)
                    .addComponent(jrModificar)
                    .addComponent(jrRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaLayout.createSequentialGroup()
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListaLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanelListaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrRegistrar)
                                .addGap(30, 30, 30)
                                .addComponent(jrListar)))
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListaLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jrLibre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrModificar)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jrConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrOcupada)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)))
                        .addComponent(jrAtendida)
                        .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jcActivo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbIr)
                                    .addComponent(jLabel6))
                                .addGap(61, 61, 61))))
                    .addGroup(jPanelListaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
    private javax.swing.JPanel jPanel1;
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
