package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage pStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		Image icon = new Image("poo.png");
		pStage.getIcons().add(icon);
		pStage.setTitle("PlayerFX");
		pStage.setResizable(false);
		//pStage.initStyle(StageStyle.UNDECORATED);
		//scene.setFill(Color.DARKGRAY);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		ScreenChanger.setScene(scene);
		pStage.setScene(scene);
		pStage.show();
	}
}
