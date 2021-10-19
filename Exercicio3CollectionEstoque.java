package ExercicioPolimorfismoHerança;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3CollectionEstoque {

	public static void main(String[] args) {

		int op;
		
		
			try (Scanner ler = new Scanner(System.in)){
				
			ArrayList<String> estoque = new ArrayList();
		
			
				do {
					
					System.out.println("\n=================================ESTOQUE======================================");
					System.out.println("           Digite uma opção para começar: "         );
					System.out.println("-------------------------------------------------------");
					System.out.println("1 - Deseja adicionar novos modelos de roupas ao estoque\n2 - Deseja remover algum modelo de roupa do estoque\n3 - Deseja Atualizar algum modelo de roupa do estoque\n4 - Visualizar todos os modelos de roupas do estoque\n0 - Encerrar o programa");
					System.out.println("-------------------------------------------------------");
					op = ler.nextInt();
					
					
						if (op ==1 ) {
					
				
							ler.nextLine();
							System.out.println("Digite o nome do novo modelo de roupa ao estoque: ");
							String roupa = ler.nextLine();
					
							estoque.add(roupa);
							System.out.println("*" + roupa + " adicionado(s) com sucesso!*");
					
					}
					
					
						else if(op == 2) {
					
							ler.nextLine();
							System.out.println("Digite por favor, o nome do modelo da roupa para remove-lo do estoque: ");
							String roupa1 = ler.nextLine();
						
								if(estoque.contains(roupa1)) {
							
									estoque.remove(roupa1);
						
								} else {
							
									System.out.println("Modelo de Roupa não encontrado no estoque");
								}
						}
						
						else if(op == 3) {
		
						
							ler.nextLine();
							System.out.println("Digite por favor, o nome do modelo da roupa que você deseja atualizar: ");
							String verifica = ler.nextLine();
							System.out.println("Digite o nome do modelo de roupa que entrará no lugar do " +verifica+".");
							String novo = ler.nextLine();
					
								if(estoque.contains(verifica)){
							
									estoque.remove(verifica);
									estoque.add(novo);
							
								} else {
							
									System.out.println("Modelo de roupa não encontrado no estoque");
							
								}
								
						} else if (op == 4){
							
						
							ler.nextLine();
							System.out.println("Temos estes modelos de roupas disponíveis no estoque: ");
							System.out.println(estoque);
							
						} else {
							
							System.out.println("ESTOQUE ATUALIZADO / PROGRAMA FINALIZADO. ");
						}
				
				} while(op!=0);	
			}

	}

}
