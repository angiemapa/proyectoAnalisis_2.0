
package gameland;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import url.conexionBD.Conexion;
import url.controlador.ComprasJpaController;
import url.controlador.ProductoJpaController;
import url.controladorBD.Compras;
import url.controladorBD.Proveedor;
import url.controladorBD.Login;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
    }
    EntityManagerFactory emf = Conexion.obtenerConexion();
    Date date = new Date();
    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
    Proveedor proveedor = new Proveedor();
    Login lg = new Login();
    ComprasJpaController controlCompras = new ComprasJpaController(emf);
    int idcompras=0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanelEstadísticas = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jComboBoxTipoEstadística = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        BotonVer = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        BotonGuardarEstadistica = new javax.swing.JButton();
        jTabbedPaneUsuarios = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        BotonModificar = new javax.swing.JButton();
        PanelModificar = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldContraseñaconfirm = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jComboBoxEstadoUsuario = new javax.swing.JComboBox<>();
        BotonCancelar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldNombreUsuarioNuevo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldCorreoNuevo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldTelefonoNuevo = new javax.swing.JTextField();
        BoxSexoNuevo = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jComboBoxEstadoUsuarioNuevo = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldUsernameNuevo = new javax.swing.JTextField();
        jTextFieldContraseñaNuevaConfirmar = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextFieldContraseñaNueva = new javax.swing.JTextField();
        BoxPrivilegioNuevo = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        BotonCancelarNuevoUsuario = new javax.swing.JButton();
        BotonGuardarNuevoUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCompras = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelEstadísticas = new javax.swing.JLabel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTabbedPane_Compras = new javax.swing.JTabbedPane();
        jPanelAgregarCompra = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelVercompras = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Numerofactura = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelDetallecompra = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Ventas = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        cantidad = new javax.swing.JTextField();
        Renta = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField14 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 640));
        setMinimumSize(new java.awt.Dimension(1020, 640));
        setPreferredSize(new java.awt.Dimension(1020, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vj.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 870, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1000, 460));

        jPanelEstadísticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grafico-circular (1).png"))); // NOI18N
        jPanelEstadísticas.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel44.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 153, 153));
        jLabel44.setText("ESTADÍSTICAS");
        jPanelEstadísticas.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 220, 40));

        jComboBoxTipoEstadística.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compra", "Ventas", "Renta de Videojuegos", " " }));
        jComboBoxTipoEstadística.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoEstadísticaActionPerformed(evt);
            }
        });
        jPanelEstadísticas.add(jComboBoxTipoEstadística, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID compra", "Fecha", "Proveedor", "Total", "Usuario"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanelEstadísticas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 810, 300));

        BotonVer.setText("Ver");
        BotonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerActionPerformed(evt);
            }
        });
        jPanelEstadísticas.add(BotonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 80, -1));

        jLabel47.setText("Tipo");
        jPanelEstadísticas.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel48.setText("Mes");
        jPanelEstadísticas.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Nombiembre", "Diciembre" }));
        jPanelEstadísticas.add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel49.setText("año");
        jPanelEstadísticas.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));
        jPanelEstadísticas.add(jComboBoxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        BotonGuardarEstadistica.setText("Guardar en PC");
        BotonGuardarEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarEstadisticaActionPerformed(evt);
            }
        });
        jPanelEstadísticas.add(BotonGuardarEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        getContentPane().add(jPanelEstadísticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1000, 460));

        jInternalFrame1.setVisible(false);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 70, 80);

        jLabel9.setText("Usuarios Activos");
        jInternalFrame1.getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 90, 120, 16);

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nombre", "Número de Teléfono"
            }
        ));
        jScrollPane4.setViewportView(TablaUsuarios);

        jInternalFrame1.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 120, 453, 270);

        BotonModificar.setBackground(new java.awt.Color(0, 183, 183));
        BotonModificar.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(BotonModificar);
        BotonModificar.setBounds(490, 350, 90, 32);

        PanelModificar.setLayout(null);

        jLabel29.setText("Correo Electrónico:");
        PanelModificar.add(jLabel29);
        jLabel29.setBounds(20, 180, 120, 16);

        jTextFieldNombreUsuario.setText("Nombre del Empleado");
        jTextFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuarioActionPerformed(evt);
            }
        });
        PanelModificar.add(jTextFieldNombreUsuario);
        jTextFieldNombreUsuario.setBounds(90, 70, 250, 30);

        jLabel30.setText("Estado:");
        PanelModificar.add(jLabel30);
        jLabel30.setBounds(80, 220, 60, 16);

        jLabel31.setText("Contraseña:");
        PanelModificar.add(jLabel31);
        jLabel31.setBounds(50, 260, 130, 16);

        jLabel32.setText("UserID");
        PanelModificar.add(jLabel32);
        jLabel32.setBounds(280, 30, 48, 16);

        jTextFieldContraseñaconfirm.setText("Teléfono");
        jTextFieldContraseñaconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaconfirmActionPerformed(evt);
            }
        });
        PanelModificar.add(jTextFieldContraseñaconfirm);
        jTextFieldContraseñaconfirm.setBounds(140, 290, 200, 30);

        jLabel33.setText("Nombre:");
        PanelModificar.add(jLabel33);
        jLabel33.setBounds(20, 80, 60, 16);

        jComboBoxEstadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado del Usuario", "Activo", "Desactivo" }));
        PanelModificar.add(jComboBoxEstadoUsuario);
        jComboBoxEstadoUsuario.setBounds(140, 210, 150, 26);

        BotonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        BotonCancelar.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 14)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        PanelModificar.add(BotonCancelar);
        BotonCancelar.setBounds(260, 330, 72, 34);

        BotonGuardar.setBackground(new java.awt.Color(0, 183, 183));
        BotonGuardar.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 14)); // NOI18N
        BotonGuardar.setText("Guardar\n");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelModificar.add(BotonGuardar);
        BotonGuardar.setBounds(160, 330, 71, 34);

        jTextFieldCorreo.setText("CorreoElectrónico");
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        PanelModificar.add(jTextFieldCorreo);
        jTextFieldCorreo.setBounds(140, 170, 200, 30);

        jLabel34.setText("Número deTeléfono:");
        PanelModificar.add(jLabel34);
        jLabel34.setBounds(20, 130, 130, 16);

        jTextFieldTelefono.setText("Teléfono");
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        PanelModificar.add(jTextFieldTelefono);
        jTextFieldTelefono.setBounds(140, 120, 200, 30);

        jTextFieldContraseña.setText("Contraseña");
        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        PanelModificar.add(jTextFieldContraseña);
        jTextFieldContraseña.setBounds(140, 250, 200, 30);

        jInternalFrame1.getContentPane().add(PanelModificar);
        PanelModificar.setBounds(610, 10, 370, 380);

        jTabbedPaneUsuarios.addTab("Ver Usuarios", jInternalFrame1);

        jInternalFrame2.setVisible(false);
        jInternalFrame2.getContentPane().setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jInternalFrame2.getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 10, 70, 80);

        jPanel16.setLayout(null);

        jLabel35.setText("Correo Electrónico:");
        jPanel16.add(jLabel35);
        jLabel35.setBounds(20, 230, 120, 16);

        jTextFieldNombreUsuarioNuevo.setText("Nombre del Empleado");
        jTextFieldNombreUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuarioNuevoActionPerformed(evt);
            }
        });
        jPanel16.add(jTextFieldNombreUsuarioNuevo);
        jTextFieldNombreUsuarioNuevo.setBounds(90, 70, 250, 30);

        jLabel36.setText("Estado:");
        jPanel16.add(jLabel36);
        jLabel36.setBounds(30, 280, 60, 16);

        jTextFieldCorreoNuevo.setText("CorreoElectrónico");
        jTextFieldCorreoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoNuevoActionPerformed(evt);
            }
        });
        jPanel16.add(jTextFieldCorreoNuevo);
        jTextFieldCorreoNuevo.setBounds(140, 220, 200, 30);

        jLabel37.setText("Número deTeléfono:");
        jPanel16.add(jLabel37);
        jLabel37.setBounds(20, 180, 130, 16);

        jLabel38.setText("UserID");
        jPanel16.add(jLabel38);
        jLabel38.setBounds(280, 30, 48, 16);

        jTextFieldTelefonoNuevo.setText("Teléfono");
        jTextFieldTelefonoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoNuevoActionPerformed(evt);
            }
        });
        jPanel16.add(jTextFieldTelefonoNuevo);
        jTextFieldTelefonoNuevo.setBounds(140, 170, 200, 30);

        BoxSexoNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Género", "Masculino", "Femenino", " " }));
        jPanel16.add(BoxSexoNuevo);
        BoxSexoNuevo.setBounds(140, 120, 160, 26);

        jLabel39.setText("Nombre:");
        jPanel16.add(jLabel39);
        jLabel39.setBounds(20, 80, 60, 16);

        jComboBoxEstadoUsuarioNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado del Usuario", "Activo", "Desactivo" }));
        jPanel16.add(jComboBoxEstadoUsuarioNuevo);
        jComboBoxEstadoUsuarioNuevo.setBounds(140, 280, 160, 26);

        jLabel40.setText("Género:");
        jPanel16.add(jLabel40);
        jLabel40.setBounds(20, 120, 60, 16);

        jInternalFrame2.getContentPane().add(jPanel16);
        jPanel16.setBounds(140, 10, 370, 380);

        jPanel17.setLayout(null);

        jLabel41.setText("Confirme Contraseña:");
        jPanel17.add(jLabel41);
        jLabel41.setBounds(20, 230, 140, 16);

        jTextFieldUsernameNuevo.setText("Username");
        jTextFieldUsernameNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameNuevoActionPerformed(evt);
            }
        });
        jPanel17.add(jTextFieldUsernameNuevo);
        jTextFieldUsernameNuevo.setBounds(100, 70, 250, 30);

        jTextFieldContraseñaNuevaConfirmar.setText("Contraseña");
        jTextFieldContraseñaNuevaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaNuevaConfirmarActionPerformed(evt);
            }
        });
        jPanel17.add(jTextFieldContraseñaNuevaConfirmar);
        jTextFieldContraseñaNuevaConfirmar.setBounds(150, 220, 190, 30);

        jLabel43.setText("Contraseña:");
        jPanel17.add(jLabel43);
        jLabel43.setBounds(20, 180, 130, 16);

        jTextFieldContraseñaNueva.setText("Contraseña");
        jTextFieldContraseñaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaNuevaActionPerformed(evt);
            }
        });
        jPanel17.add(jTextFieldContraseñaNueva);
        jTextFieldContraseñaNueva.setBounds(150, 170, 190, 30);

        BoxPrivilegioNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Privilegio", "Administrador", "Vendedor", " ", " " }));
        jPanel17.add(BoxPrivilegioNuevo);
        BoxPrivilegioNuevo.setBounds(140, 120, 160, 26);

        jLabel45.setText("Userame");
        jPanel17.add(jLabel45);
        jLabel45.setBounds(20, 80, 60, 16);

        jLabel46.setText("Privilegio");
        jPanel17.add(jLabel46);
        jLabel46.setBounds(20, 120, 60, 16);

        BotonCancelarNuevoUsuario.setBackground(new java.awt.Color(255, 51, 51));
        BotonCancelarNuevoUsuario.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 14)); // NOI18N
        BotonCancelarNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelarNuevoUsuario.setText("Cancelar");
        BotonCancelarNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel17.add(BotonCancelarNuevoUsuario);
        BotonCancelarNuevoUsuario.setBounds(260, 300, 90, 34);

        BotonGuardarNuevoUsuario.setBackground(new java.awt.Color(0, 183, 183));
        BotonGuardarNuevoUsuario.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 14)); // NOI18N
        BotonGuardarNuevoUsuario.setText("Guardar\n");
        BotonGuardarNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel17.add(BotonGuardarNuevoUsuario);
        BotonGuardarNuevoUsuario.setBounds(130, 300, 90, 34);

        jInternalFrame2.getContentPane().add(jPanel17);
        jPanel17.setBounds(550, 20, 370, 360);

        jTabbedPaneUsuarios.addTab("Crar Usuario Nuevo", jInternalFrame2);

        getContentPane().add(jTabbedPaneUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1000, 460));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 150));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 150));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("GAME LAND");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 220, 40));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("GAME LAND");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 200, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/videojuegos (3).png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 90));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuarios");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 90, 20));

        jLabelCompras.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-de-compras (1).png"))); // NOI18N
        jLabelCompras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelComprasMouseMoved(evt);
            }
        });
        jLabelCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelComprasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelComprasMouseExited(evt);
            }
        });
        jPanel3.add(jLabelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 110, 90));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palanca-de-mando.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 50, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supermercado (1).png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 100));

        jLabelEstadísticas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEstadísticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstadísticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grafico-circular (1).png"))); // NOI18N
        jLabelEstadísticas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelEstadísticasMouseMoved(evt);
            }
        });
        jLabelEstadísticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEstadísticasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEstadísticasMouseExited(evt);
            }
        });
        jPanel3.add(jLabelEstadísticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, 100));

        jLabelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jLabelUsuarios.setName(""); // NOI18N
        jLabelUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseMoved(evt);
            }
        });
        jLabelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseExited(evt);
            }
        });
        jPanel3.add(jLabelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 100, 100));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palanca-de-mando.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 60, 50));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Videojuegos");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 20));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ventas");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 60, 20));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Compras");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 60, 20));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Estadísticas");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 140));

        jTabbedPane_Compras.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane_Compras.setMinimumSize(new java.awt.Dimension(1000, 450));
        jTabbedPane_Compras.setPreferredSize(new java.awt.Dimension(1000, 450));

        jPanelAgregarCompra.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanelAgregarCompra.setName(""); // NOI18N
        jPanelAgregarCompra.setPreferredSize(new java.awt.Dimension(1000, 425));

        jPanel12.setMaximumSize(new java.awt.Dimension(900, 95));
        jPanel12.setMinimumSize(new java.awt.Dimension(900, 95));

        jTextField2.setText("BUSCAR PRODUCTO");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTextField3.setText("PROVEEDOR");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton8.setText("BUSCAR");

        jTextField4.setText("INGRESE # FACTURA");

        jButton9.setText("CONFIRMAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("CANCELAR");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(30, 30, 30)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel13.setMinimumSize(new java.awt.Dimension(1000, 240));
        jPanel13.setPreferredSize(new java.awt.Dimension(1000, 235));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "TOTAL"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel14.setMaximumSize(new java.awt.Dimension(900, 90));
        jPanel14.setMinimumSize(new java.awt.Dimension(900, 90));
        jPanel14.setPreferredSize(new java.awt.Dimension(1000, 85));

        jButton11.setText("NUEVO PRODUCTO");

        jButton12.setText("NUEVO PROVEEDOR");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("TOTAL");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("0.00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAgregarCompraLayout = new javax.swing.GroupLayout(jPanelAgregarCompra);
        jPanelAgregarCompra.setLayout(jPanelAgregarCompraLayout);
        jPanelAgregarCompraLayout.setHorizontalGroup(
            jPanelAgregarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelAgregarCompraLayout.setVerticalGroup(
            jPanelAgregarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarCompraLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane_Compras.addTab("AGREGAR COMPRA", jPanelAgregarCompra);

        jPanelVercompras.setMinimumSize(new java.awt.Dimension(1000, 406));
        jPanelVercompras.setPreferredSize(new java.awt.Dimension(1000, 406));

        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel1.setText("BUSCAR COMPRAS");

        jComboBox_Numerofactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NUMERO DE FACTURA", "FECHA EN ESPECIFICA", " " }));
        jComboBox_Numerofactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_NumerofacturaMouseClicked(evt);
            }
        });

        jLabel11.setText("NUMERO DE FACTURA");

        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel12.setText("SELECCIONE LA FECHA");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton7.setText("BUSCAR");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Numerofactura, 0, 153, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Numerofactura)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel7.setMinimumSize(new java.awt.Dimension(900, 450));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "# Factura", "Fecha", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVercomprasLayout = new javax.swing.GroupLayout(jPanelVercompras);
        jPanelVercompras.setLayout(jPanelVercomprasLayout);
        jPanelVercomprasLayout.setHorizontalGroup(
            jPanelVercomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVercomprasLayout.createSequentialGroup()
                .addGroup(jPanelVercomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelVercomprasLayout.setVerticalGroup(
            jPanelVercomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVercomprasLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane_Compras.addTab("VER COMPRAS", jPanelVercompras);

        jPanelDetallecompra.setMinimumSize(new java.awt.Dimension(1000, 456));
        jPanelDetallecompra.setPreferredSize(new java.awt.Dimension(1000, 456));

        jPanel10.setMinimumSize(new java.awt.Dimension(950, 100));
        jPanel10.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel16.setText("NUMERO DE FACTURA");

        jLabel18.setText("-----------------------");

        jLabel19.setText("FECHA");

        jLabel20.setText("----------------");

        jLabel21.setText("PROVEEDOR");

        jLabel22.setText("-------------------");

        jLabel23.setText("TOTAL DE FACTURA");

        jLabel24.setText("-------------------");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(122, 122, 122)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(100, 100, 100)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel11.setPreferredSize(new java.awt.Dimension(1000, 350));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDetallecompraLayout = new javax.swing.GroupLayout(jPanelDetallecompra);
        jPanelDetallecompra.setLayout(jPanelDetallecompraLayout);
        jPanelDetallecompraLayout.setHorizontalGroup(
            jPanelDetallecompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallecompraLayout.createSequentialGroup()
                .addGroup(jPanelDetallecompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDetallecompraLayout.setVerticalGroup(
            jPanelDetallecompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallecompraLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane_Compras.addTab("DETALLE DE COMPRA", jPanelDetallecompra);

        getContentPane().add(jTabbedPane_Compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1000, 450));

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setText("Nombre Cliente");
        jPanel19.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel57.setText("ID Factura");
        jPanel19.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel58.setText("Fecha");
        jPanel19.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(jList1);

        jPanel19.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 120));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel19.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 230, 30));

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel19.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 230, 30));

        jButton17.setText("CANCELAR");
        jPanel19.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jButton18.setText("ACEPTAR");
        jPanel19.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jButton19.setText("Buscar");
        jPanel19.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Nombiembre", "Diciembre" }));
        jPanel19.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021" }));
        jPanel19.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        Ventas.addTab("Devolucion", jPanel19);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel18.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 367, -1));

        jButton3.setText("Agregar Producto");
        jButton3.setEnabled(false);
        jPanel18.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        jLabel50.setText("Producto");
        jPanel18.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel51.setText("Cantidad");
        jPanel18.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel18.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 370, -1));

        jLabel52.setText("Cliente");
        jPanel18.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jButton13.setText("Nuevo Cliente");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel53.setText("NIT");
        jPanel18.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel18.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 120, 30));

        jButton14.setText("Eliminar");
        jButton14.setEnabled(false);
        jPanel18.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, -1));

        jButton15.setText("CANCELAR");
        jPanel18.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        jButton16.setText("ACEPTAR");
        jPanel18.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        jLabel54.setText("TOTAL;");
        jPanel18.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel55.setBackground(new java.awt.Color(62, 59, 59));
        jLabel55.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 0));
        jLabel55.setText("0.00");
        jPanel18.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 160, 60));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "PrecioU", "Cantidad"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jPanel18.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 630, 130));

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        jPanel18.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 80, 30));

        Ventas.addTab("Venta", jPanel18);

        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1000, 450));

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setText("Disponibles");
        jPanel20.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        agregar.setText("Agregar");
        agregar.setEnabled(false);
        jPanel20.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Consola", "Hora Inicio", "Hora Fin", "Total"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        jPanel20.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 715, 192));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Consola 1", "Consola 2", "Consola 3", "Consola 4", "Consola 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jList2);

        jPanel20.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 80, 210));

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        jPanel20.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 30));

        jLabel60.setText("No. Consola");
        jPanel20.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel61.setText("Tiempo");
        jPanel20.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField15KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        jPanel20.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 30));

        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });
        jPanel20.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, 30));

        jLabel62.setText("No. controles");
        jPanel20.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        Renta.addTab("Estado Consolas", jPanel20);

        getContentPane().add(Renta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 990, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void obtener_id_siguienteCompra(){
        idcompras = controlCompras.getComprasCount()+1;
        lg.setId(4);
    }
    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        // TODO add your handling code here:
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        // TODO add your handling code here:
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        // TODO add your handling code here:
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        // TODO add your handling code here:
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        // TODO add your handling code here:
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        // TODO add your handling code here:
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,183,183)));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jComboBoxTipoEstadísticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoEstadísticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoEstadísticaActionPerformed

    private void jLabelComprasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelComprasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelComprasMouseMoved

    private void jLabelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jTabbedPaneUsuarios.setVisible(true);
        jTabbedPane_Compras.setVisible(false);
        Ventas.setVisible(false);
        Renta.setVisible(false);
        jPanelEstadísticas.setVisible(false);
        //llamar clase mostrarusuarios.java
        //obtener datos y mostrar en TablaUSuarios
    }//GEN-LAST:event_jLabelUsuariosMouseClicked

    private void jLabelUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuariosMouseExited

    private void jLabelUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuariosMouseMoved

    private void jLabelEstadísticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstadísticasMouseClicked
         jPanel2.setVisible(false);
        jTabbedPaneUsuarios.setVisible(false);
        jTabbedPane_Compras.setVisible(false);
        Ventas.setVisible(false);
        Renta.setVisible(false);
        jPanelEstadísticas.setVisible(true);
    }//GEN-LAST:event_jLabelEstadísticasMouseClicked

    private void jLabelEstadísticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstadísticasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEstadísticasMouseExited

    private void jLabelEstadísticasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEstadísticasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEstadísticasMouseMoved

    private void jLabelComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelComprasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelComprasMouseExited

    private void jLabelComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelComprasMouseClicked
         // TODO add your handling code here:
        jTabbedPane_Compras.setVisible(true);
        jPanel2.setVisible(false);
        Ventas.setVisible(false);
        Ventas.setVisible(false);
        jPanelEstadísticas.setVisible(false);
        jTabbedPaneUsuarios.setVisible(false);
    }//GEN-LAST:event_jLabelComprasMouseClicked

    private void jTextFieldNombreUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreUsuarioNuevoActionPerformed

    private void jTextFieldCorreoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoNuevoActionPerformed

    private void jTextFieldTelefonoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoNuevoActionPerformed

    private void jTextFieldUsernameNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameNuevoActionPerformed

    private void jTextFieldContraseñaNuevaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaNuevaConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaNuevaConfirmarActionPerformed

    private void jTextFieldContraseñaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaNuevaActionPerformed

    private void jTextFieldContraseñaconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaconfirmActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreUsuarioActionPerformed

     public void enable2 ()
    {
        if(!jTextField14.getText().isEmpty()&&!jTextField15.getText().isEmpty()&&!jTextField16.getText().isEmpty())
        {  agregar.setEnabled(true);
        } else
        {  agregar.setEnabled(false);
        }
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         Renta.setVisible(true);
         jTabbedPane_Compras.setVisible(false);
         Ventas.setVisible(false);
         jPanelEstadísticas.setVisible(false);
         jPanel2.setVisible(false);
         jTabbedPaneUsuarios.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Nuevo_Cliente newcliente = new Nuevo_Cliente();
        newcliente.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Ventas.setVisible(true);
        jTabbedPane_Compras.setVisible(false);
        jPanelEstadísticas.setVisible(false);
        Renta.setVisible(false);
        jPanel2.setVisible(false);
        jTabbedPaneUsuarios.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jComboBox_NumerofacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_NumerofacturaMouseClicked
        // TODO add your handling code here:
        System.out.println(jComboBox_Numerofactura.getSelectedIndex());
        if(jComboBox_Numerofactura.getSelectedIndex() == 0){
            jPanel8.setVisible(true);
            jPanel9.setVisible(false);
        }else{
            jPanel8.setVisible(false);
            jPanel9.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox_NumerofacturaMouseClicked

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese el numero de Consola");
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese el tiempo en minutos");
        }
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
       char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese el numero de controles");
        }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese numero de ID");
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El NIT solo consta de numeros");
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char valido=evt.getKeyChar();
        if(Character.isDigit(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese el nombre en letras");
        }
    }//GEN-LAST:event_jTextField7KeyTyped

     public void enable1 ()
    {
        if(!jTextField5.getText().isEmpty()&&!cantidad.getText().isEmpty())
        {  jButton3.setEnabled(true);
        } else
        {  jButton3.setEnabled(false);
        }
    }
    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
         char valido=evt.getKeyChar();
        if(Character.isDigit(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese el nombre en letras");
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        enable1();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
         char valido=evt.getKeyChar();
        if(Character.isLetter(valido)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese cantidad en numeros");
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        enable1();
    }//GEN-LAST:event_cantidadKeyReleased

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        enable2();
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyReleased
        enable2();
    }//GEN-LAST:event_jTextField15KeyReleased

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        enable2();
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed

    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ProductoJpaController control = new ProductoJpaController(emf);
            
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Compras compras = new Compras();
        compras.setNfactura(jTextField4.getText());
        compras.setFecha(sqlStartDate);
        compras.setProveedorid(proveedor);
        compras.setLoginid(lg);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
        //Obtener numero de fila de tabla y mostrar PanelModificar 
        //llenar labels con info a modificar del numero de la fila obtenida
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        //Obtener datos de labels y modificar datos de tabla (id no modificable)
        //despues de insertar eliminar datos de label y ocultar panelModificar
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        //eliminar datos de labels y ocultar panelmodificar
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonGuardarNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        //Verificar que se hallan llenado todos los campos
        //Solicitar contraseña de administrador para guardar cambios
        //Obtener datos de labels
        //Enviar datos a CrearUsuario.java
        //Si insertó "mensaje exito"
        //limpiar labels
    }//GEN-LAST:event_BotonGuardarNuevoUsuarioActionPerformed

    private void BotonCancelarNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        //Limpiar labels
    }//GEN-LAST:event_BotonCancelarNuevoUsuarioActionPerformed

    private void BotonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerActionPerformed
        // TODO add your handling code here:
        //Obtener datos para filtro estadisticas
        String tipo = jComboBoxTipoEstadística.getName();
        String mes = jComboBoxMes.getName();
        String anio = jComboBoxAnio.getName();
        
        //llamar MostrarEstadisticas.java y enviar datos para consulta
        //mostrar tabla creada de estadisticas (no modificable)
    }//GEN-LAST:event_BotonVerActionPerformed

    private void BotonGuardarEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarEstadisticaActionPerformed
        // TODO add your handling code here:
        //Llamar a imprimir.java
        //enviar tabla de estadistica (si existe)
        //mostrar mensaje de exito
    }//GEN-LAST:event_BotonGuardarEstadisticaActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCancelarNuevoUsuario;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonGuardarEstadistica;
    private javax.swing.JButton BotonGuardarNuevoUsuario;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonVer;
    private javax.swing.JComboBox<String> BoxPrivilegioNuevo;
    private javax.swing.JComboBox<String> BoxSexoNuevo;
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JTabbedPane Renta;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JTabbedPane Ventas;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxEstadoUsuario;
    private javax.swing.JComboBox<String> jComboBoxEstadoUsuarioNuevo;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxTipoEstadística;
    private javax.swing.JComboBox<String> jComboBox_Numerofactura;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCompras;
    private javax.swing.JLabel jLabelEstadísticas;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAgregarCompra;
    private javax.swing.JPanel jPanelDetallecompra;
    private javax.swing.JPanel jPanelEstadísticas;
    private javax.swing.JPanel jPanelVercompras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneUsuarios;
    private javax.swing.JTabbedPane jTabbedPane_Compras;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldContraseñaNueva;
    private javax.swing.JTextField jTextFieldContraseñaNuevaConfirmar;
    private javax.swing.JTextField jTextFieldContraseñaconfirm;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldCorreoNuevo;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldNombreUsuarioNuevo;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTelefonoNuevo;
    private javax.swing.JTextField jTextFieldUsernameNuevo;
    // End of variables declaration//GEN-END:variables
}
