package Exception_ErrHandling;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            try {	//Throws the exception
                int val = scan.nextInt();
                
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val)); //Method Faktorial
                System.out.print("Another factorial? (y/n) ");
                
                keepGoing = scan.next();
            } catch(IllegalArgumentException a) {	//IllegalArgumentException
                System.out.println(a.toString());
            }
        }
    }
}