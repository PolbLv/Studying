package Tasks_for_loops2017_03_30;

/**
 * Created by Serhiy on 3/30/17.
 */
public class MinusFiveHundredToThreeHundred {
    public static void main(String args[]) {

        minusFiveHundred(-500, -300);
        fiveHundredSimpleDigits(500, 900);
    }

    public static void minusFiveHundred(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println("MinusFiveHundred = "  + i);
            }
        }
    }

    public static void fiveHundredSimpleDigits(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i simple = " + x);
                counter++;
            }
            x++;
        }
        System.out.println("counter = " + counter);
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
/*Вывести нечетные числа в диапазоне от -500 до -300
вывести простые числа в диапазоне от 500 до 900, подсчитать их количество в данном диапазоне.*/