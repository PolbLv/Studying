package Old;

import java.util.ArrayList;

public class SetExample {
    public static void main(String args[]) {
        int initialSize = 100;
        ArrayList<Integer> numbers = new ArrayList<Integer>(initialSize);
        for (int i = 0; i < initialSize; i++)
        {
            numbers.add(i);
            System.out.println(numbers.get(i));
        }
    }
}
