package main.java.com.patterns.interfaces;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import main.java.com.patterns.entity.PermissionStatus;
import main.java.com.patterns.entity.PermissionType;
import main.java.com.patterns.entity.Person;

public abstract class IPermission implements IDataAccess<IPermission> {
	private int ID;
	private PermissionType Type;
	private int QuantityDays;
	private boolean Payment;
	private PermissionStatus Status;
	private Date StartDate;
	private String Comment;
	private String DocumentMedical;
	private Person _person;
	
	protected final String TNAME = "permission";
	
	public IPermission() {
		super();
	}
	
	public abstract boolean Create() throws SQLException;
	
	public abstract List<IPermission> GetAll() throws SQLException;
	
	public abstract boolean Delete() throws SQLException;
	
	public abstract boolean Update() throws SQLException;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public PermissionType getType() {
		return Type;
	}
	public void setType(PermissionType type) {
		Type = type;
	}
	public int getQuantityDays() {
		return QuantityDays;
	}
	public void setQuantityDays(int quantityDays) {
		QuantityDays = quantityDays;
	}
	public boolean isPayment() {
		return Payment;
	}
	public void setPayment(boolean payment) {
		Payment = payment;
	}
	public PermissionStatus getStatus() {
		return Status;
	}
	public void setStatus(PermissionStatus status) {
		Status = status;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getDocumentMedical() {
		return DocumentMedical;
	}
	public void setDocumentMedical(String documentMedical) {
		DocumentMedical = documentMedical;
	}
	public Person get_person() {
		return _person;
	}
	public void set_person(Person _person) {
		this._person = _person;
	}
	
	
}
