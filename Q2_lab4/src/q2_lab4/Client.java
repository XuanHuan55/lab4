/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2_lab4;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Client {
 static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // typeBank type1 = typeBank.TPBank;
        // typeBank type2 = typeBank.VietcomBank;


        String input = sc.nextLine();

        typeBank type;
        if (input.equalsIgnoreCase("TPBANK")) {
            type = typeBank.TPBank;
        } else if (input.equalsIgnoreCase("VietcomBank")) {
            type = typeBank.VietcomBank;
        } else {
            System.out.println("No type matching with your input");
            return;
        }

        Bank bank = BankFactory.getBank(type);

        System.out.println(bank.getBankName());
    }
}
