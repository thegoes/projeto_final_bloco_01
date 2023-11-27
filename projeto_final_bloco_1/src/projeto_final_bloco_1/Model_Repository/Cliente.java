package projeto_final_bloco_1;

public class Cliente {
    private String nome;
    private int idade;
    private String cidadeOrigem;
    private String rg;
    private String dataViagem;
	public Cliente(String nome, int idade, String cidadeOrigem, String rg, String dataViagem) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidadeOrigem = cidadeOrigem;
		this.rg = rg;
		this.dataViagem = dataViagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}
	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataViagem() {
		return dataViagem;
	}
	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}

