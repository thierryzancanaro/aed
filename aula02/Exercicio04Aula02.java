import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04Aula02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> nomes = new LinkedList<>();
		int opcao = 1;
		
		while (opcao != 0) {
			try {
				System.out.println("1 - Cadastrar nome; 2 - Listar nomes; 0 - Finalizar");
				opcao = teclado.nextInt();
				
				teclado.nextLine();
				System.out.println();
				
				switch (opcao) {
				case 1:
					System.out.print("Nome para cadastro: ");
					String nome = teclado.nextLine();
					
					if (nome.strip().isEmpty()) {
						System.out.println("\nNome invalido");
					} else {
						nomes.add(nome);
						System.out.println("\nNome cadastrado");
					}
					
					System.out.println();
					break;
				case 2:
					if (nomes.size() > 0) {
						for (String n : nomes) {
							System.out.println(n);
						}
					} else {
						System.out.println("Nenhum nome cadastrado");
					}
					
					System.out.println();
					break;
				case 0:
					break;
					default: System.out.println("Opção inválida\n");
				}
			} catch (Exception e) {
				System.out.println("\nEntrada invalida\n");
				teclado.next();
			}
		}
		
		teclado.close();
	}

}
