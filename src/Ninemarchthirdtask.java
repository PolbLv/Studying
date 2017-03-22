/**
 * Created by Serhiy on 3/9/17.
 */
public class Ninemarchthirdtask {
    public static void main(String arg[]) {

        for (int i = 0; i < 500; i++) {
            if (simple(i)) {
                System.out.println("num: " + i);
            }
        }
    }

    public static boolean simple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//метод определяющий простое число на входе или нет