package extends1.ex2;

import extends1.ex.GasCar;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
    }
}
