package projeto_final_bloco_1;

import java.util.Scanner;
import PacoteBasico;
import PacoteBasico;
import PacotePremium;
import Cliente;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual pacote gostaria de escolher?");
        System.out.println("1 - Básico: 2 dias + acomodação + refeição\n2 - Premium - 2 dias + acomodação - refeição + tour personalizado com guia + passeio de barco");
        int pacoteEscolhido = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        PacoteTuristico pacote;
        if (pacoteEscolhido == 1) {
            pacote = new PacoteBasico();
        } else if (pacoteEscolhido == 2) {
            pacote = new PacotePremium();
        } else {
            System.out.println("Opção inválida");
            scanner.close();
            return;
        }
        scanner.close();
    }
}
