package Tasks_for_2017_04_12;

/**
 * Created by LVIVSOFT\spolyakov on 13.04.17.
 */
public class SixDigitsNumbers {
    public static void main(String args[]) {
        sumNumbersTwo(10000);
        sumNumbersOne(10000);
    }

    public static int sumNumbersOne(int y) {
        int i = 0;
        int first = i / 100000;
        int last = i % 10;
        for (i = 0; i < y; i++) {
            if (first == last)
                System.out.println("Variant 1 = " + i);
        }
        return i;
    }

    public static void sumNumbersTwo(int x) {
        int i;
        int first;
        int last;
        int basis;

        for (i = 0; i < x; i++) {
            if (i > 999999) {
                basis = 1000000;
            } else if (i > 99999) {
                basis = 100000;
            } else if (i > 9999) {
                basis = 10000;
            } else if (i > 999) {
                basis = 1000;
            } else if (i > 99) {
                basis = 100;
            } else if (i > 9) {
                basis = 10;
            } else
                basis = 1;

            first = i / basis;
            last = i % 10;

            if (first == last)
                System.out.println("Variant 2 = " + i);
        }
    }
}



/*    Вывести все числа от нуля до 100000
у которых первая и последняя цифры одинаковы. */