
package gestionlab_i;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;


public class Nuevo_Ingreso extends javax.swing.JFrame {
    public String usuario, clave_1, clave_2, nivel_Acceso;
    
    public Nuevo_Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        passwordUsuario_1 = new javax.swing.JPasswordField();
        passwordUsuario_2 = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblClave_1 = new javax.swing.JLabel();
        lblClave_2 = new javax.swing.JLabel();
        lblAsterisco_1 = new javax.swing.JLabel();
        lblAsterisco_2 = new javax.swing.JLabel();
        lblAsterisco_3 = new javax.swing.JLabel();
        lblCamposObliga = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblElaboradoPor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPermisoAcceso = new javax.swing.JTextField();
        lblTituloUsuario = new javax.swing.JLabel();
        lblIngresaNivelAcceso = new javax.swing.JLabel();
        lblAsterisco_4 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USUARIO NUEVO");
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(39, 88, 125, 29);
        getContentPane().add(passwordUsuario_1);
        passwordUsuario_1.setBounds(39, 156, 125, 29);
        getContentPane().add(passwordUsuario_2);
        passwordUsuario_2.setBounds(39, 219, 125, 29);

        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(39, 127, 90, 15);

        lblClave_1.setText("Ingresar Clave");
        getContentPane().add(lblClave_1);
        lblClave_1.setBounds(39, 196, 102, 15);

        lblClave_2.setText("Confirmar Clave");
        getContentPane().add(lblClave_2);
        lblClave_2.setBounds(39, 259, 111, 15);

        lblAsterisco_1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAsterisco_1.setForeground(java.awt.Color.red);
        lblAsterisco_1.setText("*");
        getContentPane().add(lblAsterisco_1);
        lblAsterisco_1.setBounds(155, 122, 9, 22);

        lblAsterisco_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAsterisco_2.setForeground(java.awt.Color.red);
        lblAsterisco_2.setText("*");
        getContentPane().add(lblAsterisco_2);
        lblAsterisco_2.setBounds(153, 191, 9, 22);

        lblAsterisco_3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAsterisco_3.setForeground(java.awt.Color.red);
        lblAsterisco_3.setText("*");
        getContentPane().add(lblAsterisco_3);
        lblAsterisco_3.setBounds(156, 254, 9, 22);

        lblCamposObliga.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblCamposObliga.setForeground(java.awt.Color.red);
        lblCamposObliga.setText("* Campos Obligatorios");
        getContentPane().add(lblCamposObliga);
        lblCamposObliga.setBounds(183, 294, 124, 13);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(70, 380, 155, 33);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(350, 380, 131, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 480, 29, 24);

        lblElaboradoPor.setText("Elaborado por: imosquerad@yahoo.com.mx");
        getContentPane().add(lblElaboradoPor);
        lblElaboradoPor.setBounds(90, 490, 306, 15);

        jLabel2.setText("Permiso de Acceso al Sistema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 46, 210, 15);

        jLabel3.setText("1 Nivel Base");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(299, 88, 85, 15);

        jLabel4.setText("2 Nivel Medio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(299, 120, 93, 15);

        jLabel5.setText("3 Nivel Administrador");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(299, 147, 150, 15);
        getContentPane().add(txtPermisoAcceso);
        txtPermisoAcceso.setBounds(335, 170, 37, 30);

        lblTituloUsuario.setText("Configurar Usuario");
        getContentPane().add(lblTituloUsuario);
        lblTituloUsuario.setBounds(39, 46, 134, 15);

        lblIngresaNivelAcceso.setText("Ingresa Nivel de Acceso");
        getContentPane().add(lblIngresaNivelAcceso);
        lblIngresaNivelAcceso.setBounds(282, 211, 167, 15);

        lblAsterisco_4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAsterisco_4.setForeground(java.awt.Color.red);
        lblAsterisco_4.setText("*");
        getContentPane().add(lblAsterisco_4);
        lblAsterisco_4.setBounds(455, 206, 9, 22);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_1090_698.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 560, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Administrador construccion = new Administrador();
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registrar_Usuario();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Nuevo_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevo_Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAsterisco_1;
    private javax.swing.JLabel lblAsterisco_2;
    private javax.swing.JLabel lblAsterisco_3;
    private javax.swing.JLabel lblAsterisco_4;
    private javax.swing.JLabel lblCamposObliga;
    private javax.swing.JLabel lblClave_1;
    private javax.swing.JLabel lblClave_2;
    private javax.swing.JLabel lblElaboradoPor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIngresaNivelAcceso;
    private javax.swing.JLabel lblTituloUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField passwordUsuario_1;
    private javax.swing.JPasswordField passwordUsuario_2;
    private javax.swing.JTextField txtPermisoAcceso;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void Registrar_Usuario(){
    
        
        usuario = txtUsuario.getText().trim();
        String clave_1 = new String(passwordUsuario_1.getPassword());
        String clave_2 = new String(passwordUsuario_2.getPassword());
        nivel_Acceso = txtPermisoAcceso.getText().trim();
        
        if(clave_2.equals(clave_1)){
                
            }else{
            JOptionPane.showMessageDialog(null, "Las claves no son iguales");
            LimpiarUsuario();
            Registrar_Usuario();
        }
        
        if (usuario.equals("") || clave_1.equals("") || clave_2.equals("") ||nivel_Acceso.equals("") ) {
 
                if (usuario.equals("")) {
                  txtUsuario.setBackground(Color.red);
                }
                if (clave_1.equals("")) {
                  passwordUsuario_1.setBackground(Color.red);
                }
                if (clave_2.equals("")) {
                  passwordUsuario_2.setBackground(Color.red);
                }
                if (nivel_Acceso.equals("")) {
                  txtPermisoAcceso.setBackground(Color.red);
                }
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            LimpiarUsuario();
                
        }else{
               
            try{
               
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
              PreparedStatement pst = cn.prepareStatement("insert into Usuario values(?,?,?,?)");
              
              pst.setString(1, "0");
              pst.setString(2, usuario); 
              pst.setString(3, clave_1); 
              pst.setString(4, nivel_Acceso);
              pst.executeUpdate();
               
              LimpiarUsuario();
              JOptionPane.showMessageDialog(null, "Registro Exitoso");
              
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, " Error en coneccion " + e);
            }
        }
        //}
}
    
    public void LimpiarUsuario(){
        txtUsuario.setText("");
        txtUsuario.setBackground(new Color(238, 238,238));
        passwordUsuario_1.setText("");
        passwordUsuario_1.setBackground(new Color(238, 238,238));
        passwordUsuario_2.setText("");
        passwordUsuario_2.setBackground(new Color(238, 238,238));
        txtPermisoAcceso.setText("");
        txtPermisoAcceso.setBackground(new Color(238, 238,238));
    }

}
