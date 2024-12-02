package exercises_part1;

import java.util.Scanner;

public class CiftMi {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Bİr tam sayı giriniz");
        int sayi= giris.nextInt();

        if (sayi%2==0){
            System.out.println("sayı çifttir");
        }else System.out.println("sayı tektir");
    }
}
