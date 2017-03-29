import java.util.ArrayList;

/**
 * Created by Serhiy on 3/29/17.
 */
public class Visibility {

     static int declaredField;
     static int assignedField = 15;



    public static void main(String args[]) {

        visibilityCheckup();
        visibilityCheckup2();
    }

    int calcSomething(int a , int b){
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(a);
        list2.add(b);
        return a+b;
    }

    public static void visibilityCheckup() {
        ArrayList<Integer> list = new ArrayList<>();
        int declaredField;
        int assignedField = 115;
        System.out.println("visibilityCheckup: " + assignedField);
    }

    public static void visibilityCheckup2(){
        System.out.println("visibilityCheckup2: "+ assignedField);
    }

}
