package application;

import java.util.ArrayList;
import java.util.List;

/* 
 * padrão baseado em um Controller para gerenciamento da lista
 */

public class Vitrine {
	
	private static List<Produto> produtos = new ArrayList<Produto>();
	
	// MÉTODO ADICONAR VÁRIOS PRODUTOS OU UM
	public void addProdutos (Produto... ps) {
		for (Produto p : ps)
			produtos.add(p);
	}
	
	
	// MÉTODO PARA RETORNAR A LISTA DE PRODUTOS
	public List<Produto> getProduto(){
		return produtos;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}