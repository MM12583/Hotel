package facility;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Features{
	
	// ¬d¸ß
	public abstract int getCurrentPeople() ;
		
	// ¤@¯ë
	public abstract String inputString() ;
	public abstract int inputInt() throws InputMismatchException ;
	public abstract Scanner input() ;
	public abstract int AdjustOfPeople() ;

}
