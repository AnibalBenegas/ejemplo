/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.summatrices;

import java.util.Scanner;

/**
 *
 * @author PUESTO 1
 */
public class SumMatrices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dim;

        System.out.println("Ingrese la dimension de la matriz");
        dim = leer.nextInt();
        
        int[][] MatrizA = new int[dim][dim];
        int[][] MatrizB = new int[dim][dim];
        
        llenarMatriz(MatrizA, dim);
        llenarMatriz(MatrizB, dim);
        
        System.out.println("Matriz A");
        mostrarMatriz(MatrizA, dim);
        System.out.println("Matriz B");
        mostrarMatriz(MatrizB, dim);
        
        System.out.println("resultado de la suma");
        sumMatriz(MatrizA, MatrizB, dim);
        mostrarMatriz(MatrizA, dim);
        
        System.out.println("Otro metodo");
        sumarMatriz(MatrizA, MatrizB, dim);
        
    }
    
    public static void llenarMatriz(int[][] matriz , int dim){
        int fila, columna;
        for (fila = 0; fila < dim ; fila++) {
            for (columna = 0; columna < dim ; columna++) {
                matriz[fila][columna] = (int) (Math.random()*10+1);
            }            
        }
    }
    public static void mostrarMatriz(int[][] matriz , int dim){
        int fila, columna;
        for (fila = 0; fila < dim ; fila++) {
            for (columna = 0; columna < dim ; columna++) {
                System.out.print(matriz[fila][columna] + " ; ");
            }   
            System.out.println("");
        }
        
    }
    public static void sumMatriz (int [][] A, int [][] B, int dim){
        int fila, columna;
        for (fila = 0; fila < dim ; fila++) {
            for (columna = 0; columna < dim ; columna++) {
                A[fila] [columna] += B[fila][columna]; 
            }
        }
    }
    
    public static void sumarMatriz(int[][] a, int[][] b, int dim){
        int [][] r = new int[dim][dim];
        int f, c;
        
        for (f = 0; f< dim ; f++) {
            for (c = 0; c < dim; c++) {
                r[f][c]= a[f][c] + b[f][c];
            }
        }
        mostrarMatriz(r, dim);
    }
}
