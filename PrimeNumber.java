package example.lab;

import java.util.Scanner;

public class PrimeNumber {
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int n = scanner.nextInt();
        System.out.println("Enter ending number: ");
        int m = scanner.nextInt();


        System.out.println("The primer number between "+ n + " and "+ m + " are: ");

        for(int i=n; i<=m;i++){
            int count = 0;
            for (int j=1; j<=i;j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count ==2){
                System.out.println(i);
            }
        }
    }
}
