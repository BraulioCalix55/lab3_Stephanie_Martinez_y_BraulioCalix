package lab3_stephaniemartinez_y_brauliocalix;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3_StephanieMartinez_y_BraulioCalix {

    static Random R = new Random();
    static Roca ro = new Roca();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int pos = 0;
        Armas arma = null;
        ArrayList<Ejercito> ejercito = new ArrayList();
        ArrayList<Soldado> soldados = new ArrayList();
        ArrayList<Armas> armas = new ArrayList();
        while (opcion != 5) {
            System.out.println("\n------------------------------------");
            System.out.println("1.- Ejercitos\n2.- Soldados\n3.- Armas\n4.- Hacer guerra\n5.- Salir");
            System.out.print("  Ingrese una opción: ");
            opcion = leer.nextInt();
            System.out.println("------------------------------------");
            if (opcion == 1) {
                System.out.println("\n1.- Crear\n2.- Modificar\n3.- Eliminar\n4.- Listar");
                System.out.print("  Ingrese una opción: ");
                int opcion1 = leer.nextInt();
                if (opcion1 == 1) {
                    System.out.println("------------------------------------");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese la región: ");
                    String region = leer.next();
                    System.out.print("Ingrese el número de victorias: ");
                    int victoria = leer.nextInt();
                    System.out.print("Ingrese la cantidad de dinero disponible: ");
                    double dinero = leer.nextDouble();
                    ejercito.add(new Ejercito(nombre, region, victoria, dinero, soldados));
                }
                if (opcion1 == 2) {
                    System.out.println("------------------------------------");
                    System.out.print("\nIngrese el ejercito que desea modificar: ");
                    int num = leer.nextInt();
                    System.out.println("1.- Nombre\n2.- Región\n3.- Número de victorias\n4.- Dinero");
                    System.out.print("  Ingrese la opción que desea modificar: ");
                    int opcionmod = leer.nextInt();
                    if (opcionmod == 1) {
                        System.out.print("Ingrese el nombre: ");
                        String nombre = leer.next();
                        ejercito.get(pos).setNombre(nombre);
                    }
                    if (opcionmod == 2) {
                        System.out.print("Ingrese la región: ");
                        String region = leer.next();
                        ejercito.get(pos).setRegion(region);
                    }
                    if (opcionmod == 3) {
                        System.out.print("Ingrese el número de victorias: ");
                        int victorias = leer.nextInt();
                        ejercito.get(pos).setVictorias(victorias);
                    }
                    if (opcionmod == 4) {
                        System.out.print("Ingrese la canitdad de dinero disponible: ");
                        double dinero = leer.nextDouble();
                        ejercito.get(pos).setDinero(dinero);
                    }
                }
                if (opcion1 == 3) {
                    System.out.println("------------------------------------");
                    System.out.print("Ingrese el ejercito que desea eliminar: ");
                    int num = leer.nextInt();
                    ejercito.remove(num);
                }
                if (opcion == 4) {
                    for (int i = 0; i < ejercito.size(); i++) {
                        System.out.println(i + ". " + ejercito.get(i).toString());
                    }
                }
            }
            if (opcion == 2) {
                System.out.println("------------------------------------");
                System.out.println("\n1.- Crear\n2.- Modificar\n3.- Eliminar\n4.- Listar");
                System.out.print("  Ingrese una opción: ");
                int opcion2 = leer.nextInt();
                System.out.print("\nIngrese el ejercito al que desea crear, modificar, eliminar o listar un soldado: ");
                int numejercito = leer.nextInt();
                if (opcion2 == 1) {
                    System.out.println("------------------------------------");
                    int contg = 0, contc = 0, conte = 0;
                    System.out.print("Ingrese el nombre del soldado: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese el lugar: ");
                    String lugar = leer.next();
                    System.out.print("Ingrese la edad: ");
                    String edad = leer.next();
                    System.out.print("Ingrese la salud: ");
                    int salud = leer.nextInt();
                    System.out.print("Ingrese el arma: ");
                    String arma1 = leer.next();
                    if (contg <= 1) {
                        System.out.println("Ingrese los años al mando: ");
                        int an = leer.nextInt();
                        ejercito.get(numejercito).getSoldados().add(new General(an, nombre, lugar, edad, salud, arma));
                        contg++;
                    } else if (contc <= 3) {
                        ejercito.get(numejercito).getSoldados().add(new Caballero(nombre, lugar, edad, salud, arma));
                        contc++;
                    } else if (conte <= 1) {
                        Bomba b = null;
                        ejercito.get(numejercito).getSoldados().add(new Ejecutor(b, nombre, lugar, edad, salud, arma));
                        conte++;
                    } else {
                        System.out.println("Ya no se pueden agregar más soldados.");
                    }
                }
                if (opcion2 == 2) {
                    System.out.println("------------------------------------");
                    System.out.print("\nIngrese la posición del soldados que desea modificar: ");
                    int possol = leer.nextInt();
                    System.out.println("1.- Nombre\n2.- Lugar\n3.- Edad\n4.- Salud\n5.- Arma");
                    System.out.print("  Ingrese la opción que desea modificar: ");
                    int opcionmod = leer.nextInt();
                    if (opcionmod == 1) {
                        System.out.print("Ingrese el nombre: ");
                        String nombre = leer.next();
                        ejercito.get(numejercito).getSoldados().set(possol, nombre);
                    }
                    if (opcionmod == 2) {
                        System.out.print("Ingrese el lugar: ");
                        String lugar = leer.next();
                        ejercito.get(numejercito).getSoldados().set(possol, lugar);
                    }
                    if (opcionmod == 3) {
                        System.out.print("Ingrese la edad: ");
                        int edad = leer.nextInt();
                        ejercito.get(numejercito).getSoldados().set(possol, edad);
                    }
                    if (opcionmod == 4) {
                        System.out.print("Ingrese la salud: ");
                        int salud = leer.nextInt();
                        ejercito.get(numejercito).getSoldados().set(possol, salud);
                    }
                    if (opcionmod == 5) {
                        System.out.print("Ingrese el arma: ");
                        String arma1 = leer.next();
                        ejercito.get(numejercito).getSoldados().set(possol, arma);
                    }
                }
                if (opcion2 == 3) {
                    System.out.print("\nIngrese el soldado que desea eliminar: ");
                    int possoldado = leer.nextInt();
                    ejercito.get(numejercito).getSoldados().remove(possoldado);
                }
                if (opcion2 == 4) {
                    for (int i = 0; i < ejercito.get(i).getSoldados().size(); i++) {
                        System.out.println(i + ". " + ejercito.get(i).getSoldados().toString());
                    }
                }
            }
            if (opcion == 3) {
                //System.out.print("Ingrese el ejercito al que desea crear, modificar, eliminar o listar un arma: ");
                //int posejer = leer.nextInt();
                System.out.println("------------------------------------");
                System.out.println("\n1.- Crear\n2.- Modificar\n3.- Eliminar\n4.- Listar");
                System.out.print("  Ingrese una opción: ");
                int opcion3 = leer.nextInt();
                if (opcion3 == 1) {
                    System.out.print("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.print("1.- Bombas  2.- Rifles  3.- Arma Blanca: ");
                    int opa = leer.nextInt();
                    if (opa == 1) {
                        System.out.print("Ingrese el material: ");
                        String mat = leer.next();
                        System.out.print("Ingrese el alcance: ");
                        int alcance = leer.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precio = leer.nextDouble();
                        armas.add(new Bomba(mat, nombre, alcance, precio));
                    } else if (opa == 2) {
                        System.out.print("Desea que el rifle sea automático 1 para si, 2 para no");
                        int auto = leer.nextInt();
                        System.out.print("Ingrese el alcance: ");
                        int alcance = leer.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precio = leer.nextDouble();
                        armas.add(new Rifle(auto, nombre, alcance, precio));
                    } else if (opa == 3) {
                        System.out.print("Ingrese el material: ");
                        String mat = leer.next();
                        System.out.print("Ingrese el alcance: ");
                        int alcance = leer.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precio = leer.nextDouble();
                        armas.add(new ArmaBlanca(mat, nombre, alcance, precio));
                    }

                }
                if (opcion3 == 2) {
                    System.out.println("------------------------------------");
                    System.out.print("\nIngrese el arma que desea modificar: ");
                    int armapos = leer.nextInt();
                    System.out.println("1.- Nombre\n2.- Alcance\n3.- Precio");
                    System.out.print("  Ingrese una opción: ");
                    int op = leer.nextInt();
                    if (op == 1) {
                        System.out.print("Ingrese el nombre: ");
                        String nombre = leer.next();
                        armas.get(armapos).setNombre(nombre);
                    }
                    if (op == 2) {
                        System.out.print("Ingrese el alcance: ");
                        int alcance = leer.nextInt();
                        armas.get(armapos).setAlcance(alcance);
                    }
                    if (op == 3) {
                        System.out.print("Ingrese el precio: ");
                        double precio = leer.nextDouble();
                        armas.get(armapos).setPrecio(precio);
                    }
                }
                if (opcion3 == 3) {
                    System.out.print("Ingrese el arma que desea eliminar: ");
                    int poselim = leer.nextInt();
                    armas.remove(poselim);
                }
                if (opcion3 == 4) {
                    for (int i = 0; i < armas.size(); i++) {
                        System.out.println(i + ". " + armas.get(i).toString());
                    }
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
