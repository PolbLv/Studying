package Task_for_2017_03_31;


public class SumFirstAndLastNumber {
    public static void main(String args[]) {

        sumNumbers(588454154);
    }

    public static int sumNumbers(int x) {
        int first = x / 100000000;
        int last = x % 10;
        int result = first + last;

        System.out.println(result);
        return x;
    }
}


/*Написать метод суммирующий первую и последнюю цифру в числе . Например на вход подано число:
4561 на выходе 5
379 на выходе 10
5884541542 на выходе 8
*/

