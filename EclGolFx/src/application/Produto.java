package application;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

/*
 * Classe para armazenar os produtos
 */

public class Produto extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		
	}
	
	// VARIÁVEIS
	private SimpleStringProperty produto;
	private SimpleDoubleProperty preco;
	
	
	// CONSTRUTOR
	public Produto(String produto, double preco) {
		this.produto = new SimpleStringProperty (produto);
		this.preco = new SimpleDoubleProperty (preco);
		
	}
	
	
	// GETTERS E SETTERS
	public String getProduto() {
		return produto.get();
		
	}
	public void setProduto(String produto) {
		this.produto.set(produto);
	}
	
	public double getPreco () {
		return preco.get();
	}
	public void setPreco(double preco) {
		this.preco.set(preco);
	}
	
	
	// MÉTODO PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
		
	

}
