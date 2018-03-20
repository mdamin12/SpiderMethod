package day.one;

import java.util.Arrays;

public class MethodPractice {
	
	public static void main(String[] args) {
		
		System.out.println("Q no-11"+ Arrays.toString(getNumber(20)));
		
		System.out.println("Q no-12"+ Arrays.toString(getNum(20)));
		
		
		
	}
	
	/**
	 * Q no:12
	 * write a method that take one number Array input and return an Array that contains 1 to given number
	 * parameter:int number
	 * returnType:int[]
	 * Servingbucket:variable
	 */
	public static int[] getNum(int number){
		int[] numArray = new int[number];
		
		for(int i = 1; i <= number; i++){
			numArray[i-1] = i;
		}
		
		return numArray;
	}
	
	/**
	 * Q no11
	 * write a method that take one number input  and return an Array that contains 0 to given number
	 * parameter:int number
	 * returnType:int[]
	 * ServingBucket:variable  
	 */
	public static int[] getNumber(int number){
		int[] numberArray =  new int[number+1];
		
		for(int i = 0; i <= number; i ++){
			
			numberArray[i] = i;
		}
		return numberArray;
	}

}
