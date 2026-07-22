package application;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class Scene2Controller {
	@FXML
	private AnchorPane Pane2;
	@FXML
	private ListView<String> sheetList;
	@FXML
	private Button next;
	@FXML
	private Button back;
	
	@FXML
	public void initialize() {
		XSSFWorkbook w = AppData.getInstance().getWorkbook();
		for(int i =0 ; i<w.getNumberOfSheets();i++) {
			sheetList.getItems().add(w.getSheetName(i));
		}
	}
	
	@FXML
	public void next() {
		System.out.println("next pressed");
		String s = sheetList.getSelectionModel().getSelectedItem();
		if(s!=null) {
			AppData.getInstance().setNameOfSheet(s);
			try {
				ScreenChanger.changeTo("Scene3.fxml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@FXML
	public void back() {
		try {
			ScreenChanger.changeTo("Main.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
