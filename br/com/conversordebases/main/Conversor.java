package br.com.conversordebases.main;

import br.com.conversordebases.calculadora.CalculadoraConversora;

import java.util.Scanner;

/**
 * @author Arthur Fernandes
 * @version 1.0
 */

public class Conversor {
    /**
     * Calculadora conversora de bases numéricas
     * No primeiro momento converte apenas para a base binaria e hexadecimal
     * Pode receber, a princípio, apenas números >= 0.
     */
    public static void main(String[] args) {

        int numeroEmDecimal, tipoParaConversao;
        Scanner entrada = new Scanner(System.in);
        CalculadoraConversora numeroConvertido;

        CalculadoraConversora.mostrarAbertura();
        numeroEmDecimal = CalculadoraConversora.RecebeNumeroDecimal(entrada);
        CalculadoraConversora.VerificaSeNumeroEhValido(numeroEmDecimal);
        tipoParaConversao = CalculadoraConversora.RecebeTipoConversao(entrada);
        numeroConvertido = CalculadoraConversora.DefineTipoConversao(tipoParaConversao);
        numeroConvertido.mostrarTipo();

        //Uso do padrão Strategy para calcular o numero convertido, utilizando o metodo Calcular()
        System.out.printf("O numero decimal %d convertido para %s eh %s", numeroEmDecimal, numeroConvertido.getTipo(),
                numeroConvertido.Calcular(numeroEmDecimal));

        entrada.close();
    }

}
