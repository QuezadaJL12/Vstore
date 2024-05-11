
package com.mycompany.vstorepresentacion;

import com.mycompany.vstoreagregarpelicula.FuncionalidadAgregarPelicula;
import com.mycompany.vstoreagregarpelicula.IFuncionalidadAgregarPelicula;
import com.mycompany.vstoreconsultarpelicula.FuncionalidadConsultarPeliculasPorGenero;
import com.mycompany.vstoreconsultarpelicula.IFuncionalidadConsultarPeliculasPorGenero;
import com.mycompany.vstoreconsultarpeliculas.FuncionalidadConsultarPeliculas;
import com.mycompany.vstoreconsultarpeliculas.IFuncionalidadConsultarPeliculas;
import com.mycompany.vstoredto.dtos.PeliculaDTO;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class FormBuscarPelicula extends javax.swing.JFrame {

    private IFuncionalidadConsultarPeliculas funcionalidadConsultarPeliculas;
    private IFuncionalidadConsultarPeliculasPorGenero funcionalidadConsultarPeliculasPorGenero;
    private IFuncionalidadAgregarPelicula funcionalidadAgregarPelicula;

    /**
     * Creates new form FormBuscarPeliculas
     */
    public FormBuscarPelicula() {
        initComponents();
        this.setLocationRelativeTo(null);
        funcionalidadConsultarPeliculas = new FuncionalidadConsultarPeliculas();
        funcionalidadConsultarPeliculasPorGenero = new FuncionalidadConsultarPeliculasPorGenero();
        funcionalidadAgregarPelicula = new FuncionalidadAgregarPelicula();
        List<PeliculaDTO> listaPeliculas = funcionalidadConsultarPeliculas.consultarPeliculas();

        llenarPanel(listaPeliculas);
        this.PeliculasPanel.setLayout(new GridLayout(0, 2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BuscarPelicula = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnTerror = new javax.swing.JButton();
        btnComedia = new javax.swing.JButton();
        btnAventura = new javax.swing.JButton();
        btnFavoritos1 = new javax.swing.JButton();
        btnAccion1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PeliculasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VSTORE.drawio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lupa.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(45, 45));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 70, 50));

        BuscarPelicula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuscarPelicula.setForeground(new java.awt.Color(204, 204, 204));
        BuscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPeliculaActionPerformed(evt);
            }
        });
        BuscarPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarPeliculaKeyReleased(evt);
            }
        });
        getContentPane().add(BuscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, 50));

        btnSalir.setBackground(new java.awt.Color(0, 0, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        btnTerror.setBackground(new java.awt.Color(0, 0, 102));
        btnTerror.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTerror.setForeground(new java.awt.Color(255, 255, 255));
        btnTerror.setText("Terror");
        btnTerror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerrorActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, -1));

        btnComedia.setBackground(new java.awt.Color(0, 0, 102));
        btnComedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComedia.setForeground(new java.awt.Color(255, 255, 255));
        btnComedia.setText("Comedia");
        btnComedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComediaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, -1));

        btnAventura.setBackground(new java.awt.Color(0, 0, 102));
        btnAventura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAventura.setForeground(new java.awt.Color(255, 255, 255));
        btnAventura.setText("Aventura");
        btnAventura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAventuraActionPerformed(evt);
            }
        });
        getContentPane().add(btnAventura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, -1));

        btnFavoritos1.setBackground(new java.awt.Color(0, 0, 102));
        btnFavoritos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFavoritos1.setForeground(new java.awt.Color(255, 255, 255));
        btnFavoritos1.setText("Favoritos");
        btnFavoritos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnFavoritos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        btnAccion1.setBackground(new java.awt.Color(0, 0, 102));
        btnAccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAccion1.setForeground(new java.awt.Color(255, 255, 255));
        btnAccion1.setText("Accion");
        btnAccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccion1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 102));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 170, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(PeliculasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 430, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTerrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerrorActionPerformed
        BuscarPelicula.setText("");
        this.buscarGenero("Terror");
    }//GEN-LAST:event_btnTerrorActionPerformed

    private void btnComediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComediaActionPerformed
        BuscarPelicula.setText("");
        this.buscarGenero("Comedia");
    }//GEN-LAST:event_btnComediaActionPerformed

    private void btnAventuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAventuraActionPerformed
        BuscarPelicula.setText("");
        this.buscarGenero("Aventura");
    }//GEN-LAST:event_btnAventuraActionPerformed

    private void BuscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarPeliculaActionPerformed
    private void llenarPanel(List<PeliculaDTO> listaPeliculas) {
        PeliculasPanel.removeAll();
        PeliculasPanel.revalidate(); // Valida el panel para que se redibuje correctamente
        PeliculasPanel.repaint();
        for (PeliculaDTO pelicula : listaPeliculas) {
            BufferedImage image = null;
            try {
                image = ImageIO.read(new ByteArrayInputStream(pelicula.getImg())); // Cambia "imagen.jpg" por la ruta de tu imagen
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Crea un ImageButton con la imagen cargada
            ImageButton button = new ImageButton(image, pelicula.getNombre());
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Accede al nombre del botón y muéstralo
                    String nombreBoton = button.getNombre();
                    JOptionPane.showMessageDialog(null, "Se hizo clic en el botón: " + nombreBoton);
                }
            });
            PeliculasPanel.add(createButtonPanel(button));
            System.out.println(pelicula.getNombre());
        }
    }

    class ImageButton extends JButton {

        private BufferedImage image;
        private String nombre;

        public ImageButton(BufferedImage image, String nombre) {
            this.image = image;
            this.nombre = nombre;
            if (image != null) {
                setPreferredSize(new Dimension(120, 170));
            }
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, null);
            }
        }
    }
    private void BuscarPeliculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarPeliculaKeyReleased
        if (BuscarPelicula.getText().isBlank()) {
            //llenarTabla();

            return;
        }
        List<PeliculaDTO> peliculas = funcionalidadConsultarPeliculas.consultarPeliculasPorNombre(BuscarPelicula.getText());
        for (PeliculaDTO pelicula : peliculas) {
            System.out.println(pelicula.getNombre());
        }
    }//GEN-LAST:event_BuscarPeliculaKeyReleased

    private void btnFavoritos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavoritos1ActionPerformed

    private void btnAccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccion1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        FormAgregarPelicula p = new FormAgregarPelicula();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void buscarGenero(String nombre) {
        List<PeliculaDTO> listaPeliculas = funcionalidadConsultarPeliculasPorGenero.consultarPeliculas(nombre);
        llenarPanel(listaPeliculas);
    }
// Método para crear un panel que contenga un botón con FlowLayout
    private JPanel createButtonPanel(JButton button) {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // FlowLayout centrado sin espaciado
        buttonPanel.add(button);
        return buttonPanel;
    }
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
            java.util.logging.Logger.getLogger(FormBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarPelicula().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarPelicula;
    private javax.swing.JPanel PeliculasPanel;
    private javax.swing.JButton btnAccion1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAventura;
    private javax.swing.JButton btnComedia;
    private javax.swing.JButton btnFavoritos1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerror;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}