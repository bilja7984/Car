
import loops.Loops;
import person.Person;
import person.Student;


public class Main {

    
    public static void main(String[] args) {
        // Car myCar = new Car();
        //double distance = myCar.maxDistance();
       // System.out.println("Max distance: " + distance);
        //myCar.changeLicence("LK356");
       // myCar.chageWeight(1055);
       // myCar.printAttributes();
       
        
//        Car audi = new Car("Audi", 50, 2, 5, 1);
//        audi.printAttributes();
//       // System.out.println("Max distance: " + audi.maxDistance());
//        audi.fuelUp();
//        audi.printAttributes();
//        audi.travel(20);
//       // audi.changeLicence("PO265");
//        //audi.chageWeight(1089); 
//        audi.printAttributes();
//        audi.travel(30);
//        audi.printAttributes();
//        
//        audi.getIn();
//      
//        Car noviAuto = new Car("Novi Auto", 100, 3, 5, 1);
//         noviAuto.printAttributes();
//         
//         noviAuto.getIn();
//         noviAuto.printAttributes();
//         noviAuto.getIn();
//         noviAuto.getIn();
//         noviAuto.getIn();
//         noviAuto.getIn();
//         noviAuto.getIn();
//         noviAuto.printAttributes();
//         
//         noviAuto.getOut();
//         noviAuto.printAttributes();
//         noviAuto.getOut();
//       
//         noviAuto.printAttributes();
//         
//         noviAuto.getIn(2);
//         noviAuto.getOut(2);
         
//         int x = 5;
////         while(x>0) {
////             System.out.println(x);
////             x = x-1; // x--;
////         }
//         
////         do {
////             System.out.println(x);
////             x--;
////         } while(x>0);
////         
//         for(int i = 7; i < 15; i++) {
//             System.out.println(i);
//         }

//           Loops loop1 = new Loops();
//           loop1.testWhileLoop();

//        Loops.testWhileLoop();
//        Loops.testForLoop();
          // Loops.printMultiplicationTable();
//           Loops.printCoordinates();
//           System.out.print("test1");
//           System.out.println("test2");
           
          Person osoba = new Person();
          osoba.showData();
 
          osoba.setName("Milomir");
          osoba.setSurname("Dragovic");
          osoba.showData();
          
          Student student1 = new Student("Petar", "Petrovic", "325648", "133/03", 6);
          student1.showData();
           
    }


    
}
