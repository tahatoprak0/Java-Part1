package exercises_part1;

import java.util.Scanner;

public class ikiDegiskeniTakasEt {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Girin");
        int sayi1 = giris.nextInt();
        System.out.println("İkinci Sayıyı Girin");
        int sayi2 = giris.nextInt();
        System.out.println("Birinci sayı:" + sayi1 + "\nİkinci Sayı:" + sayi2);
        System.out.println("\nSayılar takas ediliyor...");
        int temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        System.out.println("Birinci sayı:" + sayi1 + "\nİkinci Sayı:" + sayi2);


    }
}
