package exercises_part1;

import java.util.Scanner;

//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i <n; i++){
            for (int j=n; j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
