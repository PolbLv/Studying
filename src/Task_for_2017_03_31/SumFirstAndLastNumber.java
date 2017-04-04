package Task_for_2017_03_31;


public class SumFirstAndLastNumber {
    public static void main(String args[]) {

        sumNumbers(4561);
    }

    public static int sumNumbers(int x) {
        String number = String.valueOf(x);
        for (int i = 0; i < number.length(); i++) {
            int first = x / 1000;
            int last = x % 10;
            System.out.println("digit: " +  (last+first));
        }
        return x;
    }
}


/*Написать метод суммирующий первую и последнюю цифру в числе . Например на вход подано число:
4561 на выходе 5
379 на выходе 10
58845415423 на выходе 8
*/


/*array.get(i)
і медод, який повертатиме тобі сайз аррею
і сумуєш array.get(0)+array.get(array.size()-1)
size() чи length()*/