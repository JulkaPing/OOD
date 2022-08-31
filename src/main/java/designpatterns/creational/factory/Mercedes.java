package designpatterns.creational.factory;

public class Mercedes implements Car{
    @Override
    public void drive() {
        System.out.println("drive Mercedes with speed 180 km/h");
    }
}
