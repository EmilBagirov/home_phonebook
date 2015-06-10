package com.company;

import sun.awt.SunHints;

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Long> phoneBook = new HashMap<String, Long>();

        //put elements to the map
        phoneBook.put("Emil", new Long (0502177216));
        phoneBook.put("Silvestr Stalone", new Long (0635326523));
        phoneBook.put("Arnold Schwarzenegger", new Long (0502457515));
        phoneBook.put("Jackie Chan", new Long (0501565625));
        phoneBook.put("John Doe", new Long (0501457425));
        phoneBook.put("Anna Karenina", new Long (0502356566));
        phoneBook.put("Ancle Sam", new Long (0502156616));
        phoneBook.put("Gordon Freeman", new Long (0500150012));
        phoneBook.put("Kung Lao", new Long (0505213652));
        phoneBook.put("Robert Dawnie Jr", new Long (0502157210));

        //receive elements from map
        //Map.Entry<String, Long> set = phoneBook.entrySet();
        Set<Map.Entry<String, Long>> set = phoneBook.entrySet();


        //print elements

        Scanner sc = new Scanner(System.in);
            System.out.print("Please, enter name: ");
            while (sc.hasNextLine()) {
                String name = sc.nextLine();

                   if (phoneBook.containsKey(name)) {
                       System.out.print(set.getKey + ": ");
                       System.out.println(set.getValue());
                   }
            }



    }
}
