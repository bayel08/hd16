package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());

        }
        System.out.println(listA);
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());

        }
        System.out.println(listB);
        Collections.reverse(listB);
        listC.add(listA.get(0));
        listC.add(listB.get(0));
        listC.add(listA.get(1));
        listC.add(listB.get(1));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(3));
        listC.add(listA.get(4));
        listC.add(listB.get(4));
        System.out.println("list C: " + listC);

        Collections.sort(listC, new Comp());
        System.out.println("Отсортированный list C по длинне слова: " + listC);
    }
}
