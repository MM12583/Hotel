package facility;

import java.util.InputMismatchException;

public interface Features{
	
	// ¬d¸ß
	public abstract int getCurrentPeople() ;
	
	// ¤@¯ë
	public abstract String inputString() ;
	public abstract int inputInt() throws InputMismatchException ; 
	public abstract int plusPeople() ;
	public abstract int minusPeople() ;
	

}
