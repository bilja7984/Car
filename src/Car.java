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
    
    int maxPassengers;
    int currentNumberOfPassengers;
    
    
    public Car() {
       this.model = "default";
       this.maxFuel = 100;
       this.consumption = 5;
       this.maxPassengers = 5;
       this.currentNumberOfPassengers = 1;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption) {
       this.model = customModel;
       this.maxFuel = customMaxFuel;
       this.consumption = customConsumption;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption, int maxPass, int currPass) {
       this.model = customModel;
       this.maxFuel = customMaxFuel;
       this.consumption = customConsumption;
       this.currentNumberOfPassengers = currPass;
       this.maxPassengers = maxPass;
    }
    
    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Capacity of fuel: " + this.maxFuel);
        System.out.println("Consuption: " + this.consumption);
        System.out.println("Licence: " + this.license);
        System.out.println("State of fuel: " + this.curentFuel);
        System.out.println("Total mileage: " + this.mileage);
        System.out.println("Current number of passengers is: " + this.currentNumberOfPassengers + " of maximum: " + this.maxPassengers);
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
         System.out.println("We had sucessfull trip:" + distance);
       }else{
           System.out.println("There is not enough fuel for trip");
       }
        
    }
    
    public void getIn() {
        if (this.currentNumberOfPassengers < this.maxPassengers) {
      this.currentNumberOfPassengers = this.currentNumberOfPassengers + 1;
      // this.currentNumberOfPassengers++; isto sto i ovo gore
        System.out.println("Someone got in. Current number: " + this.currentNumberOfPassengers);
        } else {
            System.out.println("The car is full, there is no space for another passenger");
        }
}
    
    public void getIn(int numberOfPassengers) {
        if (this.currentNumberOfPassengers + numberOfPassengers <= this.maxPassengers){
            this.currentNumberOfPassengers = this.currentNumberOfPassengers + numberOfPassengers;
            System.out.println( numberOfPassengers + " passengers got in. Current number: " + this.currentNumberOfPassengers);
       } else {
        System.out.println("There is no enough space for " + numberOfPassengers + " passengers.\n");
       }
    }
    
    public void getOut() {
        if (this.currentNumberOfPassengers > 0) {
        this.currentNumberOfPassengers = this.currentNumberOfPassengers - 1;
        //this.currentNumberOfPassengers--; isto sto i ovo gore
        System.out.println("Someone got out. Current number: " + this.currentNumberOfPassengers);
        } else {
            System.out.println("There is no passenger in the car. \n");
        }
    }
    
    public void getOut(int numberOfPassengers) {
        if (this.currentNumberOfPassengers >= numberOfPassengers) {
        this.currentNumberOfPassengers = this.currentNumberOfPassengers - numberOfPassengers;
        System.out.println( numberOfPassengers + " passengers got out. Current number: " + this.currentNumberOfPassengers);
        } else {
            System.out.println("There are no " + numberOfPassengers + " passengers in the car.\n");
        }
    }
    
}


