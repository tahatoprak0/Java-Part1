package dizi_odevler;

import java.util.Arrays;

public class DiziKopyala {
    public static void main(String[] args) {
        int sayilarDizisi[] = {5, 7469, 2, 786, 4, 56, 418, 45, 1, 6, 746, 78, 85};
        System.out.println("Orijinal Dizi");
        for (int i = 0; i < sayilarDizisi.length; i++) {
            System.out.print(sayilarDizisi[i] + ",");
        }
        int kopyalananDizi[] = Arrays.copyOfRange(sayilarDizisi, 1, 8);
        System.out.println("\n" + "Kopyalanan Dizi");
        for (int i = 0; i < kopyalananDizi.length; i++) {
            System.out.print(sayilarDizisi[i] + ",");
        }
    }
}
