package exercises_part1;

import java.util.Scanner;

//Bir tam sayı (n) kabul eden ve n+nn+nnn değerini hesaplayan bir Java programı yazın.
public class NnnToplam {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Bir n değerini girin");
        String n= giris.nextLine();
        String nn="";
        String nnn="";
        System.out.println();
        System.out.println(n);

        for (int i=0;i<2;i++){
             nn+=""+n;
        }
        System.out.println(nn);

        for (int i=0;i<3;i++){
            nnn+=""+n;
        }
        System.out.println(nnn);

        System.out.println(n+"+"+nn+"+"+nnn);
        int N=Integer.parseInt(n);
        int NN=Integer.parseInt(nn);
        int NNN=Integer.parseInt(nnn);
        System.out.println(N+NN+NNN);

    }
}
