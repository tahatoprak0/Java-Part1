package exercises_part1;

import java.util.Scanner;

//Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
public class HesapMakinesi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = 0;
        System.out.println("****MENU****");
        String menu = "1 - Toplama İşlemi" +
                "\n 2 - Çıkarma İşlemi" +
                "\n 3 - Çarpma İşlemi" +
                "\n 4 - Bölme İşlemi" +
                "\n 5 - Uslu Sayı Hesaplama" +
                "\n 6 - Faktöriyel Hesaplama" +
                "\n 7 - Mod Alma" +
                "\n 8 - Dikdörtgen Alan ve Çevre Hesabı" +
                "\n 9 - Çıkış";
        System.out.println(menu);

        while (true) {
            System.out.print("Hangi İşlemi Yaptırmak İstersiniz ");
            select = input.nextInt();
            if (select == 9) {
                System.out.println("Çıkış Yapılıyor");
                break;
            }

            System.out.println("İlk sayıyı girin");
            int a = input.nextInt();
            System.out.println("İkinci Sayıyı Girin");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    pow(a, b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7 :
                    mod(a,b);
                    break;
                case 8 :
                    rectangle(a,b);
                    break;

            }
        }


    }

    static void rectangle(int a, int b) {
        int area = a*b;
        int perimeter = 2*(a+b);
        System.out.println("Area:"+area+"\n" +
                "Perimeter:"+perimeter);
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println(a+" % "+b+" = "+result);
    }

    static void factorial(int a) {
        int result = 1;
        for (int i = 1; i<=a; i++){
            result*=i;
        }
        System.out.println(a+"!"+" = "+result);
    }

    static void pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
    }

    static void divided(int a, int b) {
        int result = a / b;
        if (b == 0) {
            System.out.println("divided by zero");
        } else System.out.println(result);


    }

    static void times(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
}
