package facility;

import java.util.InputMismatchException;

public interface Features{
	
	// �d��
	public abstract int getCurrentPeople() ;
	
	// �@��
	public abstract String inputString() ;
	public abstract int inputInt() throws InputMismatchException ; 
	public abstract int plusPeople() ;
	public abstract int minusPeople() ;
	

}
