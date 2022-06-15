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
public class RectangleStat {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input for width
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // input for length
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        // calculate area
        double area = width * length;

        // calculate perimeter
        double perimeter = 2 * (width + length);

        // output message
        System.out.println("When one side is " + width + " and the other side is " + length + ", the area is " + area + " and the perimeter is " + perimeter + ".");
    }  
}
