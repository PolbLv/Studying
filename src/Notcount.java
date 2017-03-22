/**
 * Created by Serhiy on 2/22/17.
 */
public class Notcount {
    public static void main (String args[]){

        displayOddNumbers(100);
    }

    public static void displayOddNumbers(int x) {
        for (int i = 0; i <= x; i++) {
            if (i  % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

//вывести не парные числа от 0 до 100