import java.io.*;

class AssertDemo{
	static int val = 3;
	private static int getVal(){
		return val--;
	}
	public static void main(String[] args){
		int n;
		for(int i=0; i<10; i++){
			n = AssertDemo.getVal();
			assert n > 0;
			System.out.println(n);	
		}
	}
}
