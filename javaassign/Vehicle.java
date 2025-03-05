public class Vehicle {
    public void start(){
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
}