package example.lab;

import java.util.Scanner;

public class Factorial {
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }

        System.out.println("The factorial of given number is: " + fact);
    }
}
