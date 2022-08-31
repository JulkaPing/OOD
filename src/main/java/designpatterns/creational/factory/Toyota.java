package designpatterns.creational.factory;

public class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("drive Toyota with speed 150 km/h and off-road");
    }
}
