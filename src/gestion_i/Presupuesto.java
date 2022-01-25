package gestionlab_i;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Presupuesto extends javax.swing.JFrame {

    DefaultListModel lista = new DefaultListModel();
    

    public Presupuesto() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_a_1.png")).getImage());
        lista = new DefaultListModel();
        listaPresupuesto.setModel(lista);
        
        
        LeeArchivoTxt();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        listadatos = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPresupuesto = new javax.swing.JList<>();
        lblClickSeleccion = new javax.swing.JLabel();
        btnEliminaItem = new javax.swing.JButton();
        lblDiablo = new javax.swing.JLabel();
        btnCalculaPresupuesto = new javax.swing.JButton();
        btnGeneraPDF = new javax.swing.JButton();
        lblElaboradoPor = new javax.swing.JLabel();
        lblTituloPrecioAnalisis = new javax.swing.JLabel();
        btnRegresarPrincipal = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRESUPUESTO");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listadatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listadatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadatosMouseClicked(evt);
            }
        });
        listadatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listadatosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listadatos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, 791, 285));

        jScrollPane1.setViewportView(listaPresupuesto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 379, 791, 168));

        lblClickSeleccion.setForeground(java.awt.Color.black);
        lblClickSeleccion.setText("Presionar un Click para seleccionar Item");
        getContentPane().add(lblClickSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 343, -1, -1));

        btnEliminaItem.setForeground(java.awt.Color.black);
        btnEliminaItem.setText("Eliminar Item");
        btnEliminaItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnEliminaItemItemStateChanged(evt);
            }
        });
        btnEliminaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminaItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        lblDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(lblDiablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 606, -1, -1));

        btnCalculaPresupuesto.setForeground(java.awt.Color.black);
        btnCalculaPresupuesto.setText("Calcular Presupuesto");
        getContentPane().add(btnCalculaPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        btnGeneraPDF.setForeground(java.awt.Color.black);
        btnGeneraPDF.setText("Generar PDF");
        getContentPane().add(btnGeneraPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, -1, -1));

        lblElaboradoPor.setForeground(java.awt.Color.black);
        lblElaboradoPor.setText("Elaborado por: imosquerad@yahoo.com.mx");
        getContentPane().add(lblElaboradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 606, -1, -1));

        lblTituloPrecioAnalisis.setForeground(java.awt.Color.black);
        lblTituloPrecioAnalisis.setText("Precios ANALISIS DE LAB de INGEOMIN");
        getContentPane().add(lblTituloPrecioAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));

        btnRegresarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresarPrincipal.setText("Principal");
        btnRegresarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_1200_700.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaItemActionPerformed
         String elimina = null;
        elimina = listaPresupuesto.getSelectedValue().toString();
        lista.removeElement(elimina);
        EscribeArchivoTxt();
    }//GEN-LAST:event_btnEliminaItemActionPerformed

    private void listadatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listadatosValueChanged


    }//GEN-LAST:event_listadatosValueChanged

    private void listadatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadatosMouseClicked
        String mensaje = null;
        mensaje = listadatos.getSelectedValue().toString();
        lista.addElement(mensaje);
        EscribeArchivoTxt();
    }//GEN-LAST:event_listadatosMouseClicked

    private void btnEliminaItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnEliminaItemItemStateChanged

    }//GEN-LAST:event_btnEliminaItemItemStateChanged

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
        
       /*Presupuesto construccion = new Presupuesto();
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);*/

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Presupuesto().setVisible(true);
            }
        });
    }

    //  ImageIcon = new ImageIcon(ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_a_1.png")).getImage());

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculaPresupuesto;
    private javax.swing.JButton btnEliminaItem;
    private javax.swing.JButton btnGeneraPDF;
    private javax.swing.JButton btnRegresarPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblClickSeleccion;
    private javax.swing.JLabel lblDiablo;
    private javax.swing.JLabel lblElaboradoPor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTituloPrecioAnalisis;
    private javax.swing.JList<String> listaPresupuesto;
    private javax.swing.JList<String> listadatos;
    // End of variables declaration//GEN-END:variables

    public void LeeArchivoTxt() {

        BufferedReader almacenamiento;
        String cadena;
        try {
            almacenamiento = new BufferedReader(new java.io.FileReader("BasesDatosTXT/PrecioAnalisis.txt"));
            cadena = "";
            DefaultListModel lista = new DefaultListModel();
            lista.addElement("LISTA DE PRECIO 2020");
            while (cadena != null) {
                //s=linea.split(";");
                cadena = almacenamiento.readLine();
                lista.addElement(cadena);  // ojo investigar + sobre .split **** .split(" ")    
            }
            listadatos.setModel(lista);
            almacenamiento.close();
        } catch (IOException e) {
        } finally {
            try {
            } catch (Exception e2) {
            }
        }
        
    }

    public void EscribeArchivoTxt() {
        String mensaje = null;
        mensaje = listadatos.getSelectedValue();
        File archivo = new File("BasesDatos/PresupuestoTemp.txt");
        FileWriter escribir;
        try {
            escribir = new FileWriter(archivo, true);
            escribir.write(mensaje);
            escribir.write("\r\n");
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Presupuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}

