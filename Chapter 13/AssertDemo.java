import java.io.*;

class AssertDemo{
	static int val = 3;
	private static int getVal(){
		return val--;
	}
	public static void main(String[] args){
		int n = 0;
		for(int i=0; i<10; i++){
			assert (n = getVal()) > 0;
			System.out.println(n);	
		}
	}
}
