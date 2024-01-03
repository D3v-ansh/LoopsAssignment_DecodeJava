// Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int number2 = sc.nextInt();

        int smallest = (number1 < number2) ? number1 : number2;

        System.out.println();
        for (int i = smallest; i >= smallest; i++) {
            if(number1 % i == 0 && number2 % i == 0){
                System.out.println("GCD of " + number1 + " and " + number2 + " = " + i);
                break;
            }
        }

        sc.close();
    }
}