import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeAvaliativa01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Queue<Tarefa> listaTarefas = new LinkedList<>();
		int opcao = 1;
		
		while (opcao != 0) {
			try {
				System.out.println("1 - Adicionar tarefa; 2 - Concluir tarefa; 3 - Visualizar a próxima tarefa; "
						+ "0 - Finalizar");
				opcao = teclado.nextInt();
				
				teclado.nextLine();
				System.out.println();
				
				switch (opcao) {
				case 1:
					System.out.print("Tarefa: ");
					String identificacao = teclado.nextLine();
					
					if (identificacao.strip().isEmpty()) {
						System.out.println("\nIdentificação de tarefa inválida\n");
					} else {
						System.out.print("Descrição da tarefa: ");
						String descricao = teclado.nextLine();
						
						Tarefa t;
						
						if (descricao.strip().isEmpty()) {
							t = new Tarefa(identificacao);
						} else {
							t = new Tarefa(identificacao, descricao);
						}
						
						listaTarefas.add(t);
						System.out.println("\nTarefa adicionada\n");
					}
					
					break;
				case 2:
					if (listaTarefas.size() > 0) {
						String concluir = "";
						
						while (!concluir.strip().equalsIgnoreCase("S") && !concluir.strip().equalsIgnoreCase("N")) {
							System.out.print("Concluir tarefa: \"" + listaTarefas.peek().getIdentificacao() + "\"? (S\\N): ");
							concluir = teclado.nextLine();
							
							System.out.println();
							
							if (concluir.strip().equalsIgnoreCase("S")) {
								listaTarefas.remove();
								System.out.println("Tarefa concluída");
							} else if (concluir.strip().equalsIgnoreCase("N")) {
								System.out.println("Tarefa mantida na lista");
							} else {
								System.out.println("Opção inválida\n");
							}
						}
					} else {
						System.out.println("Nenhuma tarefa na lista");
					}
					
					System.out.println();
					
					break;
				case 3:
					if (listaTarefas.size() > 0) {
						System.out.println("Próxima tarefa: " + listaTarefas.peek());
					} else {
						System.out.println("Nenhuma tarefa na lista");
					}
					
					System.out.println();
					
					break;
				case 0:
					break;
					default: System.out.println("Opção inválida\n");
				}
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("\nEntrada inválida\n");
				teclado.next();
			}
		}
		
		teclado.close();
	}

}
