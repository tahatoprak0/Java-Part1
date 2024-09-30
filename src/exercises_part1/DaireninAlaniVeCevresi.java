package exercises_part1;

import java.util.Scanner;

// Bir dairenin alanını ve çevresini yazdıran bir Java programı yazın.
public class DaireninAlaniVeCevresi {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Yarıçap giriniz");
        double yariCap= giris.nextDouble();
        alanHesapla(yariCap);
        cevreHesapla(yariCap);
    }

    private static void cevreHesapla(double yariCap) {
        double cevre = 2*(Math.PI)*yariCap;
        System.out.println("Dairenin Çevresi:"+cevre);
    }

    private static void alanHesapla(double yariCap) {
        double alan=(Math.PI)*Math.pow(yariCap,2);
        System.out.println("Dairenin Alanı:"+alan);

    }


}
