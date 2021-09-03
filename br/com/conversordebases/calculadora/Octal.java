package br.com.conversordebases.calculadora;

public class Octal implements CalculadoraConversora {
    @Override
    public StringBuilder Calcular(int a) {
        StringBuilder numero = new StringBuilder();
        while(a != 0){
            int resto;
            resto = a % 8;
            a /= 8;
            numero.append(resto);
        }
        return numero.reverse();
    }

    @Override
    public String toString() {
        return "Octal";
    }

    @Override
    public void mostrarTipo() {

        System.out.println("""
              *************************************************\s
              **   ██████   ██████ ████████  █████  ██       **\s
              **  ██    ██ ██         ██    ██   ██ ██       **\s
              **  ██    ██ ██         ██    ███████ ██       **\s
              **  ██    ██ ██         ██    ██   ██ ██       **\s
              **   ██████   ██████    ██    ██   ██ ███████  **\s
              *************************************************\s""");

    }
}
