/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ZeroToHundred {
    public static void main() {
        zeroToHundred(100);
        hundredToZero(100);
    }

    public static void zeroToHundred(int x) {
        for (int i = 0; i < x; i++) ;
        System.out.println("ZeroToHundred " + x);
    }

    public static void hundredToZero(int x) {
        for (int i = 0; i > x; --i) ;
        System.out.println("HundredToZero " + x);

    }
}

