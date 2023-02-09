package teste.mao.na.massa.metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class TotalSalario {
	
	public static void somarSalarios(List<Funcionario> funcionarios) {
		
		BigDecimal totalSalario = new BigDecimal("0");
		for (Funcionario funcionario : funcionarios) {			
			totalSalario = funcionario.getSalario().add(totalSalario).setScale(2, RoundingMode.HALF_EVEN);
		}
		NumberFormat nf = NumberFormat.getInstance();
		String salarioFormatado = nf.format(totalSalario);		
		System.out.println("\n\nO total do salario de todos os funcionarios eh de: " + salarioFormatado);
		//esse salário taambém é aplicado a partir do aumento de 10%, caso solicitado
		
	}

}
