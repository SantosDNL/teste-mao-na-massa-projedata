package teste.mao.na.massa.metodos;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class ImprimirFuncionarios {
	
	public static void imprimeFuncionarios(List<Funcionario> funcionarios) {
		
		System.out.printf("\n%10s %15s %10s %15s", "Nome:", "Nascimento:", "Salario:", "Funcao:");
		System.out.println();
		for (Funcionario funcionario : funcionarios) {
			NumberFormat nf = NumberFormat.getInstance();
			String salarioFormatado = nf.format(funcionario.getSalario());
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataFormatada = LocalDate.parse(funcionario.getDataInput(), formatador);
			System.out.format("%10s %15s %10s %15s", funcionario.getNome(), formatador.format(dataFormatada),
					salarioFormatado, funcionario.getFuncao());
			System.out.println();
		}
	}
}
