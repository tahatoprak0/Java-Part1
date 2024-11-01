package exercises_part1;

import java.util.Scanner;

//4 16 64 256
//5 25 125
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class DortveBesinKuvvetleriniYaz {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı girin");
        int n = giris.nextInt();

        System.out.println("dördün kuvvetleri");
        for (int i = 1; i <= n; i*=4) {
            if (i==1)
                continue;
            System.out.println(i);
        }

        System.out.println("\nbeşin kuvvetleri");
        for (int i = 1; i <= n; i*=5) {
            if (i==1)
                continue;
            System.out.println(i);
        }

    }
}
