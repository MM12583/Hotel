package facility;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant implements Features{
	
	String restaurantName ;
	String[] menu = {"龍蝦", "牛排", "紅酒"} ;
	int numOfPeople = 0 ;
	
	Restaurant(){
		System.out.print("請輸入店名 : ") ;
		restaurantName = inputString() ;
	}
	
	String[] addMenu(){
		System.out.print("請輸入增加菜色 : ") ;
		String[]newMenu = new String[menu.length+1] ;
		newMenu[menu.length] = inputString() ;
		for(int i =0 ; i < menu.length ;i ++){
			newMenu[i] = menu[i];
		}
		menu = newMenu ;
		return menu ;
	}
	
	String getRestaurantName(){
		return restaurantName ;
	}
	
	String getMenu(){
		return Arrays.toString(menu) ;
	}
	
	
	@Override
	public String inputString(){
		Scanner input = new Scanner(System.in) ;
		return input.nextLine() ;
	}
	
	@Override
	public int inputInt() throws InputMismatchException{
		Scanner input = new Scanner(System.in) ;
		return input.nextInt() ;
	}

	@Override
	public int getCurrentPeople(){
		return numOfPeople ;
	}

	@Override
	public int plusPeople(){
		System.out.print("請輸入增加人數 : ") ;
		int addNum = inputInt() ;
		if (addNum > 0){
			return numOfPeople += addNum ;
		}else{
			throw new ArithmeticException() ;
		}
	}

	@Override
	public int minusPeople(){
		System.out.print("請輸入減少人數 : ") ;
		int minusNum = inputInt() ;
		if (minusNum > 0){
			return numOfPeople -= minusNum ;
		}else{
			throw new ArithmeticException() ;
		}
	}
	
}
