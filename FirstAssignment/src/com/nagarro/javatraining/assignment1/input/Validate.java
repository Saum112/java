package com.nagarro.javatraining.assignment1.input;
import com.nagarro.javatraining.assignment1.constant.KeepConstant;
public class Validate {


public static boolean checkDouble(String str) {

	try {
	
		Double.parseDouble(str) ;
				
	}
catch (NumberFormatException e) {
					
	System.err.print("Please Enter the Item price in double format : ");
	return false ;
				}
				return true ;
			}

			public static boolean checkItemType(String str) {
				if (str.equalsIgnoreCase(KeepConstant.RAW)||str.equalsIgnoreCase(KeepConstant.MANUFACTURED)||str.equalsIgnoreCase(KeepConstant.IMPORTED))
					return true ;
				System.err.print("You entered the item type in wrong format . kindly enter again .\nEnter one of the following (raw,manufactured,imported) :");
				return false ;
			}

			public static boolean checkInt(String str) {
				try {
					 Integer.parseInt(str);
				} catch (NumberFormatException e) {
					System.err.print("Please Enter the Qty in Integer format : ");
					return false ;
				}
				return true ;
			}
		
			public static boolean checkNegative(int str) {
				try {
				if(str<0) throw new ArithmeticException("Value of qty can't be negative");
				
				}
				catch(ArithmeticException e) {
					System.err.print(e.getMessage());
					return false;
				}
				
				return true;
			}
			
			public static boolean checkPNegative(double str) {
				
				try {
					if(str<0) throw new ArithmeticException("Value of price can't be negative");
					
					}
					catch(ArithmeticException e) {
						System.err.print(e.getMessage());
						return false;
					}
					
					return true;
			}
			
			
}
			

			
		


