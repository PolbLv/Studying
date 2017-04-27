package Task_for_2017_4_6;

import java.util.ArrayList;

/**
 * Created by Serhiy on 4/9/17.
 */
public class GetDigitsFromNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myList = populateList(5, 415);
        for(int i = 0; i < myList.size() - 1; i++){

            System.out.println(getDigitsOfNumber(myList.get(i)));

        }
    }

    public static ArrayList<Integer> populateList(int size, int limit) {
        ArrayList<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
        //System.out.println("random = " + random);
        return random;
    }
    public static ArrayList<Integer> getDigitsOfNumber(int number){
            ArrayList<Integer> myList = new ArrayList<>();
            StringBuffer s = new StringBuffer(String.valueOf(number));
        for (int i = 0; i < s.length(); i++) {
            myList.add(Character.getNumericValue(s.charAt(i)));
        }
        return myList;
    }
}
/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел.
Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/