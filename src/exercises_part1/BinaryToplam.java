package exercises_part1;

import java.util.Scanner;
//İki ikili sayıyı toplayan bir Java programı yazın.
public class BinaryToplam {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        long binary1, binary2;
        int kalan = 0;
        int i = 0;
        System.out.println("birinci binary sayıyı girin:");
        binary1 = giris.nextLong();
        System.out.println("ikinci binary sayıyı girin:");
        binary2 = giris.nextLong();

        int[] toplam = new int[15];

        while (binary1 != 0 || binary2 != 0) {
            toplam[i] = (((int) (binary1 % 10 + binary2 % 10 + kalan)) % 2);
            kalan = (((int) (binary1 % 10 + binary2 % 10 + kalan)) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
            i++;
        }
        if (kalan!=0){
            toplam[i]=kalan;
        }

        //i--;

        while(i>=0){
            System.out.print(toplam[i]);
            i--;
        }
    }
}

