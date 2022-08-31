package designpatterns.creational.factory;

public class BMW implements Car{
    @Override
    public void drive() {
        System.out.println("drive BMW with speed 280 km/h");
    }
}
