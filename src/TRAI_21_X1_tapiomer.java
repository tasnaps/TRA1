/*
    Kirjoita algoritmi joka palauttaa Integer listan pienimmän ja suurimman luvun summan.
 */

class TRAI_21_XI_tapiomer {
    static int summaaLista(Integer[] taulu){
        try{

        }
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

    }

    public static void main(String[] args) {
        //Integer [] lista = new Integer[]{1,2,3,4,5};
        //int x =summaaLista(lista);
        Integer [] tyhja = new Integer[]{};
        System.out.println(summaaLista(tyhja));
    }
}