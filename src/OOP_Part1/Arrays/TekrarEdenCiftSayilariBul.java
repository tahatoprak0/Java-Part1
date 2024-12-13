package OOP_Part1.Arrays;

import java.util.Arrays;

//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazın
public class TekrarEdenCiftSayilariBul {
    public static void main(String[] args) {
        int array[] = {5, 2, 5, 2, 8, 7, 5, 6, 3, 6, 5, 7, 8, 9};
        int newArray[] = new int[array.length];
        int starter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!isFind(newArray, array[i]) && array[i] % 2 == 0) {
                        newArray[starter++] = array[i];
                    }

                    break;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

    }

    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
