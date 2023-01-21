package edu.thiago.tema.estruturaderepeticaoarrays;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até o usuário informe um valor válido.
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
