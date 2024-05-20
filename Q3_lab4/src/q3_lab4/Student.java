/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3_lab4;

import java.util.*;

/**
 *
 * @author ASUS
 */
public abstract class Student {

    private String studentNumber;
    private String studentName;
    private int Earnedcredit;
    private double averageScore;

    public Student() {
    }

    public Student(String studentNumber, String studentName, int Earnedcredit, double averageScore) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.Earnedcredit = Earnedcredit;
        this.averageScore = averageScore;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getEarnedcredit() {
        return Earnedcredit;
    }

    public void setEarnedcredit(int Earnedcredit) {
        this.Earnedcredit = Earnedcredit;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        studentNumber = sc.next();
        System.out.print("Enter your name: ");
        studentName = sc.next();
        System.out.print("Enter your total earned credits: ");
        Earnedcredit = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your average score: ");
        averageScore = sc.nextDouble();
    }

    public void output() {
        System.out.print("Student Number: " + studentNumber + "\n"
                + "Student name: " + studentName + "\n"
                + "The total earned credits: " + Earnedcredit + "\n"
                + "Average Score: " + averageScore + "\n");
    }

    public abstract boolean graduation();

    public void remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
