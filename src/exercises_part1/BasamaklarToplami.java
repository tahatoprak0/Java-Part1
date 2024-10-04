package exercises_part1;
import java.util.Scanner;

//Bir Java programı yazın ve bir tam sayının basamaklarının toplamını hesaplayın.
public class BasamaklarToplami {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Tamsayı girin");
        int sayi= giris.nextInt();
        int toplam=0;

        while(sayi!=0){
            int kalan=sayi%10;
            toplam+=kalan;
            sayi=(int)sayi/10;
        }
        System.out.println("Basamaklar Toplamı="+toplam);
    }
}
