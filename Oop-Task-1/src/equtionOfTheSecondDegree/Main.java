package equtionOfTheSecondDegree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        int a,b,c;
        System.out.println("ax2+bx+c");
        System.out.println("enter a,b and c values in order:(a values not equals zero !!!!!!)");

        System.out.print("a=");
        a= scanner.nextInt();
        if(a==0){
            throw  new Exception("a values can't be zero");
        }
        System.out.print("b=");
        b= scanner.nextInt();
        System.out.print("c=");
        c= scanner.nextInt();


        System.out.println(a+"x2+"+b+"x+"+c);
        double delta=b*b-4*a*c;
        System.out.println("delta="+delta);
        System.out.println("******************************");
        if(delta<0){
            System.out.println("Delta < 0");
            System.out.println("The equation has no solution in real numbers.");

        }
        else if (delta>0){
            System.out.println("Delta > 0");
            System.out.println("The equation has  solution in real numbers.");

            double root_1=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("first real root is "+root_1);

            double root_2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("second real root is "+root_2);

        }
        else {
            System.out.println("Delta = 0");
            System.out.println("The equation has  solution in real numbers.");

              double root_1_2=-b/2*a;
            System.out.println("root 1 and root 2 is equals : "+root_1_2);
        }







    }
}
