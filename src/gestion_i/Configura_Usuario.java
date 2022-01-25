/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlab_i;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Configura_Usuario extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(); 

    
    public Configura_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        txt_ID = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtPermisoAcceso = new javax.swing.JTextField();
        lblDiablo = new javax.swing.JLabel();
        lblElaboradoPor = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        lbl_ID = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        lblNivel_Acceso = new javax.swing.JLabel();
        lblCargar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 485, 143));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 245, 30, 28));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 245, 122, 28));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 245, 47, 28));
        getContentPane().add(txtPermisoAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 245, 33, 28));

        lblDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(lblDiablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 487, -1, -1));

        lblElaboradoPor.setText("Elaborado por: imosquerad@yahoo.com.mx");
        getContentPane().add(lblElaboradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 496, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 390, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 390, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 383, -1, -1));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 26, -1, -1));

        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 279, -1, -1));

        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 279, -1, -1));

        lblClave.setText("Clave");
        getContentPane().add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 279, -1, -1));

        lblNivel_Acceso.setText("Nivel Acceso");
        getContentPane().add(lblNivel_Acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 279, -1, -1));

        lblCargar.setText("Carga todo los Usuarios de la Base de Datos");
        getContentPane().add(lblCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_1090_698.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Administrador construccion = new Administrador();
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        Cargar();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        mouseClick();
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Configura_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configura_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configura_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configura_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configura_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargar;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblDiablo;
    private javax.swing.JLabel lblElaboradoPor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNivel_Acceso;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtPermisoAcceso;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_ID;
    // End of variables declaration//GEN-END:variables

    public void Cargar() {

        try {
            tablaUsuario.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
            // PreparedStatement pst = cn.prepareStatement("insert into Usuario values(?,?,?,?)");

            String sql = "SELECT ID, Nombre, Clave, Nivel_Acceso FROM Usuario";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Clave");
            modelo.addColumn("Nivel Acceso");

            int[] anchos = {10, 100, 10, 10};
            for (int i = 0; i < tablaUsuario.getColumnCount(); i++) {
                tablaUsuario.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    public void mouseClick() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            int Fila = tablaUsuario.getSelectedRow();
            String codigo = tablaUsuario.getValueAt(Fila, 0).toString();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");

            ps = cn.prepareStatement("SELECT ID, Nombre, Clave, Nivel_Acceso  FROM Usuario WHERE ID=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                txt_ID.setText(rs.getString("ID"));
                txtUsuario.setText(rs.getString("Nombre"));
                txtClave.setText(rs.getString("Clave"));
                txtPermisoAcceso.setText(rs.getString("Nivel_Acceso"));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    /*public void Guardar() {
        PreparedStatement ps = null;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");

            ps = cn.prepareStatement("SELECT ID, Nombre, Clave, Nivel_Acceso  FROM Usuario WHERE ID= ?");

            ps.setString(1, txt_ID.getText());
            ps.setString(2, txtUsuario.getText());
            ps.setString(3, txtClave.getText());
            ps.setString(4, txtPermisoAcceso.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Usuario Guardado");
            Object[] fila = new Object[4];
            fila[0] = txt_ID.getText();
            fila[1] = txtUsuario.getText();
            fila[2] = txtClave.getText();
            fila[3] = txtPermisoAcceso.getText();
            modelo.addRow(fila);

            limpiar();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }*/
    
    public void Eliminar(){
         PreparedStatement ps = null;
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
            
            int Fila = tablaUsuario.getSelectedRow();
            String ID = tablaUsuario.getValueAt(Fila, 0).toString();

            ps = cn.prepareStatement("DELETE FROM Usuario WHERE ID=?");
            ps.setString(1, ID);
            ps.execute();

            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            limpiar();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public void Modificar(){
        int Fila = tablaUsuario.getSelectedRow();
        PreparedStatement ps = null;
        try{
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
          
            ps = cn.prepareStatement("UPDATE Usuario SET Nombre=?, Clave=?, Nivel_Acceso=? WHERE ID=?"); 
            
            ps.setString(1, txtUsuario.getText());
            ps.setString(2, txtClave.getText());
            ps.setString(3, txtPermisoAcceso.getText());
            ps.setString(4, txt_ID.getText());

            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario Modificado");
            tablaUsuario.setValueAt(txt_ID.getText(), Fila, 0);
            tablaUsuario.setValueAt(txtUsuario.getText(), Fila, 1);
            tablaUsuario.setValueAt(txtClave.getText(), Fila, 2);
            tablaUsuario.setValueAt(txtPermisoAcceso.getText(), Fila, 3);

            limpiar();
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void limpiar() {
        txt_ID.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
        txtPermisoAcceso.setText("");
    }

}
