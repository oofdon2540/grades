/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Yo
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float projectScore;
        float examScore;
        
        Grading student1 = new Grading ("John Kelly");
        Grading student2 = new Grading ("Sarah Jensen");
        Grading student3 = new Grading ("Aaron Fox");
        Grading student4 = new Grading ("Kevin McGrath");
        
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.printf("%s%n", student1);
            System.out.print("Type in your project score:");
            projectScore = scan.nextFloat();
            student1.setProjectScore(projectScore);
        }catch(InputMismatchException ime){
            System.out.printf("Error, please type in numbers %n", ime.getMessage());
            System.exit(1);
        }
        
        try{
            System.out.print("Type in your exam score:");
            examScore = scan.nextFloat();
            student1.setExamScore(examScore);
        }catch(InputMismatchException ime){
            System.out.printf("Error, please type in numbers %n", ime.getMessage());
            System.exit(1);
        }
        student1.calScore();
        student1.displayScore();
        
        student1.calGrade();
        student1.displayGrade();
        
     
        
        System.out.println("Displaying student on alphabetical order");
        Grading[] grades = {student1,student2,student3,student4};
        Arrays.sort(grades);
        for(Grading exampleGrade : grades){
            System.out.println(exampleGrade);
        }
       
        
       
    }
}
