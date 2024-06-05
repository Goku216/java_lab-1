package example.lab;

import java.util.Scanner;

public class NumberToWords {

    static public final String[] units ={"","one","two","three","four","five","six","seven","eight","nine"};
    static public final String[] teens ={"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static public final String[] tens ={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};


    static public String convertToWords(int num){
        if(num == 0){
            return "zero";
        }
        return convert(num);
    }

    static public String convert(int num){
        if (num < 10){
            return units[num];
        }
        if (num < 20){
            return teens[num-10];
        }
        if (num <100){
            return tens[num/10] + " " + (num%10 !=0?units[num%10]:"" );
        }
        if(num <1000){
            return units[num/100] + " hundred" +((num%100 !=0)?" and "+convert(num%100):"");
        }
        if(num <10000){
            return units[num/1000] + " thousand" + ((num%1000 !=0)?" "+convert(num%1000):"") ;
        }
        if(num <100000 || num < 1000000){
            return convert(num/1000) + " thousands " + ((num%1000!=0)?convert(num%1000):"");
        }
        if(num < 10000000){
            return convert(num/1000000) + " million " + ((num%1000000!=0)?convert(num%1000000):"");
        }
        return "";
    }


    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("The number "+ num + " in words is: ");
        System.out.println(convertToWords(num));
    }
}
