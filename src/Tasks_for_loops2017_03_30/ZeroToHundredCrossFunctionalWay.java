package Tasks_for_loops2017_03_30;

/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ZeroToHundredCrossFunctionalWay {
    public static void main(String arg[]) {
        ZeroToHundred(0, 100);
        minusHundredToZero(-100, 0);
        evenZeroToHundred(0, 100);
        minusOddHundredToZero( -100, 0);
    }

    public static void ZeroToHundred(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println("ZeroToHundred " + i);
        }
    }

    public static void minusHundredToZero(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println("minusHundredToZero " + i);
        }
    }

    public static void evenZeroToHundred(int min, int max) {
        for (int i =min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println("evenZeroToHundred " + i);
            }
        }

    }

    public static void minusOddHundredToZero(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println("minusOddHundredToZero " + i);
            }
        }
    }
}





/*    Написать программу выводящую на экран числа от 0 до 100,
затем числа от -100 до 0 затем четные числа в диапазоне от 0 до 100,
        затем нечетные числа в диапазоне от -100 до 0*/