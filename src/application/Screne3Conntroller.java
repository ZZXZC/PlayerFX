package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Screne3Conntroller{
	@FXML
	AnchorPane pane3;
	@FXML
	VBox mainBox;
	@FXML
	ListView songList;
	@FXML
	HBox durationBar;
	@FXML
	HBox controlsBar;
	@FXML
	Label startDuration;
	@FXML
	Label endDuration;
	@FXML
	Button playButton;
	@FXML
	Button pauseButton;
	@FXML
	Button stopButton;
	@FXML
	Button backButton;
	@FXML
	Slider duration;
	@FXML
	Slider Volume;
	
	@FXML
	public void initialize() {
		
	}
	@FXML
	public void back() {
		try {
			ScreenChanger.changeTo("Scene2.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void play() {
		
	}
	public void pause() {
		
	}
	public void stop() {
		
	}
}
