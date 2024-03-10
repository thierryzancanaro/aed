/* Utilizei a fila como opção de estrutura de dados pois a ordem de remoção dos
elementos que o problema solicita é característica dessa estrutura, onde o primeiro
elemento a ser adicionado, é o primeiro a ser removido.
*/
package com.mycompany.aula01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exercicio04Aula01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao = 1;
        
        while( opcao != 0 ){
            try{
                System.out.println("1 - Cadastrar atendimento; 2 - Remover; "
                        + "3 - Ver fila; 0 - Finalizar");
                opcao = teclado.nextInt();
                teclado.nextLine();
                System.out.println();
                
                switch( opcao ){
                    case 1:
                        System.out.print("Informe o nome: ");
                        String nome = teclado.nextLine();
                        
                        fila.add(nome);
                        System.out.println();
                    break;
                    case 2:
                        if( fila.isEmpty() ){
                            System.out.println("Nenhum elemento a ser removido");
                        }else{
                            System.out.println("Elemento removido: " + fila.remove());
                        }
                        System.out.println();
                    break;
                    case 3:
                        if( fila.isEmpty() ){
                            System.out.println("Nenhum nome na fila");
                        }else{
                            for(String n: fila){
                                System.out.println(n);
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
}
