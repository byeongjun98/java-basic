package extends1.overriding;


public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        ElectricCar electricCar = new ElectricCar();
        System.out.println("전기차의 move 메서드 오버라이딩(재정의)");
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
