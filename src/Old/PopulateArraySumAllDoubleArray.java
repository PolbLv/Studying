package Old;


public class PopulateArraySumAllDoubleArray {
    public static void main(String args[]) {

        int[] array = populateArray(10, 500);
        calculateSums(array);

    }

    public static int[] populateArray(int size, int maxRandomNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxRandomNumber + 1));

        }
        return array;
    }

    public static void calculateSums(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
            sum2 = sum2 + (int) Math.pow(array[i], 2);

        }
        System.out.println(" All Elements = " + sum1 + "  Sum of Math pow = " + sum2);
    }
}

/* Используя метод populateArray создать массив чисел от 0 до 500,
вывести на экран сумму всех элементов массива, а также сумму квадратов всех элементов массива*/