package poly.carTest;

public class CarTestMain {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setCar(k3Car);
        driver.driver();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driver();

    }
}
