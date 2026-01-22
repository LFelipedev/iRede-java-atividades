package org.example;

/**
 *  RESOLUÇÃO POR: LUIZ FELIPE
 *  ENUNCIADO: Escreva um programa Java que use os operadores lógicos para verificar se um número está entre 10 e 20 (inclusive). Use: int numero = 15;
 */

public class q1 {
    public static void main(String[] args) {
        int numero = 15; //Declarando a variável

        if(numero >= 10 && numero <= 20) {
            System.out.println("O numero esta entre (inclusive) 10 e 20");
        } else {
            System.out.println("O numero nao esta entre (inclusive) 10 e 20");
        }
    }
}