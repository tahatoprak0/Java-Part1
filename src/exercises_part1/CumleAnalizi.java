package exercises_part1;

import java.util.Scanner;
//Bir bir cümledeki harfleri, boşlukları, sayıları ve diğer karakterleri saymak için bir Java programı yazın
public class CumleAnalizi {
    public static void main(String[] args) {

        String sentence="ben bir amfibiyanım 31 ?!!";
        int letter=0;
        int space=0;
        int num=0;
        int other=0;

        for (int i=0; i<sentence.length();i++){
            if (Character.isLetter(sentence.charAt(i))){
                letter++;
            } else if (Character.isSpaceChar(sentence.charAt(i))) {
                space++;
            } else if (Character.isDigit(sentence.charAt(i))) {
                num++;
            }else other++;
        }

        System.out.println("Harf Sayısı:"+letter);
        System.out.println("Boşluk Sayısı:"+space);
        System.out.println("Sayı sayısı:"+num);
        System.out.println("Diğer karakterlerin sayısı:"+other);
    }
}
