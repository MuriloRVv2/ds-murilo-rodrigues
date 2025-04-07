package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o código do funcionário: ");
        int codigo = input.nextInt();

        System.out.println("Digite o gênero do funcionário (M para masculino, F para feminino): ");
        char genero = input.next().toUpperCase().charAt(0);

        System.out.println("Digite o tempo de trabalho em anos: ");
        int trabalho = input.nextInt();

        System.out.println("Digite o salário do funcionário: R$");
        double salario = input.nextDouble();

        double bonus;

        if (genero == 'M' && trabalho > 15) {
            bonus = salario * 0.20;
        } else if (genero == 'F' && trabalho > 10) {
            bonus = salario * 0.25;
        } else {
            bonus = 100;
        }

        System.out.println("O valor do bônus do funcionário é: R$" + bonus);

        input.close();
    }
}
