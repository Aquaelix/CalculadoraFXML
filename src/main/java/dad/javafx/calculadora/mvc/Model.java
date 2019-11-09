package dad.javafx.calculadora.mvc;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Model {

	private DoubleProperty nuevo = new SimpleDoubleProperty();
	
	private DoubleProperty actual = new SimpleDoubleProperty();

	public final DoubleProperty nuevoProperty() {
		return this.nuevo;
	}
	

	public final double getNuevo() {
		return this.nuevoProperty().get();
	}
	

	public final void setNuevo(final double nuevo) {
		this.nuevoProperty().set(nuevo);
	}
	

	public final DoubleProperty actualProperty() {
		return this.actual;
	}
	

	public final double getActual() {
		return this.actualProperty().get();
	}
	

	public final void setActual(final double actual) {
		this.actualProperty().set(actual);
	}
	
}
