
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter testCount = new Counter();

        testCount.increase();
        testCount.increase(-1);
        testCount.increase(9);
        System.out.println(testCount);

        testCount.decrease();
        testCount.decrease(-1);
        testCount.decrease(7);
        System.out.println(testCount);
    }
}
