package com.codepolitan.saifashaazmigmailcom;

import java.util.Arrays;

public class Selecting {
    private int[] larik;

    public Selecting(int[] ints) {
        setLarik(ints);
    }

    private void setLarik(int[] ints) {
        this.larik = ints;
    }

    private void setLarik(int pos, int inte) {
        this.larik[pos] = inte;
    }

    public int[] getLarik() {
        return larik;
    }

    public int getLarik(int col) {
        try {
            return larik[col];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public void ascSorting() {
        for (int i = 0; i < getLarik().length; ++i) {
            System.out.println("Iterasi ke-" + (i+1) + " : ");
            for(int y = 0; y < getLarik().length; y++)
                System.out.print(getLarik(y)+" ");
            System.out.println("   Apakah Data "+getLarik(i)+" sudah benar pada urutannya?");
            String pesan = "   Tidak ada pertukaran";
            boolean tukar = false;
            int  min_i = i, min = getLarik(i);
            for (int y = i + 1; y < getLarik().length; ++y) {
                if(min > getLarik(y))
                {
                    tukar = true;
                    min_i = y;
                    min = getLarik(y);

                }
            }
            if(tukar) {
                pesan = "   Data "+getLarik(i)+" ditukar dengan Data "+getLarik(min_i);
                swap(getLarik(), i, min_i);
            }

            for(int y = 0; y < getLarik().length; y++)
                System.out.print(getLarik(y)+" ");

            System.out.println(pesan+"\n");
        }
    }

    static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public void show() {
        Arrays.stream(getLarik()).forEach(System.out::println);
    }
}
