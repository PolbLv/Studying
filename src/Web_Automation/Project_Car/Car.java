package Web_Automation.Project_Car;


public class Car {
    //Fields
    private String color;

    private String brand;

    private String model;

    // Constructor
    public Car(String color, String brand, String model){
        this.color = color;
        this.brand = brand;
        this.model=model;
    }
    //Method
    public String getColor(){
        return this.color;
    }
    public void changeColor(String newColor){
        this.color = newColor;
    }
}
