package sinif_ve_nesneleri;
//constructor kullanarak daire alannı hesaplayan bir uygulama yapın

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Dairenin YarıÇapını Girin");
        int yariCap= giris.nextInt();
        Daire daire=new Daire(yariCap);
        daire.alanHesapla();
    }

}

class Daire{
    int yariCap;

    Daire(int newYariCap){
        yariCap=newYariCap;
    }

    public void alanHesapla(){
        double alan= ((float)(Math.PI))*Math.pow(yariCap,2);
        System.out.println("Alan:"+alan);
    }
}
