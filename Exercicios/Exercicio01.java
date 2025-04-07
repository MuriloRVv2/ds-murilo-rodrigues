package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o código do funcionário: ");
        int codigo = input.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas: ");
        int horas = input.nextInt();
        
        System.out.println("Digite o valor que o funcionário recebe por hora: ");
        double salarioPHora = input.nextDouble();
        
        System.out.println("Digite o número de filhos com idade menor que 14(quatorze) anos: ");
        int filhos = input.nextInt();
        
        System.out.println("Digite a idade do funcionário: ");
        int idade = input.nextInt();
        
        System.out.println("Digite o tempo de serviço do funcionário em anos: ");
        int tempo = input.nextInt();
        
        System.out.println("Digite o valor do salário família por filho: ");
        double salarioFamiliaPorFilho = input.nextDouble();
    
        double bruto = horas * salarioPHora;
        
        double descontoINPS = bruto * 0.085;
        
        double salarioFamilia = filhos * salarioFamiliaPorFilho;
        
        double IR = 0;
        if(bruto > 1500) {
        	IR = bruto * 0.15;
        } else if (bruto >= 500) {
        	IR = bruto * 0.08;
        }
        
        double ADC = 0;
        if(idade > 40) {
        	ADC = bruto * 0.02;
        }
        if (tempo > 15) {
        	ADC = bruto * 0.035;
        } else if (tempo > 5 == idade > 30) {
        	ADC = bruto * 0.015;
        }
        
        double Liquido = bruto - descontoINPS - IR + salarioFamilia + ADC;
       
        System.out.println("Código do funcionário: " + codigo);
        System.out.println("Salário bruto: R$" + bruto);
        System.out.println("Desconto INPS: R$" + descontoINPS);
        System.out.println("Imposto de Renda(IR): R$" + IR);
        System.out.println("Salário Família: R$" + salarioFamilia);
        System.out.println("Adicional: R$" + ADC);
        System.out.println("Salário Líquido: R$" + Liquido);
        
        input.close();
    }
}
