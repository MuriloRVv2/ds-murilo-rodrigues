package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado a: ");
        double a = input.nextDouble();

        System.out.println("Digite o comprimento do lado b: ");
        double b = input.nextDouble();

        System.out.println("Digite o comprimento do lado c: ");
        double c = input.nextDouble();

        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            double temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            double temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Lados ordenados: a = " + a + ", b = " + b + ", c = " + c);

        if (a >= b + c) {
            System.out.println("Não formam um triângulo.");
        } else {

            double a2 = a * a;
            double b2 = b * b;
            double c2 = c * c;

            if (a2 == b2 + c2) {
                System.out.println("Formam um triângulo retângulo.");
            } else if (a2 > b2 + c2) {
                System.out.println("Formam um triângulo obtusângulo.");
            } else {
                System.out.println("Formam um triângulo acutângulo.");
            }

            if (a == b && b == c) {
                System.out.println("Formam um triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Formam um triângulo isóceles.");
            }

        }

        input.close();

    }
}
