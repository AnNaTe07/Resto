
package Vistas;

import Data.Conexion;
import Data.MeseroData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

public class Menu extends javax.swing.JFrame {

    private Conexion conexion;
    private MeseroData mesero;
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        conexion = new Conexion();
        mesero = new MeseroData(conexion);
    }

    private Component obtenerPrincipal(){
        return jpPrincipal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jlMenu = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jpMenu1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpEscritorio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpMenu3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpProductos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpMenu5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpExtra = new javax.swing.JPanel();
        jpMenu6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(new java.awt.Color(64, 44, 72));

        jlMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resssssst.jpg"))); // NOI18N
        jlMenu.setText("jLabel7");

        jbLogin.setText("Log In");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jbLogin)
                        .addContainerGap())))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLogin)
                .addGap(59, 59, 59)
                .addComponent(jlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 610));

        jpMenu1.setBackground(new java.awt.Color(29, 19, 32));
        jpMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu1MouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(29, 19, 32));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("       SALIR");

        javax.swing.GroupLayout jpMenu1Layout = new javax.swing.GroupLayout(jpMenu1);
        jpMenu1.setLayout(jpMenu1Layout);
        jpMenu1Layout.setHorizontalGroup(
            jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpMenu1Layout.setVerticalGroup(
            jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jpMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jpEscritorio.setBackground(new java.awt.Color(29, 19, 32));
        jpEscritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEscritorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpEscritorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpEscritorioMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  ESCRITORIO");

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jpEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jpMenu3.setBackground(new java.awt.Color(29, 19, 32));
        jpMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMenu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu3MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      MENU 3");

        javax.swing.GroupLayout jpMenu3Layout = new javax.swing.GroupLayout(jpMenu3);
        jpMenu3.setLayout(jpMenu3Layout);
        jpMenu3Layout.setHorizontalGroup(
            jpMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jpMenu3Layout.setVerticalGroup(
            jpMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jpMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jpProductos.setBackground(new java.awt.Color(29, 19, 32));
        jpProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProductosMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   PRODUCTOS");

        javax.swing.GroupLayout jpProductosLayout = new javax.swing.GroupLayout(jpProductos);
        jpProductos.setLayout(jpProductosLayout);
        jpProductosLayout.setHorizontalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductosLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpProductosLayout.setVerticalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jpProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jpMenu5.setBackground(new java.awt.Color(29, 19, 32));
        jpMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMenu5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu5MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("      MENU 5");

        javax.swing.GroupLayout jpMenu5Layout = new javax.swing.GroupLayout(jpMenu5);
        jpMenu5.setLayout(jpMenu5Layout);
        jpMenu5Layout.setHorizontalGroup(
            jpMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenu5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114))
        );
        jpMenu5Layout.setVerticalGroup(
            jpMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jpMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 90, -1));

        jpExtra.setBackground(new java.awt.Color(29, 19, 32));

        javax.swing.GroupLayout jpExtraLayout = new javax.swing.GroupLayout(jpExtra);
        jpExtra.setLayout(jpExtraLayout);
        jpExtraLayout.setHorizontalGroup(
            jpExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jpExtraLayout.setVerticalGroup(
            jpExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jpExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 460, 40));

        jpMenu6.setBackground(new java.awt.Color(29, 19, 32));
        jpMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMenu6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMenu6MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("      MENU 6");

        javax.swing.GroupLayout jpMenu6Layout = new javax.swing.GroupLayout(jpMenu6);
        jpMenu6.setLayout(jpMenu6Layout);
        jpMenu6Layout.setHorizontalGroup(
            jpMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jpMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMenu6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpMenu6Layout.setVerticalGroup(
            jpMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jpMenu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMenu6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jpMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseEntered
        jpMenu1.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpMenu1MouseEntered

    private void jpMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseExited
        jpMenu1.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpMenu1MouseExited

    private void jpEscritorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscritorioMouseEntered
        jpEscritorio.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpEscritorioMouseEntered

    private void jpEscritorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscritorioMouseExited
        jpEscritorio.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpEscritorioMouseExited

    private void jpMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseEntered
        jpMenu3.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpMenu3MouseEntered

    private void jpMenu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseExited
        jpMenu3.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpMenu3MouseExited

    private void jpMenu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu6MouseEntered
        jpMenu6.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpMenu6MouseEntered

    private void jpMenu6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu6MouseExited
        jpMenu6.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpMenu6MouseExited

    private void jpProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductosMouseEntered
        jpProductos.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpProductosMouseEntered

    private void jpProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductosMouseExited
        jpProductos.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpProductosMouseExited

    private void jpMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu5MouseEntered
        jpMenu5.setBackground(new Color(64, 44, 72));
    }//GEN-LAST:event_jpMenu5MouseEntered

    private void jpMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu5MouseExited
        jpMenu5.setBackground(new Color(29, 19, 32));
    }//GEN-LAST:event_jpMenu5MouseExited

    private void jpMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseClicked
        
        dispose();
        
    }//GEN-LAST:event_jpMenu1MouseClicked

    private void jpProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductosMouseClicked
          Productos p = new Productos();
          p.setSize(1000, 610);
          p.setLocation(0,0);
          
          jpPrincipal.removeAll();
          jpPrincipal.add(p, BorderLayout.CENTER);
          jpPrincipal.revalidate();
          jpPrincipal.repaint();
        
        
    }//GEN-LAST:event_jpProductosMouseClicked

    private void jpEscritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscritorioMouseClicked
          jpPrincipal.removeAll();
        jpPrincipal.repaint();
        jpPrincipal.add(jlMenu);
        jpPrincipal.setVisible(true);
          
    }//GEN-LAST:event_jpEscritorioMouseClicked

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
      jpPrincipal.removeAll();
      jpPrincipal.repaint();
      RegistroView rv = new RegistroView(mesero);
      jpPrincipal.add(rv);
      rv.setVisible(true);
      jpPrincipal.setVisible(true);
    }//GEN-LAST:event_jbLoginActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlMenu;
    private javax.swing.JPanel jpEscritorio;
    private javax.swing.JPanel jpExtra;
    private javax.swing.JPanel jpMenu1;
    private javax.swing.JPanel jpMenu3;
    private javax.swing.JPanel jpMenu5;
    private javax.swing.JPanel jpMenu6;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProductos;
    // End of variables declaration//GEN-END:variables



}
