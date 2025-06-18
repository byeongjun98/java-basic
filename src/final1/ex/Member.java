package final1.ex;

public class Member {
    private final String id;
    private  String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void printMember(){
        System.out.println("Member ID: " + id);
        System.out.println("Member Name: " + name);
    }
}
