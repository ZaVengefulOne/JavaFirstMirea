package ru.mirea.task10;

import java.util.Scanner;

public class num6 {
    public static boolean isPrime(int n, int div){
        if (n == div)
            return true;
        if (n%div == 0)
            return false;
        return isPrime(n, div+1);
    }

    public static void main (String args[]){
        System.out.println("Enter a number => ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = isPrime(num, 2);
        System.out.println(answer);
    }
}