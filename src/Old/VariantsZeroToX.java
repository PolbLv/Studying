package Old;


public class VariantsZeroToX {
    public static void main(String args[]) {

//        myMethod(5);
//        myMethod2(30);
//        myMethod3(100);
//        myMethod4(100);
//        myMethod5(100);
        myMethod6(100);
    }

    public static void myMethod(int x) {

        for (int i = 0; i <= x; i++) {
//            System.out.println(Math.pow(i, 2));
//            System.out.println("i = "+ i + "; Square = " +  Math.pow(i, 2));
        }

    }

    public static void myMethod2(int x) {
        for (int i = 0; i <= x; i++) {
            if (Math.pow(i, 2) % 8 == 0) {
                System.out.println(i + ": " + (int) Math.pow(i, 2));
            }
//            System.out.println(Math.pow(i,2));
        }
    }

    public static void myMethod3(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void myMethod4(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println("i = " + i + "; " + Math.sqrt(i));
        }
    }

    public static void myMethod5(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void myMethod6(int x) {
        int counter = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 3 != 0 && i % 17 != 0) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("counter = " + counter);
    }
}

// || - or
// && - and
