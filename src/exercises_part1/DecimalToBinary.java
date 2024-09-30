package exercises_part1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = giris.nextInt();
        int i = 0;
        int[] kalan = new int[10];

        ;
        while (sayi/2 != 0) {
            int temp =  sayi % 2;
            sayi = sayi / 2;
            kalan[i] = temp;
            i++;
        }

        int sonKalan = sayi % 2;
        if (sonKalan == 1) {
            kalan[i] = sonKalan;
        }

        while (i >= 0) {
            System.out.print(kalan[i]);
            i--;
        }
    }
}
