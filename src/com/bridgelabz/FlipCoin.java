package com.bridgelabz;
import java.lang.Math;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of flips you want = ");
        int No_of_Flips = sc.nextInt();
        int ctr=0,ptr=0;
        if(No_of_Flips>=1) {
            for (int i = 1; i <= No_of_Flips; i++) {
                double random = Math.random();
                if (random < 0.5)
                    ctr++;
                else
                    ptr++;
            }
        System.out.println("\nNo of times Head come = " + ctr);
        System.out.println("No of times Tail come = " + ptr);
        }
        else
            System.out.println("Wrong Input");
    }
}