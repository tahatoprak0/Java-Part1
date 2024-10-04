package exercises_part1;

import java.util.Scanner;

//İki sayıyı karşılaştırmak için bir Java programı yazın.
public class SayiKarsilastir {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int sayi1= giris.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2= giris.nextInt();

        if (sayi1<sayi2){
            System.out.println(sayi1+"<"+sayi2);
        } else if (sayi1>sayi2) {
            System.out.println(sayi1+">"+sayi2);
        }else System.out.println(sayi1+"="+sayi2);
    }
}
