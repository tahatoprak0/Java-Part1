package exercises_part1;

import java.util.Scanner;

//Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz
public class GirilenDegereKadarCiftSayilar {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir tam sayı değeri girin");
        int sayi = giris.nextInt();

        for (int i = 0; i < sayi; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
