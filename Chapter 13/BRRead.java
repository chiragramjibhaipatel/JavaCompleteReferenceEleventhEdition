import java.io.*;

public class BRRead{
	public static void main(String[] args) throws IOException{
		System.out.println("Use BufferedReader to read character from the console");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write 'q' to quit");
		char c;
		do{
			c = (char) bufferedReader.read();
			System.out.println(c);	
		}while(c != 'q');
	}
}
