package exercises_part1;

import java.util.Scanner;
//girdiğiniz sayının asal bölenlerini bulan program
public class AsalBolenBul {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir Tam Sayı Giriniz");
        int sayi = giris.nextInt();
        asalBolenleriBul(sayi);

        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        System.out.print(sum);

    }

    private static void asalBolenleriBul(int sayi) {
        for (int i = 2; i < Math.abs(sayi); i++) {
            if (sayi % i == 0) {
                asalKontrol(i);
                if (asalKontrol(i) == true) {
                    System.out.println(i);

                }
            }
        }

    }

    private static boolean asalKontrol(int sayi) {
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        return asalMi;
    }

}
