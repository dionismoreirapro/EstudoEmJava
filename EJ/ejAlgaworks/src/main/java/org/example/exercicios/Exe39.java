package org.example.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exe39 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

        System.out.println("DIgite o sexo: ");
        String sexo = entrada.nextLine();

        System.out.println("Digite o seu IMC: ");
        Double imc = entrada.nextDouble();


        if (imc < 19.1 && "F".equals(sexo)){
            System.out.println("Abaixo do peso");
        }else if (imc < 20.7 && "M".equals(sexo)){
            System.out.println("Abaixo do peso");
        }else if ("F".equals(sexo) && imc <= 25.8){
            System.out.println("No peso ideal");
        } else if ("M".equals(sexo) && imc <= 26.4) {
            System.out.println("No peso ideal");
        }else {
            System.out.println("Acima do peso");
        }

    }





}
