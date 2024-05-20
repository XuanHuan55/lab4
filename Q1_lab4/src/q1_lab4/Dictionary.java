/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_lab4;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Dictionary {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        list.put("hello", "Xin chào");
        list.put("bye", "Tạm biệt");
        list.put("cat", "Con mèo");
        list.put("dog", "Con chó");
        list.put("bird", "Con chim");
        list.put("snail", "Ốc sên");
        list.put("snake", "Con rắn");
        list.put("monkey", "Con khỉ");
        list.put("cow", "Con bò");
        list.put("Fish", "Con Cá");

        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        meaning(word, list);
    }

    public static void meaning(Object key, HashMap list) {
        if (containsKey(key, list)) {
            System.out.println("Meaning: " + list.get(key));
        } else {
            System.out.println("Unavailable");
        }
    }

    public static boolean containsKey(Object key, HashMap list) {
        if (list.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }
}

