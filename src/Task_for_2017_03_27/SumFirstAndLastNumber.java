package Task_for_2017_03_27;



/**
 * Created by LVIVSOFT\spolyakov on 03.04.17.
 */
public class SumFirstAndLastNumber {
    public static void main(String args []){

        sumNumbers(1775);
    }
    public static int sumNumbers(int x){
        int digit=0;
        int no = Integer.parseInt(args[0]);
        digit = digit + no % 10;
        while(no > 9)
        {
            no /= 10;
        }
        digit=digit+no;
        System.out.println("Reverse Digit:-"+digit);
    }
}




/*Написать метод суммирующий первую и последнюю цифру в числе . Например на вход подано число:
4561 на выходе 5
379 на выходе 10
58845415423 на выходе 8
*/