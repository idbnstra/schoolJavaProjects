package schoolJavaProjects.counter;

public class Counter {
    int count;

    public Counter(){
        count = 0;
    }

    public void resetCount(){
        count = 0;
    }

    public void plusOne(){
        count += 1;
    }

    public void minusOne(){
        if (count >= 0)
        count -= 1;
    }

    public int getCount(){
        return count;
    }

    public void outputCount(){
        System.out.println("Count: " + count);
    }
}
