package Modelo;

import java.sql.Date;

public class Empleado {

    private int id_emp;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaContrato;
    private Double salario;
    private Boolean discapacidad;
    private String horario;

    public Empleado() {
    }

    public Empleado(int id_emp, String cedula, String nombres, String apellidos, Date fechaContrato, Double salario, Boolean discapacidad, String horario) {
        this.id_emp = id_emp;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
        this.discapacidad = discapacidad;
        this.horario = horario;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
