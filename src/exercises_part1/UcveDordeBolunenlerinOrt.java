package exercises_part1;

import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class UcveDordeBolunenlerinOrt {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir tam sayı değeri girin");
        int sayi = giris.nextInt();
        int toplam=0;
        int ort=0;
        int toplamSayi=0;
        for (int i = 1; i < sayi; i++){
            if (i%12==0){
                System.out.print(i+" ");
                toplam+=i;
                toplamSayi++;
            }
        }

        ort=toplam/toplamSayi;
        System.out.println("\n3 ve 4 e bölünen sayıların toplamı:"+toplam);
        System.out.println("Sayıların Ortalaması:"+ort);
    }
}
