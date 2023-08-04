
package lab3p2_fernandopadilla;

import java.util.Date;
import java.util.Scanner;

public class Lab3P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        int opcion2 = 0;
        
        do {
            System.out.println("------------Menu------------\n"
                    + "1)Crear\n"
                    + "2)Listar\n"
                    + "3)Modificar\n"
                    + "4)Eliminar\n"
                    + "5)Salir");
            opcion = read.nextInt();
            read = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("Que desea crear?\n"
                            + "1)Automovil\n"
                            + "2)Motocicleta\n"
                            + "3)Autobus";
                    opcion2 = read.nextInt();
                    switch (opcion2) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
    }
    
}
