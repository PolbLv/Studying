package Task_for_2017_04_26;

import java.util.ArrayList;

public class TenToHundredSumMeasures {
    public static void main(String args[]) {
        myMethod(0, 100);
    }

    public static void myMethod(int x, int y) {

        ArrayList<Integer> digits;

        int sum =0;
        for (int i = x; i < y; i++) {
            digits = getDenominatorsOf(i);
            //sum = sum + digits;

            System.out.println("i = " + i + " result = " + sum + "digits = " + digits );
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


/*Для чисел от 10 до 100 вывести для каждого сумму всех его делителей*/