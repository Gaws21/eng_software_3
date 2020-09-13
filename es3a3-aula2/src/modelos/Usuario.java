package modelos;


public class Usuario {
	private String nome;
	private Integer idade;
	private String cpf;
	
	public Usuario(String nome, Integer idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return nome + ", " + cpf + ", " + idade;
	}
	
}
