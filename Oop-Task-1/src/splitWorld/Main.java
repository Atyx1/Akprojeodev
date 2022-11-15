package splitWorld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("What is the word you chose:");
        String word=scanner.next();
        System.out.println("Word -->"+word);
        System.out.println("***************************");

        System.out.println("Result:");
        for(int i=0;i<word.length();i++)
        {
            String splitWord;
            System.out.print(word.charAt(i));
            if(i!=word.length()-1){
                System.out.print("*");
            }
        }


    }
}
