import java.util.Arrays;

public class Task21 {
     public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        int[] array2 = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(array2, 5);
        System.out.println(index);

        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 3};
        System.out.println(Arrays.equals(array3, array4));

        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2, 4};
        System.out.println(Arrays.compare(array5, array6));

        int[] array7 = {5, 3, 1, 4, 2};
        Arrays.sort(array7);
        System.out.println(Arrays.toString(array7));
    }
}
