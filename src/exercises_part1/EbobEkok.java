package exercises_part1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        int n1 = input.nextInt();

        System.out.println("ikinci sayıyı girin");
        int n2 = input.nextInt();

        int ebob=1;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0){
                ebob=i;
                break;
            }
        }
        System.out.println("EBOB: "+ebob);

        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK:"+ekok);
    }
}
