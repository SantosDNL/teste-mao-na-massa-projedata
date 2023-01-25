package teste.mao.na.massa.metodos;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class Aniversario {
	public void verificaAniversario(List<Funcionario> funcionarios) {
		
		System.out.println("\nOs funcionarios que fazem aniversario nos meses 10(Outubro) e/ou 12(Dezembro), sao:\n");
		System.out.printf("%10s %15s %10s %15s", "Nome:", "Nascimento:", "Salario:", "Funcao:");
		System.out.println();
		for (Funcionario funcionario : funcionarios) {
			NumberFormat nf = NumberFormat.getInstance();
			String salarioFormatado = nf.format(funcionario.getSalario());
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataFormatada = LocalDate.parse(funcionario.getDataInput(), formatador);			
			
			if (dataFormatada.getMonthValue() == 10 || dataFormatada.getMonthValue() == 12) {
				System.out.format("%10s %15s %10s %15s", funcionario.getNome(), formatador.format(dataFormatada),
						salarioFormatado, funcionario.getFuncao());
				System.out.println();
			}
		}
	}
}
