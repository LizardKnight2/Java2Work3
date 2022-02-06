package com.com;

import java.util.*;

public class TelephoneDirectory {

    public static void main(String[] args) {

        ArrayList<Integer> phone = new ArrayList<>();
        phone.add(9451312);
        phone.add(9553315);
        phone.add(9457352);
        phone.add(9951212);
        phone.add(9451312);


        System.out.println(phone.get(0));
        System.out.println(phone.get(1));
        System.out.println(phone.get(2));
        System.out.println(phone.get(3));
        System.out.println(phone.get(4));


        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Справочников");
        lastName.add("Телефонов");
        lastName.add("Списков");
        lastName.add("Справочников");
        lastName.add("Телефонов");

        System.out.println(lastName.get(0));
        System.out.println(lastName.get(1));
        System.out.println(lastName.get(2));
        System.out.println(lastName.get(3));
        System.out.println(lastName.get(4));

        System.out.println();

        HashMap<String, Integer> directory = new HashMap<>();
        directory.put("Справочников", 9451312);
        directory.put("Телефонов", 9553315);
        directory.put("Списков", 9457352);
        directory.put("Справочников", 9951212);
        directory.put("Телефонов", 9451312);

        if(!directory.containsKey(lastName)){
            System.out.println(phone);
        }



        for (Map.Entry<String, Integer> object : directory.entrySet()) {
            System.out.println("Фамилия = " + object.getKey() + " Телефон = " + object.getValue());


        }

    }

}

