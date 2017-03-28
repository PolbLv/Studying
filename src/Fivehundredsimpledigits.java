/**
 * Created by Serhiy on 3/15/17.
 */
public class Fivehundredsimpledigits {
    public static void main(String args[]) {
        fivehundredsimpledigits(0, 500);

    }

    public static void fivehundredsimpledigits(int x, int y) {
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