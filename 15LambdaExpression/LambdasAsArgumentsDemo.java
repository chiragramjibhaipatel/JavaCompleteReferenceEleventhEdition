class LambdasAsArgumentsDemo{
	public static void main(String[] args){
		String message = "This is main message";
		
		StringFunction sf = str -> str.toUpperCase();

		System.out.println(sf.func(message));		
	}
}

interface StringFunction{
	String func(String s);
}
