package sinif_ve_nesneleri.constructors;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(){

    }

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    Book(String title, String author, double price){
       this(title,author);
       this.price=price;
    }

    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Ateşten Gömlek";
        book1.author="Halide Edip Adıvar";
        book1.price=50.99;
        System.out.println("Kitap adı;"+book1.title);
        System.out.println("Kitap yazarı:"+book1.author);
        System.out.println("Kitap fiyatı:"+book1.price);
        System.out.println("\n");

        Book book2=new Book("Fahrettin Paşanın Medine Müdafaası","Fatih Çoban");
        book2.price=99.99;
        System.out.println("Kitap Adı:"+book2.title);
        System.out.println("Kitap Yazarı:"+book2.author);
        System.out.println("Kitap Fiyatı:"+book2.price);
        System.out.println("\n");

        Book book3=new Book("Kasağı","Ömer Seyfettin",65.99);
        System.out.println("Kitap Adı="+book3.title);
        System.out.println("Kitap yazarı="+book3.author);
        System.out.println("Kitap Fiyatı="+book3.price);
    }

}
