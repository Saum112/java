package com.nagarro.javatraining.assignment1.input;
import com.nagarro.javatraining.assignment1.constant.*;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TakeInput {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	public static Item enterInput() throws IOException
	{

		String name ;
		String str ;
		String type ;
		Double price ;
		int qty ;
		boolean valid ;
		System.out.println("\nEnter the Item Details :");
		System.out.print("Enter the Item name : ");
		name = br.readLine();

		System.out.print("Enter the Item price : ");
		do{
			str = br.readLine();
			valid  = Validate.checkDouble(str);
		} while(!valid) ;
	
		do{
			str = br.readLine();
			valid  = Validate.checkPNegative(Double.parseDouble(str));
		} while(!valid) ;
		
		price =  Double.parseDouble(str) ;

		System.out.print("Enter the Item type : ");
		do{
			str = br.readLine();
			valid  = Validate.checkItemType(str);
		}while(!valid) ;
		type = str.toLowerCase() ;

		
		System.out.print("Enter the Item Qty : ");
		do{
			str = br.readLine();
			valid  = Validate.checkInt(str);
		}while(!valid) ;
	
		do{
			str = br.readLine();
			valid  = Validate.checkNegative(Integer.parseInt(str));
		}while(!valid) ;
		

		qty = Integer.parseInt(str);


		Item i ;
		switch(type)
		{
			case KeepConstant.RAW :
				i = new Raw(name,type,price,qty);
				break ;
			case KeepConstant.MANUFACTURED :
				i = new Manufactured(name,type,price,qty);
				break ;
			default :
				i = new Imported(name,type,price,qty);
				break ;

		}
		return i ;

	
}	
	
}
