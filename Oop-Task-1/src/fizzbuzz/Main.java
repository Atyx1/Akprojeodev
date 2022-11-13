package fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rules:values not smaller than zero and values not equals zero");
        System.out.println("How long do you want to play FizzBuzz ?");
        int limit=scanner.nextInt();
        for (int i = 0; i < limit; i++) {

            if(i%3==0&&i%5!=0){
                System.out.println(i+"=Fizz");
            }
            else if(i%5==0&&i%3!=0){
                System.out.println(i+"=Buzz");
            }
            else if (i%15==0){
                System.out.println(i+"=FizzBuzz");
            }
            else{
                System.out.println("i="+i);
            }


        }


    }


}