package Old;

public class ZeroToThousandIfDigitEqualFiveAndThree {
    public static void main(String args[]) {

        zeroToThousand(10000);
    }

    public static void zeroToThousand(int x) {
        int counter = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 3 == 0) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("counter = " + counter);
    }
}

/*2. Подсчитать количество чисел в последовательности от 0 до 10000 выполняющих условие - число четное
и кратно 5 и 3 одновременно результат:
        334*/
