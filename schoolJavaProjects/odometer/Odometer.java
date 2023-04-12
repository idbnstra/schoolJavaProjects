package schoolJavaProjects.odometer;

public class Odometer {

    //instance variables: fuel and mileage. integer for both
    int fuel;
    int mileage;

    //constructor methods: named public, no data type, same name as class
    public Odometer(){
        fuel = 0;
        mileage = 0;
    }
    
    //getters fuel and mileage
    public int getFuel() {
        return fuel;
    }
    public int getMileage() {
        return mileage;
    }

    //setters/mutators: fuel and mileage
    public void setFuel(int f) {
        fuel = f;
    }
    public void setMileage(int m) {
        mileage = m;
    }

    public void resetOdometer() {
        mileage = 0;
    }

    public double tripMPG() {
        return mileage / fuel;
    }

    public void outputString() {
        System.out.println("Fuel: " + this.getFuel());
        System.out.println("Mileage: " + this.getMileage());
    }
}
