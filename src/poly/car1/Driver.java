package poly.car1;

public class Driver {
    private Car car;
    public void setCar(Car car) {
        System.out.println("차를 설정합니다" + car.getClass().getName());
        this.car = car;
    }
    public void drive() {
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
