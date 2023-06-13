

public class task_01 {
    public static void main(String[] args) {
        int[] array = { 15, 65, 75, 99, 42, 45 };
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
    if (array[i] > array[indexOfMax]) {
        indexOfMax = i;
    }
    else if (array[i] < array[indexOfMin]) {
        indexOfMin = i;
    }
}
System.out.println("Array maximum value: "+ array[indexOfMax]); 
System.out.println("Array minimum value: "+ array[indexOfMin]);
    }
    
}