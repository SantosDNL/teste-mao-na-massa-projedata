package teste.mao.na.massa.metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class SalariosMinimo {
	
	public void QuantidadeSalario(List<Funcionario> funcionarios) {
		
		System.out.println("\n\nAbaixo estao os funcionarios e quantos salarios minimos recebem aproximadamente:\n");
		BigDecimal salarioMinimo = new BigDecimal("1212");
		
		for (int i = 0; i < funcionarios.size(); i++) {			
			System.out.format(funcionarios.get(i).getNome() + " - " + funcionarios.get(i).getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP));
			System.out.println();
		}
		
	}

}
