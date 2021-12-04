
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Home_Principal extends javax.swing.JFrame {

    private Component panelTitulo;

    /**
     * Creates new form Home_Principal
     */
    public Home_Principal() {
        initComponents();
        this.setSize(1100, 600);
        this.getContentPane().setBackground(Color.decode("#90EE90"));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        Instrucciones2 = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tablero = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        sub_ma_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sub_Instru = new javax.swing.JMenuItem();
        acercad = new javax.swing.JMenu();
        acerca = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Instrucciones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Instrucciones.png"))); // NOI18N
        Instrucciones2.setContentAreaFilled(false);
        Instrucciones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Instrucciones2ActionPerformed(evt);
            }
        });
        getContentPane().add(Instrucciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, -1, -1));

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Play.png"))); // NOI18N
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 180));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 180));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 180));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.0.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1100, 580));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 550, 220));

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Vovler a Jugar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Option One");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Option two");
        jMenu1.add(jMenuItem4);

        sub_ma_salir.setText("Salir");
        sub_ma_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_ma_salirActionPerformed(evt);
            }
        });
        jMenu1.add(sub_ma_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        sub_Instru.setText("Instrucciones");
        sub_Instru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_InstruActionPerformed(evt);
            }
        });
        jMenu2.add(sub_Instru);

        jMenuBar1.add(jMenu2);

        acercad.setText("Acerca de ");

        acerca.setText("Desarrollo");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        acercad.add(acerca);

        jMenuBar1.add(acercad);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
    Acerca acerca = new Acerca(this, rootPaneCheckingEnabled);
    acerca.setVisible(true);
          

    }//GEN-LAST:event_acercaActionPerformed

    private void sub_ma_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_ma_salirActionPerformed
        int opcion;
        String textoBotones[] = {"Aceptar ", "Cancelar"};
        opcion = JOptionPane.showOptionDialog(panelTitulo, "Esta seguro que desea salir",
                "Advertencia!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, textoBotones, textoBotones);

        if (opcion == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_sub_ma_salirActionPerformed

    private void sub_InstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_InstruActionPerformed
        Instrucciones Instru3 = new Instrucciones();
        Instru3.setVisible(true);
    }//GEN-LAST:event_sub_InstruActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        ZafariKids VentanaJugar = new ZafariKids();
        //this.dispose();
            VentanaJugar.setVisible(true);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void Instrucciones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Instrucciones2ActionPerformed
        Instrucciones Instru2 = new Instrucciones();
        //this.dispose();
        Instru2.setVisible(true);
    }//GEN-LAST:event_Instrucciones2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ZafariKids Jugando =new ZafariKids();
        Jugando.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Instrucciones2;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenu acercad;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem sub_Instru;
    private javax.swing.JMenuItem sub_ma_salir;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
