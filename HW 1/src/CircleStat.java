/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore 
 */
import java.util.Scanner;
public class CircleStat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input for radius
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // calculate circumference
        double circumference = 2 * Math.PI * radius;

        // calculate area
        double area = Math.PI * radius * radius;

        // output message
        System.out.println("When the radius is " + radius + ", the circumference is " + circumference + " and the area is " + area + ".");
    }
}

