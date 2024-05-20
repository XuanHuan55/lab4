/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3_lab4;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Main {
 static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        studentList manager = new studentList();
        int menu;

        do {
            System.out.print("Choose your option:\n"
                    + "1. Add a new college student.\n"
                    + "2. Add a new university student.\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard.\n"
                    + "4. Print student list.\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible students.\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code.\n"
                    + "7. Find student list by student's full name (Contains).\n"
                    + "8. Exit.\nInput: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    manager.inputCollegeList();
                    break;

                case 2:
                    manager.inputUniversityList();
                    break;

                case 3:
                    manager.removeByCode();
                    break;

                case 4:
                    manager.outputList();
                    break;

                case 5:
                    manager.GraduStudent();
                    break;

                case 6:
                    manager.sort();
                    break;

                case 7:
                    manager.findStudentByName();
                    break;
            }
        } while (menu != 8);
    }

}
