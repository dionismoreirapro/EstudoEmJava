package org.example;

import java.util.Scanner;

public class LacoFor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de passegeiros: ");
        int passageiros = leia.nextInt();

        for (int passageiroAtual = 1; passageiroAtual <= passageiros; passageiroAtual++){
            System.out.println(passageiroAtual);
        }
    }


    //

}
