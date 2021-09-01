package br.com.conversordebases.calculadora;

import br.com.conversordebases.calculadora.CalculadoraConversora;

public class Hexadecimal implements CalculadoraConversora {

    @Override
    public void mostrarTipo() {
        System.out.println("""
                      *********************************************************************************************\s
                      **  ██   ██ ███████ ██   ██  █████  ██████  ███████  ██████ ██ ███    ███  █████  ██       **\s
                      **  ██   ██ ██       ██ ██  ██   ██ ██   ██ ██      ██      ██ ████  ████ ██   ██ ██       **\s
                      **  ███████ █████     ███   ███████ ██   ██ █████   ██      ██ ██ ████ ██ ███████ ██       **\s
                      **  ██   ██ ██       ██ ██  ██   ██ ██   ██ ██      ██      ██ ██  ██  ██ ██   ██ ██       **\s
                      **  ██   ██ ███████ ██   ██ ██   ██ ██████  ███████  ██████ ██ ██      ██ ██   ██ ███████  **\s
                      *********************************************************************************************\s
                       """);
    }

    public StringBuilder Calcular(int a) {
        StringBuilder numero = new StringBuilder();
        int b = a;
        if(b < 16){
            numero.append(checkHex(a));
        }else{
            while(b != 0){
                int resto;
                resto = b % 16;
                b /= 16;
                numero.append(checkHex(resto));
            }
        }
        return numero.reverse();
    }
    public static String checkHex(int a){
        String temp = "";
        if(a < 10){
            temp = String.format("%d", a);
        }else {
            switch (a){
                case 10 -> temp = "A";
                case 11 -> temp = "B";
                case 12 -> temp = "C";
                case 13 -> temp = "D";
                case 14 -> temp = "E";
                case 15 -> temp = "F";
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Hexadecimal";
    }
}


