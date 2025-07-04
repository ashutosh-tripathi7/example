package com.example;
 class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}
}
public class CustomExceptionHandlingExample {
	
public static void main(String[] args)
{
	CustomException ce= new CustomException();
}
}
