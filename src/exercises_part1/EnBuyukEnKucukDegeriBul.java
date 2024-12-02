package exercises_part1;

import java.util.Scanner;

//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
public class EnBuyukEnKucukDegeriBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Toplam kaç sayı girmek istiyorsunuz?");
        int girilecekToplamSayi = input.nextInt();
        int n = 0;
        int enKucuk=0;
        int enBuyuk=0;

        while (girilecekToplamSayi > n) {
            n++;
            System.out.print(n + ". Sayıyı girin: ");
            int sayi = input.nextInt();
            if (enBuyuk < sayi) {
                enBuyuk = sayi;
            }
            if (enKucuk==0){
                enKucuk=sayi;
            }
            if (enKucuk > sayi){
                enKucuk=sayi;
            }
        }
        System.out.println("En Büyük sayı:"+enBuyuk);
        System.out.println("En Küçük Sayı: "+enKucuk);
    }
}
