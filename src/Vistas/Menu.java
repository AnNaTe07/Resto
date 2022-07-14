
package Vistas;

import Data.Conexion;

import Data.*;

import Data.MesaData;



import java.awt.BorderLayout;
import java.awt.Component;

public class Menu extends javax.swing.JFrame {

    private Conexion conexion;
    private ProductoData pd;
    private MeseroData md;
    private ReservaData rd;

    private MesaData mesa;
    private PedidoData pedido;
    private DetalleData detalle;
    private MesaData mesad;

    public Menu() {
        conexion = new Conexion();
        pd = new ProductoData(conexion);
        initComponents();
        setLocationRelativeTo(null);
        md = new MeseroData(conexion);
        rd = new ReservaData(conexion);
        mesa = new MesaData(conexion);
        pedido = new PedidoData(conexion);
        detalle = new DetalleData(conexion);
        
        mesad=new MesaData(conexion);
    }

    private Component obtenerPrincipal(){
        return jpPrincipal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jlMenu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jbMeseros = new javax.swing.JButton();
        jbPedidos = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbReservas = new javax.swing.JButton();
        jbMesas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(new java.awt.Color(64, 44, 72));

        jlMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resssssst.jpg"))); // NOI18N
        jlMenu.setText("jLabel7");
        jlMenu.setFocusable(false);
        jlMenu.setOpaque(true);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 590));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbSalir.setBackground(new java.awt.Color(51, 0, 51));
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbMeseros.setBackground(new java.awt.Color(51, 0, 51));
        jbMeseros.setForeground(new java.awt.Color(255, 255, 255));
        jbMeseros.setText("Meseros");
        jbMeseros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosActionPerformed(evt);
            }
        });

        jbPedidos.setBackground(new java.awt.Color(51, 0, 51));
        jbPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jbPedidos.setText("Pedidos");
        jbPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPedidosActionPerformed(evt);
            }
        });

        jbProductos.setBackground(new java.awt.Color(51, 0, 51));
        jbProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbProductos.setText("Productos");
        jbProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbReservas.setBackground(new java.awt.Color(51, 0, 51));
        jbReservas.setForeground(new java.awt.Color(255, 255, 255));
        jbReservas.setText("Reservas");
        jbReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservasActionPerformed(evt);
            }
        });

        jbMesas.setBackground(new java.awt.Color(51, 0, 51));
        jbMesas.setForeground(new java.awt.Color(255, 255, 255));
        jbMesas.setText("Mesas");
        jbMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMesasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeserosActionPerformed
        jpPrincipal.removeAll();
        MeserosView meseros = new MeserosView(md);
        meseros.setVisible(true);
        jpPrincipal.add(meseros);
        meseros.moveToFront();
                
    }//GEN-LAST:event_jbMeserosActionPerformed

    private void jbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPedidosActionPerformed
         jpPrincipal.removeAll();
         PedidoView pv = new PedidoView(mesa, md, pd, pedido, detalle);
         pv.setVisible(true);
         jpPrincipal.add(pv);
         pv.moveToFront();
    }//GEN-LAST:event_jbPedidosActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
          ProductosView p = new ProductosView(pd);
          p.setSize(1000, 610);
          p.setLocation(0,0);
          
          jpPrincipal.removeAll();
          jpPrincipal.add(p, BorderLayout.CENTER);
          jpPrincipal.revalidate();
          jpPrincipal.repaint();
    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservasActionPerformed
        jpPrincipal.removeAll();
        ReservaView rv = new ReservaView(rd);
        rv.setSize(1000, 610);
        rv.setLocation(0,0);
        rv.setVisible(true);
        jpPrincipal.add(rv);
        rv.moveToFront();
    }//GEN-LAST:event_jbReservasActionPerformed

    private void jbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMesasActionPerformed
        jpPrincipal.removeAll();
        MesasView mesas = new MesasView(mesad);
        mesas.setVisible(true);
        jpPrincipal.add(mesas);
        mesas.moveToFront();
    }//GEN-LAST:event_jbMesasActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMesas;
    private javax.swing.JButton jbMeseros;
    private javax.swing.JButton jbPedidos;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbReservas;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlMenu;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables



}
