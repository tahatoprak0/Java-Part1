package OOP_Part1.Arrays;
//Dizideki Elemanların toplamını Hesaplayan Program
public class ElemanlariTopla {
    public static void main(String[] args) {
        int array[] = {3,4,1,7,5,8};
        elemanlariTopla(array);

    }

    static void elemanlariTopla (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Dizideki Elemanların Toplamı: "+sum);
    }

}
