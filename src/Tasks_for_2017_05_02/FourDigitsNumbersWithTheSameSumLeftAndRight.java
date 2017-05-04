package Tasks_for_2017_05_02;


import java.util.ArrayList;

public class FourDigitsNumbersWithTheSameSumLeftAndRight {
    public static void main(String args[]) {
        int left, right;
        ArrayList<Integer> divLeft, divRight;
        int sum1, sum2;
        for (int i = 1000; i < 10000; i++) {
            left = getDigitsOfNumber(i).get(0) * 10 + getDigitsOfNumber(i).get(1);
            right = getDigitsOfNumber(i).get(2) * 10 + getDigitsOfNumber(i).get(3);
            divLeft = getDenominatorsOf(left);
            divRight = getDenominatorsOf(right);
            sum1 = 0;
            for (int j = 0; j < divLeft.size(); j++) {
                sum1 = sum1 + divLeft.get(j);
            }
            sum2 = 0;
            for (int j = 0; j < divRight.size(); j++) {
                sum2 = sum2 + divRight.get(j);
            }
            if (sum1 == sum2) {
                System.out.println(" result = " + i);
            }
        }
    }

    public static ArrayList<Integer> getDenominatorsOf(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (0 == (number % i)) {
                digits.add(i);
            }
        }
        return digits;
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
/*Вывести все четырехзначные числа у которых сумма делителей правой части будет равна
сумме делителей левой части. То есть число 4383 будет раскладываться на 43 и 83
- для обеих этих чисел будут находиться делители и сравниваться их сумма
 */
