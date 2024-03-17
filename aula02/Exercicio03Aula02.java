
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author thzsilva
 */
public class Exercicio03Aula02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();
        List<Segmento> listaSegmentos = new ArrayList<>();
        int opcao = 1;
        
        while( opcao != 0 ){
            try{
                System.out.println("1 - Cadastrar; 2 - Listar registros; "
                        + "3 - Exibir segmentos; 4 - Alterar registro; "
                        + "5 - Remover; 0 - Finalizar");
                opcao = teclado.nextInt();
                
                teclado.nextLine();
                System.out.println();
                
                switch( opcao ){
                    case 1:
                    	System.out.print("Nome do produto: ");
                    	String nomeProduto = teclado.nextLine();
                    	
                    	if (nomeProduto.strip().isEmpty()) {
                    		System.out.println("\nNome invalido");
                    	} else {
                    		int existeProduto = -1;
                        	
                        	for (Produto p : listaProdutos) {
                        		if (nomeProduto.strip().equalsIgnoreCase(p.getNome().strip())) {
                        			existeProduto = 1;
                        		}
                        	}
                        	
                        	if (existeProduto == -1) {
                        		System.out.print("Segmento: ");
                        		String nomeSegmento = teclado.nextLine();
                        		
                        		if (nomeSegmento.strip().isEmpty()) {
                        			System.out.println("\nSegmento invalido");
                        		} else {
                        			int existeSegmento = -1;
                            		Segmento seg = null;
                            		
                            		for (Segmento s : listaSegmentos) {
                            			if (nomeSegmento.strip().equalsIgnoreCase(s.getNome().strip())) {
                            				existeSegmento = 1;
                            				seg = s;
                            			}
                            		}
                            		
                            		if (existeSegmento == -1) {
                            			seg = new Segmento(nomeSegmento);
                            			listaSegmentos.add(seg);
                            		} else {
                            			seg.setQtProdutos(seg.getQtProdutos() + 1);
                            		}
                            		
                            		Produto pro = new Produto(nomeProduto, seg);
                            		listaProdutos.add(pro);
                            		
                            		System.out.println("\nProduto cadastrado");
                        		}
                        	} else {
                    			System.out.println("Produto já cadastrado");
                        	}
                    	}
                    	
                    	System.out.println();
                    break;
                    case 2:
                    	if (listaProdutos.size() > 0) {
                    		for (Produto p : listaProdutos) {
                        		System.out.println(p.toString() + "\n");
                        	}
                    	} else {
                    		System.out.println("Nenhum produto cadastrado\n");
                    	}
                    break;
                    case 3:
                    	if (listaSegmentos.size() > 0) {
                    		System.out.println("Segmento\tQuantidade de Produtos\n");
                    		
                    		for (Segmento s : listaSegmentos) {
                    			System.out.println(s.toString() + "\n");
                    		}
                    	} else {
                    		System.out.println("Nenhum segmento cadastrado");
                    	}
                    break;
                    case 4:
                    	if (listaProdutos.size() > 0) {
                    		System.out.print("Nome do produto que deseja alterar: ");
                    		String nomeAlterar = teclado.nextLine();
                    		
                    		System.out.println();
                    		
                    		int existeProduto2 = -1;
                    		Produto prodTmp = null;
                        	
                        	for (Produto p : listaProdutos) {
                        		if (nomeAlterar.strip().equalsIgnoreCase(p.getNome().strip())) {
                        			existeProduto2 = 1;
                        			prodTmp = p;
                        		}
                        	}
                        	
                        	if (existeProduto2 == 1) {
                        		System.out.print("Nome: ");
                        		String novoNome = teclado.nextLine();
                        		
                        		System.out.print("Segmento: ");
                        		String novoSegmento = teclado.nextLine();
                        		
                        		int indiceProduto = listaProdutos.indexOf(prodTmp);
                        		
                        		if (listaProdutos.get(indiceProduto).getSegmento().getNome().strip().equalsIgnoreCase(novoSegmento.strip()) ) {
                        			prodTmp.setNome(novoNome);
                        		} else {
                        			prodTmp.getSegmento().setQtProdutos(prodTmp.getSegmento().getQtProdutos() - 1);
                        			
                        			int existeSegmento = -1;
                            		Segmento seg = null;
                            		
                            		for (Segmento s : listaSegmentos) {
                            			if (novoSegmento.strip().equalsIgnoreCase(s.getNome().strip())) {
                            				existeSegmento = 1;
                            				seg = s;
                            			}
                            		}
                            		
                            		if (existeSegmento == -1) {
                            			seg = new Segmento(novoSegmento);
                            			listaSegmentos.add(seg);
                            		} else {
                            			seg.setQtProdutos(seg.getQtProdutos() + 1);
                            		}
                            		
                            		prodTmp.setNome(novoNome);
                            		prodTmp.setSegmento(seg);
                        		}
                        		
                        		System.out.println("\nProduto alterado");
                        	} else {
                        		System.out.println("Produto não foi cadastrado");
                        	}
                    	} else {
                    		System.out.println("Nenhum produto cadastrado");
                    	}
                    	
                    	System.out.println();
                    break;
                    case 5:
                    	if (listaProdutos.size() > 0) {
                    		System.out.print("Nome do produto que deseja remover: ");
                    		String nomeRemover = teclado.nextLine();
                    		
                    		System.out.println();
                    		
                    		int existeProduto2 = -1;
                    		Produto prodTmp = null;
                        	
                        	for (Produto p : listaProdutos) {
                        		if (nomeRemover.strip().equalsIgnoreCase(p.getNome().strip())) {
                        			existeProduto2 = 1;
                        			prodTmp = p;
                        		}
                        	}
                        	
                        	if (existeProduto2 == 1) {
                        		prodTmp.getSegmento().setQtProdutos(prodTmp.getSegmento().getQtProdutos() - 1);
                        		listaProdutos.remove(prodTmp);
                        		System.out.println("Produto removido");
                        	} else {
                        		System.out.println("Produto não foi cadastrado");
                        	}
                    	} else {
                    		System.out.println("Nenhum produto cadastrado");
                    	}
                    	
                    	System.out.println();
                    break;
                    case 0:
                    break;
                    default:
                        System.out.println("Opção Invalida\n");
                }
            }catch(Exception e){
                System.out.println("\nEntrada invalida\n");
                teclado.next();
            }
        }
        
        teclado.close();
    }
}
