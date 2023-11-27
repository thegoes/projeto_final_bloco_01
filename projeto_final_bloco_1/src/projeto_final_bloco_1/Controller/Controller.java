package Controller;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<Integer, PacoteTuristico> pacotesDisponiveis;

    public Controller() {
        this.pacotesDisponiveis = new HashMap<>();
        this.preencherPacotesDisponiveis();
    }

    private void preencherPacotesDisponiveis() {
        pacotesDisponiveis.put(1, new PacoteBasico());
        pacotesDisponiveis.put(2, new PacotePremium());
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- PP NATURA TURISMO - PLATAFORMA ECOMMERCE");
        System.out.println("Olá! Descubra o encanto do Pantanal Paulista com a PP Nature Turismo! Esta região é um verdadeiro paraíso para quem busca férias inesquecíveis, repleto de uma ampla variedade de atrativos naturais!");

        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Programa encerrado. Apenas maiores de idade podem comprar pacotes");
            scanner.close();
            return;
        }

        scanner.nextLine(); 

        System.out.println("Qual a sua cidade de origem? ");
        String cidadeOrigem = scanner.nextLine();

        System.out.println("Qual o seu RG?");
        String rg = scanner.nextLine();

        System.out.println("Qual a data que deseja viajar? ");
        String dataViagem = scanner.nextLine();

        System.out.println("Qual pacote gostaria de escolher?");
        System.out.println("1 - Básico: 2 dias + acomodação + refeição\n2 - Premium - 2 dias + acomodação - refeição + tour personalizado com guia + passeio de barco");

        int pacoteEscolhido = scanner.nextInt();

        PacoteTuristico pacote = pacotesDisponiveis.getOrDefault(pacoteEscolhido, null);

        if (pacote == null) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("O pacote irá custar R$" + pacote.calcularPreco() + " por pessoa");
        }

        System.out.println("Gostaria de finalizar sua compra? (S/N)");
        scanner.nextLine();
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Compra finalizada! Tenha um ótimo passeio");
        } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Programa encerrado");
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
