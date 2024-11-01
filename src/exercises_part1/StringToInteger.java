package exercises_part1;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        System.out.println("Bir sayı girin");
        String s1=giris.nextLine();
        System.out.println();
        int sayi=Integer.parseInt(s1);
        System.out.println(sayi);
        System.out.println(sayi+10);

    }
}
