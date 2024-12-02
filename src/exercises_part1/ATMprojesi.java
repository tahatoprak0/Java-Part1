package exercises_part1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
public class ATMprojesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select=0;
        int balance=1500;
        int right=3;
        while (right > 0 ){
            System.out.print("Kullanıcı adını girin: ");
            String userName = input.nextLine();
            System.out.print("Şifrenizi girin: ");
            String password = input.nextLine();

            if (userName.equals("ttt") && password.equals("ttt")){
                System.out.println("SİSTEME HOŞGELDİNİZ\n");

                while(select != 4){
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı girin: ");
                            int tutar= input.nextInt();
                            balance+=tutar;
                            System.out.println(tutar+" TL banka hesabına eklendi\n"+"Toplam Bakiye: "+balance);
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Tutarı Girin");
                            int cekilecekTutar=input.nextInt();
                            balance-=cekilecekTutar;
                            System.out.println(cekilecekTutar+" TL hesaptan çekildi\n"+"Yeni Bakiye: "+balance);
                            break;
                        case 3:
                            System.out.println("Toplam Bakiye: "+balance);
                            break;
                    }
                }
                System.out.println("Tekrar Görüşmek üzere");

                break;
            }else {
                right--;
                if (right==0){
                    System.out.println("Hesabınız bloke edildi.Lütfen Banka ile iletişime geçin");
                }else {
                    System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar Deneyin!");
                }

            }
        }

    }
}
