/*
program to demonstrate the ternary condition statement
PRACTICE :: ternary conditions in java
 */
package basic_package;

//import java.util.Scanner;
public class EVEN_ODD_ternary {

    public static void main(String[] args) {

//        System.out.print("\n enter a number to check it is even or odd :: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int n = (int) (Math.random() * 1000);
        System.out.println((n % 2 == 0) ? n + " is even" : n + " is odd");
        // ? : is called ternary operator
    }
}
