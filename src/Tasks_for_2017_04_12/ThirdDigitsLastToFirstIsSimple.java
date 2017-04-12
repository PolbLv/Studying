package Tasks_for_2017_04_12;

/**
 * Created by LVIVSOFT\spolyakov on 12.04.17.
 */
public class ThirdDigitsLastToFirstIsSimple {
    public static void main(String args[]) {
        int r;
        for (int i = 100; i < 1000; i++) {
            r = getLastToFirstDigitsOfNumber(i);
            if (isSimple(r)) {
                System.out.println("r = " + r);
            }
        }
    }

    public static int getLastToFirstDigitsOfNumber(int num) {
        int r = 0;
        while (num > 0) {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
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

/*Вывести на экран все трехзначные числа у которых "развернутое"
число является простым числом */