
public class Aluno {
	private String nome;
	private boolean aprovado;
	
	public Aluno(String nome, boolean aprovado) {
		setNome(nome);
		setAprovado(aprovado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public String toString() {
		String str = "Aluno: " + getNome() + "\nSituação: ";
		
		if (isAprovado()) {
			str += "Aprovado";
		} else {
			str += "Reprovado";
		}
		
		return str;
	}
}
