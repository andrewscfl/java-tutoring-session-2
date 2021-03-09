package Cars;

//sub class
public class Bus extends Car {
    public String carName;
    public Bus(String carName){
        super(carName);
        this.carName = carName;
    }
    //these are methods specific to a Bus however it has access to the functions that a regular car has
    public void OpenSideDoor(){
        System.out.println(this.carName + " Opening side door...");
    }
    public void OpenStopSign(){
        System.out.println(this.carName + " Opening stop sign...");
    }

}
