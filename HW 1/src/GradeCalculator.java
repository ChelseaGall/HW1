
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore 
 */
public class GradeCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
               // input for homework
        System.out.print("Enter homework score: ");
        double homework = sc.nextDouble();

        // input for CodeLab
        System.out.print("Enter CodeLab score: ");
        double codelab = sc.nextDouble();

        // input for Midterm1
        System.out.print("Enter Midterm1 score: ");
        double midterm1 = sc.nextDouble();

        // input for Midterm2
        System.out.print("Enter Midterm2 score: ");
        double midterm2 = sc.nextDouble();

        // input for Final
        System.out.print("Enter Final score: ");
        double finalExam = sc.nextDouble();

        // calculate sum of inputs
        double totalScore = homework + codelab + midterm1 + midterm2 + finalExam;

        // output sum of inputs
        System.out.println("The total score is " + totalScore);
    }
}
