package Tasks_for_2017_04_19;

public class NumbersTenToHundredMeasuresToItself {
    public static void main(String args[]) {

        for (int i = 10; i < 100; i++) {
                System.out.println("i = " + i + " / = " + method(i));
        }
    }

    public static String method(int n) {
        String res = " ";
        for (int i = 1; i < n; i++) {
            if (0 == (n % i)) {
                res += i + ", ";
            }
        }
        return res;
    }
}


/*Для каждого из чисел от 10 до 100 вывести все их делители. Например:
        10 - 1 2 5
        11 - 1
        12 - 1 2 3 6
        13 - 1
        14 - 1 2 7
        15 - 1 3 5
        ,,,
        50 - 1 2 5 10 25 */