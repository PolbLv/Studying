package Task_for_2017_04_26;

import java.util.ArrayList;

public class TenToHundredSumMeasures {
    public static void main(String args[]) {
        myMethod(10, 100);
    }

    public static void myMethod(int x, int y) {

        ArrayList<Integer> digits;
        int sum;
        for (int i = x; i < y; i++) {
            digits = getDenominatorsOf(i);
            sum = 0;
            for (int j = 0; j < digits.size(); j++) {
                sum = sum + digits.get(j);
            }
            System.out.println(" sum = " + sum + "  digits  = " + digits + " Number = " + i);
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