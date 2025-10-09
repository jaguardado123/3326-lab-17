// Import the Car and Owner classes using *.
// You should NOT be able to access Engine.

public class Main {
    public static void main(String[] args) {

        // THIS CODE SHOULD STILL WORK.
        Car car1 = new Car("Toyota", "Tundra", 2010, 6, 500);
        Car car2 = new Car("Ford", "Mustang", 2017, 8, 700);

        Owner own1 = new Owner("Bob Bobbert", 1234567, "123 Sesame St.", car1);
    }
}

// Move these classes into their designated file in the dealership folder.
// THE ENGINE, CAR, & OWNER CLASS SHOULD NO LONGER BE HERE.

class Engine {
    int cylinders;
    int horsepower;

    Engine(int cyl, int hp) {

        cylinders = cyl;
        horsepower = hp;
    }
}

class Car {
    String make;
    String model;
    int year;
    Engine engine;

    Car(String mk, String md, int yr, int cyl, int hp) {
        make = mk;
        model = md;
        year = yr;
        engine = new Engine(cyl, hp);
    }
}

class Owner {
    String name;
    int phone_number;
    String address;
    Car car;

    Owner(String nm, int pnum, String addr, Car cr) {
        name = nm;
        phone_number = pnum;
        address = addr;
        car = cr;
    }
}