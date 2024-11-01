package exercises_part1;

//1'den 99'a kadar tek sayıları yazdıran bir Java programı yazın. Her satıra bir sayı yazdırır.
public class TekSayilariYazdir {
    public static void main(String[] args) {
        for (int i=1;i<=99;i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
