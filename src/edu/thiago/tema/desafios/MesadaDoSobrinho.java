package edu.thiago.tema.desafios;

import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de meses: ");

        int entrada = leitor.nextInt();
        int mesada = 50;
        int quantidadeDinheiro = mesada*entrada;

        System.out.println("Quantidade de dinheiro: " + quantidadeDinheiro);

    }
}
