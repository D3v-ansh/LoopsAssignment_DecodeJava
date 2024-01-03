// Write a Java program to print a multiplication table for a given number 'n'.

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Multiplication table of " + number + " :\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " =  " + i*number);
        }

        sc.close();
    }
}