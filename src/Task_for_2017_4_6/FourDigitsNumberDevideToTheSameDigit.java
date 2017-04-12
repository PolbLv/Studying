package Task_for_2017_4_6;

/*import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVIVSOFT\spolyakov on 11.04.17.
 */
public class FourDigitsNumberDevideToTheSameDigit {
    public static void main(String args[]) {
        {

        }
    }
}




    // System.out.println(counter);
/*
    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }
    public void verify (int number){
        List<Integer> digitList = getDigitsOfNumber(number);
        boolean isNumberINeed = false;
        for(int i = 0;  i < digitList.size(); i++){
            if (number % digitList.get(i) == 0){
                isNumberINeed = true;
                continue;
            }
            else {
                isNumberINeed = false;
                break;
            }
            if (isNumberINeed){
                System.out.println();
            }
        }

    }
}

/* Используя метод getDigitsOfNumber вывести на экран все четырехзначные числа,
которые делятся на каждую из своих цифр без остатка.*/
