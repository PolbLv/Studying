/**
 * Created by Serhiy on 3/16/17.
 */
public class Afteronethousandsimpledigits {
    public static void main(String args[]) {
        onethousandsimpledigits(1000, 1000);

    }

    public static void onethousandsimpledigits(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}

//    вывести  тысячу простых чисел начиная от 1000
