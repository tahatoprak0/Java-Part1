package exercises_part1;

//1, 2, 3, 4 kullanarak rakamları farklı  üç basamaklı sayı oluşturmak ve görüntülemek için bir Java programı yazın.
public class SayiOlustur {
    public static void main(String[] args) {

        int dizi[] = {1, 2, 3, 4};
        int sayi1 = dizi[((int) (Math.random() * 4))];
        int sayi2, sayi3;
        boolean rakamlarEsitMi = true;
        String sayi="";

        while (rakamlarEsitMi == true) {
            sayi2 = dizi[((int) (Math.random() * 4))];
            sayi3 = dizi[((int) (Math.random() * 4))];
            if (sayi1 != sayi3 && sayi1!=sayi2 && sayi2 != sayi3){
                sayi=""+sayi1+sayi2+sayi3;
                rakamlarEsitMi=false;
            } else rakamlarEsitMi=true;
        }
        System.out.println(sayi);


    }
}
