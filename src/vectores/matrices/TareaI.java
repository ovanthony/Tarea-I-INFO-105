/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.matrices;

/**
 *
 * @author XPC
 */
public class TareaI {

    public static void SumaMatrices() {

        int[][] matriz = new int[3][3];
        int sumd = 0;
        int sumi = 0;
        int dd = 2;
        int di = 0;

        System.out.println("\n**Valores de la matriz**");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);

                System.out.print("   [" + matriz[i][j] + "] ");

                if (dd == j) {
                    sumd += matriz[i][j];

                }
                if (di == j) {
                    sumi += matriz[i][j];

                }

            }
            dd--;
            di++;

            System.out.println("");
        }
        System.out.print("\nLa suma de la diagonal derecha es: " + sumd);
        System.out.print("\nLa suma de la diagonal izquierda es: " + sumi + "\n");

    }

}
