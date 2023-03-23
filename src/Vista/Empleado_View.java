package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Empleado_View extends javax.swing.JPanel {

    public Empleado_View() {
        initComponents();
    }

    public JLabel getID_DB_TXT() {
        return ID_DB_TXT;
    }

    public void setID_DB_TXT(JLabel ID_DB_TXT) {
        this.ID_DB_TXT = ID_DB_TXT;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JDialog getDlgEmpleado() {
        return dlgEmpleado;
    }

    public void setDlgEmpleado(JDialog dlgEmpleado) {
        this.dlgEmpleado = dlgEmpleado;
    }

    public JTextField getField_Cedula() {
        return field_Cedula;
    }

    public void setField_Cedula(JTextField field_Cedula) {
        this.field_Cedula = field_Cedula;
    }

    public JButton getGenreport() {
        return genreport;
    }

    public void setGenreport(JButton genreport) {
        this.genreport = genreport;
    }

    public JComboBox<String> getjComboBoxDiscapacidad() {
        return jComboBoxDiscapacidad;
    }

    public void setjComboBoxDiscapacidad(JComboBox<String> jComboBoxDiscapacidad) {
        this.jComboBoxDiscapacidad = jComboBoxDiscapacidad;
    }

    public JComboBox<String> getjComboBoxHorario() {
        return jComboBoxHorario;
    }

    public void setjComboBoxHorario(JComboBox<String> jComboBoxHorario) {
        this.jComboBoxHorario = jComboBoxHorario;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel_Logo() {
        return jLabel_Logo;
    }

    public void setjLabel_Logo(JLabel jLabel_Logo) {
        this.jLabel_Logo = jLabel_Logo;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JDateChooser getJdcFechaContrato() {
        return jdcFechaContrato;
    }

    public void setJdcFechaContrato(JDateChooser jdcFechaContrato) {
        this.jdcFechaContrato = jdcFechaContrato;
    }

    public JDialog getJdialogparametros() {
        return jdialogparametros;
    }

    public void setJdialogparametros(JDialog jdialogparametros) {
        this.jdialogparametros = jdialogparametros;
    }

    public JTextField getJtextfield_Buscar() {
        return jtextfield_Buscar;
    }

    public void setJtextfield_Buscar(JTextField jtextfield_Buscar) {
        this.jtextfield_Buscar = jtextfield_Buscar;
    }

    public JLabel getLblAlertaResultado() {
        return lblAlertaResultado;
    }

    public void setLblAlertaResultado(JLabel lblAlertaResultado) {
        this.lblAlertaResultado = lblAlertaResultado;
    }

    public JLabel getLbl_Cedula() {
        return lbl_Cedula;
    }

    public void setLbl_Cedula(JLabel lbl_Cedula) {
        this.lbl_Cedula = lbl_Cedula;
    }

    public JLabel getLbl_Horario() {
        return lbl_Horario;
    }

    public void setLbl_Horario(JLabel lbl_Horario) {
        this.lbl_Horario = lbl_Horario;
    }

    public JLabel getLbl_Salario() {
        return lbl_Salario;
    }

    public void setLbl_Salario(JLabel lbl_Salario) {
        this.lbl_Salario = lbl_Salario;
    }

    public JLabel getLbl_apellido() {
        return lbl_apellido;
    }

    public void setLbl_apellido(JLabel lbl_apellido) {
        this.lbl_apellido = lbl_apellido;
    }

    public JLabel getLbl_discapacidad() {
        return lbl_discapacidad;
    }

    public void setLbl_discapacidad(JLabel lbl_discapacidad) {
        this.lbl_discapacidad = lbl_discapacidad;
    }

    public JLabel getLbl_fecContrato() {
        return lbl_fecContrato;
    }

    public void setLbl_fecContrato(JLabel lbl_fecContrato) {
        this.lbl_fecContrato = lbl_fecContrato;
    }

    public JLabel getLbl_nombre() {
        return lbl_nombre;
    }

    public void setLbl_nombre(JLabel lbl_nombre) {
        this.lbl_nombre = lbl_nombre;
    }

    public JTable getTblEmpleados() {
        return tblEmpleados;
    }

    public void setTblEmpleados(JTable tblEmpleados) {
        this.tblEmpleados = tblEmpleados;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtSalario() {
        return txtSalario;
    }

    public void setTxtSalario(JTextField txtSalario) {
        this.txtSalario = txtSalario;
    }

    public JLabel getTxt_Buscar() {
        return txt_Buscar;
    }

    public void setTxt_Buscar(JLabel txt_Buscar) {
        this.txt_Buscar = txt_Buscar;
    }

    public JTextField getTxtmaximo() {
        return txtmaximo;
    }

    public void setTxtmaximo(JTextField txtmaximo) {
        this.txtmaximo = txtmaximo;
    }

    public JTextField getTxtminimo() {
        return txtminimo;
    }

    public void setTxtminimo(JTextField txtminimo) {
        this.txtminimo = txtminimo;
    }

    public JTextField getTxttitulo() {
        return txttitulo;
    }

    public void setTxttitulo(JTextField txttitulo) {
        this.txttitulo = txttitulo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgEmpleado = new javax.swing.JDialog();
        ID_DB_TXT = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lbl_fecContrato = new javax.swing.JLabel();
        lbl_discapacidad = new javax.swing.JLabel();
        lbl_Horario = new javax.swing.JLabel();
        lbl_Salario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jdcFechaContrato = new com.toedter.calendar.JDateChooser();
        jComboBoxDiscapacidad = new javax.swing.JComboBox<>();
        lbl_Cedula = new javax.swing.JLabel();
        field_Cedula = new javax.swing.JTextField();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jdialogparametros = new javax.swing.JDialog();
        txttitulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmaximo = new javax.swing.JTextField();
        txtminimo = new javax.swing.JTextField();
        genreport = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_Buscar = new javax.swing.JLabel();
        lblAlertaResultado = new javax.swing.JLabel();
        jtextfield_Buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();

        dlgEmpleado.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgEmpleado.setResizable(false);

        ID_DB_TXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID_DB_TXT.setText("ID: 211212");

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombres");

        lbl_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_apellido.setText("Apellidos");

        lbl_fecContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fecContrato.setText("Fecha Contrato");

        lbl_discapacidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_discapacidad.setText("Discapacidad:");

        lbl_Horario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Horario.setText("Horario:");

        lbl_Salario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Salario.setText("Salario");

        btnAceptar.setBackground(new java.awt.Color(86, 148, 229));
        btnAceptar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");

        btnCancelar.setBackground(new java.awt.Color(72, 169, 72));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");

        jComboBoxDiscapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurna", "Nocturna", "Mixta" }));

        lbl_Cedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Cedula.setText("Cedula");

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurna", "Nocturna", "Mixta" }));

        javax.swing.GroupLayout dlgEmpleadoLayout = new javax.swing.GroupLayout(dlgEmpleado.getContentPane());
        dlgEmpleado.getContentPane().setLayout(dlgEmpleadoLayout);
        dlgEmpleadoLayout.setHorizontalGroup(
            dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbl_fecContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ID_DB_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addComponent(lbl_Cedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(field_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_apellido))
                                .addGap(19, 19, 19)
                                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_discapacidad)
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Salario)
                                    .addComponent(lbl_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        dlgEmpleadoLayout.setVerticalGroup(
            dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ID_DB_TXT)
                .addGap(18, 18, 18)
                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_apellido))
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                        .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(lbl_Salario))
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_discapacidad)
                                    .addComponent(jComboBoxDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Horario)
                                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dlgEmpleadoLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecContrato))
                .addGap(42, 42, 42)
                .addGroup(dlgEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        txttitulo.setText("Reporte Empleados");

        jLabel7.setText("Titulo");

        txtmaximo.setText("100");

        txtminimo.setText("0");

        genreport.setText("Aceptar");

        jLabel12.setText("Sueldo Max");

        jLabel13.setText("Sueldo Min");

        javax.swing.GroupLayout jdialogparametrosLayout = new javax.swing.GroupLayout(jdialogparametros.getContentPane());
        jdialogparametros.getContentPane().setLayout(jdialogparametrosLayout);
        jdialogparametrosLayout.setHorizontalGroup(
            jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialogparametrosLayout.createSequentialGroup()
                .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdialogparametrosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdialogparametrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtminimo)
                    .addComponent(txtmaximo)
                    .addComponent(txttitulo))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdialogparametrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(genreport)
                .addGap(82, 82, 82))
        );
        jdialogparametrosLayout.setVerticalGroup(
            jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialogparametrosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jdialogparametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtminimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(49, 49, 49)
                .addComponent(genreport)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        txt_Buscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txt_Buscar.setText("Buscar");

        lblAlertaResultado.setForeground(new java.awt.Color(204, 0, 0));
        lblAlertaResultado.setText("No hay coincidencias");

        btnBuscar.setText("Buscar");

        btnActualizar.setText("Actualizar");

        btnCrear.setText("Crear");

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");

        btnImprimir.setText("Imprimir");

        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_Instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_Buscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAlertaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtextfield_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAlertaResultado)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jtextfield_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnImprimir)
                    .addComponent(btnActualizar))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblEmpleados.setBorder(new javax.swing.border.MatteBorder(null));
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRES", "APELLIDOS", "FECHA NACIMIENTO", "TELEFONO", "SEXO", "SUELDO", "CUPO", "FOTO"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_DB_TXT;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JDialog dlgEmpleado;
    private javax.swing.JTextField field_Cedula;
    private javax.swing.JButton genreport;
    private javax.swing.JComboBox<String> jComboBoxDiscapacidad;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaContrato;
    private javax.swing.JDialog jdialogparametros;
    private javax.swing.JTextField jtextfield_Buscar;
    private javax.swing.JLabel lblAlertaResultado;
    private javax.swing.JLabel lbl_Cedula;
    private javax.swing.JLabel lbl_Horario;
    private javax.swing.JLabel lbl_Salario;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_discapacidad;
    private javax.swing.JLabel lbl_fecContrato;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JLabel txt_Buscar;
    private javax.swing.JTextField txtmaximo;
    private javax.swing.JTextField txtminimo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
