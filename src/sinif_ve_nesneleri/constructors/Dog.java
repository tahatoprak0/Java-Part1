package sinif_ve_nesneleri.constructors;

public class Dog {
    private String name;
    private String color;

    Dog(String name, String color){
        this.name=name;
        this.color=color;
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Karabaş","Grey");
        System.out.println("Dog name= "+dog.name);
        System.out.println("Dog color= "+dog.color);
    }

}
