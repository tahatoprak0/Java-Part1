package exercises_part1;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı girin");
        int number = input.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}
