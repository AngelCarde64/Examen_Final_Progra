package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class VistaMP extends javax.swing.JFrame {

    public VistaMP() {
        initComponents();
    }

    public JButton getjButtonFile() {
        return jButtonFile;
    }

    public void setjButtonFile(JButton jButtonFile) {
        this.jButtonFile = jButtonFile;
    }

    public JButton getjButtonIMPRIMIR() {
        return jButtonIMPRIMIR;
    }

    public void setjButtonIMPRIMIR(JButton jButtonIMPRIMIR) {
        this.jButtonIMPRIMIR = jButtonIMPRIMIR;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenu getjMenuPersonas() {
        return jMenuPersonas;
    }

    public void setjMenuPersonas(JMenu jMenuPersonas) {
        this.jMenuPersonas = jMenuPersonas;
    }

    public JMenu getjMenuReportes() {
        return jMenuReportes;
    }

    public void setjMenuReportes(JMenu jMenuReportes) {
        this.jMenuReportes = jMenuReportes;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JToolBar.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JToolBar.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JToolBar.Separator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JToolBar.Separator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JToolBar.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JToolBar.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JLabel getLblMensaje() {
        return lblMensaje;
    }

    public void setLblMensaje(JLabel lblMensaje) {
        this.lblMensaje = lblMensaje;
    }

    public JButton getTlbAdd() {
        return tlbAdd;
    }

    public void setTlbAdd(JButton tlbAdd) {
        this.tlbAdd = tlbAdd;
    }

    public JButton getPersona_Button() {
        return Persona_Button;
    }

    public void setPersona_Button(JButton Persona_Button) {
        this.Persona_Button = Persona_Button;
    }

    public JMenuItem getjMenuItemCrearPersona() {
        return jMenuItemCrearPersona;
    }

    public void setjMenuItemCrearPersona(JMenuItem jMenuItemCrearPersona) {
        this.jMenuItemCrearPersona = jMenuItemCrearPersona;
    }

    public JPanel getBody() {
        return body;
    }

    public void setBody(JPanel body) {
        this.body = body;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        Persona_Button = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        tlbAdd = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonFile = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonIMPRIMIR = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPersonas = new javax.swing.JMenu();
        jMenuItemCrearPersona = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Tienda v1.1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        Persona_Button.setBackground(new java.awt.Color(51, 51, 51));
        Persona_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/follow.png"))); // NOI18N
        Persona_Button.setBorder(null);
        Persona_Button.setBorderPainted(false);
        Persona_Button.setFocusable(false);
        Persona_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Persona_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Persona_Button);
        jToolBar1.add(jSeparator4);

        tlbAdd.setBackground(new java.awt.Color(51, 51, 51));
        tlbAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ADD.png"))); // NOI18N
        tlbAdd.setToolTipText("Mantenimiento de Personas");
        tlbAdd.setBorder(null);
        tlbAdd.setBorderPainted(false);
        tlbAdd.setFocusable(false);
        tlbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tlbAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(tlbAdd);
        jToolBar1.add(jSeparator3);

        jButtonFile.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/FOLDER.png"))); // NOI18N
        jButtonFile.setBorder(null);
        jButtonFile.setBorderPainted(false);
        jButtonFile.setFocusable(false);
        jButtonFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonFile);
        jToolBar1.add(jSeparator2);

        jButtonIMPRIMIR.setBackground(new java.awt.Color(51, 51, 51));
        jButtonIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/IMPRIMIR.png"))); // NOI18N
        jButtonIMPRIMIR.setToolTipText("Imprimir el reporte");
        jButtonIMPRIMIR.setBorder(null);
        jButtonIMPRIMIR.setBorderPainted(false);
        jButtonIMPRIMIR.setFocusable(false);
        jButtonIMPRIMIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIMPRIMIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonIMPRIMIR);

        body.setBackground(new java.awt.Color(204, 204, 204));
        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        jMenuPersonas.setText("EMPLEADOS");

        jMenuItemCrearPersona.setText("CRUD EMPELADOS");
        jMenuPersonas.add(jMenuItemCrearPersona);

        jMenuBar1.add(jMenuPersonas);

        jMenuReportes.setText("Reportes");
        jMenuBar1.add(jMenuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 520, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Persona_Button;
    private javax.swing.JPanel body;
    private javax.swing.JButton jButtonFile;
    private javax.swing.JButton jButtonIMPRIMIR;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCrearPersona;
    private javax.swing.JMenu jMenuPersonas;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JButton tlbAdd;
    // End of variables declaration//GEN-END:variables
}
