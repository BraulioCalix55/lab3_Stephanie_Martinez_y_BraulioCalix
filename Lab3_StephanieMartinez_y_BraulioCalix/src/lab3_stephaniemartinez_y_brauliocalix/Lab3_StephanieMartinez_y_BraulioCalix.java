package lab3_stephaniemartinez_y_brauliocalix;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3_StephanieMartinez_y_BraulioCalix {

    static Random R = new Random();
    static Roca ro = new Roca();
    static Scanner leer = new Scanner(System.in);
    static Object[][] table = new Object[10][10];
    static Object[][] mat2 = new Object[10][10];
    static int con1 = 5, con2 = 5;
    static ArrayList<Soldado> soldados = new ArrayList();
    static ArrayList<Armas> armas = new ArrayList();
    static ArrayList<Ejercito> ejercito = new ArrayList();
    static String nombre1;
    static String nombre2;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int pos = 0;
        Armas arma = null;

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
                if (opcion1 == 4) {
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

            if (opcion == 4) {
                System.out.println("------------------------------------");
                System.out.println("\n1.- asignar ejercitos\n2.- Dinamica de guerra");
                int guerra = leer.nextInt();
                switch (guerra) {
                    case 1:
                        administrar();
                        break;
                    case 2:
                        guerrilla();
                        break;
                    default:
                        break;

                }
            }
        }
    }

    public static Object[][] llenaroca(Object mat[][], Object mat2[][]) {
        for (int i = 0; i < 20; i++) {
            int pos1 = 1 + R.nextInt(9), pos2 = 1 + R.nextInt(9);
            if (mat[pos1][pos2].equals(ro.toString()) || mat2[pos1][pos2].equals(ro.toString())) {
                i--;
            } else {
                mat[pos1][pos2] = ro.toString();
                mat2[pos1][pos2] = ro.toString();
            }
        }
        return mat;
    }

    public static void guerrilla() {
        int pos = 0;
        // TODO code application logic here
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = "[ ]";
                mat2[i][j] = "[ ]";
            }
        }
        table = llenaroca(table, mat2);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println("");
        }

        System.out.println("ejercito :"+nombre1);
        llenar(table);
        System.out.println("Ejercito :"+nombre2);
        llenar(mat2);
        int tipo = 0;
        boolean seguir = true;
        while (seguir = true) {
            if (pos == 0) {

                System.out.println("ejercito 1:");
                System.out.println("ingrese la posicion de x del que quiere mover");
                int x = leer.nextInt();
                System.out.println("ingrese la posicion de y del que quiere mover");
                int y = leer.nextInt();
                while (table[x][y].equals("[ ]")) {
                    System.out.println("no selecciono nada");
                    System.out.println("vuelva a ingresar x: ");
                    x = leer.nextInt();
                    System.out.println("vuelva a ingresar y: ");
                    y = leer.nextInt();
                }
                if (table[x][y].equals("[G]")) {
                    tipo = 1;
                } else if (table[x][y].equals("[C]")) {
                    tipo = 2;
                } else if (table[x][y].equals("[E]")) {
                    tipo = 3;
                }
                System.out.println("ingrese la posicion de x a donde lo quiere mover ");
                int x2 = leer.nextInt();
                System.out.println("ingrese la posicion de y a donde lo quiere mover");
                int y2 = leer.nextInt();
                if (mat2[x2][y2].equals("[G]") || mat2[x2][y2].equals("[E]") || mat2[x2][y2].equals("[C]")) {
                    System.out.println("aqui hay un SOLDADO");
                } else if (mat2[x2][y2].equals("[R]")) {
                    System.out.println("aqui hay una PIEDRA");
                } else {
                    System.out.println("movimiento aceptado");
                    if (tipo == 1) {
                        table[x][y] = "[ ]";
                        table[x2][y2] = "[G]";
                    } else if (tipo == 2) {
                        table[x][y] = "[ ]";
                        table[x2][y2] = "[C]";
                    } else if (tipo == 3) {
                        table[x][y] = "[ ]";
                        table[x2][y2] = "[E]";
                    }
                }
                System.out.println("ingrese la posicion de x donde quiere atacar");
                int ax = leer.nextInt();
                System.out.println("ingrese la posicion de y donde quiere atacar");
                int ay = leer.nextInt();
                if (mat2[ax][ay].equals("[G]") || mat2[ax][ay].equals("[E]") || mat2[ax][ay].equals("[C]")) {
                    System.out.println("aqui hay un SOLDADO");
                    mat2[ax][ay] = "[X]";
                    con2--;
                }
            } else {
                System.out.println("ejercito 2");
                System.out.println("ingrese la posicion de x del que quiere mover");
                int x = leer.nextInt();
                System.out.println("ingrese la posicion de y del que quiere mover");
                int y = leer.nextInt();
                while (mat2[x][y].equals("[ ]")) {
                    System.out.println("no selecciono nada");
                    System.out.println("vuelva a ingresar x: ");
                    x = leer.nextInt();
                    System.out.println("vuelva a ingresar y: ");
                    y = leer.nextInt();
                }
                if (mat2[x][y].equals("[G]")) {
                    tipo = 1;
                } else if (mat2[x][y].equals("[C]")) {
                    tipo = 2;
                } else if (mat2[x][y].equals("[E]")) {
                    tipo = 3;
                }
                System.out.println("ingrese la posicion de x a donde lo quiere mover ");
                int x2 = leer.nextInt();
                System.out.println("ingrese la posicion de y a donde lo quiere mover");
                int y2 = leer.nextInt();
                if (table[x2][y2].equals("[G]") || table[x2][y2].equals("[E]") || table[x2][y2].equals("[C]")) {
                    System.out.println("aqui hay un SOLDADO");
                } else if (table[x2][y2].equals("[R]")) {
                    System.out.println("aqui hay una PIEDRA");
                } else {
                    System.out.println("movimiento aceptado");
                    if (tipo == 1) {
                        mat2[x][y] = "[ ]";
                        mat2[x2][y2] = "[G]";
                    } else if (tipo == 2) {
                        mat2[x][y] = "[ ]";
                        mat2[x2][y2] = "[C]";
                    } else if (tipo == 3) {
                        mat2[x][y] = "[ ]";
                        mat2[x2][y2] = "[E]";
                    }
                }
                System.out.println("ingrese la posicion de x donde quiere atacar");
                int ax = leer.nextInt();
                System.out.println("ingrese la posicion de y donde quiere atacar");
                int ay = leer.nextInt();
                if (table[ax][ay].equals("[G]") || table[ax][ay].equals("[E]") || table[ax][ay].equals("[C]")) {
                    System.out.println("aqui hay un SOLDADO");
                    table[ax][ay] = "[X]";
                    con1--;
                }
            }
            if (con1 < 1 || con2 < 1) {
                seguir = false;
            }
            if (con1 > 0) {
                System.out.println("el jugador uno gano");
            } else if (con2 > 1) {
                System.out.println("el jugador dos gano");
            }
        }
    }

    public static void llenar(Object[][] mat) {
        System.out.println("ingrese la posicion x del general");
        int x = leer.nextInt();
        System.out.println("ingrese la posicion y del general");
        int y = leer.nextInt();
        while ((x > 9 || y > 9) || x < 0 || y < -0) {
            System.out.println("valores invalidos");
            System.out.println("ingrese la posicion x del general");
            x = leer.nextInt();
            System.out.println("ingrese la posicion y del general");
            y = leer.nextInt();
        }
        mat[x][y] = "[G]";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }

        for (int m = 0; m < 3; m++) {

            System.out.println("ingrese la posicion x del caballero");
            x = leer.nextInt();
            System.out.println("ingrese la posicion y del caballero");
            y = leer.nextInt();
            while ((x > 9 || y > 9) || x < 0 || y < -0) {
                System.out.println("valores invalidos");
                System.out.println("ingrese la posicion x del caballero");
                x = leer.nextInt();
                System.out.println("ingrese la posicion y del caballero");
                y = leer.nextInt();
            }
            mat[x][y] = "[C]";
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]);
                }
                System.out.println("");
            }

        }
        System.out.println("ingrese la posicion x del ejecutor");
        x = leer.nextInt();
        System.out.println("ingrese la posicion y del ejecutor");
        y = leer.nextInt();
        while ((x > 9 || y > 9) || x < 0 || y < -0) {
            System.out.println("valores invalidos");
            System.out.println("ingrese la posicion x del ejecutar");
            x = leer.nextInt();
            System.out.println("ingrese la posicion y del ejecutar");
            y = leer.nextInt();
        }
        mat[x][y] = "[E]";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }

    }

    public static void administrar() {
        ArrayList<Ejercito> temp = new ArrayList();
        for (int i = 0; i < ejercito.size(); i++) {
            System.out.println(i + ")" + ejercito.get(i).getNombre());
        }
        System.out.println("ingrese el numero del ejercito que quiere usar");
        int nu = leer.nextInt();
        temp.add(ejercito.get(nu));
        ejercito.remove(nu);
        nombre1 = ejercito.get(nu).getNombre();
        for (int i = 0; i < ejercito.size(); i++) {
            System.out.println(i + ")" + ejercito.get(i).getNombre());
        }
        System.out.println("ingrese el numero del ejercito que quiere usar");
        int na=leer.nextInt();
        nombre2=ejercito.get(na).getNombre();
        ejercito.add(nu, temp.get(0));
        
    }
}
