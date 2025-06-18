package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("1", "park");
        member.printMember();
        member.changeName("kim");
        member.printMember();
    }
}
