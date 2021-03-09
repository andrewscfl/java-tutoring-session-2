package Cars;
// Car Super Class
public class Car {
    //Below are methods that Cars of all types have
    public String carName;
    public Car(String carName){
        this.carName = carName;
    }
    public void Drive(){
        System.out.println(this.carName + " Started Driving...");
    }
    public void Break(){
        System.out.println(this.carName + " Started Breaking...");
    }

    public void Refuel(){
        System.out.println(this.carName + " Filling up the gas Tank...");
    }


}
