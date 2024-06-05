package example.lab;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsecutiveSequence {



    static public int sequenceElementCount(int[] arr){

        Arrays.sort(arr);
        int currentStreak = 1;
        int longestStreak =1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]) {
                    //Consecutive element checking
                    if(arr[i] == arr[i-1]+1){
                        currentStreak++;
                    } else {
                        longestStreak = Math.max(currentStreak,longestStreak); // if streak beaks update longestStreak
                        currentStreak = 1;  //reset currentStreak
                    }
            }
        }

        return longestStreak;

    }
    static public void main(String args[]){

        int[] sampleArray = {49, 1, 3, 200, 2, 4, 70, 5};

        int longestStreak = sequenceElementCount(sampleArray);
        System.out.println("The length of longest consecutive element sequence is :  " + longestStreak);

    }
}
