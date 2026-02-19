package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioListas {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número inteiro N
            e depois os dados (id, nome e salario) de N
            funcionários. Não deve haver repetição de ID.

            Em seguida, efetuar o aumento de X por cento do salário
            de um determinado funcionário. Para isso, o programa deve
            ler um id e o valor X. Se o id informado não existir, mostrar
            uma mensagem e abortar a operação. Ao final, mostrar
            a listagem atualizada dos funcionários, conforme exemplos.

            Lembre-se de aplicar a técnica de encapsulamento para não
            permitir que o saário possa ser mudado livremente. Um salário
            só pode ser aumentado com base em uma operação de aumento
            por porcentagem dada.
        */

        Scanner sc = new Scanner(System.in);

        List<Funcionario> Func = new ArrayList<>();

        Func.add(new Funcionario(10, "Nicholas", 2450.00));
        Func.add(new Funcionario(20, "Ricardo", 1691.30));
        Func.add(new Funcionario(30, "Luquinhas", 6730.22));

        System.out.println(Func.size());

        System.out.println("Digite o ID do funcionário que terá o salário alterado: ");
        int id = sc.nextInt();

        System.out.println("Digite a porcentagem que o salário será aumentado.");
        float porcentagem = sc.nextFloat();

        for (Funcionario N : Func) {

            if (id == N.getId()) {
                N.SalarioPorcent(porcentagem);
            }
            else if(N.getId() == Func.get((Func.size()-1)).getId()) {
                System.out.println("Valor de ID inválido!");
            }

        }

        System.out.printf("%n%n ------------------ %n%n");

        for (Funcionario N : Func) {

            System.out.println("Id do funcionário: " + N.getId());
            System.out.printf("Nome do funcionário: %s %n", N.getNome());
            System.out.println("Salario do funcionário: " + N.getSalario() + "\n");
        }

        sc.close();
    }

}
