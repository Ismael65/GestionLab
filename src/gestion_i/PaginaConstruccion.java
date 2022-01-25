
package gestionlab_i;

/**
 *
 * @author ismael
 */
public class PaginaConstruccion extends javax.swing.JFrame {

    /**
     * Creates new form PaginaConstruccion
     */
    public PaginaConstruccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiablo = new javax.swing.JLabel();
        lblElaboradoPor = new javax.swing.JLabel();
        lblPaginaConstruccion = new javax.swing.JLabel();
        lblObrero = new javax.swing.JLabel();
        btnRegresarPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N

        lblElaboradoPor.setText("Elaborado por: imosquerad@yahoo.com.mx");

        lblPaginaConstruccion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPaginaConstruccion.setForeground(new java.awt.Color(244, 4, 7));
        lblPaginaConstruccion.setText("Pagina en Construcción");

        lblObrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obrero.png"))); // NOI18N

        btnRegresarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresarPrincipal.setText("Principal");
        btnRegresarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblObrero))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPaginaConstruccion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDiablo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblElaboradoPor)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresarPrincipal)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblObrero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPaginaConstruccion)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiablo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblElaboradoPor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPrincipalActionPerformed
        Principal construccion = new Principal();
        construccion.setBounds(0, 0, 1082, 656);
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
/*PaginaConstruccion construccion = new PaginaConstruccion();
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PaginaConstruccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarPrincipal;
    private javax.swing.JLabel lblDiablo;
    private javax.swing.JLabel lblElaboradoPor;
    private javax.swing.JLabel lblObrero;
    private javax.swing.JLabel lblPaginaConstruccion;
    // End of variables declaration//GEN-END:variables
}
