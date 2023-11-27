package projeto_final_bloco_1;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- PP NATURA TURISMO - PLATAFORMA ECOMMERCE");
        System.out.println("Olá! Descubra o encanto do Pantanal Paulista com a PP Nature Turismo! Esta região, que abrange as cidades de Andradina, Castilho, Itapura, Ilha Solteira, Pereira Barreto, Suzanápolis e Sud Mennucci, é um verdadeiro paraíso para quem busca férias inesquecíveis, repleto de uma ampla variedade de atrativos naturais!");

        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Programa encerrado. Apenas maiores de idade podem comprar pacotes");
            scanner.close();
            return;
        }

        scanner.nextLine(); // Limpa o buffer
        System.out.println("Qual a sua cidade de origem? ");
        String cidadeOrigem = scanner.nextLine();

        System.out.println("Qual o seu RG?");
        String rg = scanner.nextLine();

        System.out.println("Qual a data que deseja viajar? ");
        String dataViagem = scanner.nextLine();

        System.out.println("Qual cidade gostaria de conhecer?");
        System.out.println("Andradina\n1 Castilho\n2 Itapura\n3 Ilha Solteira\n4 Pereira Barreto\n5 Suzanápolis\n6 Sud Mennucci");

        int cidadeEscolhida = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Qual pacote gostaria de escolher?");
        System.out.println("1 - Básico: 2 dias + acomodação + refeição\n2 - Premium - 2 dias + acomodação - refeição + tour personalizado com guia + passeio de barco");

        int pacoteEscolhido = scanner.nextInt();

        if (pacoteEscolhido == 1) {
            System.out.println("O pacote irá custar R$100,00 por pessoa");
        } else if (pacoteEscolhido == 2) {
            System.out.println("O pacote irá custar R$200,00 por pessoa");
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("Gostaria de finalizar sua compra? (S/N)");
        scanner.nextLine(); // Limpa o buffer
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
