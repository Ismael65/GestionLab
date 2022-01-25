
package gestionlab_i;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import static gestionlab_i.TabPerioEleme.elemento;
//import static gestionlab_i.TabPerioEleme.elementoE;
import java.sql.*;



public class TablaPeriodicaMuestras extends javax.swing.JFrame {
    
    DefaultListModel elemento = new DefaultListModel();
    String elementoQ;
    
    
    public TablaPeriodicaMuestras() {
        initComponents();
        
        elemento = new DefaultListModel();
        listaElementos.setModel(elemento);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloTablaPeriodica = new javax.swing.JLabel();
        txtF_H = new javax.swing.JTextField();
        txtF_Li = new javax.swing.JTextField();
        txtF_Na = new javax.swing.JTextField();
        txtF_K = new javax.swing.JTextField();
        txtF_Cs = new javax.swing.JTextField();
        txtF_Fr = new javax.swing.JTextField();
        txtF_Rb = new javax.swing.JTextField();
        txtF_Mg = new javax.swing.JTextField();
        txtF_Ca = new javax.swing.JTextField();
        txtF_Ba = new javax.swing.JTextField();
        txtF_Ra = new javax.swing.JTextField();
        txtF_Sr = new javax.swing.JTextField();
        txtF_Be = new javax.swing.JTextField();
        txtF_Sc = new javax.swing.JTextField();
        txtF_Lu = new javax.swing.JTextField();
        txtF_Lr = new javax.swing.JTextField();
        txtF_Y = new javax.swing.JTextField();
        txtF_Ti = new javax.swing.JTextField();
        txtF_Hf = new javax.swing.JTextField();
        txtF_Rf = new javax.swing.JTextField();
        txtF_Zr = new javax.swing.JTextField();
        txtF_V = new javax.swing.JTextField();
        txtF_Mn = new javax.swing.JTextField();
        txtF_Ta = new javax.swing.JTextField();
        txtF_Re = new javax.swing.JTextField();
        txtF_Db = new javax.swing.JTextField();
        txtF_Bh = new javax.swing.JTextField();
        txtF_Nb = new javax.swing.JTextField();
        txtF_Tc = new javax.swing.JTextField();
        txtF_Fe = new javax.swing.JTextField();
        txtF_Cr = new javax.swing.JTextField();
        txtF_Os = new javax.swing.JTextField();
        txtF_W = new javax.swing.JTextField();
        txtF_Hs = new javax.swing.JTextField();
        txtF_Sg = new javax.swing.JTextField();
        txtF_Ru = new javax.swing.JTextField();
        txtF_Mo = new javax.swing.JTextField();
        txtF_Tl = new javax.swing.JTextField();
        txtF_Co = new javax.swing.JTextField();
        txtF_Ir = new javax.swing.JTextField();
        txtF_Mt = new javax.swing.JTextField();
        txtF_Nh = new javax.swing.JTextField();
        txtF_Rh = new javax.swing.JTextField();
        txtF_In = new javax.swing.JTextField();
        txtF_Ni = new javax.swing.JTextField();
        txtF_Pt = new javax.swing.JTextField();
        txtF_Ge = new javax.swing.JTextField();
        txtF_Ds = new javax.swing.JTextField();
        txtF_Pd = new javax.swing.JTextField();
        txtF_Pb = new javax.swing.JTextField();
        txtF_Fl = new javax.swing.JTextField();
        txtF_Cu = new javax.swing.JTextField();
        txtF_Au = new javax.swing.JTextField();
        txtF_Sn = new javax.swing.JTextField();
        txtF_Rg = new javax.swing.JTextField();
        txtF_Ag = new javax.swing.JTextField();
        txtF_Zn = new javax.swing.JTextField();
        txtF_Hg = new javax.swing.JTextField();
        txtF_Cn = new javax.swing.JTextField();
        txtF_Cd = new javax.swing.JTextField();
        txtF_Ga = new javax.swing.JTextField();
        txtF_Bi = new javax.swing.JTextField();
        txtF_Mc = new javax.swing.JTextField();
        txtF_Sb = new javax.swing.JTextField();
        txtF_Se = new javax.swing.JTextField();
        txtF_Po = new javax.swing.JTextField();
        txtF_Lv = new javax.swing.JTextField();
        txtF_Te = new javax.swing.JTextField();
        txtF_Br = new javax.swing.JTextField();
        txtF_At = new javax.swing.JTextField();
        txtF_Ts = new javax.swing.JTextField();
        txtF_I = new javax.swing.JTextField();
        txtF_Kr = new javax.swing.JTextField();
        txtF_Rn = new javax.swing.JTextField();
        txtF_Og = new javax.swing.JTextField();
        txtF_Xe = new javax.swing.JTextField();
        txtF_As = new javax.swing.JTextField();
        txtF_N = new javax.swing.JTextField();
        txtF_P = new javax.swing.JTextField();
        txtF_O = new javax.swing.JTextField();
        txtF_S = new javax.swing.JTextField();
        txtF_F = new javax.swing.JTextField();
        txtF_Cl = new javax.swing.JTextField();
        txtF_Ne = new javax.swing.JTextField();
        txtF_Ar = new javax.swing.JTextField();
        txtF_He = new javax.swing.JTextField();
        txtF_Si = new javax.swing.JTextField();
        txtF_B = new javax.swing.JTextField();
        txtF_Al = new javax.swing.JTextField();
        txtF_C = new javax.swing.JTextField();
        txtF_La = new javax.swing.JTextField();
        txtF_Pr = new javax.swing.JTextField();
        txtF_Sm = new javax.swing.JTextField();
        txtF_Pu = new javax.swing.JTextField();
        txtF_Dy = new javax.swing.JTextField();
        txtF_Cf = new javax.swing.JTextField();
        txtF_Ac = new javax.swing.JTextField();
        txtF_Eu = new javax.swing.JTextField();
        txtF_Pa = new javax.swing.JTextField();
        txtF_Am = new javax.swing.JTextField();
        txtF_Nd = new javax.swing.JTextField();
        txtF_Ce = new javax.swing.JTextField();
        txtF_U = new javax.swing.JTextField();
        txtF_Th = new javax.swing.JTextField();
        txtF_Gd = new javax.swing.JTextField();
        txtF_Cm = new javax.swing.JTextField();
        txtF_Ho = new javax.swing.JTextField();
        txtF_Es = new javax.swing.JTextField();
        txtF_Er = new javax.swing.JTextField();
        txtF_Fm = new javax.swing.JTextField();
        txtF_Tm = new javax.swing.JTextField();
        txtF_Md = new javax.swing.JTextField();
        txtF_Tb = new javax.swing.JTextField();
        txtF_Pm = new javax.swing.JTextField();
        txtF_Np = new javax.swing.JTextField();
        txtF_Bk = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaElementos = new javax.swing.JList<>();
        txtF_Yb = new javax.swing.JTextField();
        txtF_No = new javax.swing.JTextField();
        txtF_Vacio1 = new javax.swing.JTextField();
        txtF_Vacio2 = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblDiablo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(688, 520));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloTablaPeriodica.setText("TABLA PERIODICA DE ELEMENTOS QUIMICOS");
        getContentPane().add(lblTituloTablaPeriodica, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 12, -1, -1));

        txtF_H.setEditable(false);
        txtF_H.setBackground(new java.awt.Color(51, 204, 0));
        txtF_H.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_H.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_H.setText("H");
        txtF_H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_H, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 123, 30, 30));

        txtF_Li.setEditable(false);
        txtF_Li.setBackground(new java.awt.Color(255, 0, 0));
        txtF_Li.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Li.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Li.setText("Li");
        txtF_Li.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_LiMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Li, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 159, 30, 30));

        txtF_Na.setEditable(false);
        txtF_Na.setBackground(new java.awt.Color(255, 0, 0));
        txtF_Na.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Na.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Na.setText("Na");
        txtF_Na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Na, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 195, 30, 30));

        txtF_K.setEditable(false);
        txtF_K.setBackground(new java.awt.Color(255, 0, 0));
        txtF_K.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_K.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_K.setText("K");
        txtF_K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_KMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_K, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 231, 30, 30));

        txtF_Cs.setEditable(false);
        txtF_Cs.setBackground(new java.awt.Color(255, 0, 0));
        txtF_Cs.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cs.setText("Cs");
        txtF_Cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 303, 30, 30));

        txtF_Fr.setEditable(false);
        txtF_Fr.setBackground(new java.awt.Color(255, 0, 0));
        txtF_Fr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Fr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Fr.setText("Fr");
        txtF_Fr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Fr, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 339, 30, 30));

        txtF_Rb.setEditable(false);
        txtF_Rb.setBackground(new java.awt.Color(255, 0, 0));
        txtF_Rb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Rb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rb.setText("Rb");
        txtF_Rb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 267, 30, 30));

        txtF_Mg.setEditable(false);
        txtF_Mg.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Mg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Mg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mg.setText("Mg");
        txtF_Mg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Mg, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 195, 30, 30));

        txtF_Ca.setEditable(false);
        txtF_Ca.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Ca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ca.setText("Ca");
        txtF_Ca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 231, 30, 30));

        txtF_Ba.setEditable(false);
        txtF_Ba.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Ba.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ba.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ba.setText("Ba");
        txtF_Ba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 303, 30, 30));

        txtF_Ra.setEditable(false);
        txtF_Ra.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Ra.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ra.setText("Ra");
        txtF_Ra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 339, 30, 30));

        txtF_Sr.setEditable(false);
        txtF_Sr.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Sr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sr.setText("Sr");
        txtF_Sr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 267, 30, 30));

        txtF_Be.setEditable(false);
        txtF_Be.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Be.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Be.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Be.setText("Be");
        txtF_Be.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Be, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 159, 30, 30));

        txtF_Sc.setEditable(false);
        txtF_Sc.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Sc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sc.setText("Sc");
        txtF_Sc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ScMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 231, 30, 30));

        txtF_Lu.setEditable(false);
        txtF_Lu.setBackground(java.awt.Color.pink);
        txtF_Lu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Lu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Lu.setText("Lu");
        txtF_Lu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_LuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Lu, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 381, 30, 30));

        txtF_Lr.setEditable(false);
        txtF_Lr.setBackground(java.awt.Color.magenta);
        txtF_Lr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Lr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Lr.setText("Lr");
        txtF_Lr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_LrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Lr, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 417, 30, 30));

        txtF_Y.setEditable(false);
        txtF_Y.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Y.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Y.setText("Y");
        txtF_Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_YMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 267, 30, 30));

        txtF_Ti.setEditable(false);
        txtF_Ti.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ti.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ti.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ti.setText("Ti");
        txtF_Ti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TiMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ti, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 231, 30, 30));

        txtF_Hf.setEditable(false);
        txtF_Hf.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Hf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hf.setText("Hf");
        txtF_Hf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HfMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Hf, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 303, 30, 30));

        txtF_Rf.setEditable(false);
        txtF_Rf.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Rf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rf.setText("Rf");
        txtF_Rf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RfMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Rf, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 339, 30, 30));

        txtF_Zr.setEditable(false);
        txtF_Zr.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Zr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Zr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Zr.setText("Zr");
        txtF_Zr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ZrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Zr, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 267, 30, 30));

        txtF_V.setEditable(false);
        txtF_V.setBackground(new java.awt.Color(153, 153, 153));
        txtF_V.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_V.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_V.setText("V");
        txtF_V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_VMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 231, 30, 30));

        txtF_Mn.setEditable(false);
        txtF_Mn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Mn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mn.setText("Mn");
        txtF_Mn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MnMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 231, 30, 30));

        txtF_Ta.setEditable(false);
        txtF_Ta.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ta.setText("Ta");
        txtF_Ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 303, 30, 30));

        txtF_Re.setEditable(false);
        txtF_Re.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Re.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Re.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Re.setText("Re");
        txtF_Re.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ReMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Re, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 303, 30, 30));

        txtF_Db.setEditable(false);
        txtF_Db.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Db.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Db.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Db.setText("Db");
        txtF_Db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_DbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Db, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 339, 30, 30));

        txtF_Bh.setEditable(false);
        txtF_Bh.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Bh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Bh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Bh.setText("Bh");
        txtF_Bh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BhMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Bh, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 339, 30, 30));

        txtF_Nb.setEditable(false);
        txtF_Nb.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Nb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Nb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Nb.setText("Nb");
        txtF_Nb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 267, 30, 30));

        txtF_Tc.setEditable(false);
        txtF_Tc.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Tc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Tc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Tc.setText("Tc");
        txtF_Tc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TcMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 267, 30, 30));

        txtF_Fe.setEditable(false);
        txtF_Fe.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Fe.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Fe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Fe.setText("Fe");
        txtF_Fe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Fe, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 231, 30, 30));

        txtF_Cr.setEditable(false);
        txtF_Cr.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cr.setText("Cr");
        txtF_Cr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 231, 30, 30));

        txtF_Os.setEditable(false);
        txtF_Os.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Os.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Os.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Os.setText("Os");
        txtF_Os.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_OsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Os, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 303, 30, 30));

        txtF_W.setEditable(false);
        txtF_W.setBackground(new java.awt.Color(153, 153, 153));
        txtF_W.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_W.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_W.setText("W");
        txtF_W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_WMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_W, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 303, 30, 30));

        txtF_Hs.setEditable(false);
        txtF_Hs.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hs.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Hs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hs.setText("Hs");
        txtF_Hs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Hs, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 339, 30, 30));

        txtF_Sg.setEditable(false);
        txtF_Sg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Sg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sg.setText("Sg");
        txtF_Sg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sg, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 339, 30, 30));

        txtF_Ru.setEditable(false);
        txtF_Ru.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ru.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ru.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ru.setText("Ru");
        txtF_Ru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ru, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 267, 30, 30));

        txtF_Mo.setEditable(false);
        txtF_Mo.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Mo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mo.setText("Mo");
        txtF_Mo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MoMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 267, 30, 30));

        txtF_Tl.setEditable(false);
        txtF_Tl.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Tl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Tl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Tl.setText("Tl");
        txtF_Tl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TlMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Tl, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 303, 30, 30));

        txtF_Co.setEditable(false);
        txtF_Co.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Co.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Co.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Co.setText("Co");
        txtF_Co.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CoMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Co, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 231, 30, 30));

        txtF_Ir.setEditable(false);
        txtF_Ir.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ir.setText("Ir");
        txtF_Ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_IrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ir, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 303, 30, 30));

        txtF_Mt.setEditable(false);
        txtF_Mt.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Mt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mt.setText("Mt");
        txtF_Mt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MtMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 339, 30, 30));

        txtF_Nh.setEditable(false);
        txtF_Nh.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Nh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Nh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Nh.setText("Nh");
        txtF_Nh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NhMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Nh, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 339, 30, 30));

        txtF_Rh.setEditable(false);
        txtF_Rh.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Rh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rh.setText("Rh");
        txtF_Rh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RhMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Rh, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 267, 30, 30));

        txtF_In.setEditable(false);
        txtF_In.setBackground(new java.awt.Color(102, 102, 102));
        txtF_In.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_In.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_In.setText("In");
        txtF_In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_InMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 267, 30, 30));

        txtF_Ni.setEditable(false);
        txtF_Ni.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ni.setText("Ni");
        txtF_Ni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NiMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ni, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 231, 30, 30));

        txtF_Pt.setEditable(false);
        txtF_Pt.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Pt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pt.setText("Pt");
        txtF_Pt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PtMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 303, 30, 30));

        txtF_Ge.setEditable(false);
        txtF_Ge.setBackground(new java.awt.Color(0, 255, 255));
        txtF_Ge.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ge.setText("Ge");
        txtF_Ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_GeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ge, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 231, 30, 30));

        txtF_Ds.setEditable(false);
        txtF_Ds.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ds.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ds.setText("Ds");
        txtF_Ds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_DsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ds, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 339, 30, 30));

        txtF_Pd.setEditable(false);
        txtF_Pd.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Pd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pd.setText("Pd");
        txtF_Pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PdMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 267, 30, 30));

        txtF_Pb.setEditable(false);
        txtF_Pb.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Pb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pb.setText("Pb");
        txtF_Pb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 303, 30, 30));

        txtF_Fl.setEditable(false);
        txtF_Fl.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Fl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Fl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Fl.setText("Fl");
        txtF_Fl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FlMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Fl, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 339, 30, 30));

        txtF_Cu.setEditable(false);
        txtF_Cu.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cu.setText("Cu");
        txtF_Cu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 231, 30, 30));

        txtF_Au.setEditable(false);
        txtF_Au.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Au.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Au.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Au.setText("Au");
        txtF_Au.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Au, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 303, 30, 30));

        txtF_Sn.setEditable(false);
        txtF_Sn.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Sn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sn.setText("Sn");
        txtF_Sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SnMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 267, 30, 30));

        txtF_Rg.setEditable(false);
        txtF_Rg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Rg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rg.setText("Rg");
        txtF_Rg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 339, 30, 30));

        txtF_Ag.setEditable(false);
        txtF_Ag.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ag.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ag.setText("Ag");
        txtF_Ag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 267, 30, 30));

        txtF_Zn.setEditable(false);
        txtF_Zn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Zn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Zn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Zn.setText("Zn");
        txtF_Zn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ZnMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Zn, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 231, 30, 30));

        txtF_Hg.setEditable(false);
        txtF_Hg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hg.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Hg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hg.setText("Hg");
        txtF_Hg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Hg, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 303, 30, 30));

        txtF_Cn.setEditable(false);
        txtF_Cn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cn.setText("Cn");
        txtF_Cn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CnMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 339, 30, 30));

        txtF_Cd.setEditable(false);
        txtF_Cd.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cd.setText("Cd");
        txtF_Cd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CdMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 267, 30, 30));

        txtF_Ga.setEditable(false);
        txtF_Ga.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Ga.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ga.setText("Ga");
        txtF_Ga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_GaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ga, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 231, 30, 30));

        txtF_Bi.setEditable(false);
        txtF_Bi.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Bi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Bi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Bi.setText("Bi");
        txtF_Bi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BiMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Bi, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 303, 30, 30));

        txtF_Mc.setEditable(false);
        txtF_Mc.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Mc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Mc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mc.setText("Mc");
        txtF_Mc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_McMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Mc, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 339, 30, 30));

        txtF_Sb.setEditable(false);
        txtF_Sb.setBackground(new java.awt.Color(0, 255, 255));
        txtF_Sb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sb.setText("Sb");
        txtF_Sb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 267, 30, 30));

        txtF_Se.setEditable(false);
        txtF_Se.setBackground(new java.awt.Color(51, 204, 0));
        txtF_Se.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Se.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Se.setText("Se");
        txtF_Se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Se, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 231, 30, 30));

        txtF_Po.setEditable(false);
        txtF_Po.setBackground(new java.awt.Color(0, 255, 255));
        txtF_Po.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Po.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Po.setText("Po");
        txtF_Po.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PoMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Po, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 303, 30, 30));

        txtF_Lv.setEditable(false);
        txtF_Lv.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Lv.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Lv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Lv.setText("Lv");
        txtF_Lv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_LvMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Lv, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 339, 30, 30));

        txtF_Te.setEditable(false);
        txtF_Te.setBackground(new java.awt.Color(0, 255, 255));
        txtF_Te.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Te.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Te.setText("Te");
        txtF_Te.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Te, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 267, 30, 30));

        txtF_Br.setEditable(false);
        txtF_Br.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Br.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Br.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Br.setText("Br");
        txtF_Br.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Br, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 231, 30, 30));

        txtF_At.setEditable(false);
        txtF_At.setBackground(new java.awt.Color(255, 255, 51));
        txtF_At.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_At.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_At.setText("At");
        txtF_At.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AtMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_At, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 303, 30, 30));

        txtF_Ts.setEditable(false);
        txtF_Ts.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Ts.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ts.setText("Ts");
        txtF_Ts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 339, 30, 30));

        txtF_I.setEditable(false);
        txtF_I.setBackground(new java.awt.Color(255, 255, 51));
        txtF_I.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_I.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_I.setText("I");
        txtF_I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_IMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 267, 30, 30));

        txtF_Kr.setEditable(false);
        txtF_Kr.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Kr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Kr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Kr.setText("Kr");
        txtF_Kr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_KrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Kr, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 231, 30, 30));

        txtF_Rn.setEditable(false);
        txtF_Rn.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Rn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Rn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rn.setText("Rn");
        txtF_Rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RnMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 303, 30, 30));

        txtF_Og.setEditable(false);
        txtF_Og.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Og.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Og.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Og.setText("Og");
        txtF_Og.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_OgMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Og, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 339, 30, 30));

        txtF_Xe.setEditable(false);
        txtF_Xe.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Xe.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Xe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Xe.setText("Xe");
        txtF_Xe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_XeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Xe, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 267, 30, 30));

        txtF_As.setEditable(false);
        txtF_As.setBackground(new java.awt.Color(0, 255, 255));
        txtF_As.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_As.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_As.setText("As");
        txtF_As.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_As, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 231, 30, 30));

        txtF_N.setEditable(false);
        txtF_N.setBackground(new java.awt.Color(51, 204, 0));
        txtF_N.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_N.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_N.setText("N");
        txtF_N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 159, 30, 30));

        txtF_P.setEditable(false);
        txtF_P.setBackground(new java.awt.Color(51, 204, 0));
        txtF_P.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_P.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_P.setText("P");
        txtF_P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 195, 30, 30));

        txtF_O.setEditable(false);
        txtF_O.setBackground(new java.awt.Color(51, 204, 0));
        txtF_O.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_O.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_O.setText("O");
        txtF_O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_OMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_O, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 159, 30, 30));

        txtF_S.setEditable(false);
        txtF_S.setBackground(new java.awt.Color(51, 204, 0));
        txtF_S.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_S.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_S.setText("S");
        txtF_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 195, 30, 30));

        txtF_F.setEditable(false);
        txtF_F.setBackground(new java.awt.Color(255, 255, 51));
        txtF_F.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_F.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_F.setText("F");
        txtF_F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 159, 30, 30));

        txtF_Cl.setEditable(false);
        txtF_Cl.setBackground(new java.awt.Color(255, 255, 51));
        txtF_Cl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cl.setText("Cl");
        txtF_Cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ClMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 195, 30, 30));

        txtF_Ne.setEditable(false);
        txtF_Ne.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Ne.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ne.setText("Ne");
        txtF_Ne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 159, 30, 30));

        txtF_Ar.setEditable(false);
        txtF_Ar.setBackground(new java.awt.Color(204, 204, 204));
        txtF_Ar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ar.setText("Ar");
        txtF_Ar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ArMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ar, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 195, 30, 30));

        txtF_He.setEditable(false);
        txtF_He.setBackground(new java.awt.Color(204, 204, 204));
        txtF_He.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_He.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_He.setText("He");
        txtF_He.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_He, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 123, 30, 30));

        txtF_Si.setEditable(false);
        txtF_Si.setBackground(new java.awt.Color(0, 255, 255));
        txtF_Si.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Si.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Si.setText("Si");
        txtF_Si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SiMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 195, 30, 30));

        txtF_B.setEditable(false);
        txtF_B.setBackground(java.awt.Color.cyan);
        txtF_B.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_B.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_B.setText("B");
        txtF_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 159, 30, 30));

        txtF_Al.setEditable(false);
        txtF_Al.setBackground(new java.awt.Color(102, 102, 102));
        txtF_Al.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Al.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Al.setText("Al");
        txtF_Al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AlMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Al, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 195, 30, 30));

        txtF_C.setEditable(false);
        txtF_C.setBackground(new java.awt.Color(51, 204, 0));
        txtF_C.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_C.setText("C");
        txtF_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 159, 30, 30));

        txtF_La.setEditable(false);
        txtF_La.setBackground(java.awt.Color.pink);
        txtF_La.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_La.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_La.setText("La");
        txtF_La.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_LaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_La, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 381, 30, 30));

        txtF_Pr.setEditable(false);
        txtF_Pr.setBackground(java.awt.Color.pink);
        txtF_Pr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pr.setText("Pr");
        txtF_Pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PrMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 381, 30, 30));

        txtF_Sm.setEditable(false);
        txtF_Sm.setBackground(java.awt.Color.pink);
        txtF_Sm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Sm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sm.setText("Sm");
        txtF_Sm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_SmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Sm, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 381, 30, 30));

        txtF_Pu.setEditable(false);
        txtF_Pu.setBackground(java.awt.Color.magenta);
        txtF_Pu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pu.setText("Pu");
        txtF_Pu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pu, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 417, 30, 30));

        txtF_Dy.setEditable(false);
        txtF_Dy.setBackground(java.awt.Color.pink);
        txtF_Dy.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Dy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Dy.setText("Dy");
        txtF_Dy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_DyMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Dy, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 381, 30, 30));

        txtF_Cf.setEditable(false);
        txtF_Cf.setBackground(java.awt.Color.magenta);
        txtF_Cf.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cf.setText("Cf");
        txtF_Cf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CfMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cf, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 417, 30, 30));

        txtF_Ac.setEditable(false);
        txtF_Ac.setBackground(java.awt.Color.magenta);
        txtF_Ac.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ac.setText("Ac");
        txtF_Ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AcMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 417, 30, 30));

        txtF_Eu.setEditable(false);
        txtF_Eu.setBackground(java.awt.Color.pink);
        txtF_Eu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Eu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Eu.setText("Eu");
        txtF_Eu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_EuMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Eu, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 381, 30, 30));

        txtF_Pa.setEditable(false);
        txtF_Pa.setBackground(java.awt.Color.magenta);
        txtF_Pa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pa.setText("Pa");
        txtF_Pa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PaMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 417, 30, 30));

        txtF_Am.setEditable(false);
        txtF_Am.setBackground(java.awt.Color.magenta);
        txtF_Am.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Am.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Am.setText("Am");
        txtF_Am.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Am, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 417, 30, 30));

        txtF_Nd.setEditable(false);
        txtF_Nd.setBackground(java.awt.Color.pink);
        txtF_Nd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Nd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Nd.setText("Nd");
        txtF_Nd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NdMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 381, 30, 30));

        txtF_Ce.setEditable(false);
        txtF_Ce.setBackground(java.awt.Color.pink);
        txtF_Ce.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ce.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ce.setText("Ce");
        txtF_Ce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CeMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 381, 30, 30));

        txtF_U.setEditable(false);
        txtF_U.setBackground(java.awt.Color.magenta);
        txtF_U.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_U.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_U.setText("U");
        txtF_U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_UMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 417, 30, 30));

        txtF_Th.setEditable(false);
        txtF_Th.setBackground(java.awt.Color.magenta);
        txtF_Th.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Th.setText("Th");
        txtF_Th.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ThMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Th, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 417, 30, 30));

        txtF_Gd.setEditable(false);
        txtF_Gd.setBackground(java.awt.Color.pink);
        txtF_Gd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Gd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Gd.setText("Gd");
        txtF_Gd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_GdMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Gd, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 381, 30, 30));

        txtF_Cm.setEditable(false);
        txtF_Cm.setBackground(java.awt.Color.magenta);
        txtF_Cm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Cm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cm.setText("Cm");
        txtF_Cm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Cm, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 417, 30, 30));

        txtF_Ho.setEditable(false);
        txtF_Ho.setBackground(java.awt.Color.pink);
        txtF_Ho.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Ho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ho.setText("Ho");
        txtF_Ho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_HoMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Ho, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 381, 30, 30));

        txtF_Es.setEditable(false);
        txtF_Es.setBackground(java.awt.Color.magenta);
        txtF_Es.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Es.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Es.setText("Es");
        txtF_Es.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_EsMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Es, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 417, 30, 30));

        txtF_Er.setEditable(false);
        txtF_Er.setBackground(java.awt.Color.pink);
        txtF_Er.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Er.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Er.setText("Er");
        txtF_Er.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ErMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Er, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 381, 30, 30));

        txtF_Fm.setEditable(false);
        txtF_Fm.setBackground(java.awt.Color.magenta);
        txtF_Fm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Fm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Fm.setText("Fm");
        txtF_Fm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Fm, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 417, 30, 30));

        txtF_Tm.setEditable(false);
        txtF_Tm.setBackground(java.awt.Color.pink);
        txtF_Tm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Tm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Tm.setText("Tm");
        txtF_Tm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Tm, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 381, 30, 30));

        txtF_Md.setEditable(false);
        txtF_Md.setBackground(java.awt.Color.magenta);
        txtF_Md.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Md.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Md.setText("Md");
        txtF_Md.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MdMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Md, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 417, 30, 30));

        txtF_Tb.setEditable(false);
        txtF_Tb.setBackground(java.awt.Color.pink);
        txtF_Tb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Tb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Tb.setText("Tb");
        txtF_Tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 381, 30, 30));

        txtF_Pm.setEditable(false);
        txtF_Pm.setBackground(java.awt.Color.pink);
        txtF_Pm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Pm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pm.setText("Pm");
        txtF_Pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PmMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 381, 30, 30));

        txtF_Np.setEditable(false);
        txtF_Np.setBackground(java.awt.Color.magenta);
        txtF_Np.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Np.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Np.setText("Np");
        txtF_Np.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NpMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Np, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 417, 30, 30));

        txtF_Bk.setEditable(false);
        txtF_Bk.setBackground(java.awt.Color.magenta);
        txtF_Bk.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Bk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Bk.setText("Bk");
        txtF_Bk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_BkMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Bk, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 417, 30, 30));

        listaElementos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        listaElementos.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        listaElementos.setVisibleRowCount(4);
        jScrollPane2.setViewportView(listaElementos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 30, 570, 71));

        txtF_Yb.setEditable(false);
        txtF_Yb.setBackground(java.awt.Color.pink);
        txtF_Yb.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Yb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Yb.setText("Yb");
        txtF_Yb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_YbMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Yb, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 381, 30, 30));

        txtF_No.setEditable(false);
        txtF_No.setBackground(java.awt.Color.magenta);
        txtF_No.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_No.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_No.setText("No");
        txtF_No.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NoMouseClicked(evt);
            }
        });
        getContentPane().add(txtF_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 417, 30, 30));

        txtF_Vacio1.setEditable(false);
        txtF_Vacio1.setBackground(java.awt.Color.pink);
        txtF_Vacio1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Vacio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Vacio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_Vacio1MouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Vacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 303, 30, 30));

        txtF_Vacio2.setEditable(false);
        txtF_Vacio2.setBackground(java.awt.Color.magenta);
        txtF_Vacio2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtF_Vacio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Vacio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_Vacio2MouseClicked(evt);
            }
        });
        getContentPane().add(txtF_Vacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 339, 30, 30));

        btnRegresar.setBackground(new java.awt.Color(76, 108, 7));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaIzq.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        lblDiablo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(lblDiablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_1090_698.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void txtF_HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HMouseClicked
            String mensaje = "H, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
        
    }//GEN-LAST:event_txtF_HMouseClicked

    private void txtF_LiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_LiMouseClicked
        String mensaje = "Li, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_LiMouseClicked

    private void txtF_NaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NaMouseClicked
         String mensaje = "Na, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NaMouseClicked

    private void txtF_KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_KMouseClicked
        String mensaje = "K, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_KMouseClicked

    private void txtF_RbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RbMouseClicked
        String mensaje = "Rb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RbMouseClicked

    private void txtF_CsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CsMouseClicked
        String mensaje = "Cs, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CsMouseClicked

    private void txtF_FrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FrMouseClicked
        String mensaje = "Fr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_FrMouseClicked

    private void txtF_BeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BeMouseClicked
        String mensaje = "Be, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BeMouseClicked

    private void txtF_MgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MgMouseClicked
        String mensaje = "Mg, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_MgMouseClicked

    private void txtF_CaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CaMouseClicked
        String mensaje = "Ca, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CaMouseClicked

    private void txtF_SrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SrMouseClicked
        String mensaje = "Sr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SrMouseClicked

    private void txtF_BaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BaMouseClicked
        String mensaje = "Ba, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BaMouseClicked

    private void txtF_RaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RaMouseClicked
        String mensaje = "Ra, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RaMouseClicked

    private void txtF_ScMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ScMouseClicked
        String mensaje = "Sc, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ScMouseClicked

    private void txtF_YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_YMouseClicked
        String mensaje = "Y, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_YMouseClicked

    private void txtF_LuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_LuMouseClicked
        String mensaje = "Lu, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_LuMouseClicked

    private void txtF_LrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_LrMouseClicked
        String mensaje = "Lr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_LrMouseClicked

    private void txtF_TiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TiMouseClicked
        String mensaje = "Ti, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TiMouseClicked

    private void txtF_ZrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ZrMouseClicked
        String mensaje = "Zr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ZrMouseClicked

    private void txtF_HfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HfMouseClicked
        String mensaje = "Hf, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_HfMouseClicked

    private void txtF_RfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RfMouseClicked
        String mensaje = "Rf, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RfMouseClicked

    private void txtF_VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_VMouseClicked
        String mensaje = "V, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_VMouseClicked

    private void txtF_NbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NbMouseClicked
        String mensaje = "Nb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NbMouseClicked

    private void txtF_TaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TaMouseClicked
        String mensaje = "Ta, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TaMouseClicked

    private void txtF_DbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_DbMouseClicked
        String mensaje = "Db, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_DbMouseClicked

    private void txtF_CrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CrMouseClicked
        String mensaje = "Cr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CrMouseClicked

    private void txtF_MoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MoMouseClicked
        String mensaje = "Mo, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_MoMouseClicked

    private void txtF_WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_WMouseClicked
        String mensaje = "W, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_WMouseClicked

    private void txtF_SgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SgMouseClicked
        String mensaje = "Sg, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SgMouseClicked

    private void txtF_MnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MnMouseClicked
        String mensaje = "Mn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_MnMouseClicked

    private void txtF_TcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TcMouseClicked
        String mensaje = "Tc, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TcMouseClicked

    private void txtF_ReMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ReMouseClicked
        String mensaje = "Re, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ReMouseClicked

    private void txtF_BhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BhMouseClicked
        String mensaje = "Bh, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BhMouseClicked

    private void txtF_FeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FeMouseClicked
        String mensaje = "Fe, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_FeMouseClicked

    private void txtF_RuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RuMouseClicked
        String mensaje = "Ru, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RuMouseClicked

    private void txtF_OsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_OsMouseClicked
        String mensaje = "Os, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_OsMouseClicked

    private void txtF_HsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HsMouseClicked
        String mensaje = "Hs, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_HsMouseClicked

    private void txtF_CoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CoMouseClicked
        String mensaje = "Co, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CoMouseClicked

    private void txtF_RhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RhMouseClicked
        String mensaje = "Rh, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RhMouseClicked

    private void txtF_IrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_IrMouseClicked
        String mensaje = "Ir, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_IrMouseClicked

    private void txtF_MtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MtMouseClicked
        String mensaje = "Mt, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_MtMouseClicked

    private void txtF_NiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NiMouseClicked
        String mensaje = "Ni, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NiMouseClicked

    private void txtF_PdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PdMouseClicked
        String mensaje = "Pd, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PdMouseClicked

    private void txtF_PtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PtMouseClicked
        String mensaje = "Pt, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PtMouseClicked

    private void txtF_DsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_DsMouseClicked
        String mensaje = "Ds, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_DsMouseClicked

    private void txtF_CuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CuMouseClicked
        String mensaje = "Cu, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CuMouseClicked

    private void txtF_AgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AgMouseClicked
        String mensaje = "Ag, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AgMouseClicked

    private void txtF_AuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AuMouseClicked
        String mensaje = "Au, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AuMouseClicked

    private void txtF_RgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RgMouseClicked
        String mensaje = "Rg, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RgMouseClicked

    private void txtF_ZnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ZnMouseClicked
        String mensaje = "Zn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ZnMouseClicked

    private void txtF_CdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CdMouseClicked
        String mensaje = "Cd, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CdMouseClicked

    private void txtF_HgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HgMouseClicked
        String mensaje = "Hg, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_HgMouseClicked

    private void txtF_CnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CnMouseClicked
        String mensaje = "Cn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CnMouseClicked

    private void txtF_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BMouseClicked
        String mensaje = "B, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BMouseClicked

    private void txtF_AlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AlMouseClicked
        String mensaje = "Al, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AlMouseClicked

    private void txtF_GaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_GaMouseClicked
        String mensaje = "Ga, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_GaMouseClicked

    private void txtF_InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_InMouseClicked
        String mensaje = "In, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_InMouseClicked

    private void txtF_TlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TlMouseClicked
        String mensaje = "Tl, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TlMouseClicked

    private void txtF_NhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NhMouseClicked
        String mensaje = "Nh, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NhMouseClicked

    private void txtF_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CMouseClicked
        String mensaje = "C, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CMouseClicked

    private void txtF_SiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SiMouseClicked
        String mensaje = "Si, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SiMouseClicked

    private void txtF_GeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_GeMouseClicked
        String mensaje = "Ge, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_GeMouseClicked

    private void txtF_SnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SnMouseClicked
        String mensaje = "Sn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SnMouseClicked

    private void txtF_PbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PbMouseClicked
        String mensaje = "Pb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PbMouseClicked

    private void txtF_FlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FlMouseClicked
        String mensaje = "Fl, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_FlMouseClicked

    private void txtF_NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NMouseClicked
        String mensaje = "N, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NMouseClicked

    private void txtF_PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PMouseClicked
        String mensaje = "P, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PMouseClicked

    private void txtF_AsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AsMouseClicked
        String mensaje = "As, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AsMouseClicked

    private void txtF_SbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SbMouseClicked
        String mensaje = "Sb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SbMouseClicked

    private void txtF_BiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BiMouseClicked
        String mensaje = "Bi, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BiMouseClicked

    private void txtF_McMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_McMouseClicked
        String mensaje = "Mc, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_McMouseClicked

    private void txtF_OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_OMouseClicked
        String mensaje = "O, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_OMouseClicked

    private void txtF_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SMouseClicked
        String mensaje = "S, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SMouseClicked

    private void txtF_SeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SeMouseClicked
        String mensaje = "Se, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SeMouseClicked

    private void txtF_TeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TeMouseClicked
        String mensaje = "Te, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TeMouseClicked

    private void txtF_PoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PoMouseClicked
        String mensaje = "Po, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PoMouseClicked

    private void txtF_LvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_LvMouseClicked
        String mensaje = "Lv, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_LvMouseClicked

    private void txtF_FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FMouseClicked
        String mensaje = "F, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_FMouseClicked

    private void txtF_ClMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ClMouseClicked
        String mensaje = "Cl, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ClMouseClicked

    private void txtF_BrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BrMouseClicked
        String mensaje = "Br, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BrMouseClicked

    private void txtF_IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_IMouseClicked
        String mensaje = "I, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_IMouseClicked

    private void txtF_AtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AtMouseClicked
        String mensaje = "At, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AtMouseClicked

    private void txtF_TsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TsMouseClicked
        String mensaje = "Ts, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TsMouseClicked

    private void txtF_HeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HeMouseClicked
        String mensaje = "He, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_HeMouseClicked

    private void txtF_NeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NeMouseClicked
        String mensaje = "Ne, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NeMouseClicked

    private void txtF_ArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ArMouseClicked
        String mensaje = "Ar, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ArMouseClicked

    private void txtF_KrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_KrMouseClicked
        String mensaje = "Kr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_KrMouseClicked

    private void txtF_XeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_XeMouseClicked
        String mensaje = "Xe, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_XeMouseClicked

    private void txtF_RnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RnMouseClicked
        String mensaje = "Rn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_RnMouseClicked

    private void txtF_OgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_OgMouseClicked
        String mensaje = "Og, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_OgMouseClicked

    private void txtF_Vacio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_Vacio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_Vacio1MouseClicked

    private void txtF_Vacio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_Vacio2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_Vacio2MouseClicked

    private void txtF_LaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_LaMouseClicked
        String mensaje = "La, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_LaMouseClicked

    private void txtF_CeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CeMouseClicked
        String mensaje = "Ce, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CeMouseClicked

    private void txtF_PrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PrMouseClicked
        String mensaje = "Pr, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PrMouseClicked

    private void txtF_NdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NdMouseClicked
        String mensaje = "Nd, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NdMouseClicked

    private void txtF_PmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PmMouseClicked
        String mensaje = "Pm, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PmMouseClicked

    private void txtF_SmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_SmMouseClicked
        String mensaje = "Sm, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_SmMouseClicked

    private void txtF_EuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_EuMouseClicked
        String mensaje = "Eu, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_EuMouseClicked

    private void txtF_GdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_GdMouseClicked
        String mensaje = "Gd, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_GdMouseClicked

    private void txtF_TbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TbMouseClicked
        String mensaje = "Tb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TbMouseClicked

    private void txtF_DyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_DyMouseClicked
        String mensaje = "Dy, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_DyMouseClicked

    private void txtF_HoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_HoMouseClicked
        String mensaje = "Ho, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_HoMouseClicked

    private void txtF_ErMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ErMouseClicked
        String mensaje = "Er, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ErMouseClicked

    private void txtF_TmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TmMouseClicked
        String mensaje = "Tm, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_TmMouseClicked

    private void txtF_YbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_YbMouseClicked
        String mensaje = "Yb, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_YbMouseClicked

    private void txtF_AcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AcMouseClicked
        String mensaje = "Ac, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AcMouseClicked

    private void txtF_ThMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ThMouseClicked
        String mensaje = "Tn, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_ThMouseClicked

    private void txtF_PaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PaMouseClicked
        String mensaje = "Pa, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PaMouseClicked

    private void txtF_UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_UMouseClicked
        String mensaje = "U, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_UMouseClicked

    private void txtF_NpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NpMouseClicked
        String mensaje = "Np, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NpMouseClicked

    private void txtF_PuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PuMouseClicked
        String mensaje = "Pu, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_PuMouseClicked

    private void txtF_AmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AmMouseClicked
        String mensaje = "Am, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_AmMouseClicked

    private void txtF_CmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CmMouseClicked
        String mensaje = "Cm, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CmMouseClicked

    private void txtF_BkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_BkMouseClicked
        String mensaje = "Bk, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_BkMouseClicked

    private void txtF_CfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CfMouseClicked
        String mensaje = "Cf, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_CfMouseClicked

    private void txtF_EsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_EsMouseClicked
        String mensaje = "Es, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_EsMouseClicked

    private void txtF_FmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FmMouseClicked
        String mensaje = "Fm, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_FmMouseClicked

    private void txtF_MdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MdMouseClicked
        String mensaje = "Md, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_MdMouseClicked

    private void txtF_NoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NoMouseClicked
        String mensaje = "No, ";
        elemento.addElement(mensaje);
        listaElementos.setModel(elemento);
    }//GEN-LAST:event_txtF_NoMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        GuardarElementos();
        
        Cliente_Muestra ventana = new Cliente_Muestra();
        elemento.addElement(elemento);
        listaElementos.setModel(elemento);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(TablaPeriodicaMuestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPeriodicaMuestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPeriodicaMuestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPeriodicaMuestras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TablaPeriodicaMuestras().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiablo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTituloTablaPeriodica;
    private javax.swing.JList<String> listaElementos;
    private javax.swing.JTextField txtF_Ac;
    private javax.swing.JTextField txtF_Ag;
    private javax.swing.JTextField txtF_Al;
    private javax.swing.JTextField txtF_Am;
    private javax.swing.JTextField txtF_Ar;
    private javax.swing.JTextField txtF_As;
    private javax.swing.JTextField txtF_At;
    private javax.swing.JTextField txtF_Au;
    private javax.swing.JTextField txtF_B;
    private javax.swing.JTextField txtF_Ba;
    private javax.swing.JTextField txtF_Be;
    private javax.swing.JTextField txtF_Bh;
    private javax.swing.JTextField txtF_Bi;
    private javax.swing.JTextField txtF_Bk;
    private javax.swing.JTextField txtF_Br;
    private javax.swing.JTextField txtF_C;
    private javax.swing.JTextField txtF_Ca;
    private javax.swing.JTextField txtF_Cd;
    private javax.swing.JTextField txtF_Ce;
    private javax.swing.JTextField txtF_Cf;
    private javax.swing.JTextField txtF_Cl;
    private javax.swing.JTextField txtF_Cm;
    private javax.swing.JTextField txtF_Cn;
    private javax.swing.JTextField txtF_Co;
    private javax.swing.JTextField txtF_Cr;
    private javax.swing.JTextField txtF_Cs;
    private javax.swing.JTextField txtF_Cu;
    private javax.swing.JTextField txtF_Db;
    private javax.swing.JTextField txtF_Ds;
    private javax.swing.JTextField txtF_Dy;
    private javax.swing.JTextField txtF_Er;
    private javax.swing.JTextField txtF_Es;
    private javax.swing.JTextField txtF_Eu;
    private javax.swing.JTextField txtF_F;
    private javax.swing.JTextField txtF_Fe;
    private javax.swing.JTextField txtF_Fl;
    private javax.swing.JTextField txtF_Fm;
    private javax.swing.JTextField txtF_Fr;
    private javax.swing.JTextField txtF_Ga;
    private javax.swing.JTextField txtF_Gd;
    private javax.swing.JTextField txtF_Ge;
    private javax.swing.JTextField txtF_H;
    private javax.swing.JTextField txtF_He;
    private javax.swing.JTextField txtF_Hf;
    private javax.swing.JTextField txtF_Hg;
    private javax.swing.JTextField txtF_Ho;
    private javax.swing.JTextField txtF_Hs;
    private javax.swing.JTextField txtF_I;
    private javax.swing.JTextField txtF_In;
    private javax.swing.JTextField txtF_Ir;
    private javax.swing.JTextField txtF_K;
    private javax.swing.JTextField txtF_Kr;
    private javax.swing.JTextField txtF_La;
    private javax.swing.JTextField txtF_Li;
    private javax.swing.JTextField txtF_Lr;
    private javax.swing.JTextField txtF_Lu;
    private javax.swing.JTextField txtF_Lv;
    private javax.swing.JTextField txtF_Mc;
    private javax.swing.JTextField txtF_Md;
    private javax.swing.JTextField txtF_Mg;
    private javax.swing.JTextField txtF_Mn;
    private javax.swing.JTextField txtF_Mo;
    private javax.swing.JTextField txtF_Mt;
    private javax.swing.JTextField txtF_N;
    private javax.swing.JTextField txtF_Na;
    private javax.swing.JTextField txtF_Nb;
    private javax.swing.JTextField txtF_Nd;
    private javax.swing.JTextField txtF_Ne;
    private javax.swing.JTextField txtF_Nh;
    private javax.swing.JTextField txtF_Ni;
    private javax.swing.JTextField txtF_No;
    private javax.swing.JTextField txtF_Np;
    private javax.swing.JTextField txtF_O;
    private javax.swing.JTextField txtF_Og;
    private javax.swing.JTextField txtF_Os;
    private javax.swing.JTextField txtF_P;
    private javax.swing.JTextField txtF_Pa;
    private javax.swing.JTextField txtF_Pb;
    private javax.swing.JTextField txtF_Pd;
    private javax.swing.JTextField txtF_Pm;
    private javax.swing.JTextField txtF_Po;
    private javax.swing.JTextField txtF_Pr;
    private javax.swing.JTextField txtF_Pt;
    private javax.swing.JTextField txtF_Pu;
    private javax.swing.JTextField txtF_Ra;
    private javax.swing.JTextField txtF_Rb;
    private javax.swing.JTextField txtF_Re;
    private javax.swing.JTextField txtF_Rf;
    private javax.swing.JTextField txtF_Rg;
    private javax.swing.JTextField txtF_Rh;
    private javax.swing.JTextField txtF_Rn;
    private javax.swing.JTextField txtF_Ru;
    private javax.swing.JTextField txtF_S;
    private javax.swing.JTextField txtF_Sb;
    private javax.swing.JTextField txtF_Sc;
    private javax.swing.JTextField txtF_Se;
    private javax.swing.JTextField txtF_Sg;
    private javax.swing.JTextField txtF_Si;
    private javax.swing.JTextField txtF_Sm;
    private javax.swing.JTextField txtF_Sn;
    private javax.swing.JTextField txtF_Sr;
    private javax.swing.JTextField txtF_Ta;
    private javax.swing.JTextField txtF_Tb;
    private javax.swing.JTextField txtF_Tc;
    private javax.swing.JTextField txtF_Te;
    private javax.swing.JTextField txtF_Th;
    private javax.swing.JTextField txtF_Ti;
    private javax.swing.JTextField txtF_Tl;
    private javax.swing.JTextField txtF_Tm;
    private javax.swing.JTextField txtF_Ts;
    private javax.swing.JTextField txtF_U;
    private javax.swing.JTextField txtF_V;
    private javax.swing.JTextField txtF_Vacio1;
    private javax.swing.JTextField txtF_Vacio2;
    private javax.swing.JTextField txtF_W;
    private javax.swing.JTextField txtF_Xe;
    private javax.swing.JTextField txtF_Y;
    private javax.swing.JTextField txtF_Yb;
    private javax.swing.JTextField txtF_Zn;
    private javax.swing.JTextField txtF_Zr;
    // End of variables declaration//GEN-END:variables


public void GuardarElementos(){
    //String elementoQ = "";
    
    try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_GestionLab", "root", "");
              PreparedStatement pst = cn.prepareStatement("insert into Muestra set ElementosQuimicos = ?");
// "UPDATE Usuario SET Nombre=?, Clave=?, Nivel_Acceso=? WHERE ID=?"             
              pst.setString(1, elemento.toString());
              
              pst.executeUpdate();
              }catch (Exception e){
                JOptionPane.showMessageDialog(null, " Error en coneccion " + e);
            }
}

    
}
