//abstraction we need to learn
abstract class Vehicle {
    abstract void start();
}
class MotorCar extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with kick");
    }
}
