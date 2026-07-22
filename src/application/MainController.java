package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private AnchorPane rootPane;
	@FXML
	private VBox mainVbox;
	@FXML
	private Button browseButton;
	@FXML
	private StackPane dropOff;
	
	@FXML
	private Label dragtext;
	
	File ball;
	
	boolean error = false;

	
	@FXML
	public void browse() {
		FileChooser fileNigga = new FileChooser();
		fileNigga.setTitle("Choose a Excel file");
		fileNigga.getExtensionFilters().add(
				new FileChooser.ExtensionFilter("Excel file","*.xlsx")
		);
		ball = fileNigga.showOpenDialog(rootPane.getScene().getWindow());
		if (ball != null) {
		    System.out.println("EXCEL FILE YES");
		    changeScene2();
		} 
		else {
		    System.out.println("no nigga");
		}
		
	}
	
	@FXML
	public void dragOver(javafx.scene.input.DragEvent event) {
		error = false;
		if(event.getGestureSource() != dropOff && event.getDragboard().hasFiles()) {
			dragtext.setStyle("-fx-background-color: #283857");
			event.acceptTransferModes(TransferMode.COPY);
		}
		event.consume();
	}
	@FXML
	public void dragExited(javafx.scene.input.DragEvent event) {
		if(!error) {
			dragtext.setStyle("-fx-background-color: #161f30");
		}
		event.consume();
	}
	@FXML
	public void dragDropped(javafx.scene.input.DragEvent event) {
		
		
		Dragboard db = event.getDragboard();
		boolean success = false;
			
		if(db.hasFiles()) {
			ball = db.getFiles().get(0);
			if(ball.getName().endsWith(".xlsx")) {
				success = true;
				System.out.println("true file");
				changeScene2();
			}
			else {
				System.out.println("false file");
				dragtext.setStyle("-fx-background-color: #572828");
				error =true;
			}
		}
		event.setDropCompleted(success);
		event.consume();
	}
	public void changeScene2() {
		try {
			XSSFWorkbook w = new XSSFWorkbook(ball);
			AppData.getInstance().setWorkbook(w);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ScreenChanger.changeTo("Scene2.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*public void loader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(ball);
	}
	*/
}
