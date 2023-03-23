package Controlador;

import Modelo.ModeloEmpleado;
import Vista.Empleado_View;
import Vista.VistaMP;
import java.awt.Component;

public class ControllerMP {

    private VistaMP mainView;

    public ControllerMP(VistaMP v) {
        this.mainView = v;
        mainView.setVisible(true);
    }

    public void iniciaControl() {
        mainView.getjMenuItemCrearPersona().addActionListener(l -> crudEmpleado());
        mainView.getPersona_Button().addActionListener(l -> crudEmpleado());
        mainView.setLocationRelativeTo(null);
        mainView.setTitle("Practica En Clases #1 - PROMAGAMACION VISUAL - ANGEL CARDENAS");
    }


    private void crudEmpleado() {
        System.out.println("sasassa");
        ModeloEmpleado m = new ModeloEmpleado();
        Empleado_View emple_View = new Empleado_View();
        showForm(emple_View);
        ControllerEmpleado c = new ControllerEmpleado(m, emple_View);
        c.iniciaControl();
    }
    
    
    public void showForm(Component com) {
        mainView.getBody().removeAll();
        mainView.getBody().add(com);
        mainView.getBody().repaint();
        mainView.getBody().revalidate();
    }
}
