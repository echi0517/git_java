package poly.carTest;

public class Driver {
    Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void driver() {
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
