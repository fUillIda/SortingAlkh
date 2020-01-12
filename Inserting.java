package com.codepolitan.saifashaazmigmailcom;

public class Inserting {
    private int[] larik;

    Inserting(int[] ints) {
        setLarik(ints);
    }

    private void setLarik(int[] ints) {
        this.larik = ints;
    }

    private void setLarik(int pos,int inte) {
        this.larik[pos] = inte;
    }

    public int[] getLarik() {
        return larik;
    }

    public int getLarik(int col) {
        try {
            return larik[col];
        } catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public void ascSorting() {
        int m_temp = 0;
        String pesan = "   Tidak ada pertukaran";
        for (int i = 1,j = i - 1; i < getLarik().length-1; ++i) {
            System.out.println("Iterasi ke-" + (i) + " : ");
            for(int y = 0; y < getLarik().length; y++)
                System.out.print(getLarik(y)+" ");
            System.out.println("   Apakah Data "+getLarik(i)+" sudah benar pada urutannya?");
            boolean tukar = false;
            int  min_i = i, ins = getLarik(i);
            for (int b = i+1; b > 0; b--){
                pesan = "   --> tidak ada pertukaran";
                if (getLarik(b-1) > getLarik(j)){
                    pesan = "   Data "+getLarik(i)+" ditukar dengan Data "+getLarik(min_i);
                    swap(getLarik(), getLarik(b-1), getLarik(b-2));
                    System.out.println();
                    for(int y = 0; y < getLarik().length; y++)
                        System.out.print(getLarik(y)+" ");
                    System.out.println(pesan+"\n");
                } else
                {
                    System.out.println();
                    for(int y = 0; y < getLarik().length; y++)
                        System.out.print(getLarik(y)+" ");
                    System.out.println(pesan+"\n");
                    break;
                }
                System.out.println("\n");
            }
//            while (j >= 0 && getLarik(j) > ins)
//            {
//                setLarik(j+1,getLarik(j));
//                j -= 1;
//            }

//            setLarik(j+1,ins);
//            for (int k = 0; k < getLarik().length - 1; ++k) {
//                if (getLarik(k) > getLarik(k+1)) {
//                    int i_temp = getLarik(k);
//                    setLarik(k, getLarik(k + 1));
//                    setLarik(k + 1, i_temp);
//                }
//            }
        }
    }

    static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
