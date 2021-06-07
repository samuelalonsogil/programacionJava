package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Write a program that sort 10 Strings inserted by keyboard and store them in an arrayList object */
public class WriteStringsAndSort {

    static ArrayList<String> words = new ArrayList<String>(10);
    static Scanner sc = new Scanner(System.in);

    public static ArrayList fillArrayList(){
        for (int i=0;i<10;i++){
            System.out.println("Insert the word: ");
            String word=sc.next();
            words.add(word);
        }
        return words;
    }

    public static void showArraylist(){
        System.out.println("The arrayList is: " + words.toString());
    }

    public static void main(String[] args) {
        fillArrayList();

        Collections.sort(words);

        showArraylist();
    }
}
