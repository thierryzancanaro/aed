/**
 *
 * @author thzsilva
 */
public class Segmento {
    private String nome;
    private int qtProdutos;
    
    public Segmento(String nome){
        setNome(nome);
        setQtProdutos(1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtProdutos() {
        return qtProdutos;
    }

    public void setQtProdutos(int qtProdutos) {
        this.qtProdutos = qtProdutos;
    }
    
    public String toString() {
    	return getNome() + "\t\t\t" + getQtProdutos();
    }
}
