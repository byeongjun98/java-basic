package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(isMaxValid(count)){
            count++;
        } else{
            System.out.println("최대값 초과 ");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean isMaxValid(int count) {
        return count < max;
    }
}
