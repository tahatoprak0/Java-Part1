package exercises_part1;

import java.util.Scanner;
//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
public class RecursiveAsalSayi {

    static boolean asalRecursive(int sayi, int bolen){

        if (sayi<=1){
            return false;
        }

        if (sayi % bolen == 0){
            return false;
        }

        if(bolen > sayi / 2)
            return true;

        return asalRecursive(sayi,(bolen + 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Girin");
        int number = input.nextInt();

        boolean asalMi= asalRecursive(number,2);
        if (asalMi){
            System.out.println(" Sayı asaldır ");;
        }else System.out.println("Sayı asal değildir");
    }
}
