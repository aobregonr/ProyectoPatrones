package main.java.com.patterns.interfaces;

import java.util.Date;

import main.java.com.patterns.entity.PermissionType;

public interface IPermissionFactory {
	public IPermission NewPermission(
			PermissionType _type,
			int _qDays,
			boolean _payment,
			Date _startDate,
			String _comment,
			String _medicDoc);
}
