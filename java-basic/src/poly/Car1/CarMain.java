package poly.Car1;


public class CarMain {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setCar(k3Car);
        driver.driver();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driver();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.driver();
    }
}
