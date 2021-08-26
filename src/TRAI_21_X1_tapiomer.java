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
    static int summaaLista(Integer[] taulu){
        if (tarkistus(taulu)){


            int pieni = taulu[0];
            int suuri = taulu[0];

            for (int i=1; i<taulu.length; i++){

                if(pieni<=(taulu[i++])){
                    pieni = taulu[i];
                    System.out.println("Olen pieni: ");
                    System.out.println(pieni);

                }else if (suuri>=(taulu[i++])){
                    suuri = taulu[i];
                    System.out.println("Olen suuri: ");
                    System.out.println(suuri);
                }
            }
            //System.out.println(pieni);
            //System.out.println(suuri);
            int summa = pieni+suuri;
            return summa;
        } else{
            return 0;
        }

    }

    public static void main(String[] args) {
        //Integer [] lista = new Integer[]{1,2,3,4,5};
        //int x =summaaLista(lista);
        Integer [] tyhja = new Integer[]{};
        System.out.println(summaaLista(tyhja));
    }
}