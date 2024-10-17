package sarmalama;

public class AccountTest {
    public static void main(String[] args) {
        Account musteri1=new Account(1,"Taha","Toprak",500);
        musteri1.paraEkle(500);
        musteri1.paraEkle(500);
        musteri1.paraCek(300);
        musteri1.paraCek(300);
        musteri1.paraCek(50);
        musteri1.bilgiYazdir();
        System.out.println();
        Account musteri2=new Account(2,"Ahmet","Mithat",350);
        musteri2.paraEkle(350);
        musteri2.paraEkle(300);
        musteri2.paraCek(500);
        musteri2.bilgiYazdir();

       Account.havaleEft(500,musteri1,musteri2);
       musteri2.bilgiYazdir();

       musteri1.bilgiYazdir();

    }
}
