// Создать квадратный двумерный целочисленный массив 
// (количество строк и столбцов одинаковое), и с помощью цикла(-ов) 
// заполнить его диагональные элементы единицами 
// (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: 
// индексы таких элементов равны, 
// то есть [0][0], [1][1], [2][2], …, [n][n];

import java.util.stream.IntStream;

public class task_02 {
    public static void main(String[] args) {

        int size = 5;
        int[][] array = new int[size][size];

        IntStream.range(0, size).forEach(i -> {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        });

        for (int n = 0; n < array.length; n++) {
            for (int k = 0; k < array[n].length; k++) {
                System.out.print(array[n][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int n = 0; n < array.length; n++) {
            for (int k = 0; k < array[n].length; k++) {
                if (n == k)
                
                System.out.print(array[n][k] + "\t");
            }
            
        }
        
    }
}
