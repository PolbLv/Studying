package Old;

import java.util.ArrayList;

/**
 * Created by Serhiy on 3/16/17.
 */
public class AfterOneThousandSimpleDigits {
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
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }


    public static class ArrayListPopulateArrayRandom {
        public static void main(String args[]) {

            populateList(10, 300);
        }

        public static ArrayList<Integer> populateList(int size, int limit) {
            ArrayList<Integer> random = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                random.add((int) (Math.random() * (limit + 1)));
            }
            System.out.println(random);
            return random;
        }

    }
}

//    вывести  тысячу простых чисел начиная от 1000
