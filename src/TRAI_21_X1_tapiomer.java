/*
    Kirjoita algoritmi joka palauttaa Integer listan pienimmän ja suurimman luvun summan.
 */

class TRAI_21_XI_tapiomer {
    static int summaaLista(Integer[] taulu){
        int pieni = 0;
        int suuri = 0;

        for (int i=0; i<taulu.length; i++){

            if(pieni<(taulu[i++])){
                pieni = taulu[i];
            }else if (pieni>(taulu[i++])){
                suuri = taulu[i];
            }
        }
        System.out.println(pieni);
        System.out.println(suuri);
        int summa = pieni+suuri;
        return summa;

    }

    public static void main(String[] args) {
        Integer [] lista = new Integer[]{1,2,3,4,5};
        System.out.println(summaaLista(lista));
    }
}