package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        //vetores
        int [] idade = new int[10];
        String [] nomes = new String[10];


        //ArrayList

        ArrayList<Integer> idades = new ArrayList<>();
        idades.add(22);
        idades.add(90);
        idades.add(20);

        idades.remove(0);
        idades.size();

        System.out.println(idades.get(0));
        System.out.println(idades.get(1));


    }
}
