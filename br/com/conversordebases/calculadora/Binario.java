package br.com.conversordebases.calculadora;

public class Binario implements CalculadoraConversora {

    public void mostrarTipo(){
        System.out.println("""
                *********************************************************\s
                **   ██████  ██ ███    ██  █████  ██████  ██  ██████   **\s
                **   ██   ██ ██ ████   ██ ██   ██ ██   ██ ██ ██    ██  **\s
                **   ██████  ██ ██ ██  ██ ███████ ██████  ██ ██    ██  **\s
                **   ██   ██ ██ ██  ██ ██ ██   ██ ██   ██ ██ ██    ██  **\s
                **   ██████  ██ ██   ████ ██   ██ ██   ██ ██  ██████   **\s
                *********************************************************\s""");
    }

    public StringBuilder Calcular(int a) {
        StringBuilder numero = new StringBuilder();
        int b = a;
        while(b != 0){
            int resto;
            resto = b % 2;
            b /= 2;
            numero.append(resto);
        }
        return numero.reverse();
    }

    @Override
    public String toString() {
        return "Binario";
    }
}
