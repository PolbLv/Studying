package Task_for_2017_03_27;

/**
 * Created by LVIVSOFT\spolyakov on 03.04.17.
 */
public class CountAllNumbers {
    public static void main(String args []){

        numbers(4567);
    }
    public static void numbers(int x){
        StringBuffer s  =  new StringBuffer(String.valueOf(x));
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i));
    }
}
/*Написать метод выводящий число поциферно на экран (каждую цифру на новую строку),
например на вход подается число 4567, метод должен вывести данное число следующим образом
4
5
6
7*/


//StringBuffer - объект для работы с текстом
//charAt() возвращает символ из массива строки по указанному индексу.
