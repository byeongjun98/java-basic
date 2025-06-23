package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello(); // 자신의 hello() 호출, this 는 생략가능
        super.hello(); // 부모의 hello() 호출
    }
}
