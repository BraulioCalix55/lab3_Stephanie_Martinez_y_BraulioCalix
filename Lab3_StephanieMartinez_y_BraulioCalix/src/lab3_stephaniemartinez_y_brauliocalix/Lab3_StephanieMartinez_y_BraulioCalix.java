package lab3_stephaniemartinez_y_brauliocalix;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3_StephanieMartinez_y_BraulioCalix {

    static Random R = new Random();
    static Roca ro=new Roca();
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int pos = 0;
        ArrayList ejercito = new ArrayList();
        ArrayList soldados = new ArrayList();
        while (opcion != 5) {
            System.out.println("1.- Crear ejercitos\n2.- Crear soldados\n3.- Crear armas\n4.- Hacer guerra\n5.- Salir");
            System.out.print("  Ingrese una opción: ");
            if (opcion == 1) {
                System.out.println("1.- Crear\n2.- Modificar\n3.- Eliminar\n4.- Listar");
                System.out.print("  Ingrese una opción: ");
                int opcion1 = leer.nextInt();
                if(opcion1 == 1){
                    System.out.print("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese la región: ");
                    String region = leer.next();
                    System.out.print("Ingrese el número de victorias: ");
                    int victoria = leer.nextInt();
                    System.out.print("Ingrese la cantidad de dinero disponible: ");
                    double dinero = leer.nextDouble();
                    //add
                }
                if(opcion1 == 2){
                    System.out.print("Ingrese el ejercito que desea modificar: ");
                    int num = leer.nextInt();
                    System.out.println("1.- Nombre\n2.- Región\n3.- Número de victorias\n4.- Dinero");
                    System.out.print("  Ingrese la opción que desea modificar: ");
                    int opcionmod = leer.nextInt();
                    if(opcionmod == 1){
                        System.out.print("Ingrese el nombre: ");
                        String nombre = leer.next();
                        //ejercito.get(pos).set(nombre);
                    }
                    if(opcionmod == 2){
                        System.out.print("Ingrese la región: ");
                        String region = leer.next();
                        //ejercito.get(pos).set
                    }
                    if(opcionmod == 3){
                        System.out.print("Ingrese el número de victorias: ");
                        int victorias = leer.nextInt();
                        //ejercito.get(pos).set(victorias);
                    }
                    if(opcionmod == 4){
                        System.out.print("Ingrese la canitdad de dinero disponible: ");
                        double dinero = leer.nextDouble();
                        //ejercito.get(pos).set(dinero);
                    }
                }
                if(opcion1 == 3){
                    System.out.print("Ingrese el ejercito que desea eliminar: ");
                    int num = leer.nextInt();
                    ejercito.remove(num);
                }
                if(opcion == 4){
                    
                }
            }
            if(opcion == 2){
                System.out.print("Ingrese el ejercito al que desea crear un soldado: ");
                int numejercito = leer.nextInt();
                System.out.println("1.- Crear\n2.- Modificar\n3.- Eliminar\n4.- Listar");
                int opcion2 = leer.nextInt();
                if(opcion2 == 1){
                    int contg = 0, contc = 0, conte = 0;
                    System.out.print("Ingrese el nombre del soldado: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese el lugar: ");
                    String lugar = leer.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = leer.nextInt();
                    System.out.print("Ingrese la salud: ");
                    int salud = leer.nextInt();
                    System.out.print("Ingrese el arma: ");
                    if(contg<=1){
                        
                    } else if(contc <=3){
                        
                    } else if(conte<=1){
                        
                    }
                }
                if(opcion2 == 2){
                    
                }
            }
        }
    }
    public static Object[][] llenaroca(Object mat[][]) {

        for (int i = 0; i < 20; i++) {
            int pos1 = 1 + R.nextInt(9), pos2 = 1 + R.nextInt(9);
            if (mat[pos1][pos2].equals(ro.toString())) {
                i--;
            } else {
                mat[pos1][pos2] = ro.toString();
            }
        }
        return mat;
    }

    public static void crearmat() {

        Object[][] table = new Object[10][10];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "[ ]";

            }
   
        }
        table = llenaroca(table);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);

            }
            System.out.println("");
        }
    }

}
