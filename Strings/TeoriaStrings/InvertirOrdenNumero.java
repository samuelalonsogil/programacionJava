package Strings.TeoriaStrings;

import java.util.Scanner;

public class InvertirOrdenNumero {
    static Scanner sc = new Scanner(System.in);

    public static int IntroducirNumero(int num){
        System.out.println("Escribe un int:");
        return num = sc.nextInt();
    }

    public static String ConvertirAString(int num,String digit){
        return digit= String.valueOf(num);
    }

    public static String InvertirNumero(String digit){
        String num2="";
        for(int i=digit.length()-1;i>=0;i--){
            num2+=digit.charAt(i);
        }
        System.out.println(num2);
        return num2;
    }
    public static void main(String[] args) {
        int num=0;
        num=IntroducirNumero(num);

        String digit="";
        digit=ConvertirAString(num, digit);

        digit=InvertirNumero(digit);
    }


}
