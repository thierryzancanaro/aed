
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author thzsilva
 */
public class Exercicio02Aula02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vector<String> nomes = new Vector<>();
        int opcao = 1;
        
        while( opcao != 0 ){
            try{
                System.out.println("1 - Cadastrar; 2 - Listar registros; "
                        + "3 - Pesquisa por termo; 4 - Alterar registro; "
                        + "5 - Remover; 0 - Finalizar");
                opcao = teclado.nextInt();
                
                teclado.nextLine();
                System.out.println();
                
                switch( opcao ){
                    case 1:
                        System.out.print("Nome para cadastro: ");
                        String nome = teclado.nextLine();
                        
                        System.out.println();
                        
                        if (nome.strip().isEmpty()) {
                        	System.out.println("Nome invalido");
                        } else {
                        	int existeNome = -1;
    						
                            for (String n : nomes) {
    							if (n.strip().equalsIgnoreCase(nome.strip())) {
    								existeNome = 1;
    							}
    						}
    						
    						if (existeNome == -1) {
    							nomes.add(nome);
    							System.out.println("Nome cadastrado");
    						} else {
    							System.out.println("Nome já cadastrado");
    						}
                        }
                        
                        System.out.println();
                        
                    break;
                    case 2:
                    	if(nomes.size() > 0) {
                    		for(String n: nomes){
                                System.out.println(n);
                            }
                    	} else {
                    		System.out.println("Nenhum nome cadastrado");
                    	}
                        
                        System.out.println();
                    break;
                    case 3:
                    	if (nomes.size() > 0) {
                    		System.out.print("Termo a ser pesquisado: ");
                            String termo = teclado.next();
                            System.out.println();
                            
                            boolean contem = false;
                            
                            for(String n: nomes){
                                if( n.toLowerCase().contains(termo.toLowerCase()) ){
                                    System.out.println(n);
                                    contem = true;
                                }
                            }
                            
                            if (contem == false) {
                            	System.out.println("Nenhum nome contem esse termo");
                            }
                    	} else {
                    		System.out.println("Nenhum nome cadastrado");
                    	}
                        
                        System.out.println();
                    break;
                    case 4:
                    	if (nomes.size() > 0) {
                    		System.out.print("Nome que sera alterado: ");
                            String nomeAlterar = teclado.nextLine();
                            System.out.println();
                            
                            if( nomes.contains(nomeAlterar) ){
                                System.out.print("Novo nome: ");
                                String novoNome = teclado.nextLine();
                                
                                for(String n: nomes){
                                    if( n.equals(nomeAlterar) ){
                                        int i = nomes.indexOf(n);
                                        nomes.set(i, novoNome);
                                        System.out.println("\nNome alterado");
                                    }
                                }
                            }else{
                                System.out.println("Nome não cadastrado");
                            }
                    	} else {
                    		System.out.println("Nenhum nome cadastrado");
                    	}
                        
                        System.out.println();
                    break;
                    case 5:
                    	if (nomes.size() > 0) {
                    		System.out.print("Nome que sera removido: ");
                            String nomeRemover = teclado.nextLine();
                            System.out.println();
                            
                            if( nomes.contains(nomeRemover) ){
                            	String tmp = "";
                            	
                                for(String n: nomes){
                                    if( n.equals(nomeRemover) ){
                                    	tmp = n;
                                    }
                                }
                                
                                nomes.remove(tmp);
                                System.out.println("Nome removido");
                            }else{
                                System.out.println("Nome não cadastrado");
                            }
                    	} else {
                    		System.out.println("Nenhum nome cadastrado");
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
