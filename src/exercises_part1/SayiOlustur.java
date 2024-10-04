package exercises_part1;

//1, 2, 3, 4 kullanarak bir üç basamaklı sayı oluşturmak ve görüntülemek için bir Java programı yazın.
public class SayiOlustur {
    public static void main(String[] args) {
        int dizi[] = {1, 2, 3, 4};
        String sayi = "";//+dizi[(int) (Math.random() * 4)];

        for (int i = 0; i <= 2; i++) {
            int sayiSec=dizi[(int)Math.random()*4];
            sayi+=sayiSec;
            System.out.println(s);
        }


    }
}
