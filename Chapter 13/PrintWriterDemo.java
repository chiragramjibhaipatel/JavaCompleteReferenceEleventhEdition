import java.io.*;

public class PrintWriterDemo{
	public static void main(String[] args){
		PrintWriter printWriter = new PrintWriter(System.out, true);
		printWriter.println("This is string");
		int i = 44;
		double d = 4.3e-8;
		printWriter.println(i);
		printWriter.println(d);
	}
}
