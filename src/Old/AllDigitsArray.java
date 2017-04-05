package Old;

/**
 * Created by Serhiy on 3/21/17.
 */
public class AllDigitsArray {
    public static void main(String args[]) {
        printArray(new int[]{100, 58, 45, 67});

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + "  ");
    }
}
/*Создать метод выводящий в консоль все числа массива
public static void printArray(int[] array)*/