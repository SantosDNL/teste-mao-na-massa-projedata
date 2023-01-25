package teste.mao.na.massa.pessoa.funcionario;

import java.math.BigDecimal;

import teste.mao.na.massa.pessoa.Pessoa;

public class Funcionario extends Pessoa implements Comparable<Funcionario>{
	
	protected String funcao;
	protected BigDecimal salario = new BigDecimal("0");
	
	public Funcionario(String nome, String dataInput, BigDecimal salario, String funcao) {
		super(nome, dataInput); 
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario outroFuncionario) {
		int comp = nome.compareTo(outroFuncionario.getNome());
		if (comp < 0) { 
			  return -1; 
		} if (comp > 0) { 
			  return 1; 
			} 
			  return 0; 
	}
}
