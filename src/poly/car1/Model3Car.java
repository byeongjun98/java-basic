package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Model3Car 시동을 걸었습니다.");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3Car 시동을 껐습니다.");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car 가속기를 밟았습니다.");
    }
}
