package practice;

/**
 * Created by Serhiy on 5/15/17.
 */
public class LastDiggitsToFirst {
    public static void main (String args[]){

        System.out.println(getLastToFirstDigitsOfNumber(76768));
    }

    public static int getLastToFirstDigitsOfNumber(int num) {
        int r = 0;
        while (num > 0) {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
    }
}
