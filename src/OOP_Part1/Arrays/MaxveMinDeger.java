package OOP_Part1.Arrays;

public class MaxveMinDeger {
    public static void main(String[] args) {
        int array[] = {5, 7, 12,2, 54,102,78,3, 23, 95};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i <array.length; i++){
            if (array[i]<min){
                min=array[i];
            }if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("dizideki en küçük eleman:" + min);
        System.out.println("dizideki en büyük eleman:" + max);

    }
}
