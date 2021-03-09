package Cars;

public class main {
    public static void main(String[] args){
        Car[] dealershipInventory = new Car[5];
        Car toyota = new Car("toyota");
        Bus schoolBus = new Bus("schoolBus");
        Tesla modelX = new Tesla("Tesla Model X");
        Car fordF150 = new Car("ford f150");
        Tesla modelY = new Tesla("Tesla Model Y");
        dealershipInventory[0] = toyota;
        dealershipInventory[1] = schoolBus;
        dealershipInventory[2] = modelX;
        dealershipInventory[3] = fordF150;
        dealershipInventory[4] = modelY;

        //printing subclass specific methods
        System.out.println("car type specific methods: ");
        schoolBus.OpenSideDoor();
        schoolBus.OpenStopSign();
        System.out.println("\n");

        //running shared (but different implementations of shared methods)

        for(Car myCar: dealershipInventory){
            System.out.println("Car Name: " + myCar.carName);
            myCar.Drive();
            myCar.Break();
            myCar.Refuel();
            System.out.println("\n");
        }

    }
}
