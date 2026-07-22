package application;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppData {
	private static AppData instance = new AppData();
	public static AppData getInstance() {
		return instance;
	}
	
	//nigga book
	private XSSFWorkbook workbook;
	public XSSFWorkbook getWorkbook() {
		return workbook;
	}
	public void setWorkbook(XSSFWorkbook w) {
		this.workbook = w;
	}
	
	//nigga sheet
	private String nameOfSheet;
	public String getNameOfSheet() {
		return nameOfSheet;
	}
	public void setNameOfSheet(String s) {
		this.nameOfSheet = s;
	}
	
	// nigga song selected
	private Song selectedSong;
	public Song getSelectedSong() {
		return selectedSong;
	}
	public void setSelectedSong(Song s) {
		this.selectedSong = s;
	}
	
	//nigga song list
	private ObservableList<Song> songs = FXCollections.observableArrayList();
	public ObservableList<Song> getSongList(){
		return songs;
	}
	public void setSongList(ObservableList<Song> s) {
		this.songs = s;
	}
}
