package org.ln678090;

public class Dem {
    public  int  dem (int []arr){
        int dem =0;
        for (int j : arr) {
            if (j % 2 == 0) {
                dem += j;
            }
        }
        return dem;
    }

}
