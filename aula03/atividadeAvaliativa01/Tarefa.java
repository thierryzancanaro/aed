
public class Tarefa {
	private String identificacao;
	private String descricao;
	
	public Tarefa(String identificacao) {
		setIdentificacao(identificacao);
		setDescricao("Tarefa sem descrição");
	}
	
	public Tarefa(String identificacao, String descricao) {
		setIdentificacao(identificacao);
		setDescricao(descricao);
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return getIdentificacao() + "\nDescrição: " + getDescricao();
	}
}
