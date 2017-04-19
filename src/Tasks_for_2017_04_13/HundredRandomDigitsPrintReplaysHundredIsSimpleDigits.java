package Tasks_for_2017_04_13;

import java.util.Random;

public class HundredRandomDigitsPrintReplaysHundredIsSimpleDigits {
    public static void main(String args[]) {
        randomDigits(100);
    }

    public static void randomDigits(int size) {
        Random random = new Random();
        int counter = 0;
        int replays = 0;
        while (counter < size) {
            replays++;
            int result = random.nextInt(100) + 1;
            if (isSimple(result)) {

                System.out.println("i = " + result);
                counter++;
            }
        }
        System.out.println("counter  = " + counter + " replays = " + replays);
    }

    public static boolean isSimple(int num) {
        if (num == 0 || num == 1) {
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

/*
7,Написать программу которая генерирует случайные числа от 0 до 100,
вывести на экран количество повторений этой программы необходимых
для генерациии сотни простых чисел. */
