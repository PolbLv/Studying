package Old;

/**
 * Created by Serhiy on 2/22/17.
 */
public class Notoddnumber {
    public static void main (String arg[]){

        oddDouble(1000);
    }
    public static void oddDouble(int x) {
        int counter = 0;
        for (int i = 0; i <= x; i++) {
            if (Math.pow(i, 2) % 2 != 0) {
                counter ++;
                System.out.println("i = " + i + " square = " + (int) Math.pow(i, 2));
            }
        }
        System.out.println("counter = " + counter);
    }
}
