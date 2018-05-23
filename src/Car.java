public class Car {
    String model;
    int maxSpeed;
    int minSpeed;
    double weight;
    
    String license;
    int maxFuel;
    int curentFuel;
    int consumption; //consumption per distance unit km
    int mileage = 0; //predjeni put
    
    public Car() {
       this.model = "default";
       this.maxFuel = 100;
       this.consumption = 5;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption) {
       this.model = customModel;
       this.maxFuel = customMaxFuel;
       this.consumption = customConsumption;
    }
    
    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Capacity of fuel: " + this.maxFuel);
        System.out.println("Consuption: " + this.consumption);
        System.out.println("Licence: " + this.license);
        System.out.println("State of fuel: " + this.curentFuel);
        System.out.println("Total mileage: " + this.mileage);
        System.out.println();
    }
    
    public void changeLicence(String customLicence) {
        this.license = customLicence;
 
    }
    
    public void chageWeight(double newWeight) {
        this.weight = newWeight;
    }
    
    public double maxDistance() {
       // double dist = this.maxFuel / this.consumption;
       // return dist;
        
        return this.maxFuel / this.consumption;
    }
    
    public  void fuelUp() {
        this.curentFuel = this.maxFuel;
    }
    
    public  void travel(int distance) {
        
        //ako ima dovoljno goriva za put onda putuj (povecaj mileage i smanji trenutno gorivo,
       // a ako nema onda ispisi poruku da nema dovoljno goriva.
        
       
       if (this.curentFuel >= distance * this.consumption) {
         this.mileage = this.mileage + distance;
         this.curentFuel = this.curentFuel - distance * this.consumption;  
       }else{
           System.out.println("There is not enough fuel for trip");
       }
        
    }
    
    
}


