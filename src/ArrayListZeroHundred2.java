import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ArrayListZeroHundred2 {
    public static void main (String args[]){
     myMethod();
    }

    public static void myMethod() {
        int initialSize = 100;
        ArrayList<Integer> numbers = new ArrayList<>(initialSize);
        for (int i = 0; i < initialSize; i++)

        {
            numbers.add(i);
            System.out.println(numbers.get(i));
        }
    }
}
/*Создать список со значениями от 0 до 100.
 Создать метод выводящий все значения списка на экран.*/