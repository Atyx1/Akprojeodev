package reverslynumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******Reversyl number check application******");
        System.out.println("enter the number:");

        int enteredNumber=scanner.nextInt();
        if(enteredNumber <= 0 || enteredNumber/10<1 || enteredNumber%10==0 ){
            System.out.println(enteredNumber+" is not reversly number");
        }
        else {


            int x = enteredNumber;
            int remainder, totalEquals = 0;
            while (x > 0) {
                remainder = x % 10;
                totalEquals =  totalEquals * 10 + remainder;

                int newValuesX = x / 10;
                x = newValuesX;
            }
            if ( totalEquals == enteredNumber) {
                System.out.println(enteredNumber + " is reversly number");
            } else {
                System.out.println(enteredNumber + " is not reversly number");
            }

        }

    }
}
