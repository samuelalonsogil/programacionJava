package BoletinArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Write a program that sort 10 ints inserted by keyboard and store them in an arrayList object */
public class WriteAndSort {

    static ArrayList<Integer> nums = new ArrayList<Integer>(10);
    static Scanner sc = new Scanner(System.in);

    public static ArrayList fillArrayList(){
        for (int i=0;i<10;i++){
            System.out.println("Insert the number: ");
            int num=sc.nextInt();
            nums.add(num);
        }
        return nums;
    }

    public static void showArraylist(){
        System.out.println("The arrayList is: " + nums.toString());
    }

    public static void main(String[] args) {
        fillArrayList();

        Collections.sort(nums);

        showArraylist();
    }
}
