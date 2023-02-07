package lista1respostas.exerciciosdeclasse;

public class Pessoa {
	private String cpf;
	private int idade;
	private String nome;
	private String sexo;
	private float peso;
	private float altura;
	private float imc;
	
	
	public Pessoa(String cpf, int idade, String nome, String sexo, float peso, float altura, float imc ) {
		super();
		this.setCpf(cpf);
		this.setAltura(altura);
		this.setIdade(idade);
		this.setImc(imc);
		this.setNome(nome);
		this.setPeso(peso);
		this.setSexo(sexo);
	}
	
	public String toString() {
		return "cpf = "+ cpf + ",nome = " + nome + ",altura = " + altura +
				", idade = " + idade + ",imc = " + imc + ",peso = " + peso 
				+ ",sexo = " +sexo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getImc() {
		return imc;
	}


	public void setImc(float imc) {
		this.imc = imc;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}
}
