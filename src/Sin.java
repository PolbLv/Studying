/**
 * Created by Serhiy on 2/18/17.
 */
public class Sin {
    public static void main(String args[]) {
        System.out.println("sinstring "+ sinstring(3, 4, 6, " Hello "));
        int x  = 0;
        int y = 4;
        double z  = 2;
    }
    static String sinstring(int x, int y, double z, String text) {
        return (int) Math.pow(x, 5) + (int) Math.pow(y, 6) -  Math.sin(2) + text;
    }
}
