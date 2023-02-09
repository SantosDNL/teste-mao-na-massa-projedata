package teste.mao.na.massa.metodos;

import java.util.Collections;
import java.util.List;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class OrdemAlfabetica {

	public static void ordenaAlfabetica(List<Funcionario> funcionarios) {
		
		Collections.sort(funcionarios);
		
		System.out.println("\nSegue abaixo lista dos funcionarios por ordem alfabetica: ");
		
		ImprimirFuncionarios.imprimeFuncionarios(funcionarios);
		
	}
	
}
