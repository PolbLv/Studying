package Task_for_2017_4_6;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

        verify(222);
        verify(123);
        verify(2424);
    }

    public static void verify(int number) {
        ArrayList<Integer> digitsList = getDigitsOfNumber(number);
        boolean isNumberINeed = false;
        for(int i = 0; i<digitsList.size(); i++){
            if(number % digitsList.get(i) == 0){
                isNumberINeed = true;
                continue;
            } else {
                isNumberINeed = false;
                break;
            }
        }
        if(isNumberINeed){
            System.out.println(number);
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
}


//http://stackoverflow.com/questions/19063001/extracting-digits-of-int-in-java


/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел. Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/


