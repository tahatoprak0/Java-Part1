package exercises_part1;

import java.util.Scanner;
//girilen sayının tam bölenlerini bulan program
public class TamSayiBolenleri {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir Tam Sayı Giriniz");
        int sayi = giris.nextInt();
        tamBolenleriBul(sayi);

    }

    private static void tamBolenleriBul(int sayi) {
        for (int i = 1; i < Math.abs(sayi); i++) {
            if (sayi % i == 0) {
                System.out.println(i);
            }
        }
    }
}
