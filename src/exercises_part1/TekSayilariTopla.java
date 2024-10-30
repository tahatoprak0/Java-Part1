package exercises_part1;

import java.util.Scanner;
//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
public class TekSayilariTopla {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int n;
        int toplam = 0;

       do {
           System.out.print("Sayı girin:");
           n = giris.nextInt();
           if (n % 2 == 1){
               toplam=toplam+n;
           }
       }while (n>0);
        System.out.println("Toplam:"+(toplam));

    }
}
