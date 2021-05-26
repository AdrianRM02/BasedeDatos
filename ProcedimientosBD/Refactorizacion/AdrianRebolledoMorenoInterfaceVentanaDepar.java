import java.awt.event.ActionEvent;

public interface InterfaceVentanaDepart {

	/****************************************************************/ //Extraccion de la interface en la clase VentanaDepart.java

	int modifdepart(ActionEvent e, String existedepart, String depar_error, String prueba);

	int borradepart(ActionEvent e, String existedepart, String depar_error, String prueba);

	int consuldepart(ActionEvent e, String existedepart, String depar_error, String prueba);

	int altadepart(ActionEvent e, String existedepart, String prueba);

}