package main.java.com.patterns.entity;

public class Proyect{
	private int id;
	private String nameProyect;
	private int teamAsing;
	private String description;
	
	public Proyect() {
		
	}
	
	public Proyect(int id, String nameProyect, int teamAsing, String description) {
		super();
		this.id = id;
		this.nameProyect = nameProyect;
		this.teamAsing = teamAsing;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameProyect() {
		return nameProyect;
	}

	public void setNameProyect(String nameProyect) {
		this.nameProyect = nameProyect;
	}

	public int getTeamAsing() {
		return teamAsing;
	}

	public void setTeamAsing(int teamAsing) {
		this.teamAsing = teamAsing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}