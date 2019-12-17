package dad.javafx.calculadora.mvc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	// model

	private Calculadora calc = new Calculadora();

	// View

	@FXML
	private GridPane view;

	@FXML
	private TextField numerosText;

	@FXML
	private Button ceroButton;

	@FXML
	private Button unoButton;

	@FXML
	private Button dosButton;

	@FXML
	private Button tresButton;

	@FXML
	private Button cuatroButton;

	@FXML
	private Button cincoButton;

	@FXML
	private Button seisButton;

	@FXML
	private Button sieteButton;

	@FXML
	private Button ochoButton;

	@FXML
	private Button nueveButton;

	@FXML
	private Button sumaButton;

	@FXML
	private Button restaButton;

	@FXML
	private Button multiplicarButton;

	@FXML
	private Button dividirButton;

	@FXML
	private Button puntoButton;

	@FXML
	private Button igualButton;

	@FXML
	private Button borrarButton;

	@FXML
	private Button borrarTodoButton;

	public Controller() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		numerosText.textProperty().bind(calc.pantallaProperty());
	}

	@FXML
	private void onPuntoAction(ActionEvent event) {
		calc.insertarComa();
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onIgualAction(ActionEvent event) {
		calc.operar(Calculadora.IGUAL);
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onDividirAction(ActionEvent event) {
		calc.operar(Calculadora.DIVIDIR);
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onMultiplicarAction(ActionEvent event) {
		calc.operar(Calculadora.MULTIPLICAR);
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onRestaAction(ActionEvent event) {
		calc.operar(Calculadora.RESTAR);
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onSumaAction(ActionEvent event) {
		calc.operar(Calculadora.SUMAR);
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onBorrarTodoAction(ActionEvent event) {
		calc.borrarTodo();
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onBorrarAction(ActionEvent event) {
		calc.borrar();
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onNueveAction(ActionEvent event) {
		calc.insertar('9');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onOchoAction(ActionEvent event) {
		calc.insertar('8');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onSieteAction(ActionEvent event) {
		calc.insertar('7');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onSeisAction(ActionEvent event) {
		calc.insertar('6');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onCincoAction(ActionEvent event) {
		calc.insertar('5');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onCuatroAction(ActionEvent event) {
		calc.insertar('4');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onTresAction(ActionEvent event) {
		calc.insertar('3');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onDosAction(ActionEvent event) {
		calc.insertar('2');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onUnoAction(ActionEvent event) {
		calc.insertar('1');
		this.numerosText.setText(calc.getPantalla());
	}

	@FXML
	private void onCeroAction(ActionEvent event) {
		calc.insertar('0');
		this.numerosText.setText(calc.getPantalla());
	}

	public GridPane getView() {
		return view;
	}

}
