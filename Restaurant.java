package facility;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant implements Features{
	
	String restaurantName ;
	String[] menu = {"�s��", "����", "���s"} ;
	int numOfPeople = 0 ;
	
	Restaurant(){
		System.out.print("�п�J���W : ") ;
		restaurantName = new Scanner(System.in).nextLine() ;
	}
	
	String[] addMenu(){
		System.out.print("�п�J�W�[��� : ") ;
		String[]newMenu = new String[menu.length+1] ;
		newMenu[menu.length] = new Scanner(System.in).nextLine() ;
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
	public int AdjustOfPeople()throws InputMismatchException{
		System.out.println("�п�J�W��H��") ;
		int adjustNum = new Scanner(System.in).nextInt() ;
		
		if (adjustNum > 0){
			numOfPeople += adjustNum ;
		}else {
			numOfPeople -= adjustNum ;
		}
		return numOfPeople ;
	}	
}
