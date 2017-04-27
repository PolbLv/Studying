package Task_for_2017_04_26;

import java.util.ArrayList;

public class HundredToThousandTenMeasuresIsSimple {
    public static void main(String args[]) {
        myMethod(100, 1000);
    }

    public static void myMethod(int x, int y) {
        ArrayList<Integer> digits;
        for (int i = x; i < y; i++) {
            digits = getDenominatorsOf(i);
            if (digits.size() > 10 && isSimple(digits.size()))
                System.out.println("i = " + i + " result = " + digits);
        }
    }

    public static ArrayList<Integer> getDenominatorsOf(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (0 == (number % i)) {
                digits.add(i);
            }
        }
        return digits;
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
/*Вывести на экран числа из интервала 100-1000 у которых
количество делителей больше 10 и количество делителей является простым числом.*/