package Old;

/**
 * Created by LVIVSOFT\spolyakov on 24.03.17.
 */
public class PopulateArrayCountHundredToFourhundred {
    public static void main(String args[]) {

        int[] array = populateArray(10, 500);
        countOddDigits(array, 100, 400);

    }

    public static int[] populateArray(int size, int maxRandomNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxRandomNumber + 1));

        }
        return array;
    }

    public static void countOddDigits(int[] array, int x, int y) {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0 && array[i] >= x && array[i] <= y) {
                counter++;
                System.out.println(array[i]); // выводит четные числа
            }
        System.out.println(counter); // считает количество четных чисел
    }
}
/*Используя метод populateArray создать массив чисел от 0 до 500,
 вывести на экран количество четных чисел больше 100, но меньше 400*/