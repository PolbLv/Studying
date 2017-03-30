package Old;

/**
 * Created by LVIVSOFT\spolyakov on 24.03.17.
 */
public class PopulateArraysimpledigits {
    public static void main(String arg[]){

        int[] array = populateArray(10, 500);

        System.out.println(countSimpleDigits(array));
    }

    public static int[] populateArray(int size, int maxRandomNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxRandomNumber + 1));
            //         System.out.println(array[i]);
        }
        return array;
    }
    public static int countSimpleDigits(int[] array){
        int counter = 0;
        for (int i = 0; i<array.length; i++)
            if (simple(array[i])) {
                //System.out.println("i = " + array);
                counter++;
            }
        return counter;
        }
    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
// Используя метод populateArray создать массив чисел от 0 до 500,
// вывести на экран количество простых чисел в массиве
