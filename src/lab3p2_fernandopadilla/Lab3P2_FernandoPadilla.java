package lab3p2_fernandopadilla;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        int opcion = 0;
        int opcion2 = 0;
        String lista = "";
        do {
            System.out.println("------------Menu------------\n"
                    + "1)Agregar\n"
                    + "2)Modificar\n"
                    + "3)Eliminar\n"
                    + "4)Mostrar Vehiculos\n"
                    + "5)Generar Voleta \n"
                    + "6)Salir");
            opcion = read.nextInt();
            read = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("Que desea crear?\n"
                            + "1)Automovil\n"
                            + "2)Motocicleta\n"
                            + "3)Autobus");
                    opcion2 = read.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese la placa del vehiculo: ");
                            String placa = read.next();
                            System.out.println("Ingrese la marca del vehiculo: ");
                            read.nextLine();
                            String marca = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el modelo del vehiculo: ");
                            read.nextLine();
                            String modelo = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el tipo de vehiculo: ");
                            String tipo = read.next();
                            System.out.println("Ingrese el color:");
                            Color color = JColorChooser.showDialog(null, "Ponga un color", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                            String fecha = read.next();
                            Date fechaV = new Date(fecha);
                            System.out.println("Ingrese el tipo de combustible del auto: ");
                            String tipoC = read.next();
                            System.out.println("Ingrese el numero de puertas del auto: ");
                            int numP = read.nextInt();
                            System.out.println("Ingrese el tipo de transmision del carro: ");
                            String tipoT = read.next();
                            System.out.println("Ingrese el numero de asientos del carro: ");
                            int numA = read.nextInt();
                            vehiculos.add(new Automovil(tipoC, numP, tipoT, numA, placa, marca, modelo, tipo, color, fechaV));
                            System.out.println("Agregado con exito");
                            break;
                        case 2:
                            System.out.println("Ingrese la placa del vehiculo: ");
                            placa = read.next();
                            System.out.println("Ingrese la marca del vehiculo: ");
                            read.nextLine();
                            marca = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el modelo del vehiculo: ");
                            read.nextLine();
                            modelo = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el tipo de vehiculo: ");
                            tipo = read.next();
                            System.out.println("Ingrese el color:");
                            color = JColorChooser.showDialog(null, "Ponga un color", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                            fecha = read.next();
                            fechaV = new Date(fecha);
                            System.out.println("Ingrese la velocidad maxima de la motocicleta: ");
                            double velocidadM = read.nextDouble();
                            System.out.println("Ingrese el peso de la motocicleta: ");
                            double peso = read.nextDouble();
                            System.out.println("Ingrese el consumo de la motocicleta: ");
                            double consumo = read.nextDouble();
                            vehiculos.add(new Motocicleta(velocidadM, peso, consumo, placa, marca, modelo, tipo, color, fechaV));
                            System.out.println("Agregado con exito");
                            break;
                        case 3:
                            System.out.println("Ingrese la placa del vehiculo: ");
                            placa = read.next();
                            System.out.println("Ingrese la marca del vehiculo: ");
                            read.nextLine();
                            marca = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el modelo del vehiculo: ");
                            read.nextLine();
                            modelo = read.nextLine();
                            read = new Scanner(System.in);
                            System.out.println("Ingrese el tipo de vehiculo: ");
                            tipo = read.next();
                            System.out.println("Ingrese el color:");
                            color = JColorChooser.showDialog(null, "Ponga un color", Color.yellow);
                            System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                            fecha = read.next();
                            fechaV = new Date(fecha);
                            System.out.println("Ingrese la cantidad de pasajeros: ");
                            int numeroP = read.nextInt();
                            System.out.println("Ingrese el numero de ejes: ");
                            int numeroE = read.nextInt();
                            System.out.println("Ingrese la longitud del autobus: ");
                            double longitud = read.nextDouble();
                            vehiculos.add(new Autobus(numeroP, numeroE, longitud, placa, marca, modelo, tipo, color, fechaV));
                            System.out.println("Agregado con exito");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    lista = "";
                    for (Vehiculo t : vehiculos) {
                        lista += vehiculos.indexOf(t) + ".- " + t;
                    }
                    System.out.println(lista);
                    System.out.println("Ingrese el indice a modificar: ");
                    int index = read.nextInt();
                    if (index >= 0 && index < vehiculos.size()) {
                        if (vehiculos.get(index) instanceof Automovil) {
                            System.out.println("Que desea modificar?: "
                                    + "1)Numero de placa\n"
                                    + "2)Marca\n"
                                    + "3)Modelo\n"
                                    + "4)Tipo\n"
                                    + "5)Color\n"
                                    + "6)Año\n"
                                    + "7)Tipo de combustible\n"
                                    + "8)Numero de puertas\n"
                                    + "9)Tipo de transmision\n"
                                    + "10)Numero de asientos");
                            opcion2 = read.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Ingrese la nueva placa: ");
                                    String placa = read.next();
                                    vehiculos.get(index).setPlaca(placa);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la nueva marca: ");
                                    read.nextLine();
                                    String marca = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setMarca(marca);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nuevo modelo del vehiculo: ");
                                    read.nextLine();
                                    String modelo = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setModelo(modelo);
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nuevo tipo del vehiculo: ");
                                    String tipo = read.next();
                                    vehiculos.get(index).setTipo(tipo);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el nuevo color: ");
                                    Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
                                    vehiculos.get(index).setColor(color);
                                    break;
                                case 6:
                                    System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                                    String fecha = read.next();
                                    Date fechaV = new Date(fecha);
                                    vehiculos.get(index).setAño(fechaV);
                                    break;
                                case 7:
                                    
                                    break;
                                case 8:

                                    break;
                                case 9:

                                    break;
                                case 10:

                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        } else if (vehiculos.get(index) instanceof Motocicleta) {
                            System.out.println("Que desea modificar?: "
                                    + "1)Numero de placa\n"
                                    + "2)Marca\n"
                                    + "3)Modelo\n"
                                    + "4)Tipo\n"
                                    + "5)Color\n"
                                    + "6)Año\n"
                                    + "7)Tipo de combustible\n"
                                    + "8)Numero de puertas\n"
                                    + "9)Tipo de transmision\n"
                                    + "10)Numero de asientos");
                            opcion2 = read.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Ingrese la nueva placa: ");
                                    String placa = read.next();
                                    vehiculos.get(index).setPlaca(placa);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la nueva marca: ");
                                    read.nextLine();
                                    String marca = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setMarca(marca);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nuevo modelo del vehiculo: ");
                                    read.nextLine();
                                    String modelo = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setModelo(modelo);
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nuevo tipo del vehiculo: ");
                                    String tipo = read.next();
                                    vehiculos.get(index).setTipo(tipo);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el nuevo color: ");
                                    Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
                                    vehiculos.get(index).setColor(color);
                                    break;
                                case 6:
                                    System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                                    String fecha = read.next();
                                    Date fechaV = new Date(fecha);
                                    vehiculos.get(index).setAño(fechaV);
                                    break;
                                case 7:
                                    System.out.println("Ingrese el tipo de combustible nuevo: ");
                                    String tipoC = read.next();
                                    ((Automovil)vehiculos.get(index)).setTipoC(tipoC);
                                    break;
                                case 8:
                                    System.out.println("Ingrese el numero de puertas: ");
                                    int numP = read.nextInt();
                                    ((Automovil)vehiculos.get(index)).setNumP(numP);
                                    break;
                                case 9:
                                    System.out.println("Ingrese el tipo de transmision: ");
                                    String tipoT = read.next();
                                    ((Automovil)vehiculos.get(index)).setTipoT(tipoT);
                                    break;
                                case 10:
                                    System.out.println("Ingrese el numero de asientos: ");
                                    int numA = read.nextInt();
                                    ((Automovil)vehiculos.get(index)).setNumA(numA);
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        } else if (vehiculos.get(index) instanceof Autobus) {
                            System.out.println("Que desea modificar?: "
                                    + "1)Numero de placa\n"
                                    + "2)Marca\n"
                                    + "3)Modelo\n"
                                    + "4)Tipo\n"
                                    + "5)Color\n"
                                    + "6)Año\n"
                                    + "7)Tipo de combustible\n"
                                    + "8)Numero de puertas\n"
                                    + "9)Tipo de transmision\n"
                                    + "10)Numero de asientos");
                            opcion2 = read.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Ingrese la nueva placa: ");
                                    String placa = read.next();
                                    vehiculos.get(index).setPlaca(placa);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la nueva marca: ");
                                    read.nextLine();
                                    String marca = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setMarca(marca);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nuevo modelo del vehiculo: ");
                                    read.nextLine();
                                    String modelo = read.nextLine();
                                    read = new Scanner(System.in);
                                    vehiculos.get(index).setModelo(modelo);
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nuevo tipo del vehiculo: ");
                                    String tipo = read.next();
                                    vehiculos.get(index).setTipo(tipo);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el nuevo color: ");
                                    Color color = JColorChooser.showDialog(null, "Ingrese color", Color.yellow);
                                    vehiculos.get(index).setColor(color);
                                    break;
                                case 6:
                                    System.out.println("Ingrese el año del vehiculo(dd/mm/yyyy): ");
                                    String fecha = read.next();
                                    Date fechaV = new Date(fecha);
                                    vehiculos.get(index).setAño(fechaV);
                                    break;
                                case 7:

                                    break;
                                case 8:

                                    break;
                                case 9:

                                    break;
                                case 10:

                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    break;
                case 3:
                    lista = "";
                    for (Vehiculo t : vehiculos) {
                        lista += vehiculos.indexOf(t) + ".- " + t;
                    }
                    System.out.println(lista);
                    System.out.println("Ingrese el indice a modificar: ");
                    index = read.nextInt();
                    if (index >= 0 && index < vehiculos.size()) {
                        vehiculos.remove(index);
                        System.out.println("Eliminado con exito");
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    opcion = 6;
                    break;
            }
        } while (opcion != 6);

    }
}
