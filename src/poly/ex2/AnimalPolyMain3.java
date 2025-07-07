package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    /*
    틈틈히 정리하는 단축키
    command + opt + n : 추출
    command + opt + m : 메소드 추출
     */
}
