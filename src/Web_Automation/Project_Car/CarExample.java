package Web_Automation.Project_Car;


public class CarExample {
    public static void main(String args[]) {
        Car myFirstCar = new Car("Green", "Audi", "R8");

        String color = myFirstCar.getColor();
        System.out.println(color);

        myFirstCar.changeColor("White");
        color = myFirstCar.getColor();
        System.out.println(color);

        Car mySecondCar = new Car("Red", "BMW", "X5");

        String bmwColor = mySecondCar.getColor();
        System.out.println(bmwColor);

        String audiColor = myFirstCar.getColor();
        System.out.println(audiColor);
    }
}
