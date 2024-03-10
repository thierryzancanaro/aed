package com.mycompany.aula01;

/**
 *
 * @author Usuario
 */
public class Vetor {
    Produto[] produtos;

    public Vetor() {
        this.produtos = new Produto[0];
    }

    public void cadastrar(Produto umProduto) {
        int tamanho = this.produtos.length;
        tamanho += 1;

        Produto[] vetorTemp = new Produto[tamanho];

        for (int i = 0; i < this.produtos.length; i++) {
            vetorTemp[i] = this.produtos[i];
        }

        vetorTemp[tamanho - 1] = umProduto;

        this.produtos = vetorTemp;
    }
    
    public int retornarTamanho(){
        return produtos.length;
    }
    
    public String listar(){
        String str = "";
        for(Produto umProduto: produtos){
            str += umProduto.toString() + "\n";
        }
        return str;
    }
    
    public String pesquisarTermo(String termo){
        String str = "";
        for(Produto umProduto: produtos){
            if( umProduto.getNome().toLowerCase().contains(termo.toLowerCase()) ){
                str += umProduto.toString() + "\n";
            }
        }
        return str;
    }
    
    public Produto retornarProduto(String nome){
        Produto p = null;
        for(Produto umProduto: produtos){
            if( umProduto.getNome().toLowerCase().equals(nome.toLowerCase()) ){
                p = umProduto;
            }
        }
        return p;
    }
    
    public void alterar(String nomeAntigo, String nomeNovo, double valor){
        Produto p = null;
        for(Produto umProduto: produtos){
            if( umProduto.getNome().toLowerCase().equals(nomeAntigo.toLowerCase()) ){
                p = umProduto;
            }
        }
        if( p != null ){
            p.setNome(nomeNovo);
            p.setValor(valor);
        }
    }
    
    public void remover(String nome){
        int tamanho = this.produtos.length;
        tamanho -= 1;
        
        Produto p = retornarProduto(nome);
        Produto vetorTemp[] = new Produto[tamanho];
        int apagar = 0;
        
        for(int i = 0; i < tamanho; i++){
            if( p == this.produtos[i] ){
                apagar = 1;
                vetorTemp[i] = this.produtos[i+1];
            }else{
                if( apagar == 1 ){
                    vetorTemp[i] = this.produtos[i+1];
                }else{
                    vetorTemp[i] = this.produtos[i];
                }
            }
        }
        
        this.produtos = vetorTemp;
    }
}
