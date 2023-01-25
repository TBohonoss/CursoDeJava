package edu.thiago.tema.desafios;

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade de dinheiro: ");
        int doce = leitor.nextInt();
        int quantidadeDoces = doce*2;

        System.out.println("O cliente obteve " + quantidadeDoces + " doces");
    }
}
