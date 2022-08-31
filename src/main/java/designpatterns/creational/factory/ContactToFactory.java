package designpatterns.creational.factory;

public class ContactToFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car mercedes = factory.create("Mercedes");
        Car bmw = factory.create("BMW");
        toyota.drive();
        mercedes.drive();
        bmw.drive();
    }
}
