package com.bridgelabz;
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if(year>=1000 && year<=9999) {
            if(year%4==0)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
        else
            System.out.println("Please enter year in 4-digit.");
    }
}
