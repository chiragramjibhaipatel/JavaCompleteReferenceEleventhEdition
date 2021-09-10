import java.io.*;

public class BRReadLine{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Write 'stop' to exit");
		do{
			str = br.readLine();
			System.out.println(str);
		}while(!"stop".equals(str));
	}
}
