/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3_lab4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class College_Students extends Student{
    private double graduationScore;

    public College_Students() {
    }

    public College_Students(double graduationScore) {
        this.graduationScore = graduationScore;
    }

    public College_Students(double graduationScore, String studentNumber, String studentName, int Earnedcredit, double averageScore) {
        super(studentNumber, studentName, Earnedcredit, averageScore);
        this.graduationScore = graduationScore;
    }

    public double getGraduationScore() {
        return graduationScore;
    }

    public void setGraduationScore(double graduationScore) {
        this.graduationScore = graduationScore;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter your graduation exam score: ");
        graduationScore = sc.nextDouble();
    }
    public void output() {
        super.output();
        System.out.println(" - The graduation exam score: " + graduationScore);
    }

    @Override
    public boolean graduation() {
        
        super.getEarnedcredit();
        super.getAverageScore();

        if (getEarnedcredit()>= 100 && getAverageScore()>= 5 && graduationScore >= 5) {
            return true;
        }
        return false;
    }
}
