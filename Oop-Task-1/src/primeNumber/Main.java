package primeNumber;

import java.util.Scanner;

public class Main {
    public static boolean checkPrimeNumber(int i){
         int counter=0;
        for(int z=2;z<i;z++) {
            if (i % z == 0) {
                counter++;
            }
        }
        if(counter==0){
            return true;
        }

        return false;

    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----> Prime number <------");
        System.out.println("Calculate prime numbers up to which number:");
        int primeNumberCheck= scanner.nextInt();
        int counter=0;
        if(primeNumberCheck<=0){
            throw new Exception("number cannot not zero or smaller than zero");
        }
        else{
            for(int i=primeNumberCheck;i>=2;i--){
                if(checkPrimeNumber(i)==true){
                    System.out.print("|"+"prime number :"+i+"|");
                    counter++;
                }
                else{
                    System.out.print("|"+"not prime number :"+i+"|");
                }

            }
            System.out.println("");
        }
        System.out.println(
                "How many prime number:"+counter
        );

    }
}
