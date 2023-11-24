package Fundamentos_Java;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // lista

        // toda lista deve receber um tipo, pode ser um objeto, tipo de variavel
        List<String> nomes = new ArrayList<>();

        nomes.add("Dionis");
        nomes.add("Vanessa");
        nomes.add("Cida");
        nomes.add("Maria");


        System.out.println(nomes.get(0));
        for(String  nome : nomes) {
            System.out.println(" O nome é: " + nome);
        }


        nomes.forEach(nome -> System.out.println(nome));
    }
}