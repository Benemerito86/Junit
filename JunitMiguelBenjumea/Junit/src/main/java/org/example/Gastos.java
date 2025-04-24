package org.example;

public class Gastos {
    private double vacaciones;
    private double alquiler;
    private double vicios;

    public Gastos() {
        vacaciones = 0;
        alquiler = 0;
        vicios = 0;
    }

    public double getVacaciones() {
        return vacaciones;
    }

    public void addVacaciones(double vacaciones) {
        this.vacaciones += vacaciones;
    }

    public double getAlquiler() {
        return alquiler;
    }

    public void addAlquiler(double alquiler) {
        this.alquiler += alquiler;
    }

    public double getVicios() {
        return vicios;
    }

    public void addVicios(double vicios) {
        this.vicios += vicios;
    }

    public double getGastos() {
        return getVacaciones() + getAlquiler() + getVicios();
    }
}
