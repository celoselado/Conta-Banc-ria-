package Conta;

import java.util.Scanner;

import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + 
					"---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("                BANCO DO BRAZIL                          ");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("              (1) Criar uma conta                        ");
			System.out.println("              (2) Listar todas as contas                 ");
			System.out.println("              (3) Buscar conta por numero                "); 
			System.out.println("              (4) Atualizar dados da conta               ");
			System.out.println("              (5) Apagar conta                           ");
			System.out.println("              (6) Sacar                                  ");
			System.out.println("              (7) Depositar                              ");
			System.out.println("              (8) Transferir valores entre contas        ");
			System.out.println("              (9) Sair                                   ");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("---------------------------------------------------------");
			System.out.println("                                                         "+Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("Digite a opção que deseja:                               ");
			System.out.println("                                                         "+Cores.TEXT_REST);
			
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println();
				System.out.println("O Banco do Brazil agradece sua visita! - Seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar uma conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar conta por numero\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar\n\n");
				break;
			case 8: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir valores entre contas");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!\n");
			}
			
		}

	}

}
