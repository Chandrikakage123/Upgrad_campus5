import java.util.Scanner; 

class MyClass
 {
  public static void main(String args[])
 {
    int x, y, sum;
    Scanner s = new Scanner(System.in); 
    System.out.println("Type a number");
    x = s.nextInt(); 

    System.out.println("Type another number");
    y = s.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 