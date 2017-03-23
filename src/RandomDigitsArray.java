import java.util.Random;

/**
 * Created by Serhiy on 3/20/17.
 */
public class RandomDigitsArray {
    public static void main(String args[]) {
        populateArray(10, 55);

    }

    public static int[] populateArray(int size, int maxRandomNumber) {
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()* (maxRandomNumber + 1));
            System.out.println(array[i]);
        }
        return array;
    }
}


 /*   Создать метод наполняющий массив случайными числами, метод должен иметь такую сигнатуру:
public static int[] populateArray(int size, int maxRandomNumber)
переменная size  определяет количество сгенерированых чисел и размер выходного массив
переменная maxRandomNumber определяет верхнюю границу генерируемых чисел, например если
оно будет равно 55 то генератор случайных чисел должен генерировать числа в диапазоне 0-55*/