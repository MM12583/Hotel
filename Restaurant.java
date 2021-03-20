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
	public int getCurrentPeople(){
		return numOfPeople ;
	}
	
	@Override
	public Scanner input(){
		return new Scanner(System.in) ;
	}
	
	@Override
	public String inputString(){
		String inputString = input().nextLine() ;
		return inputString ;
	}

	@Override
	public int inputInt() throws InputMismatchException{
		int inputInt = input().nextInt() ;
		return inputInt ;
	}

	@Override
	public int AdjustOfPeople(){
		System.out.println("請輸入增減人數") ;
		int adjustNum = inputInt() ;
		if (adjustNum > 0){
			numOfPeople += adjustNum ;
		}else {
			numOfPeople -= adjustNum ;
		}
		return numOfPeople ;
	}	
}
