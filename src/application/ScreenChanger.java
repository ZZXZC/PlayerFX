package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenChanger {
	private static Scene mainScene;
	
	public static void setScene(Scene m) {
		mainScene = m;
	}
	public static void changeTo(String s) throws IOException {
		Parent root = FXMLLoader.load(
			ScreenChanger.class.getResource(s)
		);
		mainScene.setRoot(root);
	}
}
