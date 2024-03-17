import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio05Aula02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map<String, Aluno> alunos = new HashMap<>();
		int opcao = 1;
		
		while (opcao != 0) {
			try {
				System.out.println("1 - Cadastrar aluno; 2 - Listar alunos; 3 - Alterar registro; 4 - Remover registro;"
						+ " 5 - Visualizar estatísticas; 0 - Finalizar");
				opcao = teclado.nextInt();
				
				teclado.nextLine();
				System.out.println();
				
				switch (opcao) {
				case 1:
					System.out.print("Nome do aluno: ");
					String nomeAluno = teclado.nextLine();
					
					if (nomeAluno.strip().isEmpty()) {
						System.out.println("\nNome invalido\n");
					} else {
						System.out.print("Situação do aluno (1 - Aprovado; 2 - Reprovado): ");
						int situacaoAluno = teclado.nextInt();
						
						teclado.nextLine();
						
						if (situacaoAluno != 1 && situacaoAluno != 2) {
							System.out.println("\nSituação invalida\n");
						} else {
							boolean aprovado;
							
							if (situacaoAluno == 1) {
								aprovado = true;
							} else {
								aprovado = false;
							}
							
							Aluno a = new Aluno(nomeAluno, aprovado);
							alunos.put(nomeAluno, a);
							
							System.out.println("\nAluno cadastrado\n");
						}
					}
					
					break;
				case 2:
					if (alunos.size() > 0) {
						for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
							System.out.println(entry.getValue().toString() + "\n");
						}
					} else {
						System.out.println("Nenhum aluno cadastrado\n");
					}
					
					break;
				case 3:
					if (alunos.size() > 0) {
						System.out.print("Nome do aluno a ser alterado: ");
						String nomeAlterar = teclado.nextLine();
						
						int existeAluno = -1;
						String chaveAluno = null;
						
						for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
							if (entry.getKey().equalsIgnoreCase(nomeAlterar.strip())) {
								existeAluno = 1;
								chaveAluno = entry.getKey();
							}
						}
						
						if (existeAluno == -1) {
							System.out.println("\nAluno não cadastrado");
						} else {
							System.out.print("Nome: ");
							String novoNome = teclado.nextLine();
							
							if (novoNome.strip().isEmpty()) {
								System.out.println("\nNome invalido");
							} else {
								System.out.print("Situação (1 - Aprovado; 2 - Reprovado): ");
								int situacaoAluno = teclado.nextInt();
								
								teclado.nextLine();
								
								if (situacaoAluno != 1 && situacaoAluno != 2) {
									System.out.println("\nSituação invalida");
								} else {
									boolean aprovado;
									
									if (situacaoAluno == 1) {
										aprovado = true;
									} else {
										aprovado = false;
									}
									
									Aluno a = alunos.remove(chaveAluno);
									a.setNome(novoNome);
									a.setAprovado(aprovado);
									
									alunos.put(novoNome, a);
									
									System.out.println("\nRegistro alterado");
								}
							}
						}
					} else {
						System.out.println("Nenhum aluno cadastrado");
					}
					
					System.out.println();
					
					break;
				case 4:
					if (alunos.size() > 0) {
						System.out.print("Nome do aluno a ser removido: ");
						String nomeAlterar = teclado.nextLine();
						
						int existeAluno = -1;
						String chaveAluno = null;
						
						for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
							if (entry.getKey().equalsIgnoreCase(nomeAlterar.strip())) {
								existeAluno = 1;
								chaveAluno = entry.getKey();
							}
						}
						
						if (existeAluno == -1) {
							System.out.println("\nAluno não cadastrado");
						} else {
							alunos.remove(chaveAluno);
							
							System.out.println("\nRegistro removido");
						}
					} else {
						System.out.println("Nenhum aluno cadastrado");
					}
					
					System.out.println();
					
					break;
				case 5:
					int alunosRegistrados = alunos.size();
					int alunosReprovados = 0, alunosAprovados = 0;
					
					for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
						if (entry.getValue().isAprovado()) {
							alunosAprovados++;
						} else {
							alunosReprovados++;
						}
					}
					
					System.out.println("Alunos registrados: " + alunosRegistrados + "\nAlunos aprovados: " + 
					alunosAprovados + "\nAlunos reprovados: " + alunosReprovados + "\n");
					
					break;
				case 0:
					break;
					default: System.out.println("Opção invalida\n");
				}
			} catch (Exception e) {
				System.out.println("\nEntrada invalida\n");
				teclado.next();
			}
		}
		
		teclado.close();
	}

}
