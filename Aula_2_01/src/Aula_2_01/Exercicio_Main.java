package Aula_2_01;

import java.util.Scanner;

public class Exercicio_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Usuario usuario2 = new Usuario();
		
		String nome, email;
		int idade;
		
		System.out.println("================ Usuário ==================");
		System.out.println("\nDigite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("\nDigite seu email: ");
		email = sc.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = sc.nextInt();
		
		
		usuario2.exibirInfo();	
		
		
		
		
		
	}
	
}
