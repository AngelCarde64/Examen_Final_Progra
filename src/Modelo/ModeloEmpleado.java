package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloEmpleado extends Empleado {

    ConectPG conpg = new ConectPG();

    public ModeloEmpleado() {
    }

    public ModeloEmpleado(int id_emp, String cedula, String nombres, String apellidos, java.sql.Date fechaContrato, Double salario, Boolean discapacidad, String horario) {
        super(id_emp, cedula, nombres, apellidos, fechaContrato, salario, discapacidad, horario);
    }

    public List<Empleado> listarEmpleados(String filtro) {
        String sql = "select * from empleado";

        if (!filtro.isEmpty()) {
            sql += "WHERE UPPER(emp_cedula) like UPPER('%" + filtro + "%') ";
            sql += "OR UPPER(emp_nombres) like UPPER('%" + filtro + "%') ";
            sql += "OR UPPER(emp_apellidos) like UPPER('%" + filtro + "%');";
        }

        ResultSet rs = conpg.consulta(sql);
        List<Empleado> lista = new ArrayList<Empleado>();
        try {
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setId_emp(rs.getInt("emp_id"));
                emp.setCedula(rs.getString("emp_cedula"));
                emp.setNombres(rs.getString("emp_nombres"));
                emp.setApellidos(rs.getString("emp_apellidos"));
                emp.setFechaContrato(rs.getDate("emp_fecha_contrato"));
                emp.setSalario(rs.getDouble("emp_salario"));
                emp.setDiscapacidad(rs.getBoolean("emp_discapacidad"));
                emp.setHorario(rs.getString("emp_horario"));
                lista.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean CrearEmpleado() {
        String sql = "INSERT INTO empleado(emp_cedula, emp_nombres, emp_apellidos, emp_fecha_contrato, "
                + "emp_salario, emp_discapacidad, emp_horario) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = conpg.con.prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombres());
            ps.setString(3, getApellidos());
            ps.setDate(4, new java.sql.Date(((Date) getFechaContrato()).getTime()));
            ps.setDouble(5, getSalario());
            ps.setBoolean(6, getDiscapacidad());
            ps.setString(7, getHorario());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ActualizarEmpleado() {
        String sqlEmpleado = "UPDATE empleado SET emp_cedula=?, emp_nombres=?, emp_apellidos=?, emp_fecha_contrato=?, emp_salario=?, emp_discapacidad=?, emp_horario=?"
                + " WHERE emp_id = ?";
        try {
            PreparedStatement ps = conpg.getCon().prepareStatement(sqlEmpleado);
            ps.setString(1, getCedula());
            ps.setString(2, getNombres());
            ps.setString(3, getApellidos());
            ps.setDate(4, new java.sql.Date(((Date) getFechaContrato()).getTime()));
            ps.setDouble(5, getSalario());
            ps.setBoolean(6, getDiscapacidad());
            ps.setString(7, getHorario());
            ps.setInt(8, getId_emp());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ModeloEmpleado MostrarEmpleadoAEditar(String id) {
        String sql = "select * from empleado where emp_id = '" + id + "'";
        ResultSet rs = conpg.consulta(sql);
        ModeloEmpleado empleado = new ModeloEmpleado();

        try {
            while (rs.next()) {
                empleado.setId_emp(rs.getInt("emp_id"));
                empleado.setCedula(rs.getString("emp_cedula"));
                empleado.setNombres(rs.getString("emp_nombres"));
                empleado.setApellidos(rs.getString("emp_apellidos"));
                empleado.setFechaContrato(rs.getDate("emp_fecha_contrato"));
                empleado.setSalario(rs.getDouble("emp_salario"));
                empleado.setDiscapacidad(rs.getBoolean("emp_discapacidad"));
                empleado.setHorario(rs.getString("emp_horario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return empleado;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean deleteEmpleado(String id) {
        String sql = "DELETE FROM empleado WHERE emp_id ='" + id + "';";
        return conpg.accion(sql);
    }
}
