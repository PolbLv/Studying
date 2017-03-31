package Tasks_for_loops2017_03_30;

/**
 * Created by Serhiy on 3/30/17.
 */
public class MathSqrtEqualFive {
    public static void main(String args[]) {

        minusFiveHundredToThreeHundred(-500, 300);
        thirtyToSeventy(30, 70);


    }

    public static void minusFiveHundredToThreeHundred(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (Math.sqrt(i) % 5 == 0) {
                System.out.println("i = " + i + "   Math.sqrt =  " + Math.sqrt(i));
            }
        }
    }

    public static void thirtyToSeventy(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + " Math.pow " + Math.pow(i, 2));
            }
        }
    }
}
/* вывести все числа от -500 до 300 для которых квадратные корни кратны пяти,
вывести квадраты четных числа от 30 до 70*/