package main.java.com.patterns.entity;

public class Report{
	private int id;
	private int permisoId;
	private int teamId;
	private int hours;
	
	public Report () {
		
	}
	
	public Report(int id, int permisoId, int teamId, int hours) {
		super();
		this.id = id;
		this.permisoId = permisoId;
		this.teamId = teamId;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPermisoId() {
		return permisoId;
	}

	public void setPermisoId(int permisoId) {
		this.permisoId = permisoId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
}