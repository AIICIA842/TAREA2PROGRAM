/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal1;

import java.util.Scanner;

/**
 *
 * @author Wine
 */
public class Principal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al menu de ordenamiento!");
        System.out.println("Por favor, ingresa el tamano del arreglo:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Selecciona un algoritmo de ordenamiento:");
        System.out.println("1. Selection sort");
        System.out.println("2. Bubble sort");
        System.out.println("3. Insertion sort");
        System.out.println("4. Merge sort");
        System.out.println("5. Quick sort");
        System.out.println("6. Heap sort");
        System.out.println("7. Counting sort");
        System.out.println("8. Radix sort");
        System.out.println("9. Bucket sort");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                SelectionSourt.sort(arr);
                break;
            case 2:
                BubbleSortExample.sort(arr);
                break;
            case 3:
                Insertionsort.sort(arr);
                break;
            case 4:
                MergeSort.sort(arr);
                break;
            case 5:
                QuickSort.sort(arr);
                break;
            case 6:
                HeapSort.sort(arr);
                break;
            case 7:
                CountSort.sort(arr);
                break;
            case 8:
                RadixSort.sort(arr);
                break;
            case 9:
                BucketSort.sort(arr);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("Arreglo ordenado ;):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
