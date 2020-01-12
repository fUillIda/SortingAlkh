package com.codepolitan.saifashaazmigmailcom;

public class Bubbling {
    private int[] larik;

    Bubbling(int[] ints) {
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
        for (int i = 0; i < getLarik().length; ++i) {
            for (int k = 0; k < getLarik().length - 1; ++k) {
                if (getLarik(k) > getLarik(k+1)) {
                    int i_temp = getLarik(k);
                    setLarik(k, getLarik(k + 1));
                    setLarik(k + 1, i_temp);
                }
            }
        }
    }
}
