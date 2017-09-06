/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 *
 * @author Yo
 */
public class Grading implements Comparable{
    private String studentName;
    private float projectScore;
    private float examScore;
    private float totalScore;
    private char grad;
    
    
    
    public Grading(String studentName){
        this.studentName = studentName;
       
        projectScore = 0;
        examScore = 0;
    }
    public void setProjectScore(float projectScore){
        this.projectScore = projectScore;
    }
    
    public void setExamScore(float examScore){
        this.examScore = examScore;
    }
    
    @Override
    public int compareTo(Object obj){
        Grading other = (Grading)obj;
        if(equals(other)){
            return 0;
        }
        int naming = studentName.compareTo(other.studentName);
        return naming;
    }
    
    
    @Override
    public String toString(){
        return String.format(studentName);
    }
 
    
    public float calScore(){
        totalScore = projectScore + examScore;
        return totalScore;
    }
    
    public char calGrade(){
        if(totalScore >= 75){
           grad = 'H';
        } else if(totalScore >= 50 && totalScore < 75){
           grad ='S';
        }else{
           grad = 'U';
        }
        return grad;
    }
    
    public void displayScore(){
        System.out.println("Score: "+totalScore);
    }
    
    public void displayGrade(){
        System.out.println("Grade: "+grad);
    }

   
}
