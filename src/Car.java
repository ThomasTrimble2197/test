//Project 3

public class Car {

    //car characteristics
    String carColor;
    int carYear;
    String manufactuerer;
    

    /* 
    color = color of the car
    year = year car was made
    manufactuerer = manufactuerer of the car

    constructor below creates car objects with characteristics above
    */
    public Car (String color, int year, String manufactuerer) {
        carColor = color;
        carYear = year;
        this.manufactuerer = manufactuerer;
    }

    public static void main (String[] args) {

        //creates a car named tomDaBombCar, a yellow fiat made in 1965
        Car tomDaBombCar = new Car("yellow", 1965, "Fiat");
        
        //prints the statement
        System.out.println("\nI drive a " + tomDaBombCar.carColor + " " + tomDaBombCar.manufactuerer + " made in " + tomDaBombCar.carYear + " every day!\n");

    }
    
}
