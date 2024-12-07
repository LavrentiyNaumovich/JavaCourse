/**
 * Класс ArrayUtils предоставляет несколько полезных методов для работы с массивами.
 *
 * @author Lavrentiy
 * @version 1.0
 */
public class ArrayUtils {

    /**
     * Возвращает максимальное значение в массиве
     *
     * @param arr массив целых чисел
     * @return максимальное значение в массиве
     * @throws IllegalArgumentException если массив пуст
     */
    public static int findMax(int[] arr) throws IllegalArgumentException {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Возвращает минимальное значение в массиве
     *
     * @param arr массив целых чисел
     * @return минимальное значение в массиве
     * @throws IllegalArgumentException если массив пуст
     */
    public static int findMin(int[] arr) throws IllegalArgumentException {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Находит сумму всех элементов массива
     *
     * @param arr массив целых чисел
     * @return сумма всех элементов массива
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Главная функция для демонстрации работы с массивами
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
        System.out.println("Sum: " + sum(arr));
    }
}
