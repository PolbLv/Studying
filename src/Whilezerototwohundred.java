/**
 * Created by Serhiy on 3/15/17.
 */
public class Whilezerototwohundred {
    public static void main(String args[]) {
        zerototwohundred(200);
    }

    public static void zerototwohundred(int x) {
        int counter = 0;
        while (counter < x) {
            System.out.println("i = " + counter);
            counter++;
        }
        x++;
    }
}

//Вывести на экран числа от 0 до 200 используя цикл while