package edu.thiago.tema.desafios;

import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantidade de Páginas: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int terminaraSeusLivros = paginas / paginasLidas;

        System.out.println(terminaraSeusLivros + " dias");
    }
}
