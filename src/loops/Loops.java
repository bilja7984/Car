
package loops;

public class Loops {
    
    public static void testWhileLoop() {
        int x = 3;
    
        while(x > -3) {
        System.out.println("Value of x: " + x);
        x--;
        }
    }
    
    public static void testForLoop() {
        for (int i=0; i<10; i++) {
            System.out.println("Value of i: " + i);
        }
    }
    
    public static void testDoubleForLoop() {
        for (int i = 0; i <10; i++) {
          
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
  
        }
    }
        
    public static void printMultiplicationTable() {
        for (int i = 0; i <10; i++) {
          
            for (int j = 0; j < 10; j++) {
                int z = i * j;
                System.out.println(i + " * " + j + " = " + z);
            }
        }
    }
    
    public static void printCoordinates() {
        for (int i = 0; i <10; i++) {
            
          
            for (int j = 0; j < 10; j++) {
                 System.out.print("(" + i + "," + j + ") ");
               
            }
            System.out.println();
            
    }
}
}

