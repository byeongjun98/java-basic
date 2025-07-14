package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        System.out.println("K3Car 객체 생성" );
        driver.setK3Car(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        System.out.println("Model3Car 객체 생성" );
        driver.setK3Car(null);
        driver.setMdel3Car(model3Car);
        driver.drive();
    }
}
