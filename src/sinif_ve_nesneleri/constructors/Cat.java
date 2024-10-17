package sinif_ve_nesneleri.constructors;

/*"Cat" adında bir sınıf oluşturmak için name ve age örnek değişkenleri içeren bir Java programı yazın.
Adı "Unknown" ve age'i 0 olarak başlatan varsayılan bir oluşturucu uygulayın. Değişkenlerin değerlerini yazdırın.*/
public class Cat {
    private String name;
    private int age;

    Cat(){
        this.name="Unknown";
        this.age=0;
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println("Cat Name: "+cat.name);
        System.out.println("Cat Age: "+cat.age);
    }

}
