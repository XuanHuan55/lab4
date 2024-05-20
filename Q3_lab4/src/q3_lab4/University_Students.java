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
public class University_Students extends Student {

    private String thesisName;
    private double thesisScore;

    public University_Students() {
    }

    public University_Students(String thesisName, double thesisScore, String studentNumber, String studentName, int Earnedcredit, double averageScore) {
        super(studentNumber, studentName, Earnedcredit, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter your thesis name: ");
        thesisName = sc.next();
        System.out.print("Enter your thesis score: ");
        thesisScore = sc.nextDouble();
    }

    public void output() {
        super.output();
        System.out.println("Thesis name: " + thesisName + "Thesis score: " + thesisScore);
    }
    public boolean graduation() {
        super.getEarnedcredit();
        super.getAverageScore();
        if (getEarnedcredit()>= 150 && getAverageScore()>= 5 && thesisScore >= 5) {
            return true;
        }
        return false;
    }


}
