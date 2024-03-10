package com.mycompany.aula01;

import java.util.Scanner;

/**
 *
 * @author thzsilva
 */
public class Exercicio03Aula01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vetor v = new Vetor();
        int opcao = 1;
        
        while( opcao != 0 ){
            try{
                System.out.println("1 - Cadastrar produto; 2 - Listar produtos; "
                    + "3 - Pesquisar produto; 4 - Alterar produto; "
                        + "5 - Remover produto; 0 - Finalizar");
                opcao = teclado.nextInt();
                teclado.nextLine();
                
                System.out.println();
                
                switch( opcao ){
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = teclado.nextLine();
                    System.out.print("Valor: ");
                    double valorProduto = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println();
                    
                    if( v.retornarProduto(nomeProduto) != null ){
                        System.out.println("Esse produto já foi cadastrado");
                        System.out.println();
                    }else{
                        Produto novoProduto = new 
                        Produto(nomeProduto, valorProduto);
                    
                        v.cadastrar(novoProduto);
                    }
                break;
                case 2:
                    if( v.retornarTamanho() == 0){
                        System.out.println("Nenhum produto cadastrado\n");
                    }else{
                        System.out.println(v.listar());
                    }
                break;
                case 3:
                    System.out.print("Informe o termo a ser pesquisado: ");
                    String termo = teclado.next();
                    
                    System.out.println();
                    if( v.pesquisarTermo(termo).isBlank() ){
                        System.out.println("Nenhum produto com esse termo encontrado\n");
                    }else{
                       System.out.println(v.pesquisarTermo(termo)); 
                    }
                break;
                case 4:
                    System.out.print("Informe o nome do produto que será alterado: ");
                    String nomeAlterar = teclado.nextLine();
                    System.out.println();
                    
                    if( v.retornarProduto(nomeAlterar) == null ){
                        System.out.println("Produto não encontrado");
                    }else{
                        System.out.print("Informe o novo nome: ");
                        String novoNome = teclado.nextLine();
                        System.out.print("Informe o novo valor: ");
                        double novoValor = teclado.nextDouble();
                        teclado.nextLine();
                        v.alterar(nomeAlterar, novoNome, novoValor);
                    }
                    
                    System.out.println();
                break;
                case 5:
                    System.out.print("Informe o nome do produto que será removido: ");
                    String nomeRemover = teclado.nextLine();
                    
                    if( v.retornarProduto(nomeRemover) == null ){
                        System.out.println("\nProduto não encontrado");
                    }else{
                        v.remover(nomeRemover);
                    }
                    
                    System.out.println();
                break;
                case 0:
                break;
                default:
                    System.out.println("Opção invalida\n");
                }
            }catch(Exception e){
                System.out.println("\nEntrada invalida\n");
                teclado.next();
            }
        }
    }
}
