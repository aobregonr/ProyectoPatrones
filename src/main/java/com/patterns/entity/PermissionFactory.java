package main.java.com.patterns.entity;

import java.util.ArrayList;
import java.util.Date;

import main.java.com.patterns.interfaces.IObserver;
import main.java.com.patterns.interfaces.IPermission;
import main.java.com.patterns.interfaces.IPermissionFactory;
import main.java.com.patterns.interfaces.ISubject;

public class PermissionFactory implements IPermissionFactory, ISubject{
	private static ArrayList<IObserver> _obs = new ArrayList<IObserver>();
	private IPermission perm;
	
	public PermissionFactory() {
		super();
		// add observers 
		this.attach(new EmployeeToAdmin());
		this.attach(new EmployeeToSupervisor());
	}

	@Override
	public IPermission NewPermission(PermissionType _type, int _qDays, Date _startDate,
			String _comment, String _medicDoc) {
		
		try {
			switch(_type) {
				case INCAPACITY:
					perm = new Incapacity();
					break;
				case VACATION:
					perm = new Vacation();
					break;
				case MIDDAY:
					perm = new Midday();
					break;
				case WITHSALARY:
					perm = new WithSalary();
					break;
				case WITHOUTSALARY:
					perm = new WithoutSalary();
					break;
				default:
					throw new Exception("Invalid Permission type!!");
			}
			perm.setQuantityDays(_qDays);
			perm.setStatus(PermissionStatus.PENDING);
			perm.setStartDate(_startDate);
			perm.setComment(_comment);
			perm.setDocumentMedical(_medicDoc);
			perm.Create();
			
			this.notifyObservers();
			
		}catch(Exception ex) {
			
		}
		return null;
	}

	@Override
	public void attach(IObserver observer) {
		_obs.add(observer);
	}
	

	@Override
	public void deattach(IObserver observer) {
		_obs.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(IObserver iObs : _obs) {
			iObs.update(perm);
		}
	}

}
