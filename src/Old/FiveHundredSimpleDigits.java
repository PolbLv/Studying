package Old;

/**
 * Created by Serhiy on 3/15/17.
 */
public class FiveHundredSimpleDigits {
    public static void main(String args[]) {
        fiveHundredSimpleDigits(500, 50);

    }

    public static void fiveHundredSimpleDigits(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}

/*Используя цикл while вывести 500 простых чисел начиная от нуля.
Метод определяющий простое число на входе или нет у тебя уже есть.*/