package org.example.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercio223 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        double valorTotalTrabalhado;
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o valor por hora: ");
        double valorPorHora = entrada.nextDouble();

        System.out.println("Digite a horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.println("Digite o valor de desconto");
        double desconto = entrada.nextDouble();

        valorTotalTrabalhado = horasTrabalhadas * valorPorHora;
        double valorTotalLiquido = valorTotalTrabalhado - desconto;

        System.out.println("Folha de pagamento:: " + nome);
        System.out.println("Horas trabalhada: " + horasTrabalhadas + " horas");
        System.out.println("Valor total bruto: R$  " + valorTotalTrabalhado);
        System.out.println("Valor liquido: R$ " + valorTotalLiquido);
    }
}
