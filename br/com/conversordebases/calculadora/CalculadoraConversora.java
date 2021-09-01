package br.com.conversordebases.calculadora;

import java.util.Scanner;

public interface CalculadoraConversora {

    /**
     * @param a;
     * @return numero convertido;
     * Calcula a conversao de base decimal para a base selecionada, utilizando o padrão Strategy
     */
    StringBuilder Calcular(int a);
    /**
     * @return tipo selecionado
     * Devolve o tipo
     */
    default String getTipo(){
        return this.toString();
    }
    /**
     * Metodo que mostra no console a abertura do tipo selecionado
     */
    void mostrarTipo();
    /**
     * @return numero decimal para conversao
     * @param entrada
     * Recebe um numero decimal para ser convertido para base selecionada
     */
    static int RecebeNumeroDecimal(Scanner entrada){
        int a;
        System.out.print("Digite o numero decimal: ");
        a = entrada.nextInt();
        return a;
    }
    /**
     * @return tipo para conversao
     * @param entrada
     * Recebe o tipo de base para converter
     */
    static int RecebeTipoConversao(Scanner entrada){
        int tipo;
        System.out.printf("Converter para [1] %s ; [2] %s", new Binario().getTipo(), new Hexadecimal().getTipo());
        tipo = entrada.nextInt();
        return tipo;
    }
    /**
     * @param a
     * Verifica o numero decimal fornecido e sua validade para a aplicação
     */
    static void VerificaSeNumeroEhValido(int a){
        if (a < 0) {
            throw new IllegalArgumentException("Numero precisa ser inteiro positivo");
        }
    }
    /**
     * @return a calculadora que fara as ações
     * @param tipoParaConversao
     * Recebe o tipo de conversao e define qual o tipo de base para ser convertido
     */
    static CalculadoraConversora DefineTipoConversao(int tipoParaConversao){
        CalculadoraConversora tipo;
        switch (tipoParaConversao) {
            case 1 -> tipo = new Binario();
            case 2 -> tipo = new Hexadecimal();
            default -> throw new IllegalArgumentException("Tipo inexistente");
        }
        return tipo;
    }
    /**
     * Mostra a abertura do programa
     */
    static void mostrarAbertura(){
        System.out.println("""
                **********************************************************************************************************************************************************
                **   ██████  ██████  ███    ██ ██    ██ ███████ ██████  ███████  ██████  ██████      ███    ██ ██    ██ ███    ███ ███████ ██████  ██  ██████  ██████   **
                **  ██      ██    ██ ████   ██ ██    ██ ██      ██   ██ ██      ██    ██ ██   ██     ████   ██ ██    ██ ████  ████ ██      ██   ██ ██ ██      ██    ██  **
                **  ██      ██    ██ ██ ██  ██ ██    ██ █████   ██████  ███████ ██    ██ ██████      ██ ██  ██ ██    ██ ██ ████ ██ █████   ██████  ██ ██      ██    ██  **
                **  ██      ██    ██ ██  ██ ██  ██  ██  ██      ██   ██      ██ ██    ██ ██   ██     ██  ██ ██ ██    ██ ██  ██  ██ ██      ██   ██ ██ ██      ██    ██  **
                **   ██████  ██████  ██   ████   ████   ███████ ██   ██ ███████  ██████  ██   ██     ██   ████  ██████  ██      ██ ███████ ██   ██ ██  ██████  ██████   **
                ****************************************************************************************************************By:ArthurOCFernandes**********************
                """);
    }
}
