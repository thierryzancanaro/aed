package com.mycompany.aula01;

import java.util.Scanner;

/**
 *
 * @author thzsilva
 */
public class Exercicio02Aula01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[10];
        int opcao = 1;
        
        while( opcao != 0 ){
            try{
                System.out.println("1 - Cadastrar nome; 2 - Listar nomes; "
                    + "3 - Alterar item; 4 - Remover item; 0 - Finalizar");
                opcao = teclado.nextInt();
                teclado.nextLine();
                System.out.println();
            
                switch( opcao ){
                    case 1:
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();
                        int indice = procuraPosicao(nomes);
                        if( indice == 10) {
                            System.out.println("\nVetor cheio");
                        }else{
                           nomes[indice] = nome; 
                        }
                        
                        System.out.println();
                    break;
                    case 2:
                        for(int i = 0; i < nomes.length; i++){
                            System.out.print("Indice " + i + " - ");
                            if( nomes[i] == null || nomes[i].isEmpty() ){
                                System.out.println("Nenhum nome cadastrado");
                            }else{
                                System.out.println(nomes[i]);
                            }
                        }
                        System.out.println();
                    break;
                    case 3:
                        if( estaVazio(nomes) ){
                            System.out.println("Nenhum item cadastrado");
                        }else{
                            System.out.print("Indice do item a ser alterado: ");
                            int indiceAlterar = teclado.nextInt();
                            teclado.nextLine();

                            if( indiceAlterar > 9 || indiceAlterar < 0 || 
                                    nomes[indiceAlterar] == null || 
                                    nomes[indiceAlterar].isEmpty() ){
                                System.out.println("\nIndice invalido");
                            }else{
                                System.out.print("Novo nome: ");
                                String novoNome = teclado.nextLine();
                                nomes[indiceAlterar] = novoNome;
                            }
                        }
                        System.out.println();
                    break;
                    case 4:
                        if( estaVazio(nomes) ){
                            System.out.println("Nenhum item cadastrado");
                        }else{
                            System.out.print("Indice do item a ser removido: ");
                            int indiceRemover = teclado.nextInt();
                            teclado.nextLine();

                            if( indiceRemover > 9 || indiceRemover < 0 || 
                                    nomes[indiceRemover] == null ||
                                    nomes[indiceRemover].isEmpty() ){
                                System.out.println("\nIndice invalido");
                            }else{
                                nomes[indiceRemover] = "";
                            }
                        }
                        System.out.println();
                    break;
                    case 0:
                    break;
                    default:
                        System.out.println("Opçao invalida\n");
                }
            }catch(Exception e){
                System.out.println("\nEntrada invalida\n");
                teclado.next();
            }
        }
    }
    
    public static int procuraPosicao(String nomes[]){
        int posicao = 10;
        boolean tmp = false;
        
        for(int i = 0; i < nomes.length; i++){
            if( tmp == false ){
                if( nomes[i] == null || nomes[i].isEmpty() ){
                    posicao = i;
                    tmp = true;
                }
            }
        }
        return posicao;
    }
    
    public static boolean estaVazio(String nomes[]){
        boolean vazio = true;
        for(int i = 0; i < nomes.length; i++){
            if( nomes[i] != null && !nomes[i].isEmpty() ){
                vazio = false;
            }
        }
        return vazio;
    }
}
