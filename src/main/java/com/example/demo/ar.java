package com.example.demo;

import java.lang.reflect.Array;

public class ar {
    public static void main(String[] args) {

        int[] numb = new int[5];
        numb[0] = 10;
        numb[1] = 20;
        numb[2] = 30;
        numb[3] = 40;
        numb[4] = 50;
//System.out.println(""+ numb[3+1]);

        //int n =1;
        // for array and array list using inhance loop is the best method
        for (int n : numb) {
            System.out.println(n);
        }

        System.out.println("............Name list...............");

        String[] name = {"james", "larry", "tom", "lacy","k"};
        for (String n : name) {
         System.out.println(""+ name [3]);
           // System.out.println(n);

        }
        System.out.println(".............char List...........");

        Character[] letter = {'a', 'b', 'c', 'd', 'e'};

        for (char k: letter) {

            System.out.println(k);

        }
    }

}





