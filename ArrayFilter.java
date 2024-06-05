package example.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFilter {


    static public ArrayList duplicateFilter(int[] arr){
        ArrayList filteredArray = new ArrayList();
        filteredArray.add(arr[0]);
        Arrays.sort(arr);
        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                filteredArray.add(arr[i]);
            }
        }
        return filteredArray;
    }
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] sampleArray = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter [" + (i+1) + "] element: ");
            sampleArray[i] = scanner.nextInt();
        }
        System.out.println("The length of initial array is: "+ sampleArray.length);
        System.out.println("The array emelents are: ");
        for (int i=0;i<sampleArray.length;i++){
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println("");
        ArrayList filteredArray = duplicateFilter(sampleArray);
        System.out.println("The length of filtered array is: " + filteredArray.size());
        System.out.println("The array emelents are: ");
        for (int i=0;i<filteredArray.size();i++){
            System.out.print(filteredArray.get(i) + " ");
        }
    }
}
