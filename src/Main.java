
public class Main {

    
    public static void main(String[] args) {
        Car myCar = new Car();
        //double distance = myCar.maxDistance();
       // System.out.println("Max distance: " + distance);
        //myCar.changeLicence("LK356");
       // myCar.chageWeight(1055);
       // myCar.printAttributes();
       
        
        Car audi = new Car("Audi", 50, 2);
        audi.printAttributes();
       // System.out.println("Max distance: " + audi.maxDistance());
        audi.fuelUp();
        audi.printAttributes();
        audi.travel(20);
       // audi.changeLicence("PO265");
        //audi.chageWeight(1089); 
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();
        
    }
    
}
