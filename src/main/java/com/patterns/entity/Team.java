package main.java.com.patterns.entity;

public class Team{
	private int id;
	private String name;
	private int proyectId;
	private String description;
	private int userId;
	
	public Team() {
		
	}

	public Team(int id, String name){
		super();
		this.id = id;
		this.name = name;
	}
	
	public Team(int id, String name, int proyectId, String description, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.proyectId = proyectId;
		this.description = description;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProyectId() {
		return proyectId;
	}
	public void setProyectId(int proyectId) {
		this.proyectId = proyectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}