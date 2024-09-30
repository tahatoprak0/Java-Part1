package dizi_odevler;

import java.util.Scanner;

public class AsalBolenBul {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir Tam Sayı Giriniz");
        int sayi = giris.nextInt();
        asalBolenleriBul(sayi);
    }

    private static void asalBolenleriBul(int sayi) {
        for (int i = 2; i < Math.abs(sayi); i++) {
            if (sayi % i == 0) {
                asalKontrol(i);
                if (asalKontrol(i) == true) {
                    System.out.println(i);

                }
            }
        }

    }

    private static boolean asalKontrol(int sayi) {
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        return asalMi;
    }

}
