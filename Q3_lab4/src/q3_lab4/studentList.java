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
public class studentList {

    protected Vector<Student> list = new Vector<Student>();

    public studentList() {
    }

    public studentList(Vector<Student> list) {
        this.list = list;
    }

    public void inputCollegeList() {
        Scanner sc = new Scanner(System.in);
        Student s = new College_Students();
        System.out.print("Enter the number of college students: ");
        int n = sc.nextInt();
        while (n-- > 0) {
            s.input();
            list.add(s);
        }
    }

    public void inputUniversityList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of university students: ");
        int n = sc.nextInt();
        Student s = new University_Students();
        while(n-->0){
        s.input();
        list.add(s);
        }
    }

    public void removeByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student code: ");
        String code = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (code.equalsIgnoreCase(list.get(i).getStudentNumber())) {
                list.remove(i);
                System.out.println("Finish!");
            } else {
                System.out.println("Not found!");
            }

        }

    }

    public void outputList() {

        for (Student s : list) {
            s.output();
        }

    }

    public void GraduStudent() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).graduation()) {
                list.get(i).output();
                System.out.println(" - Eligible Student: ");
                System.out.println();
                count++;
            }
        }
        System.out.println("The number of Eligible students: " + count);
        System.out.println("__________________________________");
    }

    public void sort() {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (s1 instanceof College_Students && s2 instanceof University_Students) {
                    return -1;
                } else if (s1 instanceof University_Students && s2 instanceof College_Students) {
                    return 1;
                } else {
                    return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                }
            }
        };
        list.sort(com);
        System.out.println("Finish !");
        System.out.println("__________________________________");
    }

    public void findStudentByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentName().contains(name)) {
                list.get(i).output();
                System.out.println("__________________________________");
            }
        }
    }

}
