//  Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
        int first = 0, second = 1, fibo = first + second; // assuming first 2 elements of fibonacci series are 0 and 1

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            first = second;
            second = fibo;
            fibo = first + second;            
        }
        sc.close();
    }
}