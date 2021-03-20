package facility;

import java.util.InputMismatchException ; 

public class SystemTest{

	public static void main(String[] args){
		Restaurant Gordon = new Restaurant() ;
		boolean continueInput = true ;
		
		do{
			try{
				Gordon.AdjustOfPeople() ;
				continueInput = false ;
			}catch (InputMismatchException var1){
				System.out.println("�п�J�Ʀr") ;
			}catch(ArithmeticException var2){
				System.out.println("�п�J 0 �� �����") ;
			}
			
		}while(continueInput) ;
		
		Gordon.addMenu() ;
		imformation(Gordon) ;
	}
	
	
	public static void imformation(Features oFeatures){
		System.out.println("---------------------");
		System.out.println("���W" + ((Restaurant)oFeatures).getRestaurantName()) ;
		System.out.println("�ثe�� " + ((Restaurant)oFeatures).getCurrentPeople() + "�W����") ;
		System.out.println(((Restaurant)oFeatures).getMenu()) ;
	}
	
}
