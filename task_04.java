// Написать метод, которому на вход подается одномерный массив и число n 
// (может быть положительным, или отрицательным), при этом метод должен 
// сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами. 
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; 
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. 
// При каком n в какую сторону сдвиг можете выбирать сами.

import java.util.Arrays;
import java.util.Scanner;

/**
 * task_04
 */

public class task_04 {
    public static void main(String[] args) {

        int[] intArrTest = { 23, 56, 17, 44, 67, 1 };   // Создаем одномерный массив;
        System.out.println("Outputting a one-dimensional array\n");
        System.out.println(Arrays.toString(intArrTest));
        System.out.println();
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Enter array shift: ");
            Integer n = iScanner.nextInt();
        System.out.println();   
        
        System.out.println(Arrays.toString(getArrayWithShift(intArrTest, n)));
        }
    }

   

    public static int[] getArrayWithShift(int[] arr, int shift) {
        if (shift > 0) {
            for (int s = 1; s <= shift; s++) {
                int elemshift = arr[arr.length - 1];
                for (int i = arr.length - 2; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = elemshift;
            }
        } else if (shift < 0) {
            for (int s = shift; s <= -1; s++) {
                int elemshift = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = elemshift;
            }
        }
        return arr;

    }
}
