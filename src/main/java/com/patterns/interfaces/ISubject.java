package main.java.com.patterns.interfaces;

public interface ISubject {
	public void attach(IObserver observer);
	public void deattach(IObserver observer);
	public void notifyObservers();
}
