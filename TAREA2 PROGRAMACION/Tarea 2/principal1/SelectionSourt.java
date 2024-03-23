/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal1;

/**
 *
 * @author Wine
 */
public class SelectionSourt {
    public static void sort(int[] arr) {
        int numero = arr.length;
        
        for (int i = 0; i < numero-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < numero; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
