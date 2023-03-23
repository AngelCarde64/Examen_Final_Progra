package Controlador;

import Modelo.*;
import Vista.Empleado_View;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ControllerEmpleado {

    private ModeloEmpleado modelo;
    private Empleado_View vista;
    private String id_empleado = "", criterio = "";
    Validaciones validaciones = new Validaciones();
    DefaultTableModel mTablaModel = new DefaultTableModel(
            new Object[]{"ID", "Cedula", "Nombres", "Apellidos", "Fecha Contratación", "Salario", "Discapacidad", "Horario"}, 0);

    JFileChooser jfc;

    public ControllerEmpleado(ModeloEmpleado modelo, Empleado_View vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.getLblAlertaResultado().setVisible(false);
        CargarEmpleados();
    }

    public void iniciaControl() {
        vista.getBtnActualizar().addActionListener(l -> CargarEmpleados());
        vista.getBtnBuscar().addActionListener(l -> buscar());
        vista.getBtnImprimir().addActionListener(l -> imprimirEmpleados());
        vista.getBtnCrear().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnAceptar().addActionListener(l -> CrearEditarEmpleado());
        vista.getBtnCancelar().addActionListener(l -> cancelar());

        vista.getTblEmpleados().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verIdDatos(evt);
            }
        });

        vista.getBtnEliminar().addActionListener(l -> eliminar());

        vista.getJtextfield_Buscar().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscar();
            }
        });

        vista.getField_Cedula().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloNumeros(evt);
            }
        });
        vista.getTxtNombre().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloLetras(evt);
            }
        });
        vista.getTxtApellido().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.IngresarSoloLetras(evt);
            }
        });
        vista.getTxtSalario().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validaciones.ValiSueldo(evt);
            }
        });
    }

    private void CargarEmpleados() {
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        vista.getTblEmpleados().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTblEmpleados().setRowHeight(50);
        vista.getTblEmpleados().setModel(mTablaModel);

        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getTblEmpleados().getModel();
        mTabla.setNumRows(0);

        List<Empleado> listap = modelo.listarEmpleados("");

        listap.stream().forEach(emp -> {
            String[] filaNueva = {String.valueOf(emp.getId_emp()), emp.getCedula(), emp.getNombres(), emp.getApellidos(),
                emp.getFechaContrato().toString(), String.valueOf(emp.getSalario()), String.valueOf(emp.getDiscapacidad()), emp.getHorario()};
            mTabla.addRow(filaNueva);
        });
    }

    private void llenarTablaBusqueda() {
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        vista.getTblEmpleados().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTblEmpleados().setRowHeight(50);
        vista.getTblEmpleados().setModel(mTablaModel);

        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getTblEmpleados().getModel();
        mTabla.setNumRows(0);

        List<Empleado> listap = modelo.listarEmpleados(criterio);

        listap.stream().forEach(emp -> {
            String[] filaNueva = {String.valueOf(emp.getId_emp()), emp.getCedula(), emp.getNombres(), emp.getApellidos(),
                emp.getFechaContrato().toString(), String.valueOf(emp.getSalario()), String.valueOf(emp.getDiscapacidad()), emp.getHorario()};
            mTabla.addRow(filaNueva);
        });
    }

    private void verIdDatos(java.awt.event.MouseEvent evt) {
        id_empleado = "";
        DefaultTableModel tm = (DefaultTableModel) vista.getTblEmpleados().getModel();

        id_empleado = String.valueOf(tm.getValueAt(vista.getTblEmpleados().getSelectedRow(), 0));
    }

    private void cancelar() {
        vista.getDlgEmpleado().dispose();
        id_empleado = "";
    }

    private void abrirDialogo(int op) {
        String titulo;
        if (op == 1) {
            titulo = "Crear Empleado";
            vista.getDlgEmpleado().setName("C");
            limpiarDatos();
            activarJdialog(titulo);
        } else {
            if (id_empleado.equals("")) {
                JOptionPane.showMessageDialog(vista, "Seleccione una empleado");
            } else {
                titulo = "Editar Empleado";
                vista.getDlgEmpleado().setName("E");
                activarJdialog(titulo);
                cargarDatos();
                id_empleado = "";
            }
        }
    }

    private void cargarDatos() {
        limpiarDatos();
        ModeloEmpleado empleado = new ModeloEmpleado();
        empleado = empleado.MostrarEmpleadoAEditar(id_empleado);

        vista.getID_DB_TXT().setText("ID: " + String.valueOf(empleado.getId_emp()));
        vista.getField_Cedula().setText(empleado.getCedula());
        vista.getTxtNombre().setText(empleado.getNombres());
        vista.getTxtApellido().setText(empleado.getApellidos());
        vista.getJdcFechaContrato().setDate(empleado.getFechaContrato());
        vista.getjComboBoxDiscapacidad().setSelectedIndex(empleado.getDiscapacidad() == true ? 0 : 1);
        vista.getjComboBoxHorario().setSelectedItem(empleado.getHorario().toString());
        vista.getTxtSalario().setText(String.valueOf(empleado.getSalario()));
    }

    private void CrearEditarEmpleado() {
        //registrar
        if (datosNoVacios()) {
            if (vista.getDlgEmpleado().getName().contentEquals("C")) {
                ModeloEmpleado empleado = new ModeloEmpleado();
                empleado = recuperarDatos(empleado);
                if (empleado.CrearEmpleado()) {
                    JOptionPane.showMessageDialog(null,
                            "Empleado creada satisfactoriamente.");
                    vista.getDlgEmpleado().dispose();
                    CargarEmpleados();
                } else {
                    JOptionPane.showMessageDialog(vista,
                            "No se pudo crear empleado error id repetido");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Faltan datos");
        }

        if (vista.getDlgEmpleado().getName().contentEquals("E")) {
            if (datosNoVacios()) {
                ModeloEmpleado empleado = new ModeloEmpleado();
                empleado = recuperarDatos(empleado);

                if (empleado.ActualizarEmpleado()) {
                    JOptionPane.showMessageDialog(null,
                            "Empleado Modificada satisfactoriamente.");
                    vista.getDlgEmpleado().dispose();

                    CargarEmpleados();
                } else {
                    JOptionPane.showMessageDialog(vista,
                            "No se pudo Modificar empleado error base");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "No se puede editar faltan datos");
            }
        }
    }

    private ModeloEmpleado recuperarDatos(ModeloEmpleado emple) {
        int id = Integer.parseInt(vista.getID_DB_TXT().getText().replace("ID: ", ""));;
        emple.setId_emp(id);
        emple.setCedula(vista.getField_Cedula().getText());
        emple.setNombres(vista.getTxtNombre().getText());
        emple.setApellidos(vista.getTxtApellido().getText());

        java.sql.Date datesql = new java.sql.Date(vista.getJdcFechaContrato().getDate().getTime());
        emple.setFechaContrato(datesql);
        emple.setDiscapacidad(vista.getjComboBoxDiscapacidad().getSelectedIndex() == 0);
        emple.setHorario(vista.getjComboBoxHorario().getSelectedItem().toString());
        System.out.println("sasasa:" + vista.getjComboBoxHorario().getSelectedItem().toString());
        emple.setSalario(Double.valueOf(vista.getTxtSalario().getText()));

        return emple;
    }

    private void eliminar() {
        if (id_empleado.equals("")) {
            JOptionPane.showMessageDialog(vista, "Selecciona una empleado");

        } else {
            int respuesta = 0;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                ModeloEmpleado empleado = new ModeloEmpleado();

                if (empleado.deleteEmpleado(id_empleado)) {
                    JOptionPane.showMessageDialog(vista, "Registro Eliminado");
                    id_empleado = "";
                    CargarEmpleados();
                } else {
                    JOptionPane.showMessageDialog(vista, "El registro no se elimino");
                    id_empleado = "";
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Cancelado");
                id_empleado = "";
            }
        }
    }

    private boolean datosNoVacios() {
        return !vista.getField_Cedula().getText().equals("") && !vista.getTxtNombre().getText().equals("") && !vista.getTxtApellido().getText().equals("")
                && !vista.getJdcFechaContrato().toString().equals("") && !vista.getTxtSalario().getText().equals("");
    }

    private void buscar() {
        criterio = vista.getJtextfield_Buscar().getText().trim();

        if (!criterio.equals("")) {
            llenarTablaBusqueda();
        } else {
            vista.getLblAlertaResultado().setVisible(false);
            CargarEmpleados();
        }
    }

    public void ImprimirEmpleados() {
        ConectPG cpg = new ConectPG();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Blank_A4.jasper"));
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("limitea", Integer.parseInt(vista.getTxtmaximo().getText()));
            parametros.put("limiteb", Integer.parseInt(vista.getTxtminimo().getText()));
            parametros.put("titulo", vista.getTxttitulo().getText());
            JasperPrint jp = JasperFillManager.fillReport(
                    jr,
                    parametros, cpg.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void activarJdialog(String titulo) {
        vista.getDlgEmpleado().setTitle(titulo);
        vista.getDlgEmpleado().setSize(680, 330);
        vista.getDlgEmpleado().setLocationRelativeTo(vista);
        vista.getDlgEmpleado().setVisible(true);
    }

    private void limpiarDatos() {
        vista.getField_Cedula().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getjComboBoxDiscapacidad().setSelectedItem(1);
        vista.getjComboBoxHorario().setSelectedItem(1);
        vista.getTxtSalario().setText("");
    }

    private void imprimirEmpleados() {
        ConectPG cpg = new ConectPG();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/MVC - ANGEL CARDENAS - M3A.jasper"));
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("limitea", Integer.parseInt(vista.getTxtmaximo().getText()));
            parametros.put("limiteb", Integer.parseInt(vista.getTxtminimo().getText()));
            parametros.put("titulo", vista.getTxttitulo().getText());
            JasperPrint jp = JasperFillManager.fillReport(
                    jr,
                    parametros, cpg.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
