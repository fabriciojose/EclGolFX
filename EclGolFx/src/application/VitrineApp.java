package application;

import java.awt.TextField;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineApp extends Application {
	
	@Override
	public void start (Stage stage) throws Exception {
		
	}

	// CLASSE INTERNA À CLASSE START PARA OS ITENS DA TABELA
	public class ItensProperty {
		
		private SimpleStringProperty produto;
		private SimpleDoubleProperty preco;
		
		//construtor da classe ItensProperty()
		public ItensProperty (String produto, double preco) {
			this.produto = new SimpleStringProperty(produto);
			this.preco = new SimpleDoubleProperty(preco);
			
		}
	
	private AnchorPane pane;
	private TextField txtPesquisa;
	private TableView<ItensProperty> tblVitrine;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double>	columnPreco;
	private static ObservableList<ItensProperty> listItens = FXCollections
			.observableArrayList();
	
	
	// GETTERS E SETTERS
	public String getProduto() {
		return produto.get();
		
	}
	public void setProduto(String produto) {
		this.produto.set(produto);
	}
	
	public double getPreco() {
		return preco.get();
	}
	
	public void setPreco(double preco) {
		this.preco.set(preco);
	}

	} // class itens property
	
	
	// MÉTODO PRINCIPAL
	public static void main(String[] args) {
		launch (args);

	}

}
