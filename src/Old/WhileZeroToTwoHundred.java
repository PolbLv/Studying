package Old;

public class WhileZeroToTwoHundred {
    public static void main(String args[]) {
        zeroToTwoHundred(200);
    }

    public static void zeroToTwoHundred(int x) {
        int counter = 0;
        while (counter < x) {
            System.out.println("i = " + counter);
            counter++;
        }
        x++;
    }
}

//Вывести на экран числа от 0 до 200 используя цикл while