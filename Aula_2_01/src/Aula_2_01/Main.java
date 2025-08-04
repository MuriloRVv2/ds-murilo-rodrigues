package Aula_2_01;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("Murilo", "murilo@gmail.com", 17);
		
		usuario1.exibirInfo();
		
		usuario1.setNome("Murilo Rodrigues");
		
		System.out.println("\nApós alteraqção de nome: ");
		usuario1.exibirInfo();
		
	}
	
}
