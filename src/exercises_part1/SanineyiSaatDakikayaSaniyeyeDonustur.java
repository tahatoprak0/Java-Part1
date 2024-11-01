package exercises_part1;

import java.util.Scanner;

public class SanineyiSaatDakikayaSaniyeyeDonustur {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi=giris.nextInt();
        int saniye =0;
        int saat = 0;
        int dakika = 0;

        for (int i = 0; i < 1; i++) {
            saniye = sayi % 60;
            dakika = (int) sayi/ 60;
            for (int j = 0; j < 1; j++) {
                saat = (int) dakika / 60;
            }
        }
        System.out.println(saat + " saat  " + dakika + " dakika " + saniye+" saniye ");
    }
}
