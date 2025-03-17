package Aula4;

import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEscreva um numero: ");


        int v1 = input.nextInt();
        System.out.println("\nEscreva outro numero: ");
        int v2 = input.nextInt();

        if (v1 > v2) {
            System.out.println(v1 + " e maior que " + v2);
        } if (v1 == v2) {
            System.out.println(v1 + " e igual a " + v2);
        } else {
            System.out.println(v1 + " e menor que " + v2);
        }

        input.close();



    }
}