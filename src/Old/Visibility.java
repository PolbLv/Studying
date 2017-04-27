package Old;

import java.util.ArrayList;

public class Visibility {
    //declared variable, accessible from anywhere inside this class
    static int declaredField;
    //declared and assigned to specific value variable,
    // accessible from anywhere inside this class
    static int assignedField = 15;


    public static void main(String args[]) {
        visibilityCheckup();
//visibilityCheckup2();
        visibilityCheckup2();
        visibilityCheckup();
    }

    int calcSomething(int a, int b) {
        //list2 - internal variable, accessible only inside method it's been declared
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(a);
        list2.add(b);
        return a + b;
    }

    public static void visibilityCheckup() {
        ArrayList<Integer> list = new ArrayList<>();
        //declared only variable, accessible only from inside this method
        int declaredField;
        //declared and assigned to specific value variable,
        // accessible only from inside this method
        int assignedField = 15;
        System.out.println("visibilityCheckup: " + assignedField);
    }

    public static void visibilityCheckup2() {
        // assignedField = 115;
        System.out.println("visibilityCheckup2: " + assignedField);
    }

}
