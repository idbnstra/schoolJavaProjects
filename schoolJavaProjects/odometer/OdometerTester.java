package schoolJavaProjects.odometer;

public class OdometerTester {
    public static void main(String[] args) {
        //create an object myOdom
        Odometer myOdom = new Odometer(); //creates or constructs Odometer object
        //display values
        System.out.println("my fuel: " + myOdom.getFuel());
        System.out.println("my mileage: " + myOdom.getMileage());
        //set values
        myOdom.setFuel(11);
        myOdom.setMileage(9);


        //new mens volleyball odometer object
        Odometer mvbOdom = new Odometer();
        //display values
        System.out.println("mvb fuel: " + mvbOdom.getFuel());
        System.out.println("mvb mileage: " + mvbOdom.getMileage());
        //set values
        mvbOdom.setFuel(40);
        mvbOdom.setMileage(385);

        myOdom.outputString();
        mvbOdom.outputString();


        //new RV odometer object
        Odometer RVOdom = new Odometer();

        RVOdom.setFuel(35);
        RVOdom.setMileage(1000);

        System.out.println(RVOdom);
        System.out.println("RV fuel: " + RVOdom.getFuel());
        System.out.println("RV mileage: " + RVOdom.getMileage());
    }
}
