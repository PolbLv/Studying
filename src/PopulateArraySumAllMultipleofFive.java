/**
 * Created by LVIVSOFT\spolyakov on 27.03.17.
 */
public class PopulateArraySumAllMultipleofFive {
    public static void main(String args[]) {

        int[] array = populateArray(10, 500);
        calculateSumsOfMultipleOfFive(array);

    }

    public static int[] populateArray(int size, int maxRandomNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxRandomNumber + 1));
        }
        return array;
    }

    public static void calculateSumsOfMultipleOfFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}


/*Используя метод populateArray создать массив чисел от 0 до 500,
вывести на экран сумму всех элементов массива которые кратны пяти*/