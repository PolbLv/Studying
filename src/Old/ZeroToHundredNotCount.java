package Old;

public class ZeroToHundredNotCount {
    public static void main(String args[]) {

        displayOddNumbers(100);
    }

    public static void displayOddNumbers(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

//вывести не парные числа от 0 до 100