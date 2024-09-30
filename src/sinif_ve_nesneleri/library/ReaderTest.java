package sinif_ve_nesneleri.library;

public class ReaderTest {
    public static void main(String[] args) {

        Author author1=new Author();
        author1.name="fahrettin Yılmaz";

        Reader reader1=new Reader();
        reader1.name="Taha Tayyib Toprak";
        reader1.age=21;
        reader1.sex='M';

        Book book1=new Book();
        book1.title="Fahrettin Paşanın Medine Müdafaası";
        book1.author=author1;
        book1.page=254;
        String type="History";
        int currentPage=100;

        reader1.read(book1);

    }
}
