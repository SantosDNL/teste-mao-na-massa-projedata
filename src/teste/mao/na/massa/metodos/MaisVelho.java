package teste.mao.na.massa.metodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class MaisVelho {
	
	public static void verificaMaisVelho (List<Funcionario> funcionarios) {
		
		int maiorIdade  = 0;
		String pessoaMaisVelha = "";
		for (int i = 0; i < funcionarios.size(); i++) {
			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataFormatada = LocalDate.parse(funcionarios.get(i).getDataInput(), formatador);
			
			int aux = Period.between(dataFormatada, LocalDate.now()).getYears();
			
			if (maiorIdade < aux){				
				maiorIdade = aux;
				pessoaMaisVelha = funcionarios.get(i).getNome();
			}			
		}	
		System.out.println("\nA pessoa mais velha eh " + pessoaMaisVelha + ", com " + maiorIdade + " anos de idade!");
		System.out.println();
	}

}
