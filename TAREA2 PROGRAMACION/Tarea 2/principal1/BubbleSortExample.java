/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal1;

import java.util.Arrays;

/**
 *
 * @author Wine
 */
public class BubbleSortExample {
    public static void sort(int[] arr) {
        int numero = arr.length;
        
        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < numero-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
