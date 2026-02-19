package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaListas01 {

    public static void main(String[] args) {

        // Instanciando uma nova lista
        List<String> lista = new ArrayList<>();

        lista.add("Nicholas");
        lista.add("Ricardo");
        lista.add("Rosangela");
        lista.add("Ronaldo");
        lista.add("Nicole");

        System.out.println(lista.size()); // Imprimindo tamanho da lista

        System.out.println("---------------");

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("---------------");

        lista.remove(2); // Deletando Item através do indíce
        lista.remove("Ronaldo"); // Deletando Item através da String

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("---------------");

        // Removendo todas as variáveis que começam com N
        // Através de uma função lambda
        lista.removeIf(x -> x.charAt(0) == 'N'); // Removendo por predicado

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("---------------");
        System.out.println("Index of Ricardo: " + lista.indexOf("Ricardo"));

        // Criando uma nova lista que recebe somente os nomes que começam com a letra R
        // nesta linha de comando, nós criamos uma nova lista
        // Então nós atribuímos a ela a antiga lista convertida para o tipo Stream()
        // Então nós filtramos a primeira letra e depois nós convertemos a primeira lista de volta
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("---------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(name);

    }

}
