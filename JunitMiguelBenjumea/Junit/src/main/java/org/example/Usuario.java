package org.example;

import java.util.ArrayList;

public class Usuario {
    private String username;
    private Gastos gastos = new Gastos();
    private double ingresos;


    public Usuario() {
        this.username = "";
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
        System.out.println("Nombre cambiado a " + getUsername());

    }

    public void addGasto (double dinero, int opcion) {
        if (ingresos < gastos.getGastos() + dinero) {
            dinero = getIngresos()- gastos.getGastos();
            System.out.println("Límite superado.");
        }
        if (opcion == 1) { // 1 vacaciones
            gastos.addVacaciones(dinero);
            System.out.println("Gasto de " + dinero + " en vacaciones.");
        }
        if (opcion == 2) { // 2 alquiler
            gastos.addAlquiler(dinero);
            System.out.println("Gasto de " + dinero + " en alquiler.");
        }
        if (opcion == 3) { // 3 vicios
            gastos.addVicios(dinero);
            System.out.println("Gasto de " + dinero + " en vicios.");
        }
    }

    public double getIngresos() {
        return ingresos;
    }
    public void addIngresos(double ingresos) {
        this.ingresos += ingresos;
        System.out.println("Ingreso de " + ingresos + " en nóminas.");
    }

    public double getSaldo() {
        double saldo = 0;

        saldo = getIngresos() - gastos.getGastos();
        if (saldo < 0) {
            saldo = 0;
        }
        return saldo;
    }


}
