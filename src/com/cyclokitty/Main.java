package com.cyclokitty;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        makeTeachers();
//        System.out.println("********");
        //monkeySee();
        //noRepeats();
        //sortedOut();
        //reverseOrder();
       // System.out.println(createList());
       // printOut(createList());
//        ArrayList<String> myList = createList();
//        System.out.println("Number of items in the list: " + countStuff(myList));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(12);
        numbers.add(40);
        numbers.add(12);
        numbers.add(50);

        System.out.println(addUp(numbers));
        System.out.println(greatest(numbers));
        System.out.println(least(numbers));
        int digits = 12;
        if (moreThanOnce(numbers, digits)) {
            System.out.println(digits + " is listed more than once.");
        } else {
            System.out.println(digits + " is not listed more than once.");
        }
        digits = 2;
        if (moreThanOnce(numbers, digits)) {
            System.out.println(digits + " is listed more than once.");
        } else {
            System.out.println(digits + " is not listed more than once.");
        }
        System.out.println(palindrome("madam"));
        System.out.println("The word is " + palindrome("quit"));
        System.out.println("This is word is: " + checkPalindrome());
        System.out.println(makeList(new int[]{10, 20, 30, 40, 50}));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = makeList(new int[] {10, 20, 30, 40, 50});
        list2 = makeList(new int[] { 60, 70, 80, 90, 100});
        System.out.println(combine(list1, list2));
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        list3 = makeList(new int[] {1, 2, 3, 4, 5});
        list4 = makeList(new int[] {3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(smartCombine(list3, list4));
    }

    // combine 2 lists
    public static ArrayList<Integer> combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int num : second) {
            first.add(num);
        }
        return first;
    }

    // add numbers that are not already on the list
    public static ArrayList<Integer> smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int num : second) {
            if (!first.contains(num)) {
                first.add(num);
            }
        }
        return first;
    }

    // give the makeList and array and get back an ArrayList<Integer>
    public static ArrayList<Integer> makeList(int[] numList) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < numList.length; i++) {
            arrList.add(numList[i]);
        }
        return arrList;
    }

    public static boolean palindrome(String text) {
        StringBuilder rev = new StringBuilder();
        rev.append(text);
        rev = rev.reverse();
        if (rev.toString().equals(text)) {
            return true;
        }
        return false;

    }

    public static boolean checkPalindrome() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in a word: ");
        String text = reader.nextLine();
        StringBuilder rev = new StringBuilder();
        rev.append(text);
        rev = rev.reverse();
        if (rev.toString().equals(text)) {
            return true;
        }
        return false;
    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int counted = 0;
        for (int item : list) {
            if (item == number) {
                counted++;
            }
        }
        if (counted > 1) {
            return true;
        }
        return false;
    }

    public static int least(ArrayList<Integer> numList) {
        int least = numList.get(0);
        for (int num : numList) {
            if (num < least) {
                least = num;
            }
        }
        return least;
    }

    public static int greatest(ArrayList<Integer> numList) {
        int greatest = 0;
        for (int num : numList) {
            if (num > greatest) {
                greatest = num;
            }
        }
        return greatest;
    }

    // get list of integers and add them up:
    public static int addUp(ArrayList<Integer> numList) {
        int total = 0;
        for (int num : numList) {
            total += num;
        }
        return total;
    }

    // count items in a list:
    public static int countStuff(ArrayList<String> list) {
        return list.size();
    }

    // print lists:
    public static void printOut(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    // arraylist creator:
    public static ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your strings.");
        System.out.print("New word: ");
        String input = scan.nextLine();

        while (!input.equals("")) {
            list.add(input);
            System.out.print("Add next word: ");
            input = scan.nextLine();
        }

        return list;
    }

    // get a list back in reverse order as entered:
    public static void reverseOrder() {
        ArrayList<String> rev = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter names for your arraylist");
        System.out.print("When done, press return twice: \n");
        String input = scan.nextLine();

        while (!input.equals("")) {
            rev.add(input);
            input = scan.nextLine();
        }

        Collections.reverse(rev);
        for (String person : rev) {
            System.out.println(person);
        }
    }

    // sort out a list of names in alphabetical order:
    public static void sortedOut() {
        ArrayList<String> classList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter names for your classroom.");
        System.out.print("When done, press return twice: \n");
        String input = reader.nextLine();

        while(!input.equals("")) {
            classList.add(input);
            input = reader.nextLine();
        }

        Collections.sort(classList);
        for (String student : classList) {
            System.out.println(student);
        }
    }

    // get words from a user and reprint them when the user hits return twice:
    public static void monkeySee() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type in a word. When you are done, press enter twice.");
        System.out.print("Type a word: \n");
        String input = reader.nextLine();

        while (!input.equals("")) {
            words.add(input);
            input = reader.nextLine();
        }

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void makeTeachers() {
        ArrayList<String> teachers = new ArrayList<String>();
        teachers.add("Anthony");
        teachers.add("Wilma");
        teachers.add("Geoff");
        teachers.add("Sandy");
        teachers.add("Pat");
        teachers.add("Ramon");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }

    // get words from a user and if the word is a repeat, stop adding words and print out the
    // list
    public static void noRepeats() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Type in words. If a word is repeated, the entering will end.");
        System.out.print("Type in a word: \n");
        String input = reader.nextLine();

        while (!words.contains(input)) {
            words.add(input);
            input = reader.nextLine();
        }

        System.out.println("You gave the following word, " + input +  ", twice.");


    }





}
