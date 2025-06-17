package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 인스턴스를 통한 접근
        // 권장하지 않는다. 인스턴스 변수인지 정적 변수 (static) 인지 구분하기에 용이함을 위해
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count);

        // 클래스를 통한 접근
        Data3 data5 = new Data3("E");
        System.out.println("E count = " + Data3.count);
    }
}
