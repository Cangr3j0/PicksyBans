package application;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class Alerta {

	
	public static void mostrarAlerta(String msg) {
		Stage ventana=new Stage();
		ventana.initModality(Modality.WINDOW_MODAL);
		ventana.setTitle("Error");
		ventana.setMinWidth(250);
		
		Label label=new Label();
		label.setText(msg);
		Button cerrar=new Button("Cerrar");
		cerrar.setOnAction(e -> ventana.close());
		VBox layout=new VBox(10);
		layout.getChildren().addAll(label,cerrar);
		layout.setAlignment(Pos.CENTER);
		
		Scene escena=new Scene(layout);
		ventana.setScene(escena);
		ventana.showAndWait();
		
	}
}
