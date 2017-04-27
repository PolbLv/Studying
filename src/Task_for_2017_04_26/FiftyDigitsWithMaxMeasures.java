package Task_for_2017_04_26;

import java.util.ArrayList;

public class FiftyDigitsWithMaxMeasures {
    public static void main(String args[]) {
        myMethod(100, 110);
    }

    public static void myMethod(int x, int y) {
        ArrayList<Integer> digits;
        ArrayList<Integer> maxDenominators = new ArrayList<>();
        int size = 50;
        int maxLength = 0;
        int k = 0;
        for (int i = x; i < y; i++) {
            digits = getDenominatorsOf(i);

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
}


/*Вывести на экран 50 чисел из интервала 100-1000
    у которых наибольшее количество делителей.*/