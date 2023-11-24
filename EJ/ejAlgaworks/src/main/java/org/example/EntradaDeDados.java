package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();


        System.out.println("Digite um valor inteiro: ");
        int valorInteiro = entrada.nextInt();


        System.out.println("Digite um valor double:  ");
        double valorDouble = entrada.nextDouble();


        System.out.println(valorInteiro);
        System.out.println(valorDouble);
        System.out.println(nome);
    }
}
