package designpatterns.creational.factory;

public class Factory {
    public Car create( String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota": return new Toyota();
            case "Mercedes": return new Mercedes();
            case "BMW": return new BMW();
            default: return null;
        }
    }
}
