package BoletinArrayList2;

import java.util.HashMap;
import java.util.Scanner;

public class UserAndPassword {
    /*Use a HashMap to store an user and a password, the program has to ask for a user and a psw you have 3
    * attempts to guess it*/

    static HashMap<String,Integer> userAndKey = new HashMap<String,Integer>();
    static Scanner sc = new Scanner(System.in);

    public static String fillUser(){
        System.out.println("Insert the user: ");
        String user=sc.next();
        return user;
    }

    public static Integer fillKey(){
        System.out.println("Insert the key: ");
        Integer key=sc.nextInt();
        return key;
    }


    public static HashMap putUsers(){
        userAndKey.put("samu",02 );
        return userAndKey;
    }

    public static void checkUserAndPswd(){
        int count=0;
        boolean correct=false;

        String user="";
        Integer key=0;

        do {
            user=fillUser();
            key=fillKey();
            count++;

            if (userAndKey.containsKey(user)){
                System.out.println("user exists");
                    if (userAndKey.get(user).equals(key)){
                        System.out.println("User and password correct, access granted");
                        correct=true;
                    }else{
                        System.out.println("incorrect password " + (3-count) + " attempts left");
                    }
            }
            else System.out.println("user doesn't exists" + (3-count) + " attempts left");

        }while (count!=3 && correct==false);
    }

    public static void main(String[] args) {
        putUsers();
        checkUserAndPswd();
    }
}
