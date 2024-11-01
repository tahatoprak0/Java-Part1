package exercises_part1;

import java.util.Scanner;

public class İkininKuvveriniYazdir {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı girin");
        int n = giris.nextInt();

        for (int i = 1; i < n; i*=2) {
            System.out.println(i);
        }
    }
}
