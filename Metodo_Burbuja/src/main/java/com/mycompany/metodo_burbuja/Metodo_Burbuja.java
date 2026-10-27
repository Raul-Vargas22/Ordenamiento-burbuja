package com.mycompany.metodo_burbuja;

public class Metodo_Burbuja {
    public static void main(String[] args) {
        int[] arreglo1 = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Estado Inicial: ");
        imprimirArreglo(arreglo1);

        Burbuja.ordenamientoBurbuja(arreglo1);

        System.out.print("Resultado Final: ");
        imprimirArreglo(arreglo1);

        int[] arreglo2 = {111, 12, 22, 25, 34, 64, 90};

        System.out.print("Estado Inicial: ");
        imprimirArreglo(arreglo2);

        Burbuja.ordenamientoBurbujaMejorado(arreglo2);

        System.out.print("Resultado Final: ");
        imprimirArreglo(arreglo2);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}