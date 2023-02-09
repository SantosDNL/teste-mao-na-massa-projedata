package teste.mao.na.massa.metodos;


import java.util.List;
import java.util.Scanner;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class RemoverFuncionario {
			
	public static void removeFuncionario (List<Funcionario> funcionarios){
		
		Scanner sc = new Scanner(System.in);
		String excluirFuncionario = sc.nextLine();
		boolean inexistente = true;
		
		if (excluirFuncionario == ""){			
			System.out.println("\nNenhum Funcionario foi Excluido!\n");
			
		}else{
			for (int i = 0; i < funcionarios.size(); i++){
				if(funcionarios.get(i).getNome().equalsIgnoreCase(excluirFuncionario)){
					if (funcionarios.get(i).getNome().equalsIgnoreCase(excluirFuncionario)){
						funcionarios.remove(i);
						System.out.println("\nO funcionario '" + excluirFuncionario + "' foi removido do sistema! Segue abaixo lista atualizada!");
						inexistente = false;
					}else {
						inexistente = true;
					}
				}
			}if(inexistente == true) {
				System.out.println("\nNao existe '"+ excluirFuncionario +"' na lista de funcionarios!");
			}else {
				ImprimirFuncionarios.imprimeFuncionarios(funcionarios);
			}
		}
	}
}
