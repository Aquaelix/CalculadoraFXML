package dad.javafx.calculadora.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new Controller();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
