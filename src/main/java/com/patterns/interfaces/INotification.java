package main.java.com.patterns.interfaces;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import main.java.com.patterns.entity.Employee;
import main.java.com.patterns.entity.NotificationStatus;
import main.java.com.patterns.entity.Person;

public abstract class INotification implements IDataAccess {
	private int ID;
	private String Title;
	private String Subject;
	private String Content;
	private Date ReciveDate;
	private Person Receiver;
	private NotificationStatus Status;
	private Employee Employee;
	
	public abstract boolean CreateNotification() throws SQLException;

	public abstract List<INotification> GetAllNotifications();
	
	public abstract void UpdateReadedNotification();
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Date getReciveDate() {
		return ReciveDate;
	}
	public void setReciveDate(Date reciveDate) {
		ReciveDate = reciveDate;
	}
	public Person getReceiver() {
		return Receiver;
	}
	public void setReceiver(Person receiver) {
		Receiver = receiver;
	}
	protected NotificationStatus getStatus() {
		return Status;
	}
	protected void setStatus(NotificationStatus status) {
		Status = status;
	}
	
}
