package teste.mao.na.massa.metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class AumentarSalario {
	
	public void AumentaSalario(List<Funcionario> funcionarios) {
		
		for (int i = 0; i < funcionarios.size(); i++) {
			BigDecimal multiplicar = new BigDecimal("1.1");
			BigDecimal salarioAumentado  = funcionarios.get(i).getSalario().multiply(multiplicar).setScale(2, RoundingMode.HALF_EVEN);
			funcionarios.get(i).setSalario(salarioAumentado);
		}
		
		ImprimirFuncionarios imprimirFuncionarios =  new ImprimirFuncionarios();
		
		imprimirFuncionarios.imprimeFuncionarios(funcionarios);		
	}

}
