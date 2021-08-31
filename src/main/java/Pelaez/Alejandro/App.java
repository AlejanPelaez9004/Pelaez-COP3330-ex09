/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        System.out.print("Enter length: ");
        Scanner input = new Scanner(System.in);
        float l = input.nextFloat();
        System.out.print("Enter width: ");
        float w = input.nextFloat();
        final int area = Math.round(l * w);
        int paint = area / 350;
        if (area % 350 != 0)
            paint++;
        System.out.println("You will need to purchase " + paint + " gallons of paint to cover " + area + " sq ft.");
    }
}
