
package Vistas;

import Data.MesaData;
import Modelos.Mesa;
import java.util.ArrayList;
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
             
       // limpiarTabla();
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

        jtCapacidad.setText("jTextField2");

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcActivo)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrAtendida)
                    .addComponent(jrLibre)
                    .addComponent(jrOcupada))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jrLibre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jrOcupada, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jrAtendida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addComponent(jcActivo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))))
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
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                                .addGap(40, 40, 40)
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
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jbIr)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrListar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRegistrarActionPerformed

    private void jbIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrActionPerformed
       
        
    }//GEN-LAST:event_jbIrActionPerformed


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
