package com.ipc1.g4_practica1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    //public static int Matriz[][][];//Esta hace referencia al guardado de cada una de las matrices
    public static Scanner entrada = new Scanner(System.in);
    public static double matrizA[][];
    public static double matrizB[][];
    public static double matrizC[][];
    public static double matrizD[][];
    public static double matrizE[][];
    public static double matrizF[][];
    public static double matrizG[][];
    public static double matrizH[][];
    public static double matrizI[][];
    public static double matrizJ[][];
    public static double matrizK[][];
    public static double matrizL[][];
    public static double matrizM[][];
    public static double matrizN[][];
    public static double matrizO[][];
    public static double matrizP[][];
    public static double matrizQ[][];
    public static double matrizR[][];
    public static double matrizS[][];
    public static double matrizT[][];
    public static double matrizU[][];
    public static double matrizV[][];
    public static double matrizW[][];
    public static double matrizX[][];
    public static double matrizY[][];
    public static double matrizZ[][];
    public static double Inversa[][];

    public static double determinante;

    public static double R1[][], R2[][], R3[][], R4[][], R5[][], R6[][], R7[][], R8[][], R9[][], R10[][], R11[][], R12[][], R13[][], R14[][], R15[][], R16[][], R17[][], R18[][], R19[][], R20[][];
    public static String M1, M2, M3, M4, M5, M6, M7, M8, M9, M10, M11, M12, M13, M14, M15, M16, M17, M18, M19, M20;

    public static String[] nombre_datos;//Vector donde estan los nombres de la matriz

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        //Menú de inicio de forma cíclica
        // kevin

        do {
            try {

                // intento de push
                System.out.println("            __  ___    ___  __");
                System.out.println("    |\\  /| |  |  |    |    |  | | ");
                System.out.println("    | \\/ | | _|  | __ |    | _| |");
                System.out.println("    |    | |  |  |    |___ |  | |___");

                System.out.println("-------------Menu principal-------------");
                System.out.println("    1.  Cargar matrices                 ");
                System.out.println("    2.  Sumar matrices                  ");
                System.out.println("    3.  Restar matrices                 ");
                System.out.println("    4.  Multiplicar matrices            ");
                System.out.println("    5.  Dividir matrices                ");
                System.out.println("    6.  Traspuesta de una matriz        ");
                System.out.println("    7.  Matriz inversa                  ");
                System.out.println("    8.  Potencia de una matriz          ");
                System.out.println("    9.  Determinante de una matriz      ");
                System.out.println("    10. Matriz R                        ");
                System.out.println("    11. Reportes                        ");
                System.out.println("    12. SALIR                           ");
                System.out.println("----------------------------------------");
                System.out.print("Ingrese una opción: ");
                opcion = entrada.nextInt();
                System.out.println();

                switch (opcion) {
                    case 1://1.  Cargar matrices

                        Ruta();

                        break;
                    case 2://2.  Sumar matrices

                        System.out.println("Ingrese el nombre de la primera Matriz:");
                        double[][] matriz1 = EncontrarMatriz();//encuentra la matriz para poder ser utilizada y la guardamos en nueva variable
                        System.out.println("Ingrese el nombre de la segunda Matriz:");
                        double[][] matriz2 = EncontrarMatriz();
                        if (matriz1.length == matriz2.length) {

                            matrizR = sumarMatriz(matriz1, matriz2);
                        } else {
                            System.out.println("la matriz no es de mismo orden, no se pueden sumar");
                        }

                        break;

                    case 3://3.  Restar matrices

                        System.out.println("Ingrese el nombre de la primera Matriz:");
                        double[][] matriz3 = EncontrarMatriz();//encuentra la matriz para poder ser utilizada y la guardamos en nueva variable
                        System.out.println("Ingrese el nombre de la segunda Matriz:");
                        double[][] matriz4 = EncontrarMatriz();

                        if (matriz3.length == matriz4.length) {

                            matrizR = restarMatriz(matriz3, matriz4);
                        } else {
                            System.out.println("la matriz no es de mismo orden, no se pueden restar");
                        }
                        break;

                    case 4://4.  Multiplicar matrices
                        submenuMultiplicacion(); //ACCEDIENTO AL METODO SUMBMENU
                        break;

                    case 5://5.  Dividir matrices
                        DivisionMatrices();
                        break;

                    case 6://6.  Traspuesta de una matriz
                        System.out.println("Ingrese el nombre de la Matriz:");
                        double[][] matriz7 = EncontrarMatriz();
                        matrizR = TranspuestaMatriz(matriz7);
                        R6 = TranspuestaMatriz(matriz7);
                        M6 = "Transpuesta";
                        break;

                    case 7://7.  Matriz inversa
                        System.out.println("Ingrese la matriz que desea invertir:");
                        double[][] matriz12 = EncontrarMatriz();
                        matrizR = CalcInverso(matriz12);

                        ImprimirMatrices(matrizR);
                        break;

                    case 8://8.  Potencia de una matriz
                        System.out.println("ingrese la matriz a potenciar:");

                        double[][] matrizPotencia = EncontrarMatriz();
                        double[][] matrizPotenciab = matrizPotencia;
                        System.out.println("elevar a la potencia:");
                        int potencia = entrada.nextInt();

                        for (int i = 0; i < potencia - 1; i++) {

                            matrizPotencia = multiplicarMatriz(matrizPotencia, matrizPotenciab);

                        }
                        matrizR = matrizPotencia;
                        R8 = matrizPotencia;
                        M8 = "Potencia";
                        break;

                    case 9://9.  Determinante de una matriz
                        determinante();
                        break;

                    case 10://10. Matriz R
                        System.out.println("La matriz R es: ");
                        for (int i = 0; i < matrizR.length; i++) {
                            for (int j = 0; j < matrizR[0].length; j++) {

                                System.out.print(matrizR[i][j] + "   ");
                            }
                            System.out.println("");
                        }
                        break;

                    case 11://11. Reportes
                        hacerHtml();

                        System.out.println("Se genero los reportes con exito!.. ");
                        System.out.println("");
                        break;

                    case 12://12. SALIR
                        System.out.println("Gracias por utilizar el programa ");
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion no válida. Inténtelo de nuevo.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("¡Ups! Ocurrió un error, inténtalo de nuevo.");
                entrada.nextLine();
            }
        } while (opcion != 12);
    }

    public static void getContentOfFile(String pathname) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int contMatriz = 0;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathname);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String content = "";
            String linea;
            int contadorFilas = 0;

            //Cada linea leída del txt representa una matriz
            while ((linea = br.readLine()) != null) {
                contadorFilas++;

                if (contadorFilas <= 26) {

                    nombre_datos = linea.split(":");
                    //nombre_datos[0] es el nombre de la matriz
//                System.out.println(nombre_datos[1].trim());// estan los datos de la matriz
                    System.out.println(nombre_datos[0].trim());//estan los datos de los indices

                    if (nombre_datos[1].contains(";") || nombre_datos[1].contains(",")) {
                        //La matriz posee varias filas, se puede hacer split
                        if (nombre_datos[1].contains(",") || nombre_datos[1].contains(";")) {
                            //La matriz posee varias columnas

                            String[] filas = nombre_datos[1].split(";");
                            //Cada elemento del array es una fila de la matriz

                            String[] columnas = filas[0].split(",");
                            //Este split es solo para obtener el número de columnas de la matriz y poder declararla

                            //Declarando la matriz
                            double[][] Matriz = new double[filas.length][columnas.length];

                            for (int i = 0; i < filas.length; i++) {
                                String[] datosEnLaFila = filas[i].split(",");
                                //Para cada fila, se hace split de las comas para obtener los datos de la matriz

                                for (int j = 0; j < datosEnLaFila.length; j++) {
                                    Matriz[i][j] = Double.parseDouble(datosEnLaFila[j].trim());
                                    System.out.print("|" + Matriz[i][j] + "|" + "\t");

                                }

                                System.out.println("\t");
                                String letra = String.valueOf(nombre_datos[0].trim());//PARSEA EL INDICE PARA ENTRAR AL SWITCH Y LLENAR LA MATRIZ CORRESPONDIENTE

                                switch (letra) {
                                    case "A":
                                        matrizA = Matriz;

                                        break;

                                    case "B":
                                        matrizB = Matriz;

                                        break;
                                    case "C":
                                        matrizC = Matriz;

                                        break;

                                    case "D":
                                        matrizD = Matriz;

                                        break;
                                    case "E":
                                        matrizE = Matriz;

                                        break;
                                    case "F":
                                        matrizF = Matriz;

                                        break;
                                    case "G":
                                        matrizG = Matriz;

                                        break;
                                    case "H":
                                        matrizH = Matriz;

                                        break;
                                    case "I":
                                        matrizI = Matriz;

                                        break;
                                    case "J":
                                        matrizJ = Matriz;

                                        break;
                                    case "K":
                                        matrizK = Matriz;

                                        break;
                                    case "L":
                                        matrizL = Matriz;

                                        break;
                                    case "M":
                                        matrizM = Matriz;

                                        break;
                                    case "N":
                                        matrizN = Matriz;

                                        break;
                                    case "O":
                                        matrizO = Matriz;
                                        break;
                                    case "P":
                                        matrizP = Matriz;

                                        break;
                                    case "Q":
                                        matrizQ = Matriz;

                                        break;
                                    case "R":
                                        matrizR = Matriz;

                                        break;
                                    case "S":
                                        matrizS = Matriz;

                                        break;
                                    case "T":
                                        matrizT = Matriz;

                                        break;
                                    case "U":
                                        matrizU = Matriz;

                                        break;
                                    case "V":
                                        matrizV = Matriz;

                                        break;
                                    case "W":
                                        matrizW = Matriz;

                                        break;
                                    case "X":
                                        matrizX = Matriz;

                                        break;
                                    case "Y":
                                        matrizY = Matriz;

                                        break;
                                    case "Z":
                                        matrizZ = Matriz;

                                        break;

                                }

                            }

                        } else {
                            //La matriz posee una columna y varias filas

                            String[] filas = nombre_datos[1].split(";");
                            //Cada elemento del array es una fila de la matriz

                            //Declarando la matriz
                            double[][] Matriz = new double[filas.length][1];

                            for (int i = 0; i < filas.length; i++) {
                                Matriz[i][0] = Double.parseDouble(filas[i].trim());
                            }

                        }
                    } else if (nombre_datos[1].contains(",")) {
                        //La matriz posee una fila y varias columnas

                        String[] columnas = nombre_datos[1].split(",");
                        //Cada elemento del array es una columna de la matriz

                        //Declarando la matriz
                        double[][] Matriz = new double[1][columnas.length];

                        for (int i = 0; i < columnas.length; i++) {
                            Matriz[0][i] = Double.parseDouble(columnas[i].trim());
                        }

                    } else {
                        //La matriz posee un único dato

                        //Declarando la matriz
                        double[] Matriz = new double[1];
                        Matriz[0] = Double.parseDouble(nombre_datos[1].trim());
                    }

                } else {
                    System.out.println("archivo demasiado grande, solo lee 26 matrices");
                }

            }

        } catch (Exception e) {
            System.out.println("OPS! no se encotro el archivo en ruta");
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void Ruta() {//carga y guardado del contenido del Txt
        System.out.print("Ingrese ruta del txt: ");

        String ruta = entrada.nextLine();
        getContentOfFile(ruta);
    }

    public static void submenuMultiplicacion() {
        String opcion;
        int numero;

        boolean flag = true;
        while (flag) {
            flag = false;

            System.out.print("-------------");
            System.out.print(" SUB - MENU ");
            System.out.println("-------------");
            System.out.println("  1. MULTIPLICACION MATRIZ-MATRIZ");
            System.out.println("  2. MULTIPLICACION MATRIZ-NUMERO");
            System.out.println("--------------------------");
            System.out.println("\nELEGIN UNA OPCION: \n");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1": {
                    System.out.println("Ingrese el nombre de la primera Matriz:");
                    double[][] matriz5 = EncontrarMatriz();//encuentra la matriz para poder ser utilizada y la guardamos en nueva variable
                    System.out.println("Ingrese el nombre de la segunda Matriz:");
                    double[][] matriz6 = EncontrarMatriz();
                    R3 = matrizR = multiplicarMatriz(matriz5, matriz6);
                    M3 = "multiplicacion matriz - matriz";
                    break;
                }
                case "2": {
                    System.out.println("Ingrese el nombre de la primera Matriz");
                    double[][] matriz7 = EncontrarMatriz();
                    System.out.println("Ingrese el numero a multiplicar");
                    numero = entrada.nextInt();
                    R4 = matrizR = multiplicarMatrizNum(matriz7, numero);
                    M4 = "multiplicacion matriz - numero entero";
                    break;
                }
                default: {
                    System.out.println("La opcion ingresada no es valida");
                    flag = true;
                }

            }// CIERRE DEL SWITCH

        }// CIERRRE DEL WHILE
    }// CIERRRE DEL METODO SUBMENU

    public static double[][] EncontrarMatriz() {
        try {
            String Opcion = entrada.nextLine().toUpperCase();
            switch (Opcion) {
                case "A":
                    return matrizA;
                case "B":
                    return matrizB;
                case "C":
                    return matrizC;
                case "D":
                    return matrizD;
                case "E":
                    return matrizE;
                case "F":
                    return matrizF;
                case "G":
                    return matrizG;
                case "H":
                    return matrizH;
                case "I":
                    return matrizI;
                case "J":
                    return matrizJ;
                case "K":
                    return matrizK;
                case "L":
                    return matrizL;
                case "M":
                    return matrizM;
                case "N":
                    return matrizN;
                case "O":
                    return matrizO;
                case "P":
                    return matrizP;
                case "Q":
                    return matrizQ;
                case "R":
                    return matrizR;
                case "S":
                    return matrizS;
                case "T":
                    return matrizT;
                case "U":
                    return matrizU;
                case "V":
                    return matrizV;
                case "W":
                    return matrizW;
                case "X":
                    return matrizX;
                case "Y":
                    return matrizY;
                case "Z":
                    return matrizZ;

            }
        } catch (Exception e) {
            System.out.println("¡Ups! Ocurrió un error, inténtalo de nuevo.");
            entrada.nextLine();

        }
        return null;
    }

    public static double[][] multiplicarMatriz(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        // se comprueba si las matrices se pueden multiplicar
        System.out.println("Primera matriz:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("|" + a[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print("|" + b[i][j] + "|");
            }
            System.out.println("");
        }
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        // aquí se multiplica la matriz
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        /**
         * si no se cumple la condición se retorna una matriz vacía
         */
        System.out.println("Matriz resultado es:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print("|" + c[i][j] + "|");
            }
            System.out.println("");
        }
        return c;
    }

    public static double[][] multiplicarMatrizNum(double[][] a, int b) {
        double[][] resultado = new double[a.length][a[0].length];

        System.out.println("Primera matriz:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("|" + a[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("Numero multiplicar");
        System.out.println(b);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = b * a[i][j];

            }
        }
        System.out.println("Matriz resultado es:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print("|" + resultado[i][j] + "|");
            }
            System.out.println("");
        }
        return resultado;
    }

    public static double[][] TranspuestaMatriz(double[][] a) {
        double[][] matrizT = new double[a[0].length][a.length];
        System.out.println("La matriz es:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("La transpuesta de esa matriz es: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrizT[i][j] = a[j][i];
                System.out.print(matrizT[i][j] + "   ");
            }
            System.out.println("");
        }
        return matrizT;

    }

    public static double[][] sumarMatriz(double[][] matriz1, double[][] matriz2) {

        double[][] matrizResultado;
        int filasA = matriz1.length;
        int columnasA = matriz1[0].length;

        int filasB = matriz2.length;
        int columnasB = matriz2[0].length;

        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("|" + matriz1[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("|" + matriz2[i][j] + "|");
            }
            System.out.println("");
        }

        if (filasA == filasB && columnasB == columnasA) {

            matrizResultado = new double[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
        }
        System.out.println("Matriz resultado es:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("|" + matrizResultado[i][j] + "|");
            }
            System.out.println("");
        }
        R1 = matrizResultado;
        M1 = "suma";
        return matrizResultado;

    }

    public static double[][] restarMatriz(double[][] matriz3, double[][] matriz4) {
        double[][] matrizResultado;
        int filasA = matriz3.length;
        int columnasA = matriz3[0].length;

        int filasB = matriz4.length;
        int columnasB = matriz4[0].length;
        System.out.println("Primera matriz:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("|" + matriz3[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("Segunda matriz:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("|" + matriz4[i][j] + "|");
            }
            System.out.println("");
        }

        if (filasA == filasB && columnasB == columnasA) {

            matrizResultado = new double[filasA][columnasA];

            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matriz3[i][j] - matriz4[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
        }
        System.out.println("Matriz resultado es:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("|" + matrizResultado[i][j] + "|");
            }

            System.out.println("");
        }

        R2 = matrizResultado;
        M2 = "resta";
        return matrizResultado;
    }

    public static void determinante() {

        System.out.println("Ingrese el nombre de la Matriz:");
        // VARIABLES
        // NUEVA MATRIZ PARA GUARDAR LOS VALORES DE LA MATRIZ ENCONTRADA
        double[][] matriz8 = EncontrarMatriz();

        if (matriz8[0].length == 3 & matriz8.length == 3) {// DETERMINANTE PARA MATRIZ 3x3
            System.out.println("Matriz Seleccionada:");
            System.out.println("");
            for (int i = 0; i < matriz8.length; i++) {
                for (int j = 0; j < matriz8[0].length; j++) {
                    System.out.print("|" + matriz8[i][j] + "|");
                }
                System.out.println("");
            }
            //ENCONTRAR DETERMINATE MATRIZ
            determinante = (matriz8[0][0] * ((matriz8[1][1] * matriz8[2][2]) - (matriz8[1][2] * matriz8[2][1])))
                    - (matriz8[0][1] * ((matriz8[1][0] * matriz8[2][2]) - (matriz8[2][0] * matriz8[1][2])))
                    + (matriz8[0][2] * ((matriz8[1][0] * matriz8[2][1]) - (matriz8[2][0] * matriz8[1][1])));
            System.out.println("");
            System.out.println("El determinante es :" + determinante);
            R9[0][0] = determinante;
            M9 = "Determinante 3x3";
        } else if (matriz8[0].length == 2 & matriz8.length == 2) {// DETERMINANTE PARA MATRIZ 2x2
            System.out.println("Matriz Seleccionada:");
            System.out.println("");
            for (int i = 0; i < matriz8.length; i++) {
                for (int j = 0; j < matriz8[0].length; j++) {
                    System.out.print("|" + matriz8[i][j] + "|");
                }
                System.out.println("");

            }
            //ENCONTRAR DETERMINATE MATRIZ
            determinante = (matriz8[0][0] * matriz8[1][1]) - (matriz8[1][0] * matriz8[0][1]);
            System.out.println("");
            System.out.println("El determinante es :" + determinante);
            R10[0][0] = determinante;
            M10 = "Determinante 2x2";
        } else {
            System.out.println("Oden maximo 3 porfavor");
        }

    }

    public static double[][] CalcInverso(double matriz[][]) {

        //Creamos otra matriz
        //Matriz escalonada para comparar
        double inversa[][] = new double[matriz.length][matriz.length];
        //Contador de espacios para diagonal principal
        int contSpacio = 0;
        //Cambiar todos los elementos de la diagonal principal a 0
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (contSpacio == j) {
                    inversa[i][j] = 1;
                } else {
                    inversa[i][j] = 0;
                }
            }
            contSpacio++;
        }

        //Reiniciando contSpacio para operear la inversa
        contSpacio = 0;
        //Almacenamiento del número a operar por cada fila y columna
        double operacion = 0;
        //Operando para obtener la matriz inversa
        //Operando de diagonal hacía abajo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //Paso 1 - volver 1 el valor de la diagonal y operar su columna
                //Verificando si estamos en un pivote
                if (i == j) {
                    //Ciclo para dividir fila para volver 1 la diagonal

                    operacion = (1 / matriz[i][j]);
                    for (int operacionCol = 0; operacionCol < matriz.length; operacionCol++) {
                        matriz[i][operacionCol] = matriz[i][operacionCol] * operacion;
                        inversa[i][operacionCol] = inversa[i][operacionCol] * operacion;
                    }

                    double constanteUno = matriz[i][j];
                    if (constanteUno < 0) {
                        System.out.println("SE HIZ0 NEGATIVO PORQUE - FILA: " + i + " COLUMNA: " + j);
                    }
                    double constanteDos = 0;
//                  //Obteniendo constante de fila pivote
                    for (int operacionfilas = 0; operacionfilas < matriz.length; operacionfilas++) {
                        if (operacionfilas != i) {
                            for (int operacioonCol = 0; operacioonCol < matriz.length; operacioonCol++) {
                                if (operacioonCol == j) {
                                    constanteDos = matriz[operacionfilas][operacioonCol];

                                    for (int insideCol = 0; insideCol < matriz.length; insideCol++) {

                                        matriz[operacionfilas][insideCol] = constanteUno * matriz[operacionfilas][insideCol] - (constanteDos * matriz[i][insideCol]);
                                        inversa[operacionfilas][insideCol] = constanteUno * inversa[operacionfilas][insideCol] - (constanteDos * inversa[i][insideCol]);
                                        if (matriz[operacionfilas][insideCol] == Double.NaN || inversa[operacionfilas][insideCol] == Double.NaN) {
                                            System.out.println("Esta matriz no tiene inversa");

                                        }
                                    }
                                }
                            }

//
                        }
                    }
                }
            }
        }
        R7 = inversa;
        M7 = "Matriz Inversa";
        return inversa;

    }

    public static void ImprimirMatrices(double[][] matriz) {
        System.out.println("Matriz resultante: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }//METODO PARA IMPRIMIR LAS MATRICES

    public static void DivisionMatrices() {
        System.out.println("Ingrese la primera Matriz");
        double[][] matriz01 = EncontrarMatriz();
        System.out.println("Ingrese la segunda Matriz");
        double[][] matriz02 = EncontrarMatriz();
        double[][] matriz02Inversa = CalcInverso(matriz02);// CALCULANDO LA INVERSA DE LA MATRIZ

        matrizR = R5 = multiplicarMatriz(matriz01, matriz02Inversa);
        M5 = "Division";

        System.out.println("");

    }

    public static void reportes(String mensaje) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("reportes.html");
            pw = new PrintWriter(fichero);

            pw.println(mensaje);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void hacerHtml() {
        String cuerpo = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">"
                + "<title>Reportes</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "\n"
                + "<h1>Reportes</h1>\n"
                + "<p>operaciones:</p>\n"
                + "<h1> mensaje: " + "Reporte Encriptar" + "</h1> <br><br>"
                + "<h1> mensaje: " + "Matrices ingresadas" + "</h1> <br><br> <h1>Matriz A</h1><br> ";

        if (matrizA != null) {
            cuerpo += "<h1> mensaje: " + "matriz A" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizA) + "\n";
        }

        if (matrizB != null) {
            cuerpo += "<h1> mensaje: " + "matriz B" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizB) + "\n";
        }

        if (matrizC != null) {
            cuerpo += "<h1> mensaje: " + "matriz C" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizC) + "\n";
        }

        if (matrizD != null) {
            cuerpo += "<h1> mensaje: " + "matriz D" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizD) + "\n";
        }

        if (matrizE != null) {
            cuerpo += "<h1> mensaje: " + "matriz E" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizE) + "\n";
        }

        if (matrizF != null) {
            cuerpo += "<h1> mensaje: " + "matriz F" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizF) + "\n";
        }

        if (matrizG != null) {
            cuerpo += "<h1> mensaje: " + "matriz G" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizG) + "\n";
        }

        if (matrizH != null) {
            cuerpo += "<h1> mensaje: " + "matriz H" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizH) + "\n";
        }

        if (matrizI != null) {
            cuerpo += "<h1> mensaje: " + "matriz I" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizI) + "\n";
        }

        if (matrizJ != null) {
            cuerpo += "<h1> mensaje: " + "matriz J" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizJ) + "\n";
        }

        if (matrizK != null) {
            cuerpo += "<h1> mensaje: " + "matriz K" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizK) + "\n";
        }

        if (matrizL != null) {
            cuerpo += "<h1> mensaje: " + "matriz L" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizL) + "\n";
        }

        if (matrizM != null) {
            cuerpo += "<h1> mensaje: " + "matriz M" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizM) + "\n";
        }

        if (matrizN != null) {
            cuerpo += "<h1> mensaje: " + "matriz N" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizN) + "\n";
        }

        if (matrizO != null) {
            cuerpo += "<h1> mensaje: " + "matriz O" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizO) + "\n";
        }

        if (matrizP != null) {
            cuerpo += "<h1> mensaje: " + "matriz P" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizP) + "\n";
        }

        if (matrizQ != null) {
            cuerpo += "<h1> mensaje: " + "matriz Q" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizQ) + "\n";
        }

        if (matrizR != null) {
            cuerpo += "<h1> mensaje: " + "matriz R" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizR) + "\n";
        }

        if (matrizS != null) {
            cuerpo += "<h1> mensaje: " + "matriz S" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizS) + "\n";
        }

        if (matrizT != null) {
            cuerpo += "<h1> mensaje: " + "matriz T" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizT) + "\n";
        }

        if (matrizU != null) {
            cuerpo += "<h1> mensaje: " + "matriz U" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizU) + "\n";
        }

        if (matrizV != null) {
            cuerpo += "<h1> mensaje: " + "matriz V" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizV) + "\n";
        }

        if (matrizW != null) {
            cuerpo += "<h1> mensaje: " + "matriz W" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizW) + "\n";
        }

        if (matrizX != null) {
            cuerpo += "<h1> mensaje: " + "matriz X" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizX) + "\n";
        }

        if (matrizY != null) {
            cuerpo += "<h1> mensaje: " + "matriz Y" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizY) + "\n";
        }
        if (matrizZ != null) {
            cuerpo += "<h1> mensaje: " + "matriz Z" + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(matrizZ) + "\n";
        }
        if (R1 != null) {
            cuerpo += "<h1>     Operacion: " + M1 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R1) + "\n";
        }
        if (R2 != null) {
            cuerpo += "<h1>     Operacion: " + M2 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R2) + "\n";
        }
        if (R3 != null) {
            cuerpo += "<h1>     Operacion: " + M3 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R3) + "\n";
        }
        if (R4 != null) {
            cuerpo += "<h1>     Operacion: " + M4 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R4) + "\n";
        }
        if (R5 != null) {
            cuerpo += "<h1>     Operacion: " + M5 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R5) + "\n";
        }
        if (R6 != null) {
            cuerpo += "<h1>     Operacion: " + M6 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R6) + "\n";
        }
        if (R7 != null) {
            cuerpo += "<h1>     Operacion: " + M7 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R7) + "\n";
        }
        if (R8 != null) {
            cuerpo += "<h1>     Operacion: " + M8 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R8) + "\n";
        }
        if (R9 != null) {
            cuerpo += "<h1>     Operacion: " + M9 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R9) + "\n";
        }
        if (R10 != null) {
            cuerpo += "<h1>     Operacion: " + M10 + "</h1> <br><br>";
            cuerpo += obtenerTablaHtml(R10) + "\n";
        }
        cuerpo += "<h1>     Determinante: " + determinante + "</h1> <br><br>";
        cuerpo += "\n"
                + "</body>\n"
                + "</html>";
        reportes(cuerpo);

    }

    public static String obtenerTablaHtml(double matriz[][]) {
        String tabla = "";
        tabla += "\n <table class=\"table\"> \n";
        for (int i = 0; i < matriz.length; i++) {
            tabla += "<tr> \n";

            for (int k = 0; k < matriz[0].length; k++) {

                tabla += "<td>" + matriz[i][k] + "</td>";

            }
            tabla += "</tr> \n";
        }
        tabla += "</table>\n";

        return tabla;
    }
}
