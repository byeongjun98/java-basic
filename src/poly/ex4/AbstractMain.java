package poly.ex4;

/*
추상 클래스는 제약을 추가한 클래스이다.
메모리 구조, 실행 결과 모두 동일하다.
- 추상 클래스 덕분에 실수로 Animal 인스턴스를 생성할 문제를 근본적으로 방지
- 새로운 동물의 자식 클래스를 만들때 실수로 sound() 를 오버라이디이 하지 않을 문제를 근본적으로 방지
 */


public class AbstractMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
