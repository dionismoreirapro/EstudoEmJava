package org.example.exercicios;

import java.util.Scanner;

public class EXE34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o ano");
        int ano = entrada.nextInt();

        if(ano % 400 == 0 || ano % 4 == 0){
            System.out.println("O ano " + ano + " é bissexto" );
        }else{
            System.out.println("Ano não bissexto!");
        }


    }

}
