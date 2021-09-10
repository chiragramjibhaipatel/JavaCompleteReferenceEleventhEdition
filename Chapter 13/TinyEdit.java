import java.io.*;

public class TinyEdit{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lines = new String[100];
		for (int i=0; i<100; i++){
			lines[i] = br.readLine();
			if ("stop".equals(lines[i])){
				break;
			}
		}
		for(int i=0; i<100; i++){
			System.out.println(lines[i]);
			if("stop".equals(lines[i])){
				break;
			}
		}
	}
}
