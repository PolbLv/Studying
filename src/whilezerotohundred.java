/**
 * Created by Serhiy on 3/13/17.
 */
public class whilezerotohundred {
    public static void main(String args[]) {

        zerotohundred(100,20);
    }

    public static void zerotohundred(int x, int y) {
        int counter = 0;
        while (counter <= y) {
            if (x % 2 != 0) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }
}

//Вывести на экран 20 нечетных числе начиная с 100 . Подсказка использовать цикл while()
/*i = 101
i = 103
i = 105
i = 107
i = 109
i = 111
i = 113
i = 115
i = 117
i = 119
i = 121
i = 123
i = 125
i = 127
i = 129
i = 131
i = 133
i = 135
i = 137
i = 139
i = 141*/




