package sinif_ve_nesneleri.library;

public class Reader {
    String name;
    int age;
    char sex;

    public void read(Book book){
        System.out.println(name+" "+book.title+" adlı kitabı okumaya başladı");
    }
}
