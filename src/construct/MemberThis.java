package construct;

// 매개변수를 먼저 찾고 없으면 그 다음으로 멤버변수를 찾는다. this 의 생략
public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략
    }
}
