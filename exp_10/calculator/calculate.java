package calculator;
import jdk.swing.interop.SwingInterOpUtils;
import multiplication.*;

import java.util.Scanner;

public class calculate extends multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. DIVIDE");
            System.out.print("enter your choice: ");
            int n = sc.nextInt();
            operations op = new operations();
            switch (n){
                case 1:

                    System.out.print("number 1: ");
                    int a1 = sc.nextInt();
                    System.out.print("number 2: ");
                    int b1 = sc.nextInt();
                    System.out.println("the sum is "+op.add(a1, b1));
                    break;

                case 2:

                    System.out.print("number 1: ");
                    int a2 = sc.nextInt();
                    System.out.print("number 2: ");
                    int b2 = sc.nextInt();
                    System.out.println("the difference is "+op.subtract(a2, b2));
                    break;

                case 3:

                    calculate c = new calculate();
                    System.out.print("number 1: ");
                    int a3 = sc.nextInt();
                    System.out.print("number 2: ");
                    int b3 = sc.nextInt();
                    System.out.println("the product is "+c.multiply(a3, b3));
                    break;

                case 4:

                    System.out.print("number 1: ");
                    double a4 = sc.nextDouble();
                    System.out.print("number 2: ");
                    double b4 = sc.nextDouble();
                    System.out.println("the division is "+op.divide(a4, b4));
                    break;
            }

            System.out.print("enter 0 to exit, else 1 to continue: ");
            int m = sc.nextInt();
            if(m==0){
                break;
            }

        }while (true);

    }
}
