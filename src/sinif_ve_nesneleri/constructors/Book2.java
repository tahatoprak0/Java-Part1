package sinif_ve_nesneleri.constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book2 {
    String title;
    String author;
    String ISBN;
    static ArrayList<Book2> books=new ArrayList<>();

    Book2(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

    public void kitapEkle(Book2 newBook){
       books.add(newBook);
    }
    public void kitapSil(Book2 oldBook){
        books.remove(oldBook);
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book2 book1= new Book2("Ahmet Mithat","Şemsettin Paşa","125789634572");
        Book2 book2= new Book2("Kavgam","Adolf Hitler","125787634572");
        Book2 book3= new Book2("Daha İyi Bir Dünya","RTE","125789634172");
        Book2 book4= new Book2("Cingöz Recai","Peyami Safa","125749634572");
        Book2 book5= new Book2("Kaşağı","Ömer Seyfettin","125782634572");
        book1.kitapEkle(book1);
        book2.kitapEkle(book2);
        book3.kitapEkle(book3);
        book4.kitapEkle(book4);
        book5.kitapEkle(book5);

        System.out.println(Book2.books.get(4));

        book5.kitapSil(book5);
        System.out.println(Book2.books.get(3));




    }

}
