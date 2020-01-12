package com.codepolitan.saifashaazmigmailcom;

import java.util.Scanner;

public class MainSort {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah data : ");
        int jmlh = inpt.nextInt();
        int[] intsa = new int[jmlh];
        Bubbling bubbleSort = new Bubbling(intsa);
        Selecting selectionSort = new Selecting(intsa);
        Inserting insertionSort = new Inserting(intsa);

        for (int i = 0 ; i < jmlh; ++i){
            int v = i + 1;
            System.out.print("Masukkan Data ke-" + v + " : ");
            intsa[i] = inpt.nextInt();
        }

        System.out.print("Data sebelum diurutkan : ");
        for (int i : intsa){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Masukkan pilihan sort");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int pil = inpt.nextInt();
        switch (pil){
            case 1 :
                bubbleSort.ascSorting();
                break;
            case 2:
                selectionSort.ascSorting();
                break;
            case 3:
                insertionSort.ascSorting();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pil);
        }


        System.out.print("Data sesudah diurutkan : ");
        for (int i : bubbleSort.getLarik()){
            System.out.print(i + " ");
        }
    }
}
