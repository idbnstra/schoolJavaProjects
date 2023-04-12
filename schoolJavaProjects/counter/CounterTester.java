package schoolJavaProjects.counter;

public class CounterTester {
    public static void main(String[] args){
        Counter coolCount = new Counter();

        coolCount.outputCount();
        coolCount.plusOne();
        coolCount.outputCount();
        coolCount.minusOne();
        coolCount.outputCount();
        coolCount.plusOne();
        coolCount.outputCount();
        coolCount.resetCount();
        coolCount.outputCount();
        coolCount.getCount();
        
    }
}
