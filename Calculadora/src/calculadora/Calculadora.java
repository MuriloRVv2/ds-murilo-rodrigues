/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculadora;

/**
 *
 * @author Muril
 */
public class Calculadora {

    private double numeroAnterior; //Numero antes do operador
    private double resultado;
    private String operador;


public Calculadora() {
    
    limpar();
    
}

public void InserirNumero(double numero) {
    
    this.numeroAnterior = numero;
    
}

public void setOperador(String operador){
    
    this.operador = operador;
    
}

public double Calcular (double numeroAtual) {
    
    switch(operador) {//Definindo os operadores da calculadora
        
        case "+": resultado = numeroAnterior + numeroAtual;
        break;
        
        case "-": resultado = numeroAnterior - numeroAtual;
        break;
        
        case "*": resultado = numeroAnterior * numeroAtual;
        break;
        
        case "/": 
            if(numeroAtual == 0){
                throw new ArithmeticException ("Divisão por zero");//Throw new para lançar uma excessão 
            }
            
            resultado = numeroAnterior / numeroAtual;
        break;
        
    }
    
    return resultado;
    
}

public void limpar() {
    
    numeroAnterior = 0;
    resultado = 0;
    operador = "";
    
}

public double CResultado () {
    return resultado;
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

    
}
}
