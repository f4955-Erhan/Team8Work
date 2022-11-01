package day1;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
       /*Soru 1) iki String array olusturunuz ve bu array'lerdeki ortak elemanlari For-each
         loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana "Ortak
        eleman yok" yazdiriniz.
        */

        String arr1[] = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        String arr2[] = new String[]{"c", "h", "t", "g", "b", "y", "u", "o"};


        for (String a : arr1) {
            for (String b : arr2) {

                if (a == b) {
                    System.out.print(a + " ");
                }
            }
        }

        /*
        Soru 2) Bir integer array olusturunuz ve bu array'deki tum sayilarin
        carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazd'riniz.
        */
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int carpım = 1;
        for (int a : arr3) {
            carpım *= a;

        }
        System.out.println("carpım = " + carpım);

        /*
        Soru 3) Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin
        toplam'ni  birer birer bulan ve herbi' sonucu yeni bir array'in elemani yapan ve yeni
        array'i  ekrana  yazdiran bir program yaziniz.
        { {1,2,3}, {4,5}, {6,7} }
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output:'{6, 9, 13}
        */

        int sayi[][] = new int[][]{{3, 2, 7}, {2, 5}, {6, 4}};

        int toplam1 = 0;
        int toplam2 = 0;
        int toplam3 = 0;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {

                if (i == 0) {
                    toplam1 += sayi[i][j];

                } else if (i == 1) {
                    toplam2 += sayi[i][j];

                } else if (i == 2) {
                    toplam3 += sayi[i][j];
                }
            }
        }
        int sayiYeni[] = new int[]{toplam1, toplam2, toplam3};

        System.out.println(Arrays.toString(sayiYeni));

        /*
        Soru 4) Asagidaki multi dimensional array'in ic array'lerindeki son elemanlarin
        carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

         */

        int sayi4[][] = new int[][]{{3, 2, 2}, {2, 5}, {6}};

        int sonSayiCarpım = 1;

        for (int i = 0; i < sayi4.length; i++) {
            for (int j = 0; j < sayi4[i].length; j++) {

                if (i == 0 || i == 1 || i == 2) {
                    if (j == sayi4[i].length - 1) {
                        sonSayiCarpım *= sayi4[i][j];
                    }
                }
            }
        }
        System.out.println(sonSayiCarpım);
    }
}
