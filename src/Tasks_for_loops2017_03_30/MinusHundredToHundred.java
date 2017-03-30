package Tasks_for_loops2017_03_30;

/**
 * Created by Serhiy on 3/30/17.
 */
public class MinusHundredToHundred {
    public static void main(String args[]) {

        minusHundredToHundred(-100, 100);
        thousandToZeroMathSqrt(0, 1000);
    }

    public static void minusHundredToHundred(int min, int max) {
        for (int i = min; i < max; i++) {
            System.out.println("minusHundredToHundred " + i);
        }
    }

    public static void thousandToZeroMathSqrt(int min, int max) {
        for (int i = max; i >= min; --i) {
            double pi = i + Math.sqrt(i);
                System.out.println("i" + " = " + i + " res" + " = " + pi); {

            }

        }
    }
}



/*Написать программу выводящую на экран числа от -100 до 100,
затем вывести квадратные корни чисел в диапазоне от 1000 до 0*/