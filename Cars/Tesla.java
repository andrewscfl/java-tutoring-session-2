package Cars;
//sub class of car
public class Tesla extends Car{
    public String carName;
    public Tesla(String carName){
        super(carName);
        this.carName = carName;
    }
     // THIS METHOD UTILIZES POLYMORPHISM
     // Teslas dont refuel like traditional cars and charge instead,
     // so the refuel method will be different for this car and will not
     // use the standard refuel method but will instead take a different form
    public void Refuel(){
        System.out.println(this.carName + " Plugged into charging station...");
    }

    // THIS METHOD UTILIZES POLYMORPHISM
    // Teslas are able to self drive so this drive method
    // can will be different than the standard car drive method
    //even though a tesla is still a car
    public void Drive(){
        System.out.println(this.carName + " Began self driving...");
    }
}
