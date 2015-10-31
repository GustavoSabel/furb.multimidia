package Polinomio;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class Polinomio implements Base {
	/**
	 * Variáveis que estão no polinômio utilizado para calcular o polinômio
	 * Antes de executar o calculo, deve-se atribuir um valor para cada vari�vel
	 * do dicion�rio
	 */
	public static HashMap<Character, Integer> Variaveis;
	private ArrayList<Expressao> expressoes;
	private Expressao ultimaExpressao;

	public Polinomio() {
		expressoes = new ArrayList<Expressao>();
		Polinomio.Variaveis = new HashMap<>();
	}

	public void addExpressao(Expressao expressao) {
		this.ultimaExpressao = expressao;
		expressao.setOrigem(this);
		this.expressoes.add(expressao);
	}

	public ArrayList<Expressao> getExpressoes() {
		return expressoes;
	}

	public Expressao getUltimaExpressao() {
		return ultimaExpressao;
	}

	@Override
	public void setOrigem(Base origem) {
		//Não deve ter origem
	}
	
	@Override
	public Base getOrigem() {
		return null;
	}

	/**
	 * Resolve o poln�mio com base nos valores da propriedade <b>variaveis</b>
	 */
	@Override
	public double calcular() {
		double result = 0;
		for (Expressao expressao : expressoes) {
			result += expressao.calcular();
		}
		return result;
	}

}