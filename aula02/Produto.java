/**
 *
 * @author thzsilva
 */
public class Produto {
    private String nome;
    private Segmento segmento;
    
    public Produto(String nome, Segmento segmento){
        setNome(nome);
        setSegmento(segmento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }
    
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Segmento: " + getSegmento().getNome();
    }
}
