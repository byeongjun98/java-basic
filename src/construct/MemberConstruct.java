package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name, age, 50); // 중복 제거, 생성자 안에서만 사용가능
        // this() 는 첫줄에 작성하는 것이 규칙, 그렇지 않을 경우 컴파일 에러
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
