package com.loiane.cursojava.aula13;

import javax.sound.midi.Soundbank;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma string concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        System.out.println(resultado++);
        /*mesma coisa que:
        System.out.println(resultado);

        resultado = resultado + 1;
        ou resultado += 1*/

        System.out.println(++resultado);
        /*mesma coisa que:
        resultado = resultado + 1;
        ou resultado += 1;

        System.out.println(resultado);
         */

        resultado--;
        System.out.println(resultado); //mesma lógica anterior

        --resultado;
        System.out.println(resultado); //mesma lógica anterior
    }
}
