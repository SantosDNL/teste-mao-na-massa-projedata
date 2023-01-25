package teste.mao.na.massa.pessoa;


public class Pessoa{
	
	protected String nome;
	protected String dataInput;

	public Pessoa(String nome, String dataInput){
        this.nome = nome;
        this.dataInput = dataInput;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataInput() {
		return dataInput;
	}

	public void setDataInput(String dataInput) {
		this.dataInput = dataInput;
	}
	
	

}
