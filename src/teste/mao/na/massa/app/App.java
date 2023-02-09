package teste.mao.na.massa.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import teste.mao.na.massa.metodos.Aniversario;
import teste.mao.na.massa.metodos.AumentarSalario;
import teste.mao.na.massa.metodos.ImprimirFuncionarios;
import teste.mao.na.massa.metodos.MaisVelho;
import teste.mao.na.massa.metodos.MapFuncionarios;
import teste.mao.na.massa.metodos.OrdemAlfabetica;
import teste.mao.na.massa.metodos.RemoverFuncionario;
import teste.mao.na.massa.metodos.SalariosMinimo;
import teste.mao.na.massa.metodos.TotalSalario;
import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class App {

	static Scanner sc = new Scanner(System.in);

	public static void menu() {

		System.out.println("\nEscolha a opcao de acordo com o numero (INSERIR SOMENTE NUMEROS)\n");
		System.out.println(" 1 - Remover um funcionario da lista");
		System.out.println(" 2 - Imprimir todos os funcionarios com todas suas informacoes, sendo que:"
						+ "\n   - data deve ser exibido no formato dd/mm/aaaa"
						+ "\n   - valor numerico deve ser exibida no formatado com separador de milhar como ponto e decimal como virgula");
		System.out.println(" 3 - Os funcionarios receberam 10% de aumento de salario, atualizar a lista de funcionarios com novo valor");
		System.out.println(" 4 - Agrupar e imprimir os funcionarios por funcao em um MAP, sendo a chave a 'funcao' e o valor a 'lista de funcionarios'.");
		System.out.println(" 5 - Imprimir os funcionarios que fazem aniversario no mes 10 e 12");
		System.out.println(" 6 - Imprimir o funcionario com a maior idade, exibir os atributos: nome e idade");
		System.out.println(" 7 - Imprimir a lista de funcionarios por ordem alfabetica");
		System.out.println(" 8 - Imprimir o total dos salarios dos funcionarios");
		System.out.println(
				" 9 - Imprimir quantos salarios minimos ganha cada funcionario, considerando que o salario minimo eh R$1212.00\n\n");
	}

	public static void main(String[] args) {

//3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.

		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new Funcionario("Maria", "18/01/2000", new BigDecimal("2009.44"), "Operadora"));
		funcionarios.add(new Funcionario("Joao", "12/05/1990", new BigDecimal("2284.38"), "Operadora"));
		funcionarios.add(new Funcionario("Caio", "02/05/1961", new BigDecimal("9836.14"), "Coordenador"));
		funcionarios.add(new Funcionario("Miguel", "14/10/1988", new BigDecimal("19119.88"), "Diretor"));
		funcionarios.add(new Funcionario("Alice", "05/01/1995", new BigDecimal("2234.68"), "Recepcionista"));
		funcionarios.add(new Funcionario("Heitor", "19/11/1999", new BigDecimal("1582.72"), "Operadora"));
		funcionarios.add(new Funcionario("Arthur", "31/03/1993", new BigDecimal("4071.84"), "Contador"));
		funcionarios.add(new Funcionario("Laura", "08/07/1994", new BigDecimal("3017.45"), "Gerente"));
		funcionarios.add(new Funcionario("Heloisa", "24/05/2003", new BigDecimal("1606.85"), "Eletricista"));
		funcionarios.add(new Funcionario("Helena", "02/09/1996", new BigDecimal("2799.93"), "Gerente"));

		ImprimirFuncionarios.imprimeFuncionarios(funcionarios);
		
		menu();
		int escolha = sc.nextInt();

		while (true) {

			switch (escolha) {
			case 1:
//3.2 – Remover o funcionário “João” da lista.

				System.out.println(
						"\nDigite o nome do Funcionario que deseja excluir, caso nao queira, basta apertar a tecla ENTER: \n");
				
				RemoverFuncionario.removeFuncionario(funcionarios);

				System.out.println();

				break;

			case 2:
//3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
//			      • informação de data deve ser exibido no formato dd/mm/aaaa;
//			      • informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.				

				System.out.println();
				
				ImprimirFuncionarios.imprimeFuncionarios(funcionarios);

				System.out.println();

				break;

			case 3:
//3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.					

				System.out.println(
						"\n\nHouve um aumento de 10% no salario de todos os funcionarios, segue tabela atualizada!");

				AumentarSalario.AumentaSalario(funcionarios);

				break;

			case 4:
//3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
//3.6 – Imprimir os funcionários, agrupados por função.

				System.out.println("\nSegue abaixo lista dos funcionarios agrupados por funcao: \n");
				
				MapFuncionarios.criarMap(funcionarios);
				
				break;

			case 5:
//3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
				
				Aniversario.verificaAniversario(funcionarios);

				break;

			case 6:
//3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
				
				MaisVelho.verificaMaisVelho(funcionarios);

				break;

			case 7:
//3.10 – Imprimir a lista de funcionários por ordem alfabética.
				
				OrdemAlfabetica.ordenaAlfabetica(funcionarios);

				break;

			case 8:
//3.11 – Imprimir o total dos salários dos funcionários.
				
				TotalSalario.somarSalarios(funcionarios);

				break;

			case 9:
//3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
				
				SalariosMinimo.QuantidadeSalario(funcionarios);

				break;

			default:
				System.out.println("\nVoce digitou uma opcao errada, favor tentar novamente!\n");
				break;
			}
			System.out.println("\nDigite 'sair' para encerrar o programa, ou digite qualquer tecla para voltar o menu principal:\n");

			String decisao = sc.next();

			if (decisao.equalsIgnoreCase("sair")) {
				System.out.println("\nPrograma encerrado!");
				break;
			} else {
				menu();
				escolha = sc.nextInt();
			}
		}
	}
}
