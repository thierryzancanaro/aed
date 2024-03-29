package com.mycompany.aula01;

/**
 *
 * @author Usuario
 */
public class Produto {
    private String nome;
    private double valor;
    
    public Produto(String nome, double valor){
        setNome(nome);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if( valor <= 0 ){
            throw new IllegalArgumentException();
        }
        this.valor = valor;
    }
    
    public String toString(){
        return "Nome do produto: " + getNome() + "\n" +
                "Valor: " + getValor();
    }
}
