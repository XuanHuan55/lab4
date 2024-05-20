/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2_lab4;

/**
 *
 * @author ASUS
 */
enum typeBank {
    TPBank,
    VietcomBank;
}

public class BankFactory {
    public static Bank getBank(typeBank bankType) {
        switch (bankType) {
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("We dont have this bank type");
        }
    }

}
