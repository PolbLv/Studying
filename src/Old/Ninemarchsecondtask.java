package Old;

/**
 * Created by Serhiy on 3/9/17.
 */
public class Ninemarchsecondtask {
    public static void main(String args[]) {
        number(895742424);


    }
    public static void number(int x) {
        int count = 0;
        for ( ; x !=0; x/= 10){
            ++count;
        }
        System.out.println(count);
    }
}

/*Написать метод определяющий количество цифр в числе,
типа если ему на вход подать число 234 то он должен возвратить 3,
на число 121234 он возвратит 6, на 22 - ответ будет 2*/