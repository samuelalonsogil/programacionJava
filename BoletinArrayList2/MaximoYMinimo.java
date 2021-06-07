package BoletinArrayList2;

import java.util.ArrayList;

/*2-Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que calcule
* la suma, media, máximo y mínimo de esos números. El tamaño de la lista también será aleatorio y podrá oscilar
* entre 10 y 20 elementos (ambos incluidos) */

public class MaximoYMinimo {
    static ArrayList<Integer> nums = new ArrayList<Integer>(arrayListSize());

    /*no need to call on main*/
    public static int arrayListSize(){
        return (int)(10 + Math.random()*10);
    }

    /*no need to call on main*/
    public static Integer randomNumGenerator(){
        return (Integer)((int)(Math.random()*100));
    }

    public static ArrayList fillArray(ArrayList<Integer>nums){
        for (int i=0;i<arrayListSize();i++){
            nums.add(randomNumGenerator());
        }
        return nums;
    }

    public static int summation(){
        int summ=0;
        for (Integer n :nums) {
            summ+=n;
        }
        return summ;
    }

    public static double average(int summ){
        int cont=0;

        for (Integer n :nums) {
            cont++;
        }
        return summ/cont;
    }

    public static int maxNum(){
        int max=0;
        for (Integer n :nums) {
            if (n>max) max=n;
        }
        return max;
    }

    public static int minNum(){
        int min=100;
        for (Integer n :nums) {
            if (n<min) min=n;
        }
        return min;
    }

    public static void showArraylist(){
        System.out.println("The arrayList is: " + nums.toString());
    }

    public static void main(String[] args) {

        fillArray(nums);

        int summ=summation();
        System.out.println("The total summation is: " + summ);

        double average = average(summ);
        System.out.println("The average number is: " + average);

        int maxNum = maxNum();
        System.out.println("The highest number is: " + maxNum);

        int minNum = minNum();
        System.out.println("The lowest number is: " + minNum);

        showArraylist();
    }


}
