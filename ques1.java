// Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.Scanner;

class ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int sum = number * ((number + 1) / 2);
        System.out.println("The sum of first " + number + " natural numbers is : " + sum);

        sc.close();
    }
}