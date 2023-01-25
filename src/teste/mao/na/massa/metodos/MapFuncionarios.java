package teste.mao.na.massa.metodos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import teste.mao.na.massa.pessoa.funcionario.Funcionario;

public class MapFuncionarios {

	public void criarMap(List<Funcionario> funcionarios) {
		HashMap<String, ArrayList<String>> mapFuncoes = new HashMap<String, ArrayList<String>>();

		for (Funcionario funcionario : funcionarios) {
			if (mapFuncoes.containsKey(funcionario.getFuncao())) {
				mapFuncoes.get(funcionario.getFuncao()).add(funcionario.getNome());
			} else {
				mapFuncoes.put(funcionario.getFuncao(), new ArrayList<String>());
				mapFuncoes.get(funcionario.getFuncao()).add(funcionario.getNome());
			}
		}
		for (Entry<String, ArrayList<String>> entry : mapFuncoes.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
