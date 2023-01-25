package edu.thiago.tema.desafios;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Velocidade do motorista: ");
        int velocidadeAtual = leitor.nextInt();

        if(velocidadeAtual > 60){
            System.out.println("Foi multado");
        }else{
            System.out.println("Nao foi multado");
        }
    }
}
