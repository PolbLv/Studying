package Tasks_for_loops2017_03_30;

/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ZeroToHundred1 {
    public static void main(String[] args) {
        zeroToHundred(100);
        minusHundredToZero(0);
        evenZeroTohundred(100);
        minusOddHundredToZero(0);

    }

    public static void zeroToHundred(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println("zeroToHundred " + i);
        }
    }

    public static void minusHundredToZero(int x) {
        for (int i = -100; i <= x; i++) {
            System.out.println("minusHundredToZero " + i);
        }
    }
    public static void evenZeroTohundred(int x){
        for (int i= 0; i <= x; i++){
            if (i % 2 == 0){
                System.out.println("evenZeroToHundred " + i);
            }
        }

    }
    public static void minusOddHundredToZero(int x){
        for (int i = -100; i <= x; i++){
            if (i % 2 != 0){
                System.out.println("minusOddHundredToZero " + i);
            }
        }
    }
}


/*    Написать программу выводящую на экран числа от 0 до 100,
        затем числа от -100 до 0 затем четные числа в диапазоне от 0 до 100,
        затем нечетные числа в диапазоне от -100 до 0*/