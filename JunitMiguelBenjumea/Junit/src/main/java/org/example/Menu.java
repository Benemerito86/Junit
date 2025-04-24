package org.example;

import java.util.Scanner;

public class Menu {
    public Menu() {
        boolean acabar = false, depurar = false;
        int opcion = 0;
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        String username = "";
        double ingreso = 0;
        double gasto = 0;
        boolean nombrepedido = false;
        while (!acabar) {
            // muestro las opciones
            System.out.println("Menú");
            System.out.println("1. Introduce nombre de usuario");
            System.out.println("2. Introducir ingresos");
            System.out.println("3. Introducir gasto");
            System.out.println("4. Mostrar saldo");
            System.out.println("5. Salir");
            //pido opcion
            do {
                try {
                    System.out.print("Elija una opción: ");
                    opcion = scanner.nextInt();
                    depurar = true;
                    if (opcion != 1 && nombrepedido == false) {
                        depurar = false;
                        System.out.println("Debes introducir primero el nombre de usuario.");
                    }
                } catch (Exception e) {
                    System.out.println("Debe ingresar un número entero.");
                    depurar = false;
                    scanner.next();
                }
            } while (!depurar);
            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Introduce nombre de usuario");
                    username = scanner.nextLine();
                    usuario.setUsername(username);
                    nombrepedido = true;
                    break;
                case 2:
                    scanner.nextLine();
                    do {
                        try {
                            System.out.print("Introduce ingreso: ");
                            ingreso = scanner.nextDouble();
                            depurar = true;
                            if (ingreso < 0) {
                                System.out.println("El ingreso no puede ser menor que 0");
                                depurar = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Debe ingresar un número.");
                            depurar = false;
                            scanner.next();
                        }
                    } while (!depurar);
                    usuario.addIngresos(ingreso);

                    break;
                case 3:
                    scanner.nextLine();
                    do {
                        try {
                            System.out.print("Introduce gasto: ");
                            gasto = scanner.nextDouble();
                            depurar = true;
                            if (gasto < 0) {
                                System.out.println("El gasto no puede ser menor que 0");
                                depurar = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Debe ingresar un número.");
                            depurar = false;
                            scanner.next();
                        }
                    } while (!depurar);

                    do {
                        try {
                            System.out.print("Elija el tipo de gasto: ");
                            System.out.println("1: Vacaciones");
                            System.out.println("2: Alquiler");
                            System.out.println("3: Vicios");
                            opcion = scanner.nextInt();
                            depurar = true;
                            if (opcion < 1 || opcion > 3) {
                                System.out.println("Opcion invalida.");
                                depurar = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Debe ingresar un número entero.");
                            depurar = false;
                            scanner.next();
                        }
                    } while (!depurar);
                    usuario.addGasto(gasto, opcion);

                    break;
                case 4:
                    System.out.println(usuario.getUsername() + ", tu saldo es: " + usuario.getSaldo());
                    break;
                case 5:
                    acabar = true;
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }
}
