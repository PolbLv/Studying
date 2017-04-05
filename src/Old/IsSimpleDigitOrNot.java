package Old;

/**
 * Created by Serhiy on 3/9/17.
 */
public class IsSimpleDigitOrNot {
    public static void main(String arg[]) {

        for (int i = 0; i < 500; i++) {
            if (isSimple(i)) {
                System.out.println("num: " + i);
            }
        }
    }

    public static boolean isSimple(int num) {
        if (num == 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//метод определяющий простое число на входе или нет