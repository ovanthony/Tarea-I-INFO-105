/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores.matrices;

import java.util.Scanner;

public class VectoresMatrices {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Arreglos();
        //Matriz();
        //EjemploI3D();
        //EjemploII3D();
        TareaI.SumaMatrices();

    }

    public static void Arreglos() { //Método en Java
        Scanner leer = new Scanner(System.in);
        int n;

        String[] nombres = new String[5];
        nombres[0] = "Susana";
        nombres[1] = "Karla";
        nombres[2] = "Marco";
        nombres[3] = "Pedro";
        nombres[4] = "Sergio";

        int[] edad = new int[]{20, 12, 36, 54, 45};

        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + " tiene una edad de " + edad[i] + " años.");
        }

        System.out.print("\nDigite el tamaño del arreglo: ");
        n = leer.nextInt();
        int[] salario = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite el salario para el vector [" + i + "]: ");
            salario[i] = leer.nextInt();
        }

        System.out.print("\nVector:\n");

        for (int i = 0; i < salario.length; i++) {
            System.out.print("[" + salario[i] + "] ");
        }

    }

    public static void Matriz() {
        int[][] matriz = new int[2][2];

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print("Digite el dato de la matriz [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();

            }
        }

        System.out.println("\n**Valores de la matriz**");

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print("     [" + matriz[f][c] + "] ");

            }
            System.out.println("");
        }

    }

    public static void EjemploI3D() {
        int[][][] intArray = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        System.out.println("3-d array is given below :");
        //print the elements of array
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                for (int z = 0; z < 3; z++) {
                    System.out.println("[" + i
                            + "][" + j + "][" + z + "] = " + intArray[i][j][z]);
                }
            }
        }
    }

    public static void EjemploII3D() {
        //initialize 3-d array
        int[][][] myArray = {{{1, 2, 3}, {4, 5, 6}}, {{1, 4, 9}, {16, 25, 36}},
        {{1, 8, 27}, {64, 125, 216}}};
        System.out.println("3x2x3 array is given below:");
        //print the 3-d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(myArray[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
