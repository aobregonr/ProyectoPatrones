package test.java.com.patrones;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;

import main.java.com.patterns.entity.Person;
import main.java.com.patterns.entity.ReadNotification;
import main.java.com.patterns.entity.UnreadNotification;
import main.java.com.patterns.interfaces.INotification;
public class NotificationTest {
	public Person globalUser;
	public int count;
	
	@Test
	public void CreateNotificationUnread() throws SQLException {
		globalUser = new Person();
		globalUser.setId(6);
		
		UnreadNotification obj = new UnreadNotification();
		obj.setTitle("Message");
		obj.setSubject("Subject");
		obj.setContent("Lorem inpsum");
		obj.setReciveDate(new Date());
		obj.setReceiver(globalUser);
		
		assertFalse(obj.CreateNotification());
	}
	
	@Test
	public void CreateNotificationRead() throws SQLException {
		globalUser = new Person();
		globalUser.setId(4);
		
		ReadNotification obj = new ReadNotification();
		obj.setTitle("Message");
		obj.setSubject("Subject");
		obj.setContent("Lorem inpsum");
		obj.setReciveDate(new Date());
		obj.setReceiver(globalUser);
		
		assertFalse(obj.CreateNotification());
	}
	
	@Test
	public void GetNotificationUnread() {
		globalUser = new Person();
		globalUser.setId(4);
		
		UnreadNotification obj = new UnreadNotification();
		obj.setReceiver(globalUser);
		
		List<INotification> list = obj.GetAllNotifications();
		
		assertTrue(list.size()>1);
	}
	
	@Test
	public void GetNotificationRead() {
		globalUser = new Person();
		globalUser.setId(4);
		
		UnreadNotification obj = new UnreadNotification();
		obj.setReceiver(globalUser);
		
		List<INotification> list = obj.GetAllNotifications();
		assertTrue(list.size()>1);
	}

}
