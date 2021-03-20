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
		restaurantName = inputString() ;
	}
	
	String[] addMenu(){
		System.out.print("�п�J�W�[��� : ") ;
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
		System.out.println("�п�J�W��H��") ;
		int adjustNum = inputInt() ;
		if (adjustNum > 0){
			numOfPeople += adjustNum ;
		}else {
			numOfPeople -= adjustNum ;
		}
		return numOfPeople ;
	}	
}
