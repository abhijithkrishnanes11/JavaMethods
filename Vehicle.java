package methods;

import oopsconcepts.Accessmodifier;

class Car extends Accessmodifier {

    public void displayCar() {
        System.out.println(num2);
    }
}

public class Vehicle {

    public static void main(String[] args) {

        Car c = new Car();
        c.displayCar();
    }
}