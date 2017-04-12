package Task_for_2017_4_6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for( int i = 100; i <1000; i++ ){
            sum = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(1) + getDigitsOfNumber(i).get(2);
            if (isSimple(sum)){
                System.out.println("i = " + i + " sum = " +sum);

            }


//            if (getDigitsOfNumber(i).get(0) % 5 == 0 && getDigitsOfNumber(i).get(2) % 5 == 0 && getDigitsOfNumber(i).get(2) != 0){
//                System.out.println(i);
//            }

            }

        }





    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }

    public static boolean isSimple(int num) {
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }

}


//http://stackoverflow.com/questions/19063001/extracting-digits-of-int-in-java


/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел. Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/


