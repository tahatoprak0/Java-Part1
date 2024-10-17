package sarmalama;

public class Account {
    private int id;
    private String firstName;
    private String lastName;
    private double balance;

    public Account(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void paraEkle(double eklenenPara) {
        balance += eklenenPara;
        System.out.println("Hesapa " + eklenenPara + " TL Eklendi");
    }

    public void paraCek(double cekilecekPara) {
        balance -= cekilecekPara;
        System.out.println("Hesaptan " + cekilecekPara + " TL Çekildi");
    }

    public static void havaleEft(double gonderilenPara, Account gonderenHesap, Account alanHesap) {
        if (gonderenHesap.getBalance()>=gonderilenPara){

            gonderenHesap.setBalance(gonderenHesap.getBalance()-gonderilenPara);
            alanHesap.setBalance(alanHesap.getBalance()+gonderilenPara);
            System.out.println(gonderilenPara+" TL "+"Havale İşlemi Gerçekleşti");
        }else System.out.println("Yetersiz Bakiye");

    }

    public void bilgiYazdir() {
        System.out.println("İD:" + id + "\nName:" + firstName + "\nLast Name:" + lastName + "\nHesaptaki Toplam Para:" + balance + "TL");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
