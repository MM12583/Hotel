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
				System.out.println("請輸入數字") ;
			}catch(ArithmeticException var2){
				System.out.println("請輸入 0 或 正整數") ;
			}
			
		}while(continueInput) ;
		
		Gordon.addMenu() ;
		imformation(Gordon) ;
	}
	
	
	public static void imformation(Features oFeatures){
		System.out.println("---------------------");
		System.out.println("店名" + ((Restaurant)oFeatures).getRestaurantName()) ;
		System.out.println("目前有 " + ((Restaurant)oFeatures).getCurrentPeople() + "名賓客") ;
		System.out.println(((Restaurant)oFeatures).getMenu()) ;
	}
	
}
