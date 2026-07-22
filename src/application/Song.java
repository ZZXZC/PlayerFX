package application;

public class Song {
	private String name;
	private String link;
	private String end;
	private String start;
	
	public Song(String name, String link , String end , String start ) {
		this.name = name;
		this.end = end;
		this.link = link;
		this.start = start;
	}
	
	public String getName() {
		return name;
	}
	public String getLink() {
		return link;
	}
	public String getEnd() {
		return end;
	}
	public String getStart() {
		return start;
	}
}
