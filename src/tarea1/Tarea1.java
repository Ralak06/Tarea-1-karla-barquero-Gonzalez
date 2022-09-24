/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Karla
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // SUMA DE DIAGONALES DE UNA MATRIZ//
        int matriz[][] = new int[3][3];
        int contador = 1;
        float sumatoria = 0;
        float sumatoria2 = 0;
        float Promedio = 0;

        for (int i = 0; i < 3; i++) { // filas
            for (int j = 0; j < 3; j++) { // columnas
                matriz[i][j] = contador;
                contador++;
                System.out.print("   " + matriz[i][j]);// impresion de matriz completa
            }
            System.out.println("  ");//Espacio Para acomodar la Matriz 
        }

        //SUMA DE LA DIAGONAL 1//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                if (i == j) {

                    sumatoria += matriz[i][j];
                }

                System.out.println("la sumatoria diagonal 1 es " + sumatoria);
            }
            //sumatoria Diagnonal 2//
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    sumatoria2 += matriz[i][j];
                }

            }
            System.out.println("");
        }
        System.out.println("la sumatoria diagonal 2 es " + sumatoria2);
    }

}
