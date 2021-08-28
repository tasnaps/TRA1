/*
    Kirjoita algoritmi joka palauttaa Integer listan pienimmän ja suurimman luvun summan.
 */

import java.util.Arrays;

class TRAI_21_XI_tapiomer {
    static boolean tarkistus(Integer[] taulu){
        boolean eiNull = false;
        if(Arrays.stream(taulu).count()>0){
           eiNull = true;
        }
        return eiNull;
    }
    static Integer summaaLista(Integer[] taulu){
        if (tarkistus(taulu)){
            Integer pieni = taulu[0];
            Integer suuri = taulu[0];

            for (int i=1; i<taulu.length; i++){

                if(pieni<=(taulu[i++])){
                    pieni = taulu[i];

                }else if (suuri>=(taulu[i++])){
                    suuri = taulu[i];
                }
            }
            Integer summa = pieni+suuri;
            return summa;
        } else{
            return null;
        }

    }

    public static void main(String[] args) {
        Integer [] lista = new Integer[]{1,2,3,4,5};
        Integer [] tyhja = new Integer[]{};
        Integer [] yksi = new Integer[]{2};
        System.out.println(summaaLista(tyhja));
        System.out.println(summaaLista(lista));
        System.out.println(summaaLista(yksi));

    }
}